package com.skniro.agree.datagen;

import com.skniro.agree.block.GrowableOresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class GrowableModelProvider extends FabricModelProvider {
    public GrowableModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Village
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.Iron_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.Coal_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.Diamond_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.Lapis_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.Redstone_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.Nether_Quartz_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.Copper_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.Emerald_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.Gold_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.Blaze_Rod_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.Ender_Pearl_Cane, BlockStateModelGenerator.TintType.TINTED);

        //AE2
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.certus_quartz_crystal_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Tech Reborn
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.cinnabar_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.galena_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.iridium_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.lead_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.peridot_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.pyrite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.ruby_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.sapphire_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.sheldonite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.silver_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.sphalerite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.tin_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.tungsten_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.sodalite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(GrowableOresBlocks.bauxite_Cane, BlockStateModelGenerator.TintType.TINTED);
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
