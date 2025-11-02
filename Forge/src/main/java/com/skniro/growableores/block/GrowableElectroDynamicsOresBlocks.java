package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.init.GrowableOreCaneBlock;
import com.skniro.growableores.item.MapleItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
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

public class GrowableElectroDynamicsOresBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GrowableOres.MOD_ID);

    //Electro Dynamics
    public static final Supplier<Block> ED_Ingot_Aluminum_Cane =registerBlock("ed_ingot_aluminum_cane", GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY));
    public static final Supplier<Block> ED_Ingot_Bronze_Cane = registerBlock("ed_ingot_bronze_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY));
    public static final Supplier<Block> ED_Ingot_Chromium_Cane = registerBlock("ed_ingot_chromium_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY));
    public static final Supplier<Block> ED_Ingot_Hsla_Steel_Cane = registerBlock("ed_ingot_hsla_steel_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY));
    public static final Supplier<Block> ED_Ingot_Lead_Cane = registerBlock("ed_ingot_lead_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY));
    public static final Supplier<Block> ED_Ingot_Lithium_Cane = registerBlock("ed_ingot_lithium_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY));
    public static final Supplier<Block> ED_Ingot_Molybdenum_Cane = registerBlock("ed_ingot_molybdenum_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY));
    public static final Supplier<Block> ED_Ingot_Silver_Cane = registerBlock("ed_ingot_silver_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY));
    public static final Supplier<Block> ED_Ingot_Stainless_Steel_Cane = registerBlock("ed_ingot_stainless_steel_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY));
    public static final Supplier<Block> ED_Ingot_Steel_Cane = registerBlock("ed_ingot_steel_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY));
    public static final Supplier<Block> ED_Ingot_Superconductive_Cane = registerBlock("ed_ingot_superconductive_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY));
    public static final Supplier<Block> ED_Ingot_Tin_Cane = registerBlock("ed_ingot_tin_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY));
    public static final Supplier<Block> ED_Ingot_Titanium_Cane = registerBlock("ed_ingot_titanium_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY));
    public static final Supplier<Block> ED_Ingot_Titanium_Carbide_Cane = registerBlock("ed_ingot_titanium_carbide_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY));
    public static final Supplier<Block> ED_Ingot_Vanadium_Cane = registerBlock("ed_ingot_vanadium_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY));
    public static final Supplier<Block> ED_Ingot_Vanadium_Steel_Cane = registerBlock("ed_ingot_vanadium_steel_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY));

    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    public static <B extends Block> RegistryObject<Block> register(String name, Function<BlockBehaviour.Properties, ? extends B> func, BlockBehaviour.Properties props) {
        return BLOCKS.register(name, () -> {
            return (Block)func.apply(props.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(GrowableOres.MOD_ID, name))));
        });
    }

    private static <B extends Block> RegistryObject<Block> registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        RegistryObject<Block> register = register(name, block, properties.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(GrowableOres.MOD_ID, name))));
        return register;
    }

    private static <B extends Block> RegistryObject<Block> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        RegistryObject<Block> bRegistryObject = registerBlockWithoutItem(name, block, properties);
        registerBlockItem(name, bRegistryObject);
        return bRegistryObject;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, Supplier<T> block) {
        return MapleItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(GrowableOres.MOD_ID, name)))));
    }

    public static void registerModBlocks(BusGroup eventBus) {
        BLOCKS.register(eventBus);
    }
}

