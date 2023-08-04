package com.skniro.growableores.item;

import com.skniro.growableores.block.GrowableOresBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;

public class ModCreativeModeTabs {
    public static final ItemGroup Growable_Ores_Group = new ItemGroup("test_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack (GrowableOresBlocks.Iron_Cane.get());
        }
    };
}
