package com.skniro.growableores;


import com.skniro.growableores.block.GrowableOresBlocks;
import com.skniro.growableores.item.GrowableOresItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;


public class ModContent {


    public static void registerItem(){
        GrowableOresItems.shield_item();
    }
    public static void registerBlock(){
        GrowableOresBlocks.registerModBlocks();

    }

    public static void CreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(GrowableOres.Growable_Ores_Group).register(content -> {
            content.add(GrowableOresBlocks.Coal_Cane);
            content.add(GrowableOresBlocks.Iron_Cane);
            content.add(GrowableOresBlocks.Diamond_Cane);
            content.add(GrowableOresBlocks.Copper_Cane);
            content.add(GrowableOresBlocks.Emerald_Cane);
            content.add(GrowableOresBlocks.Gold_Cane);
            content.add(GrowableOresBlocks.Lapis_Cane);
            content.add(GrowableOresBlocks.Nether_Quartz_Cane);
            content.add(GrowableOresBlocks.Redstone_Cane);
            content.add(GrowableOresBlocks.Blaze_Rod_Cane);
            content.add(GrowableOresBlocks.Ender_Pearl_Cane);
            content.add(GrowableOresBlocks.Netherite_Ingot_Cane);

            //ae2
            content.add(GrowableOresBlocks.certus_quartz_crystal_Cane);

            //Tech Reborn
            content.add(GrowableOresBlocks.cinnabar_Cane);
            content.add(GrowableOresBlocks.galena_Cane);
            content.add(GrowableOresBlocks.iridium_Cane);
            content.add(GrowableOresBlocks.lead_Cane);
            content.add(GrowableOresBlocks.peridot_Cane);
            content.add(GrowableOresBlocks.pyrite_Cane);
            content.add(GrowableOresBlocks.ruby_Cane);
            content.add(GrowableOresBlocks.sapphire_Cane);
            content.add(GrowableOresBlocks.sheldonite_Cane);
            content.add(GrowableOresBlocks.silver_Cane);
            content.add(GrowableOresBlocks.sphalerite_Cane);
            content.add(GrowableOresBlocks.tin_Cane);
            content.add(GrowableOresBlocks.tungsten_Cane);
            content.add(GrowableOresBlocks.sodalite_Cane);
            content.add(GrowableOresBlocks.bauxite_Cane);

            //BetterEnd
            content.add(GrowableOresBlocks.amber_Cane);
            content.add(GrowableOresBlocks.ender_Cane);
            content.add(GrowableOresBlocks.thallasium_Cane);

            //Maple
            content.add(GrowableOresBlocks.Salt_Cane);
        });
    }
}
