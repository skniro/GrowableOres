package com.skniro.growableores.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SugarCaneBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(SugarCaneBlock.class)
public class Mixin_SugarCaneBlock extends Block {
    @Shadow
    @Final
    public static IntegerProperty AGE;

    public Mixin_SugarCaneBlock(Properties settings) {
        super(settings);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (world.isEmptyBlock(pos.above())) {
            int i;
            for(i = 1; world.getBlockState(pos.below(i)).is(this); ++i) {
            }

            if (i < 3) {
                int j = (Integer)state.getValue(AGE);
                if (j >= 2) {
                    world.setBlockAndUpdate(pos.above(), this.defaultBlockState());
                    world.setBlock(pos, (BlockState)state.setValue(AGE, 0), 2);
                } else {
                    world.setBlock(pos, (BlockState)state.setValue(AGE, j + 1), 2);
                }
            }
        }
    }
}
