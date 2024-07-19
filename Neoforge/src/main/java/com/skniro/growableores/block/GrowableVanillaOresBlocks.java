package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.item.MapleItems;
import com.skniro.growableores.item.ModCreativeModeTabs;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SugarCaneBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class GrowableVanillaOresBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, GrowableOres.MODID);

    //Village
    public static final Supplier<Block> Iron_Cane =registerBlock("iron_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Coal_Cane =registerBlock("coal_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Emerald_Cane =registerBlock("emerald_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Gold_Cane =registerBlock("gold_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Redstone_Cane =registerBlock("redstone_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Nether_Quartz_Cane =registerBlock("nether_quartz_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Lapis_Cane =registerBlock("lapis_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Diamond_Cane =registerBlock("diamond_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Copper_Cane =registerBlock("copper_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Blaze_Rod_Cane =registerBlock("blaze_rod_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Ender_Pearl_Cane =registerBlock("ender_pearl_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Clay_Cane = registerBlock("clay_cane", () ->  new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Slime_Cane = registerBlock("slime_cane", () ->  new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Nether_Star_Cane = registerBlock("nether_star_cane", () ->  new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Glowstone_Cane = registerBlock("glowstone_cane", () ->  new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Bone_Cane = registerBlock("bone_cane", () ->  new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Netherite_Ingot_Cane =registerBlock("netherite_ingot_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Egg_Cane = registerBlock("egg_cane", () ->  new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Feather_Cane = registerBlock("feather_cane", () ->  new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Wool_Cane = registerBlock("wool_cane", () ->  new SugarCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);


    private static <T extends Block> Supplier<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        Supplier<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block, Supplier<CreativeModeTab> tab) {
        Supplier<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> Holder<Item> registerBlockItem(String name, Supplier<T> block, Supplier<CreativeModeTab> tab) {
        return MapleItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void registerMapleBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

