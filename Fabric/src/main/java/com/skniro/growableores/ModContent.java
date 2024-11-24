package com.skniro.growableores;


import com.skniro.growableores.block.GrowableOresBlocks;
import com.skniro.growableores.item.GrowableOresItems;
import com.skniro.growableores.registry.tag.GrowableBlockTags;


public class ModContent {


    public static void registerItem(){
        GrowableOresItems.shield_item();
    }
    public static void registerBlock(){
        GrowableOresBlocks.registerModBlocks();
    }

    public static void registerTag(){
        GrowableBlockTags.registerBlockTags();
    }


    public static void CreativeTab() {
    }
}
