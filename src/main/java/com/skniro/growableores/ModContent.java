package com.skniro.growableores;


import com.skniro.growableores.block.GrowableVanillaOresBlocks;
import com.skniro.growableores.item.GrowableOresItems;
import com.skniro.growableores.util.GrowableOresItemGroups;


public class ModContent {


    public static void registerItem(){
        GrowableOresItems.shield_item();
    }
    public static void registerBlock(){
        GrowableVanillaOresBlocks.registerModBlocks();

    }

    public static void CreativeTab() {
        GrowableOresItemGroups.itemgroups();
    }
}
