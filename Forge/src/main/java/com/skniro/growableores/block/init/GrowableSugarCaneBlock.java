package com.skniro.growableores.block.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.IFluidState;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class GrowableSugarCaneBlock extends Block implements net.minecraftforge.common.IPlantable {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_15;
    protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);

    public GrowableSugarCaneBlock(Block.Properties p_i48312_1_) {
        super(p_i48312_1_);
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, Integer.valueOf(0)));
    }

    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return SHAPE;
    }

    public void tick(BlockState p_225534_1_, ServerWorld p_225534_2_, BlockPos p_225534_3_, Random p_225534_4_) {
        if (!p_225534_1_.canSurvive(p_225534_2_, p_225534_3_)) {
            p_225534_2_.destroyBlock(p_225534_3_, true);
        } else if (p_225534_2_.isEmptyBlock(p_225534_3_.above())) {
            int i;
            for(i = 1; p_225534_2_.getBlockState(p_225534_3_.below(i)).getBlock() == this; ++i) {
                ;
            }

            if (i < 3) {
                int j = p_225534_1_.getValue(AGE);
                if (net.minecraftforge.common.ForgeHooks.onCropsGrowPre(p_225534_2_, p_225534_3_, p_225534_1_, true)) {
                    if (j == 15) {
                        p_225534_2_.setBlockAndUpdate(p_225534_3_.above(), this.defaultBlockState());
                        p_225534_2_.setBlock(p_225534_3_, p_225534_1_.setValue(AGE, Integer.valueOf(0)), 4);
                    } else {
                        p_225534_2_.setBlock(p_225534_3_, p_225534_1_.setValue(AGE, Integer.valueOf(j + 1)), 4);
                    }
                    net.minecraftforge.common.ForgeHooks.onCropsGrowPost(p_225534_2_, p_225534_3_, p_225534_1_);
                }
            }
        }

    }

    public BlockState updateShape(BlockState p_196271_1_, Direction p_196271_2_, BlockState p_196271_3_, IWorld p_196271_4_, BlockPos p_196271_5_, BlockPos p_196271_6_) {
        if (!p_196271_1_.canSurvive(p_196271_4_, p_196271_5_)) {
            p_196271_4_.getBlockTicks().scheduleTick(p_196271_5_, this, 1);
        }

        return super.updateShape(p_196271_1_, p_196271_2_, p_196271_3_, p_196271_4_, p_196271_5_, p_196271_6_);
    }

    public boolean canSurvive(BlockState p_196260_1_, IWorldReader p_196260_2_, BlockPos p_196260_3_) {
        BlockState soil = p_196260_2_.getBlockState(p_196260_3_.below());
        if (soil.canSustainPlant(p_196260_2_, p_196260_3_.below(), Direction.UP, this)) return true;
        Block block = p_196260_2_.getBlockState(p_196260_3_.below()).getBlock();
        if (block == this) {
            return true;
        } else {
            if (block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT || block == Blocks.PODZOL || block == Blocks.SAND || block == Blocks.RED_SAND) {
                BlockPos blockpos = p_196260_3_.below();

                for(Direction direction : Direction.Plane.HORIZONTAL) {
                    BlockState blockstate = p_196260_2_.getBlockState(blockpos.relative(direction));
                    IFluidState ifluidstate = p_196260_2_.getFluidState(blockpos.relative(direction));
                    if (ifluidstate.is(FluidTags.WATER) || blockstate.getBlock() == Blocks.FROSTED_ICE) {
                        return true;
                    }
                }
            }

            return false;
        }
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(AGE);
    }

    @Override
    public net.minecraftforge.common.PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return net.minecraftforge.common.PlantType.Beach;
    }

    @Override
    public BlockState getPlant(IBlockReader world, BlockPos pos) {
        return defaultBlockState();
    }
}
