package com.skniro.growableores.block.init;

import net.minecraft.block.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.EntityContext;
import net.minecraft.fluid.FluidState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.CollisionView;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.Random;

public class GrowableOresSugarCaneBlock extends Block {
    public static final IntProperty AGE;
    protected static final VoxelShape SHAPE;

    public GrowableOresSugarCaneBlock(Block.Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(AGE, 0));
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, EntityContext context) {
        return SHAPE;
    }

    public void onScheduledTick(BlockState state, World world, BlockPos pos, Random random) {
        if (!state.canPlaceAt(world, pos)) {
            world.breakBlock(pos, true);
        } else if (world.isAir(pos.up())) {
            int i;
            for(i = 1; world.getBlockState(pos.down(i)).getBlock() == this; ++i) {
            }

            if (i < 3) {
                int j = (Integer)state.get(AGE);
                if (j == 15) {
                    world.setBlockState(pos.up(), this.getDefaultState());
                    world.setBlockState(pos, (BlockState)state.with(AGE, 0), 4);
                } else {
                    world.setBlockState(pos, (BlockState)state.with(AGE, j + 1), 4);
                }
            }
        }

    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, IWorld world, BlockPos pos, BlockPos neighborPos) {
        if (!state.canPlaceAt(world, pos)) {
            world.getBlockTickScheduler().schedule(pos, this, 1);
        }

        return super.getStateForNeighborUpdate(state, facing, neighborState, world, pos, neighborPos);
    }

    public boolean canPlaceAt(BlockState state, CollisionView world, BlockPos pos) {
        Block block = world.getBlockState(pos.down()).getBlock();
        if (block == this) {
            return true;
        } else {
            if (block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT || block == Blocks.PODZOL || block == Blocks.SAND || block == Blocks.RED_SAND) {
                BlockPos blockPos = pos.down();
                Iterator var6 = Direction.Type.HORIZONTAL.iterator();

                while(var6.hasNext()) {
                    Direction direction = (Direction)var6.next();
                    BlockState blockState = world.getBlockState(blockPos.offset(direction));
                    FluidState fluidState = world.getFluidState(blockPos.offset(direction));
                    if (fluidState.matches(FluidTags.WATER) || blockState.getBlock() == Blocks.FROSTED_ICE) {
                        return true;
                    }
                }
            }

            return false;
        }
    }


    public RenderLayer getRenderLayer() {
        return RenderLayer.CUTOUT;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{AGE});
    }


    static {
        AGE = Properties.AGE_15;
        SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
    }
}
