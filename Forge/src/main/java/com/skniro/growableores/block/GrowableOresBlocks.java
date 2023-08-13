package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.init.GrowableSugarCaneBlock;
import com.skniro.growableores.item.MapleItems;
import com.skniro.growableores.item.ModCreativeModeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.SugarCaneBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class GrowableOresBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GrowableOres.MODID);

    //Village
    public static final RegistryObject<Block> Iron_Cane =registerBlock("iron_cane", () -> new SugarCaneBlock(Block.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Coal_Cane =registerBlock("coal_cane", () -> new GrowableSugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Emerald_Cane =registerBlock("emerald_cane", () -> new GrowableSugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Gold_Cane =registerBlock("gold_cane", () -> new GrowableSugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Redstone_Cane =registerBlock("redstone_cane", () -> new GrowableSugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Nether_Quartz_Cane =registerBlock("nether_quartz_cane", () -> new GrowableSugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Lapis_Cane =registerBlock("lapis_cane", () -> new GrowableSugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Diamond_Cane =registerBlock("diamond_cane", () -> new GrowableSugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Copper_Cane =registerBlock("copper_cane", () -> new GrowableSugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Blaze_Rod_Cane =registerBlock("blaze_rod_cane", () -> new GrowableSugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Ender_Pearl_Cane =registerBlock("ender_pearl_cane", () -> new GrowableSugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);

    //Ae2
    public static final RegistryObject<Block> certus_quartz_crystal_Cane =registerBlock("certus_quartz_crystal_cane", () -> new GrowableSugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);


    //BetterEnd
    public static final RegistryObject<Block> amber_Cane =registerBlock("amber_cane", () -> new SugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> ender_Cane =registerBlock("ender_cane", () -> new SugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> thallasium_Cane =registerBlock("thallasium_cane", () -> new SugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);


    //Powah Rearchitected and Powah
    public static final RegistryObject<Block> Steel_Energized_Cane =registerBlock("steel_energized_cane", () -> new SugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Uraninite_Ore_Dense_Cane =registerBlock("uraninite_ore_dense_cane", () -> new SugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Ender_Core_Cane =registerBlock("ender_core_cane", () -> new SugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Crystal_Spirited_Cane =registerBlock("crystal_spirited_cane", () -> new SugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Crystal_Nitro_Cane =registerBlock("crystal_nitro_cane", () -> new SugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Crystal_Niotic_Cane =registerBlock("crystal_niotic_cane", () -> new SugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Crystal_Blazing_Cane =registerBlock("crystal_blazing_cane", () -> new SugarCaneBlock(Block.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);



    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, ItemGroup tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, ItemGroup tab) {
        return MapleItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTabs.Growable_Ores_Group)));
    }

    public static void registerMapleBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

