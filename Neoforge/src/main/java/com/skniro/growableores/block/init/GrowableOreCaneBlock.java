package com.skniro.growableores.block.init;

import com.mojang.serialization.MapCodec;
import com.skniro.growableores.conifg.GrowableOresConfig;
import com.skniro.growableores.registry.tag.GrowableBlockTags;
import com.skniro.growableores.registry.tag.GrowableFluidTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Plane;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Iterator;


public class GrowableOreCaneBlock extends Block {
    public static final MapCodec<GrowableOreCaneBlock> CODEC = simpleCodec(GrowableOreCaneBlock::new);
    public static final IntegerProperty AGE;
    protected static final float field_31258 = 6.0F;
    protected static final VoxelShape SHAPE;

    public MapCodec<GrowableOreCaneBlock> codec() {
        return CODEC;
    }

    public GrowableOreCaneBlock(Properties settings) {
        super(settings);
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(AGE, 0));
    }

    protected VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    protected void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (!state.canSurvive(world, pos)) {
            world.destroyBlock(pos, true);
        }
    }

    protected void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (world.isEmptyBlock(pos.above())) {
            int i;
            for (i = 1; world.getBlockState(pos.below(i)).is(this); ++i) {
            }
            if (i < GrowableOresConfig.Ore_Cane_Max_Height) {
                int j = (Integer) state.getValue(AGE);
                if (j == 15) {
                    world.setBlockAndUpdate(pos.above(), this.defaultBlockState());
                    world.setBlock(pos, (BlockState) state.setValue(AGE, 0), 4);
                } else {
                    world.setBlock(pos, (BlockState) state.setValue(AGE, j + 1), 4);
                }
            }
        }
    }

    protected BlockState updateShape(BlockState state, LevelReader world, ScheduledTickAccess tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, RandomSource random) {
        if (!state.canSurvive(world, pos)) {
            tickView.scheduleTick(pos, this, 1);
        }

        return super.updateShape(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    protected boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos.below());
        if (blockState.is(this)) {
            return true;
        } else {
            if (blockState.is(BlockTags.DIRT) || blockState.is(BlockTags.SAND) || blockState.is(GrowableBlockTags.GrowBlock)) {
                BlockPos blockPos = pos.below();
                Iterator var6 = Plane.HORIZONTAL.iterator();

                while(var6.hasNext()) {
                    Direction direction = (Direction)var6.next();
                    BlockState blockState2 = world.getBlockState(blockPos.relative(direction));
                    FluidState fluidState = world.getFluidState(blockPos.relative(direction));
                    if (fluidState.is(FluidTags.WATER) || blockState2.is(Blocks.FROSTED_ICE) || (fluidState.is(GrowableFluidTags.GrowFluid))) {
                        return true;
                    }
                }
            }

            return false;
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{AGE});
    }

    static {
        AGE = BlockStateProperties.AGE_15;
        SHAPE = Block.box(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
    }
}