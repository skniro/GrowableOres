package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.util.GrowableOresItemGroups;
import com.skniro.growableores.block.init.GrowableOreCaneBlock;
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

public class GrowableMekanismOresBlocks {
    //Mekanism
    public static final Block MEK_Fluorite_Cane =registerBlock("mek_fluorite_cane",GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MEK_Lead_Cane =registerBlock("mek_lead_cane",GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MEK_Osmium_Cane =registerBlock("mek_osmium_cane",GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MEK_Tin_Cane =registerBlock("mek_tin_cane",GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MEK_Uranium_Cane =registerBlock("mek_uranium_cane",GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MEK_Steel_Cane =registerBlock("mek_steel_cane",GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MEK_Refined_Obsidian_Cane =registerBlock("mek_refined_obsidian_cane",GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MEK_Refined_Glowstone_Cane =registerBlock("mek_refined_glowstone_cane",GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MEK_Bronze_Cane =registerBlock("mek_bronze_cane",GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);



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

