package com.skniro.growableores.block.init;

import com.skniro.growableores.conifg.GrowableOresConfig;
import com.skniro.growableores.registry.tag.GrowableBlockTags;
import com.skniro.growableores.registry.tag.GrowableFluidTags;
import net.minecraft.block.IGrowable;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.FluidState;
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
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IPlantable;

import java.util.Iterator;
import java.util.Random;


public class GrowableOreCaneBlock extends Block implements IGrowable, IPlantable {
    public static final IntegerProperty AGE;
    protected static final float field_31258 = 6.0F;
    protected static final VoxelShape SHAPE;


    public GrowableOreCaneBlock(Properties settings) {
        super(settings);
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(AGE, 0));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    @Override
    public void tick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.canSurvive(world, pos)) {
            world.destroyBlock(pos, true);
        } else if (world.isEmptyBlock(pos.above())) {
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

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, IWorld world, BlockPos pos, BlockPos neighborPos) {
        if (!state.canSurvive(world, pos)) {
            world.getBlockTicks().scheduleTick(pos, this, 1);
        }

        return super.updateShape(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean canSurvive(BlockState state, IWorldReader world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos.below());
        if (blockState.is(this)) {
            return true;
        } else {
            if (blockState.is(Blocks.GRASS_BLOCK) || blockState.is(Blocks.DIRT) || blockState.is(Blocks.COARSE_DIRT) || blockState.is(Blocks.PODZOL) || blockState.is(Blocks.SAND) || blockState.is(Blocks.RED_SAND) || blockState.is(GrowableBlockTags.GrowBlock)) {
                BlockPos blockPos = pos.below();
                Iterator var6 = Direction.Plane.HORIZONTAL.iterator();

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

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    protected IntegerProperty getAgeProperty() {
        return AGE;
    }

    public int getAge(BlockState state) {
        return state.getValue(this.getAgeProperty());
    }

    @Override
    public net.minecraftforge.common.PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return net.minecraftforge.common.PlantType.BEACH;
    }

    @Override
    public BlockState getPlant(IBlockReader world, BlockPos pos) {
        return defaultBlockState();
    }

    @Override
    public boolean isValidBonemealTarget(IBlockReader IBlockReader, BlockPos pos, BlockState state, boolean includeData) {
        if(GrowableOresConfig.Ore_Cane_Bonemeal){
            return this.getAge(state) < 15;
        }
        return false;
    }

    @Override
    public boolean isBonemealSuccess(World level, Random random, BlockPos pos, BlockState state) {
        if(GrowableOresConfig.Ore_Cane_Bonemeal) {
            return true;
        }
        return false;
    }

    @Override
    public void performBonemeal(ServerWorld level, Random randomSource, BlockPos pos, BlockState state) {
        if (GrowableOresConfig.Ore_Cane_Bonemeal) {
            for (int y = pos.getY(); y <= level.getHeight(); y++) {
                BlockPos uppos = new BlockPos(pos.getX(), y, pos.getZ());
                Block block = level.getBlockState(uppos).getBlock();
                if (block != this) {
                    if (block.equals(Blocks.AIR)) {
                        level.setBlockAndUpdate(uppos, this.defaultBlockState());
                        level.levelEvent(2005, uppos, 0);
                        level.levelEvent(2005, uppos.above(), 0);
                    }
                    break;
                }
            }
        }
    }

    static {
        AGE = BlockStateProperties.AGE_15;
        SHAPE = Block.box(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
    }
}