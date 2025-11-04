package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.init.GrowableOreCaneBlock;
import com.skniro.growableores.item.MapleItems;
import com.skniro.growableores.item.ModCreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class GrowableElectroDynamicsOresBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GrowableOres.MOD_ID);

    //Electro Dynamics
    public static final Supplier<Block> ED_Ingot_Aluminum_Cane =registerBlock("ed_ingot_aluminum_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> ED_Ingot_Bronze_Cane = registerBlock("ed_ingot_bronze_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> ED_Ingot_Chromium_Cane = registerBlock("ed_ingot_chromium_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> ED_Ingot_Hsla_Steel_Cane = registerBlock("ed_ingot_hsla_steel_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> ED_Ingot_Lead_Cane = registerBlock("ed_ingot_lead_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> ED_Ingot_Lithium_Cane = registerBlock("ed_ingot_lithium_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> ED_Ingot_Molybdenum_Cane = registerBlock("ed_ingot_molybdenum_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> ED_Ingot_Silver_Cane = registerBlock("ed_ingot_silver_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> ED_Ingot_Stainless_Steel_Cane = registerBlock("ed_ingot_stainless_steel_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> ED_Ingot_Steel_Cane = registerBlock("ed_ingot_steel_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> ED_Ingot_Superconductive_Cane = registerBlock("ed_ingot_superconductive_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> ED_Ingot_Tin_Cane = registerBlock("ed_ingot_tin_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> ED_Ingot_Titanium_Cane = registerBlock("ed_ingot_titanium_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> ED_Ingot_Titanium_Carbide_Cane = registerBlock("ed_ingot_titanium_carbide_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> ED_Ingot_Vanadium_Cane = registerBlock("ed_ingot_vanadium_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> ED_Ingot_Vanadium_Steel_Cane = registerBlock("ed_ingot_vanadium_steel_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);


    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return MapleItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTabs.Growable_Ores_Group)));
    }

    public static void registerModBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

