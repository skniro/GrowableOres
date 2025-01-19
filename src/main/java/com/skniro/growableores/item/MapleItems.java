package com.skniro.growableores.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class MapleItems {

    public static Item registerItem(IForgeRegistry<Item> reg, Item item, String name, CreativeTabs tab) {
        item.setRegistryName(name);
        item.setUnlocalizedName(name);
        if (tab != null) item.setCreativeTab(tab);

        reg.register(item);

        return item;
    }
}