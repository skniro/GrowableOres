package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.item.MapleItems;
import com.skniro.growableores.item.ModCreativeModeTabs;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SugarCaneBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

public class GrowableVanillaOresBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(GrowableOres.MODID);

    //Village
    public static final Supplier<Block> Iron_Cane =registerBlock("iron_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Coal_Cane =registerBlock("coal_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Emerald_Cane =registerBlock("emerald_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Gold_Cane =registerBlock("gold_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Redstone_Cane =registerBlock("redstone_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Nether_Quartz_Cane =registerBlock("nether_quartz_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Lapis_Cane =registerBlock("lapis_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Diamond_Cane =registerBlock("diamond_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Copper_Cane =registerBlock("copper_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Blaze_Rod_Cane =registerBlock("blaze_rod_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Ender_Pearl_Cane =registerBlock("ender_pearl_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Clay_Cane = registerBlock("clay_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Slime_Cane = registerBlock("slime_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Nether_Star_Cane = registerBlock("nether_star_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Glowstone_Cane = registerBlock("glowstone_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Bone_Cane = registerBlock("bone_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Netherite_Ingot_Cane =registerBlock("netherite_ingot_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Egg_Cane = registerBlock("egg_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Feather_Cane = registerBlock("feather_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> Wool_Cane = registerBlock("wool_cane", SugarCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);


    private static <B extends Block> DeferredBlock<B> registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> register = BLOCKS.registerBlock(name, block, properties.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(GrowableOres.MODID, name))));
        return register;
    }

    private static <B extends Block> DeferredBlock<B> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties, Supplier<CreativeModeTab> tab) {
        DeferredBlock<B> bDeferredBlock = registerBlockWithoutItem(name, block, properties);
        registerBlockItem(name, bDeferredBlock);
        return bDeferredBlock;
    }

    private static <T extends Block> Holder<Item> registerBlockItem(String name, Supplier<T> block) {
        return MapleItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(GrowableOres.MODID, name)))));
    }

    public static void registerMapleBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

