package com.skniro.growableores.datagen;

import com.skniro.growableores.block.GrowableOresBlocks;
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
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Iron_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Coal_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Diamond_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Lapis_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Redstone_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Nether_Quartz_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Copper_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Emerald_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Gold_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Blaze_Rod_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Ender_Pearl_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Netherite_Ingot_Cane, BlockStateModelGenerator.TintType.TINTED);

        //AE2
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.certus_quartz_crystal_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Tech Reborn
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.cinnabar_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.galena_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.iridium_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.lead_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.peridot_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.pyrite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.ruby_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.sapphire_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.sheldonite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.silver_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.sphalerite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.tin_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.tungsten_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.sodalite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.bauxite_Cane, BlockStateModelGenerator.TintType.TINTED);

        //BetterEnd
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.amber_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.ender_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.thallasium_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Maple
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Salt_Cane, BlockStateModelGenerator.TintType.TINTED);

    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
