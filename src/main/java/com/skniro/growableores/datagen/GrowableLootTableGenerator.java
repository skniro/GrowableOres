package com.skniro.growableores.datagen;


import com.skniro.growableores.block.GrowableOresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.data.client.BlockStateModelGenerator;


public class GrowableLootTableGenerator extends FabricBlockLootTableProvider {
    public GrowableLootTableGenerator(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }

    @Override
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

        //BetterEnd
        addDrop(GrowableOresBlocks.amber_Cane);
        addDrop(GrowableOresBlocks.ender_Cane);
        addDrop(GrowableOresBlocks.thallasium_Cane);

        //Maple
        addDrop(GrowableOresBlocks.Salt_Cane);

        //Powah Rearchitected and Powah
        addDrop(GrowableOresBlocks.Steel_Energized_Cane);
        addDrop(GrowableOresBlocks.Uraninite_Ore_Dense_Cane);
        addDrop(GrowableOresBlocks.Ender_Core_Cane);
        addDrop(GrowableOresBlocks.Crystal_Spirited_Cane);
        addDrop(GrowableOresBlocks.Crystal_Nitro_Cane);
        addDrop(GrowableOresBlocks.Crystal_Niotic_Cane);
        addDrop(GrowableOresBlocks.Crystal_Blazing_Cane);

    }
}
