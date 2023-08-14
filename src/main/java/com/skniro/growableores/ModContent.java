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
            event.accept(GrowableOresBlocks.Netherite_Ingot_Cane.get());

            //ae2
            event.accept(GrowableOresBlocks.certus_quartz_crystal_Cane);

            //BetterEnd
            event.accept(GrowableOresBlocks.amber_Cane.get());
            event.accept(GrowableOresBlocks.ender_Cane.get());
            event.accept(GrowableOresBlocks.thallasium_Cane.get());



        }
    }
}
