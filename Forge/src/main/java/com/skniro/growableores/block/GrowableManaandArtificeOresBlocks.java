package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.init.GrowableOreCaneBlock;
import com.skniro.growableores.item.MapleItems;
import com.skniro.growableores.item.ModCreativeModeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
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

public class GrowableManaandArtificeOresBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GrowableOres.MOD_ID);

    //ManaandArtifice
    public static final RegistryObject<Block> MA_Animus_Dust_Cane = registerBlock("ma_animus_dust_cane", () -> new GrowableOreCaneBlock(Block.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> MA_Arcane_Ash_Cane = registerBlock("ma_arcane_ash_cane", () -> new GrowableOreCaneBlock(Block.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> MA_Bone_Ash_Cane = registerBlock("ma_bone_ash_cane", () -> new GrowableOreCaneBlock(Block.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> MA_Ironbark_Cane = registerBlock("ma_ironbark_cane", () -> new GrowableOreCaneBlock(Block.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> MA_Living_Flame_Cane = registerBlock("ma_living_flame_cane", () -> new GrowableOreCaneBlock(Block.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> MA_Mote_Air_Cane = registerBlock("ma_mote_air_cane", () -> new GrowableOreCaneBlock(Block.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> MA_Mote_Arcane_Cane = registerBlock("ma_mote_arcane_cane", () -> new GrowableOreCaneBlock(Block.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> MA_Mote_Earth_Cane = registerBlock("ma_mote_earth_cane", () -> new GrowableOreCaneBlock(Block.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> MA_Mote_Ender_Cane = registerBlock("ma_mote_ender_cane", () -> new GrowableOreCaneBlock(Block.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> MA_Mote_Fire_Cane = registerBlock("ma_mote_fire_cane", () -> new GrowableOreCaneBlock(Block.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> MA_Mote_Water_Cane = registerBlock("ma_mote_water_cane", () -> new GrowableOreCaneBlock(Block.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> MA_Purified_Vinteum_Dust_Cane = registerBlock("ma_purified_vinteum_dust_cane", () -> new GrowableOreCaneBlock(Block.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> MA_Purified_Vinteum_Ingot_Cane = registerBlock("ma_purified_vinteum_ingot_cane", () -> new GrowableOreCaneBlock(Block.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> MA_Resonating_Dust_Cane = registerBlock("ma_resonating_dust_cane", () -> new GrowableOreCaneBlock(Block.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> MA_Superheated_Purified_Vinteum_Ingot_Cane = registerBlock("ma_superheated_purified_vinteum_ingot_cane", () -> new GrowableOreCaneBlock(Block.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> MA_Superheated_Vinteum_Ingot_Cane = registerBlock("ma_superheated_vinteum_ingot_cane", () -> new GrowableOreCaneBlock(Block.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> MA_Vinteum_Dust_Cane = registerBlock("ma_vinteum_dust_cane", () -> new GrowableOreCaneBlock(Block.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> MA_Vinteum_Ingot_Cane = registerBlock("ma_vinteum_ingot_cane", () -> new GrowableOreCaneBlock(Block.Properties.of(Material.PLANT, MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().strength(0.0F).sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);

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

    public static void registerGrowableBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

