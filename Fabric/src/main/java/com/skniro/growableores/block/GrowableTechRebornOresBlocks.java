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
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.logging.Logger;

public class GrowableTechRebornOresBlocks {
    //TechReborn
    public static final Block cinnabar_Cane =registerBlock("cinnabar_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block galena_Cane =registerBlock("galena_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block iridium_Cane =registerBlock("iridium_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block lead_Cane =registerBlock("lead_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block peridot_Cane =registerBlock("peridot_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block pyrite_Cane =registerBlock("pyrite_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ruby_Cane =registerBlock("ruby_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block sapphire_Cane =registerBlock("sapphire_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block sheldonite_Cane =registerBlock("sheldonite_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block silver_Cane =registerBlock("silver_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block sodalite_Cane =registerBlock("sodalite_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block sphalerite_Cane =registerBlock("sphalerite_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block tin_Cane =registerBlock("tin_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block tungsten_Cane =registerBlock("tungsten_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block bauxite_Cane =registerBlock("bauxite_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);


    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(GrowableOres.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> tab) {
        return Registry.register(Registries.ITEM, new Identifier(GrowableOres.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks(){
        Logger.getLogger("register mod blocks" + GrowableOres.MOD_ID);
    }
}

