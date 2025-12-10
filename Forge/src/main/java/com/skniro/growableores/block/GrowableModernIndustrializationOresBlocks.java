package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.init.GrowableOreCaneBlock;
import com.skniro.growableores.item.MapleItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class GrowableModernIndustrializationOresBlocks {
    public static final DeferredRegister<net.minecraft.world.level.block.Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GrowableOres.MOD_ID);

    //Modern Industrialization
    public static final Supplier<Block> MI_antimony_Cane =registerBlock("mi_antimony_cane", GrowableOreCaneBlock::new ,(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final Supplier<Block> MI_bauxite_Cane =registerBlock("mi_bauxite_cane", GrowableOreCaneBlock::new ,(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final Supplier<Block> MI_iridium_Cane =registerBlock("mi_iridium_cane", GrowableOreCaneBlock::new ,(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final Supplier<Block> MI_lead_Cane =registerBlock("mi_lead_cane", GrowableOreCaneBlock::new ,(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final Supplier<Block> MI_lignite_coal_Cane =registerBlock("mi_lignite_coal_cane", GrowableOreCaneBlock::new ,(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final Supplier<Block> MI_monazite_Cane =registerBlock("mi_monazite_cane", GrowableOreCaneBlock::new ,(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final Supplier<Block> MI_nickel_Cane =registerBlock("mi_nickel_cane", GrowableOreCaneBlock::new ,(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final Supplier<Block> MI_platinum_Cane =registerBlock("mi_platinum_cane", GrowableOreCaneBlock::new ,(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final Supplier<Block> MI_quartz_Cane =registerBlock("mi_quartz_cane", GrowableOreCaneBlock::new ,(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final Supplier<Block> MI_salt_Cane =registerBlock("mi_salt_cane",GrowableOreCaneBlock::new ,(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final Supplier<Block> MI_tin_Cane =registerBlock("mi_tin_cane", GrowableOreCaneBlock::new ,(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final Supplier<Block> MI_titanium_Cane =registerBlock("mi_titanium_cane", GrowableOreCaneBlock::new ,(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final Supplier<Block> MI_tungsten_Cane =registerBlock("mi_tungsten_cane", GrowableOreCaneBlock::new ,(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final Supplier<Block> MI_uranium_Cane =registerBlock("mi_uranium_cane", GrowableOreCaneBlock::new ,(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));



    private static <T extends net.minecraft.world.level.block.Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    public static <B extends net.minecraft.world.level.block.Block> RegistryObject<net.minecraft.world.level.block.Block> register(String name, Function<BlockBehaviour.Properties, ? extends B> func, BlockBehaviour.Properties props) {
        return BLOCKS.register(name, () -> {
            return (net.minecraft.world.level.block.Block)func.apply(props.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(GrowableOres.MOD_ID, name))));
        });
    }

    private static <B extends net.minecraft.world.level.block.Block> RegistryObject<net.minecraft.world.level.block.Block> registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        RegistryObject<net.minecraft.world.level.block.Block> register = register(name, block, properties.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(GrowableOres.MOD_ID, name))));
        return register;
    }

    private static <B extends net.minecraft.world.level.block.Block> RegistryObject<net.minecraft.world.level.block.Block> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        RegistryObject<net.minecraft.world.level.block.Block> bRegistryObject = registerBlockWithoutItem(name, block, properties);
        registerBlockItem(name, bRegistryObject);
        return bRegistryObject;
    }

    private static <T extends net.minecraft.world.level.block.Block> RegistryObject<net.minecraft.world.item.Item> registerBlockItem(String name, Supplier<T> block) {
        return MapleItems.ITEMS.register(name, () -> new net.minecraft.world.item.BlockItem(block.get(),
                new net.minecraft.world.item.Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GrowableOres.MOD_ID, name)))));
    }

    public static void registerModBlocks(BusGroup eventBus) {
        BLOCKS.register(eventBus);
    }
}

