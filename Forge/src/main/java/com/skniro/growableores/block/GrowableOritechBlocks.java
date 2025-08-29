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
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class GrowableOritechBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GrowableOres.MOD_ID);

    //Oritech
    public static final RegistryObject<Block> OT_Adamant_Ingot_Cane = registerBlock("ot_adamant_ingot_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> OT_Biosteel_Ingot_Cane = registerBlock("ot_biosteel_ingot_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> OT_Duratium_Ingot_Cane = registerBlock("ot_duratium_ingot_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> OT_Electrum_Ingot_Cane = registerBlock("ot_electrum_ingot_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> OT_Energite_Ingot_Cane = registerBlock("ot_energite_ingot_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> OT_Nickel_Ingot_Cane = registerBlock("ot_nickel_ingot_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> OT_Platinum_Ingot_Cane = registerBlock("ot_platinum_ingot_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> OT_Prometheum_Ingot_Cane = registerBlock("ot_prometheum_ingot_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> OT_Steel_Ingot_Cane = registerBlock("ot_steel_ingot_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> OT_Uranium_Crystal_Cane = registerBlock("ot_uranium_crystal_cane", () -> new GrowableOreCaneBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);


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

    public static void registerMapleBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

