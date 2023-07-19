package com.skniro.growableores;


import com.skniro.growableores.block.GrowableOresBlocks;
import com.skniro.growableores.item.ModCreativeModeTabs;
import net.minecraftforge.event.CreativeModeTabEvent;


public class ModContent {

    public static void CreativeTab(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == ModCreativeModeTabs.Growable_Ores_Group) {
            event.accept(GrowableOresBlocks.Coal_Cane);
            event.accept(GrowableOresBlocks.Iron_Cane);
            event.accept(GrowableOresBlocks.Diamond_Cane);
            event.accept(GrowableOresBlocks.Copper_Cane);
            event.accept(GrowableOresBlocks.Emerald_Cane);
            event.accept(GrowableOresBlocks.Gold_Cane);
            event.accept(GrowableOresBlocks.Lapis_Cane);
            event.accept(GrowableOresBlocks.Nether_Quartz_Cane);
            event.accept(GrowableOresBlocks.Redstone_Cane);
            event.accept(GrowableOresBlocks.Blaze_Rod_Cane);
            event.accept(GrowableOresBlocks.Ender_Pearl_Cane);

            //ae2
            event.accept(GrowableOresBlocks.certus_quartz_crystal_Cane);

            //Tech Reborn
            /*event.accept(GrowableOresBlocks.cinnabar_Cane);
            event.accept(GrowableOresBlocks.galena_Cane);
            event.accept(GrowableOresBlocks.iridium_Cane);
            event.accept(GrowableOresBlocks.lead_Cane);
            event.accept(GrowableOresBlocks.peridot_Cane);
            event.accept(GrowableOresBlocks.pyrite_Cane);
            event.accept(GrowableOresBlocks.ruby_Cane);
            event.accept(GrowableOresBlocks.sapphire_Cane);
            event.accept(GrowableOresBlocks.sheldonite_Cane);
            event.accept(GrowableOresBlocks.silver_Cane);
            event.accept(GrowableOresBlocks.sphalerite_Cane);
            event.accept(GrowableOresBlocks.tin_Cane);
            event.accept(GrowableOresBlocks.tungsten_Cane);
            event.accept(GrowableOresBlocks.sodalite_Cane);
            event.accept(GrowableOresBlocks.bauxite_Cane);*/
        }
    }
}
