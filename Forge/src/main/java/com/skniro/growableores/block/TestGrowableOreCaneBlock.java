package com.skniro.growableores.block;

import com.mojang.serialization.MapCodec;
import java.util.Iterator;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Plane;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;

public class TestGrowableOreCaneBlock extends Block implements IPlantable {
    public static final MapCodec<TestGrowableOreCaneBlock> CODEC = simpleCodec(TestGrowableOreCaneBlock::new);
    public static final IntegerProperty AGE;
    protected static final float AABB_OFFSET = 6.0F;
    protected static final VoxelShape SHAPE;

    public MapCodec<TestGrowableOreCaneBlock> codec() {
        return CODEC;
    }

    public TestGrowableOreCaneBlock(BlockBehaviour.Properties p_57168_) {
        super(Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS));
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(AGE, 0));
    }

    public VoxelShape getShape(BlockState p_57193_, BlockGetter p_57194_, BlockPos p_57195_, CollisionContext p_57196_) {
        return SHAPE;
    }

    public void tick(BlockState p_222543_, ServerLevel p_222544_, BlockPos p_222545_, RandomSource p_222546_) {
        if (!p_222543_.canSurvive(p_222544_, p_222545_)) {
            p_222544_.destroyBlock(p_222545_, true);
        }

    }

    public void randomTick(BlockState p_222548_, ServerLevel p_222549_, BlockPos p_222550_, RandomSource p_222551_) {
        if (p_222549_.isEmptyBlock(p_222550_.above())) {
            int i;
            for(i = 1; p_222549_.getBlockState(p_222550_.below(i)).is(this); ++i) {
            }

            if (i < 3) {
                int j = (Integer)p_222548_.getValue(AGE);
                if (ForgeHooks.onCropsGrowPre(p_222549_, p_222550_, p_222548_, true)) {
                    if (j == 15) {
                        p_222549_.setBlockAndUpdate(p_222550_.above(), this.defaultBlockState());
                        ForgeHooks.onCropsGrowPost(p_222549_, p_222550_.above(), this.defaultBlockState());
                        p_222549_.setBlock(p_222550_, (BlockState)p_222548_.setValue(AGE, 0), 4);
                    } else {
                        p_222549_.setBlock(p_222550_, (BlockState)p_222548_.setValue(AGE, j + 1), 4);
                    }
                }
            }
        }

    }

    public BlockState updateShape(BlockState p_57179_, Direction p_57180_, BlockState p_57181_, LevelAccessor p_57182_, BlockPos p_57183_, BlockPos p_57184_) {
        if (!p_57179_.canSurvive(p_57182_, p_57183_)) {
            p_57182_.scheduleTick(p_57183_, this, 1);
        }

        return super.updateShape(p_57179_, p_57180_, p_57181_, p_57182_, p_57183_, p_57184_);
    }

    public boolean canSurvive(BlockState p_57175_, LevelReader p_57176_, BlockPos p_57177_) {
        BlockState soil = p_57176_.getBlockState(p_57177_.below());
        if (soil.canSustainPlant(p_57176_, p_57177_.below(), Direction.UP, this)) {
            return true;
        } else {
            BlockState blockstate = p_57176_.getBlockState(p_57177_.below());
            if (blockstate.is(this)) {
                return true;
            } else {
                if (blockstate.is(BlockTags.DIRT) || blockstate.is(BlockTags.SAND)) {
                    BlockPos blockpos = p_57177_.below();
                    Iterator var7 = Plane.HORIZONTAL.iterator();

                    while(var7.hasNext()) {
                        Direction direction = (Direction)var7.next();
                        BlockState blockstate1 = p_57176_.getBlockState(blockpos.relative(direction));
                        FluidState fluidstate = p_57176_.getFluidState(blockpos.relative(direction));
                        if (p_57175_.canBeHydrated(p_57176_, p_57177_, fluidstate, blockpos.relative(direction)) || blockstate1.is(Blocks.FROSTED_ICE)) {
                            return true;
                        }
                    }
                }

                return false;
            }
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_57186_) {
        p_57186_.add(new Property[]{AGE});
    }

    public PlantType getPlantType(BlockGetter world, BlockPos pos) {
        return PlantType.BEACH;
    }

    public BlockState getPlant(BlockGetter world, BlockPos pos) {
        return this.defaultBlockState();
    }

    static {
        AGE = BlockStateProperties.AGE_15;
        SHAPE = Block.box(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
    }
}