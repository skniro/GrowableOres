package com.skniro.growableores.item;

import com.skniro.growableores.block.GrowableOresBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModCreativeModeTabs extends CreativeTabs
{
    public ModCreativeModeTabs(String label) {
        super(label);
    }

    @Override
    public ItemStack getIconItemStack() {
        return new ItemStack(Item.getItemFromBlock(GrowableOresBlocks.Blaze_Rod_Cane));
    }

    @Override
    public String getTranslatedTabLabel() {
        return "UsefulFood";
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(GrowableOresBlocks.Blaze_Rod_Cane));
    }
}
