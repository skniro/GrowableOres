package com.skniro.growableores.item;

import com.skniro.growableores.GrowableOres;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

public class GrowableOresItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(GrowableOres.MOD_ID, name), item);
    }

    public static void shield_item(){
      GrowableOres.LOGGER.debug("register shield item.");
    }
}
