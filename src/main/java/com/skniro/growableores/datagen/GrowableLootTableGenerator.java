package com.skniro.growableores.datagen;


import com.skniro.growableores.block.GrowableOresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;


public class GrowableLootTableGenerator extends FabricBlockLootTableProvider {
    public GrowableLootTableGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateBlockLootTables() {

    }

    public void generate() {
        addDrop(GrowableOresBlocks.Coal_Cane);
        addDrop(GrowableOresBlocks.Iron_Cane);
        addDrop(GrowableOresBlocks.Diamond_Cane);
        addDrop(GrowableOresBlocks.Gold_Cane);
        addDrop(GrowableOresBlocks.Lapis_Cane);
        addDrop(GrowableOresBlocks.Nether_Quartz_Cane);
        addDrop(GrowableOresBlocks.Emerald_Cane);
        addDrop(GrowableOresBlocks.Copper_Cane);
        addDrop(GrowableOresBlocks.Redstone_Cane);
        addDrop(GrowableOresBlocks.Blaze_Rod_Cane);
        addDrop(GrowableOresBlocks.Ender_Pearl_Cane);

        //AE2
        addDrop(GrowableOresBlocks.certus_quartz_crystal_Cane);

        //Tech Reborn
        addDrop(GrowableOresBlocks.cinnabar_Cane);
        addDrop(GrowableOresBlocks.galena_Cane);
        addDrop(GrowableOresBlocks.iridium_Cane);
        addDrop(GrowableOresBlocks.lead_Cane);
        addDrop(GrowableOresBlocks.peridot_Cane);
        addDrop(GrowableOresBlocks.pyrite_Cane);
        addDrop(GrowableOresBlocks.ruby_Cane);
        addDrop(GrowableOresBlocks.sapphire_Cane);
        addDrop(GrowableOresBlocks.sodalite_Cane);
        addDrop(GrowableOresBlocks.bauxite_Cane);
        addDrop(GrowableOresBlocks.sheldonite_Cane);
        addDrop(GrowableOresBlocks.silver_Cane);
        addDrop(GrowableOresBlocks.sphalerite_Cane);
        addDrop(GrowableOresBlocks.tin_Cane);
        addDrop(GrowableOresBlocks.tungsten_Cane);
    }
}
