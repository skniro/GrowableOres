package com.skniro.growableores.item;

import com.skniro.growableores.block.GrowableVanillaOresBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModCreativeModeTabs {
    public static final ItemGroup Growable_Ores_Group = new ItemGroup("growable_ores.test_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack (GrowableVanillaOresBlocks.Iron_Cane.get());
        }
    };
}
