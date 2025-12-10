package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.init.GrowableOreCaneBlock;
import com.skniro.growableores.item.MapleItems;
import com.skniro.growableores.item.ModCreativeModeTabs;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

public class GrowableTechRebornOresBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(GrowableOres.MOD_ID);

    //TechReborn
    public static final Supplier<Block> cinnabar_Cane =registerBlock("cinnabar_cane", GrowableOreCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> galena_Cane =registerBlock("galena_cane", GrowableOreCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> iridium_Cane =registerBlock("iridium_cane", GrowableOreCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> lead_Cane =registerBlock("lead_cane", GrowableOreCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> peridot_Cane =registerBlock("peridot_cane", GrowableOreCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> pyrite_Cane =registerBlock("pyrite_cane", GrowableOreCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> ruby_Cane =registerBlock("ruby_cane", GrowableOreCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> sapphire_Cane =registerBlock("sapphire_cane", GrowableOreCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> sheldonite_Cane =registerBlock("sheldonite_cane", GrowableOreCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> silver_Cane =registerBlock("silver_cane", GrowableOreCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> sodalite_Cane =registerBlock("sodalite_cane", GrowableOreCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> sphalerite_Cane =registerBlock("sphalerite_cane", GrowableOreCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> tin_Cane =registerBlock("tin_cane", GrowableOreCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> tungsten_Cane =registerBlock("tungsten_cane", GrowableOreCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final Supplier<Block> bauxite_Cane =registerBlock("bauxite_cane", GrowableOreCaneBlock::new, (BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)), ModCreativeModeTabs.Growable_Ores_Group);


    private static <B extends Block> DeferredBlock<B> registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> register = BLOCKS.registerBlock(name, block, properties.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(GrowableOres.MOD_ID, name))));
        return register;
    }

    private static <B extends Block> DeferredBlock<B> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties, Supplier<CreativeModeTab> tab) {
        DeferredBlock<B> bDeferredBlock = registerBlockWithoutItem(name, block, properties);
        registerBlockItem(name, bDeferredBlock);
        return bDeferredBlock;
    }

    private static <T extends Block> Holder<Item> registerBlockItem(String name, Supplier<T> block) {
        return MapleItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GrowableOres.MOD_ID, name)))));
    }

    public static void registerGrowableBlocks(net.neoforged.bus.api.IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

