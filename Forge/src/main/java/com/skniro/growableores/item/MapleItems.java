package com.skniro.growableores.item;

import com.skniro.growableores.GrowableOres;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class MapleItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, GrowableOres.MODID);

    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item, ItemGroup tab) {
        RegistryObject<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}