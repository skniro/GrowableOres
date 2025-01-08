package com.skniro.growableores.item;

import com.skniro.growableores.block.GrowableVanillaOresBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab Growable_Ores_Group = new CreativeModeTab("growable_ores.test_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(GrowableVanillaOresBlocks.Iron_Cane.get());
        }
    };
}
