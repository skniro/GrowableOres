package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.logging.Logger;

public class GrowableThermalSeriesOresBlocks {
    //Thermal Series
    public static final Block TF_Apatite_Cane =registerBlock("tf_apatite_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block TF_Cinnabar_Cane =registerBlock("tf_cinnabar_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block TF_Copper_Cane =registerBlock("tf_copper_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block TF_Lead_Cane =registerBlock("tf_lead_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block TF_Nickel_Cane =registerBlock("tf_nickel_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block TF_Niter_Cane =registerBlock("tf_niter_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block TF_Ruby_Cane =registerBlock("tf_ruby_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block TF_Sapphire_Cane =registerBlock("tf_sapphire_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block TF_Silver_Cane =registerBlock("tf_silver_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block TF_Sulfur_Cane =registerBlock("tf_sulfur_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block TF_Tin_Cane =registerBlock("tf_tin_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);



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

