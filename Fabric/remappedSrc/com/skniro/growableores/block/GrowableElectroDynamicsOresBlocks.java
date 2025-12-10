package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.init.GrowableOreCaneBlock;
import com.skniro.growableores.util.GrowableOresItemGroups;
import java.util.function.Function;
import java.util.logging.Logger;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
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

public class GrowableElectroDynamicsOresBlocks {
    //Electro Dynamics
    public static final Block ED_Ingot_Aluminum_Cane =registerBlock("ed_ingot_aluminum_cane", GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Bronze_Cane = registerBlock("ed_ingot_bronze_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Chromium_Cane = registerBlock("ed_ingot_chromium_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Hsla_Steel_Cane = registerBlock("ed_ingot_hsla_steel_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Lead_Cane = registerBlock("ed_ingot_lead_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Lithium_Cane = registerBlock("ed_ingot_lithium_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Molybdenum_Cane = registerBlock("ed_ingot_molybdenum_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Silver_Cane = registerBlock("ed_ingot_silver_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Stainless_Steel_Cane = registerBlock("ed_ingot_stainless_steel_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Steel_Cane = registerBlock("ed_ingot_steel_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Superconductive_Cane = registerBlock("ed_ingot_superconductive_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Tin_Cane = registerBlock("ed_ingot_tin_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Titanium_Cane = registerBlock("ed_ingot_titanium_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Titanium_Carbide_Cane = registerBlock("ed_ingot_titanium_carbide_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Vanadium_Cane = registerBlock("ed_ingot_vanadium_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Vanadium_Steel_Cane = registerBlock("ed_ingot_vanadium_steel_cane", GrowableOreCaneBlock::new, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY), GrowableOresItemGroups.Growable_Ores_Group);

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings, ResourceKey<CreativeModeTab> tab) {
        Block block = (Block)factory.apply(settings.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(GrowableOres.MOD_ID, name))));
        registerBlockItem(name, block, tab);
        return Registry.register(BuiltInRegistries.BLOCK, ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(GrowableOres.MOD_ID, name)), block);
    }

    private static Item registerBlockItem(String name, Block block, ResourceKey<CreativeModeTab> tab) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GrowableOres.MOD_ID, name)),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GrowableOres.MOD_ID, name)))));
    }
    public static void registerModBlocks(){
        Logger.getLogger("register mod blocks" + GrowableOres.MOD_ID);
    }
}

