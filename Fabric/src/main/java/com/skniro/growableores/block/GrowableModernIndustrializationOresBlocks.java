package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.util.GrowableOresItemGroups;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.SugarCaneBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;
import java.util.logging.Logger;

public class GrowableModernIndustrializationOresBlocks {
    //Modern Industrialization
    public static final Block MI_antimony_Cane =registerBlock("mi_antimony_cane", SugarCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_bauxite_Cane =registerBlock("mi_bauxite_cane", SugarCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_iridium_Cane =registerBlock("mi_iridium_cane", SugarCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_lead_Cane =registerBlock("mi_lead_cane", SugarCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_lignite_coal_Cane =registerBlock("mi_lignite_coal_cane", SugarCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_monazite_Cane =registerBlock("mi_monazite_cane", SugarCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_nickel_Cane =registerBlock("mi_nickel_cane", SugarCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_platinum_Cane =registerBlock("mi_platinum_cane", SugarCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_quartz_Cane =registerBlock("mi_quartz_cane", SugarCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_salt_Cane =registerBlock("mi_salt_cane",SugarCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_tin_Cane =registerBlock("mi_tin_cane", SugarCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_titanium_Cane =registerBlock("mi_titanium_cane", SugarCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_tungsten_Cane =registerBlock("mi_tungsten_cane", SugarCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_uranium_Cane =registerBlock("mi_uranium_cane", SugarCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);



    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings, RegistryKey<ItemGroup> tab) {
        Block block = (Block)factory.apply(settings.registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrowableOres.MOD_ID, name))));
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrowableOres.MOD_ID, name)), block);
    }

    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> tab) {
        return Registry.register(Registries.ITEM, RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GrowableOres.MOD_ID, name)),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GrowableOres.MOD_ID, name)))));
    }
    public static void registerModBlocks(){
        Logger.getLogger("register mod blocks" + GrowableOres.MOD_ID);
    }
}

