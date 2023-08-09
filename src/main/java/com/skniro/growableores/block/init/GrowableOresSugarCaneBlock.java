package com.skniro.growableores.block.init;

import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Iterator;

public class GrowableOresSugarCaneBlock extends Block {
    public static final IntProperty AGE = Properties.AGE_15;
    protected static final float field_31258 = 6.0F;
        protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

        public GrowableOresSugarCaneBlock(Settings settings) {
            super(settings);
            this.setDefaultState((BlockState) ((BlockState) this.stateManager.getDefaultState()).with(AGE, 0));
        }

        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return SHAPE;
        }

        @Override
        public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
            if (!state.canPlaceAt(world, pos)) {
                world.breakBlock(pos, true);
            }
        }

        @Override
        public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
            if (world.isAir(pos.up())) {
                int i = 1;
                while (world.getBlockState(pos.down(i)).isOf(this)) {
                    ++i;
                }
                if (i < 3) {
                    int j = state.get(AGE);
                    if (j == 15) {
                        world.setBlockState(pos.up(), this.getDefaultState());
                        world.setBlockState(pos, (BlockState) state.with(AGE, 0), Block.NO_REDRAW);
                    } else {
                        world.setBlockState(pos, (BlockState) state.with(AGE, j + 1), Block.NO_REDRAW);
                    }
                }
            }
        }

        @Override
        public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
            if (!state.canPlaceAt(world, pos)) {
                world.scheduleBlockTick(pos, this, 1);
            }
            return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
        }

        @Override
        public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
            BlockState blockState = world.getBlockState(pos.down());
            if (blockState.isOf(this)) {
                return true;
            }
            if (blockState.isIn(BlockTags.DIRT) || blockState.isIn(BlockTags.SAND)) {
                BlockPos blockPos = pos.down();
                for (Direction direction : Direction.Type.HORIZONTAL) {
                    BlockState blockState2 = world.getBlockState(blockPos.offset(direction));
                    FluidState fluidState = world.getFluidState(blockPos.offset(direction));
                    if (!fluidState.isIn(FluidTags.WATER) && !blockState2.isOf(Blocks.FROSTED_ICE)) continue;
                    return true;
                }
            }
            return false;
        }

        @Override
        protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
            builder.add(AGE);
        }
}