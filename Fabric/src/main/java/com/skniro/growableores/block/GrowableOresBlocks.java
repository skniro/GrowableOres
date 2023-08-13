package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.init.GrowableOresSugarCaneBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.logging.Logger;

public class GrowableOresBlocks {
    //Village
    public static final Block Iron_Cane =registerBlock("iron_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Coal_Cane =registerBlock("coal_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Emerald_Cane =registerBlock("emerald_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Gold_Cane =registerBlock("gold_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Redstone_Cane =registerBlock("redstone_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Nether_Quartz_Cane =registerBlock("nether_quartz_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Lapis_Cane =registerBlock("lapis_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Diamond_Cane =registerBlock("diamond_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Copper_Cane =registerBlock("copper_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Blaze_Rod_Cane =registerBlock("blaze_rod_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Ender_Pearl_Cane =registerBlock("ender_pearl_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);

    //Ae2
    public static final Block certus_quartz_crystal_Cane =registerBlock("certus_quartz_crystal_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);


    //TechReborn
    public static final Block cinnabar_Cane =registerBlock("cinnabar_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block galena_Cane =registerBlock("galena_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block iridium_Cane =registerBlock("iridium_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block lead_Cane =registerBlock("lead_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block peridot_Cane =registerBlock("peridot_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block pyrite_Cane =registerBlock("pyrite_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block ruby_Cane =registerBlock("ruby_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block sapphire_Cane =registerBlock("sapphire_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block sheldonite_Cane =registerBlock("sheldonite_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block silver_Cane =registerBlock("silver_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block sodalite_Cane =registerBlock("sodalite_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block sphalerite_Cane =registerBlock("sphalerite_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block tin_Cane =registerBlock("tin_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block tungsten_Cane =registerBlock("tungsten_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block bauxite_Cane =registerBlock("bauxite_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);

    //BetterEnd
    public static final Block amber_Cane =registerBlock("amber_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block ender_Cane =registerBlock("ender_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block thallasium_Cane =registerBlock("thallasium_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);

    //Maple
    public static final Block Salt_Cane =registerBlock("salt_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);

    //Powah Rearchitected and Powah
    public static final Block Steel_Energized_Cane =registerBlock("steel_energized_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Uraninite_Ore_Dense_Cane =registerBlock("uraninite_ore_dense_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Ender_Core_Cane =registerBlock("ender_core_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Crystal_Spirited_Cane =registerBlock("crystal_spirited_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Crystal_Nitro_Cane =registerBlock("crystal_nitro_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Crystal_Niotic_Cane =registerBlock("crystal_niotic_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block Crystal_Blazing_Cane =registerBlock("crystal_blazing_cane", new GrowableOresSugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);


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

