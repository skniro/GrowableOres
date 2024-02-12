package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.util.GrowableOresItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
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

public class GrowableModernIndustrializationOresBlocks {
    //Modern Industrialization
    public static final Block MI_antimony_Cane =registerBlock("mi_antimony_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_bauxite_Cane =registerBlock("mi_bauxite_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_iridium_Cane =registerBlock("mi_iridium_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_lead_Cane =registerBlock("mi_lead_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_lignite_coal_Cane =registerBlock("mi_lignite_coal_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_monazite_Cane =registerBlock("mi_monazite_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_nickel_Cane =registerBlock("mi_nickel_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_platinum_Cane =registerBlock("mi_platinum_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_quartz_Cane =registerBlock("mi_quartz_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_salt_Cane =registerBlock("mi_salt_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_tin_Cane =registerBlock("mi_tin_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_titanium_Cane =registerBlock("mi_titanium_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_tungsten_Cane =registerBlock("mi_tungsten_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MI_uranium_Cane =registerBlock("mi_uranium_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);

    //ic2 and ic2c
    public static final Block IC2_Aluminium_Cane =registerBlock("ic_aluminium_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block IC2_silver_Cane =registerBlock("ic_silver_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block IC2_Tin_Cane =registerBlock("ic_tin_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block IC2_Uranium_Cane =registerBlock("ic_uranium_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);

    //Ad Astra!
    public static final Block AD_Ostrum_Cane =registerBlock("ad_mars_ore_ostrum_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block AD_Ice_Shard_Cane =registerBlock("ad_moon_ice_shard_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block AD_Cheese_Cane =registerBlock("ad_moon_ore_cheese_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block AD_Desh_Cane =registerBlock("ad_moon_ore_desh_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block AD_Calorite_Cane =registerBlock("ad_venus_calorite_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);

    //Create
    public static final Block C_Andesite_Alloy_Cane =registerBlock("c_andesite_alloy_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block C_Brass_Ingot_Cane =registerBlock("c_brass_ingot_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block C_Polished_Rose_Quartz_Cane =registerBlock("c_polished_rose_quartz_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block C_Zinc_Cane =registerBlock("c_zinc_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);

    //Thermal Series
    public static final Block TF_Apatite_Cane =registerBlock("tf_apatite_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TF_Cinnabar_Cane =registerBlock("tf_cinnabar_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TF_Copper_Cane =registerBlock("tf_copper_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TF_Lead_Cane =registerBlock("tf_lead_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TF_Nickel_Cane =registerBlock("tf_nickel_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TF_Niter_Cane =registerBlock("tf_niter_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TF_Ruby_Cane =registerBlock("tf_ruby_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TF_Sapphire_Cane =registerBlock("tf_sapphire_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TF_Silver_Cane =registerBlock("tf_silver_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TF_Sulfur_Cane =registerBlock("tf_sulfur_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TF_Tin_Cane =registerBlock("tf_tin_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY)),GrowableOresItemGroups.Growable_Ores_Group);



    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(GrowableOres.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> tab) {
        return Registry.register(Registries.ITEM, new Identifier(GrowableOres.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks(){
        Logger.getLogger("register mod blocks" + GrowableOres.MOD_ID);
    }
}

