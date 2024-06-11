package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.item.MapleItems;
import com.skniro.growableores.item.ModCreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SugarCaneBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class GrowableAdAstraOresBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GrowableOres.MODID);

    //Ad Astra!
    public static final RegistryObject<Block> AD_Ostrum_Cane =registerBlock("ad_mars_ore_ostrum_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> AD_Ice_Shard_Cane =registerBlock("ad_moon_ice_shard_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> AD_Cheese_Cane =registerBlock("ad_moon_ore_cheese_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> AD_Desh_Cane =registerBlock("ad_moon_ore_desh_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> AD_Calorite_Cane =registerBlock("ad_venus_calorite_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);



    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, RegistryObject<CreativeModeTab> tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, RegistryObject<CreativeModeTab> tab) {
        return MapleItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void registerAdAstraBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
