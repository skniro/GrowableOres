package com.skniro.growableores.block.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.IFluidState;
import net.minecraft.state.IProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.PlantType;

import java.util.Iterator;
import java.util.Random;

public class GrowableSugarCaneBlock extends Block implements net.minecraftforge.common.IPlantable {
    public static final IntegerProperty AGE;
    protected static final VoxelShape SHAPE;

    public GrowableSugarCaneBlock(Block.Properties p_i48312_1_) {
        super(p_i48312_1_);
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, Integer.valueOf(0)));
    }

    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return SHAPE;
    }

    public void tick(BlockState p_196267_1_, World p_196267_2_, BlockPos p_196267_3_, Random p_196267_4_) {
        if (!p_196267_1_.canSurvive(p_196267_2_, p_196267_3_)) {
            p_196267_2_.destroyBlock(p_196267_3_, true);
        } else if (p_196267_2_.isEmptyBlock(p_196267_3_.above())) {
            int i;
            for(i = 1; p_196267_2_.getBlockState(p_196267_3_.below(i)).getBlock() == this; ++i) {
            }

            if (i < 3) {
                int j = (Integer)p_196267_1_.getValue(AGE);
                if (ForgeHooks.onCropsGrowPre(p_196267_2_, p_196267_3_, p_196267_1_, true)) {
                    if (j == 15) {
                        p_196267_2_.setBlockAndUpdate(p_196267_3_.above(), this.defaultBlockState());
                        p_196267_2_.setBlock(p_196267_3_, (BlockState)p_196267_1_.setValue(AGE, 0), 4);
                    } else {
                        p_196267_2_.setBlock(p_196267_3_, (BlockState)p_196267_1_.setValue(AGE, j + 1), 4);
                    }

                    ForgeHooks.onCropsGrowPost(p_196267_2_, p_196267_3_, p_196267_1_);
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
        if (soil.canSustainPlant(p_196260_2_, p_196260_3_.below(), Direction.UP, this)) {
            return true;
        } else {
            Block block = p_196260_2_.getBlockState(p_196260_3_.below()).getBlock();
            if (block == this) {
                return true;
            } else if (block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT || block == Blocks.PODZOL || block == Blocks.SAND || block == Blocks.RED_SAND) {
                BlockPos blockpos = p_196260_3_.below();
                Iterator var7 = Direction.Plane.HORIZONTAL.iterator();

                BlockState blockstate;
                IFluidState ifluidstate;
                do {
                    if (!var7.hasNext()) {
                        return false;
                    }

                    Direction direction = (Direction)var7.next();
                    blockstate = p_196260_2_.getBlockState(blockpos.relative(direction));
                    ifluidstate = p_196260_2_.getFluidState(blockpos.relative(direction));
                } while(!ifluidstate.is(FluidTags.WATER) && blockstate.getBlock() != Blocks.FROSTED_ICE);

                return true;
            } else {
                return false;
            }
        }
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(new IProperty[]{AGE});
    }

    public PlantType getPlantType(IBlockReader p_getPlantType_1_, BlockPos p_getPlantType_2_) {
        return PlantType.Beach;
    }

    public BlockState getPlant(IBlockReader p_getPlant_1_, BlockPos p_getPlant_2_) {
        return this.defaultBlockState();
    }

    static {
        AGE = BlockStateProperties.AGE_15;
        SHAPE = Block.box(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
    }
}
