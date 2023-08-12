package com.skniro.growableores.item;

import com.skniro.growableores.block.GrowableOresBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab Growable_Ores_Group = new CreativeModeTab("test_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(GrowableOresBlocks.Iron_Cane.get());
        }
    };
}
