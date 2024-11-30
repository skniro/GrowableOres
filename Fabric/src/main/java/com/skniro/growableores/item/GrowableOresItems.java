package com.skniro.growableores.item;

import com.skniro.growableores.GrowableOres;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GrowableOresItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GrowableOres.MOD_ID, name), item);
    }

    public static void shield_item(){
      GrowableOres.LOGGER.debug("register shield item.");
    }
}
