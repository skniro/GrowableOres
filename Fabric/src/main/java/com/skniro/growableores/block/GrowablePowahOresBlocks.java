package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.logging.Logger;

public class GrowablePowahOresBlocks {
    //Powah Rearchitected and Powah
    public static final Block Steel_Energized_Cane =registerBlock("steel_energized_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Uraninite_Ore_Dense_Cane =registerBlock("uraninite_ore_dense_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Ender_Core_Cane =registerBlock("ender_core_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Crystal_Spirited_Cane =registerBlock("crystal_spirited_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Crystal_Nitro_Cane =registerBlock("crystal_nitro_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Crystal_Niotic_Cane =registerBlock("crystal_niotic_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Crystal_Blazing_Cane =registerBlock("crystal_blazing_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(GrowableOres.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(GrowableOres.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks(){
        Logger.getLogger("register mod blocks" + GrowableOres.MOD_ID);
    }
}

