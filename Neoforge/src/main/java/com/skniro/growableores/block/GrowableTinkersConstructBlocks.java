package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.init.GrowableOreCaneBlock;
import com.skniro.growableores.item.MapleItems;
import com.skniro.growableores.item.ModCreativeModeTabs;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class GrowableTinkersConstructBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, GrowableOres.MOD_ID);

    //Tinkers' Construct
    public static final Supplier<Block> TC_Amethyst_Bronze_Ingot_Cane = registerBlock("tc_amethyst_bronze_ingot_cane",  () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> TC_Blazing_Bone_Cane = registerBlock("tc_blazing_bone_cane",  () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> TC_Cheese_Ingot_Cane = registerBlock("tc_cheese_ingot_cane",  () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> TC_Cobalt_Ingot_Cane = registerBlock("tc_cobalt_ingot_cane",  () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> TC_Earth_Slime_Crystal_Cane = registerBlock("tc_earth_slime_crystal_cane",  () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> TC_Ender_Slime_Crystal_Cane = registerBlock("tc_ender_slime_crystal_cane",  () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> TC_Hepatizon_Ingot_Cane = registerBlock("tc_hepatizon_ingot_cane",  () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> TC_Ichor_Slime_Crystal_Cane = registerBlock("tc_ichor_slime_crystal_cane",  () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> TC_Knightslime_Ingot_Cane = registerBlock("tc_knightslime_ingot_cane",  () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> TC_Manyullyn_Ingot_Cane = registerBlock("tc_manyullyn_ingot_cane",  () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> TC_Modifier_Crystal_Cane = registerBlock("tc_modifier_crystal_cane",  () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> TC_Necronium_Bone_Cane = registerBlock("tc_necronium_bone_cane",  () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> TC_Necrotic_Bone_Cane = registerBlock("tc_necrotic_bone_cane",  () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> TC_Queens_Slime_Ingot_Cane = registerBlock("tc_queens_slime_ingot_cane",  () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> TC_Rose_Gold_Ingot_Cane = registerBlock("tc_rose_gold_ingot_cane",  () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> TC_Sky_Slime_Crystal_Cane = registerBlock("tc_sky_slime_crystal_cane",  () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> TC_Slimesteel_Ingot_Cane = registerBlock("tc_slimesteel_ingot_cane",  () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> TC_Soulsteel_Ingot_Cane = registerBlock("tc_soulsteel_ingot_cane",  () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);


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

    public static void registerGrowableBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

