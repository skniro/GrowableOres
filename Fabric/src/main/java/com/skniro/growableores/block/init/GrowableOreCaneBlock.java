package com.skniro.growableores.block.init;

import com.mojang.serialization.MapCodec;
import com.skniro.growableores.conifg.GrowableOresConfig;
import com.skniro.growableores.registry.tag.GrowableBlockTags;
import com.skniro.growableores.registry.tag.GrowableFluidTags;
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
import net.minecraft.util.math.Direction.Type;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Iterator;


public class GrowableOreCaneBlock extends Block implements Fertilizable {
    public static final IntProperty AGE;
    protected static final float field_31258 = 6.0F;
    protected static final VoxelShape SHAPE;


    public GrowableOreCaneBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(AGE, 0));
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
            int i;
            for (i = 1; world.getBlockState(pos.down(i)).isOf(this); ++i) {
            }
            if (i < GrowableOresConfig.Ore_Cane_Max_Height) {
                int j = (Integer) state.get(AGE);
                if (j == 15) {
                    world.setBlockState(pos.up(), this.getDefaultState());
                    world.setBlockState(pos, (BlockState) state.with(AGE, 0), 4);
                } else {
                    world.setBlockState(pos, (BlockState) state.with(AGE, j + 1), 4);
                }
            }
        }
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
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
        } else {
            if (blockState.isIn(BlockTags.DIRT) || blockState.isIn(BlockTags.SAND) || blockState.isIn(GrowableBlockTags.GrowBlock)) {
                BlockPos blockPos = pos.down();
                Iterator var6 = Type.HORIZONTAL.iterator();

                while(var6.hasNext()) {
                    Direction direction = (Direction)var6.next();
                    BlockState blockState2 = world.getBlockState(blockPos.offset(direction));
                    FluidState fluidState = world.getFluidState(blockPos.offset(direction));
                    if (fluidState.isIn(FluidTags.WATER) || blockState2.isOf(Blocks.FROSTED_ICE) || (fluidState.isIn(GrowableFluidTags.GrowFluid))) {
                        return true;
                    }
                }
            }

            return false;
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{AGE});
    }

    protected IntProperty getAgeProperty() {
        return AGE;
    }

    public int getAge(BlockState state) {
        return state.get(this.getAgeProperty());
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state, boolean isClient) {
        if(GrowableOresConfig.Ore_Cane_Bonemeal){
            return this.getAge(state) < 15;
        }
        return false;
    }


    @Override
    public boolean canGrow(World level, Random random, BlockPos pos, BlockState state) {
        if(GrowableOresConfig.Ore_Cane_Bonemeal) {
            return true;
        }
        return false;
    }

    @Override
    public void grow(ServerWorld level, Random randomSource, BlockPos pos, BlockState state) {
        if (GrowableOresConfig.Ore_Cane_Bonemeal) {
            for (int y = pos.getY(); y <= level.getHeight(); y++) {
                BlockPos uppos = new BlockPos(pos.getX(), y, pos.getZ());
                Block block = level.getBlockState(uppos).getBlock();
                if (block != this) {
                    if (block.equals(Blocks.AIR)) {
                        level.setBlockState(uppos, this.getDefaultState());
                        level.syncWorldEvent(2005, uppos, 0);
                        level.syncWorldEvent(2005, uppos.up(), 0);
                    }
                    break;
                }
            }
        }
    }

    static {
        AGE = Properties.AGE_15;
        SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
    }
}