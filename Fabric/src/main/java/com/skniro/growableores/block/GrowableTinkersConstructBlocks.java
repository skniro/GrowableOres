package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.init.GrowableOreCaneBlock;
import com.skniro.growableores.util.GrowableOresItemGroups;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
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

public class GrowableTinkersConstructBlocks {
    //Tinkers' Construct
    public static final Block TC_Amethyst_Bronze_Ingot_Cane = registerBlock("tc_amethyst_bronze_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Ardite_Ingot_Cane = registerBlock("tc_ardite_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Blazing_Bone_Cane = registerBlock("tc_blazing_bone_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Cheese_Ingot_Cane = registerBlock("tc_cheese_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Cobalt_Ingot_Cane = registerBlock("tc_cobalt_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Earth_Slime_Crystal_Cane = registerBlock("tc_earth_slime_crystal_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Ender_Slime_Crystal_Cane = registerBlock("tc_ender_slime_crystal_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Hepatizon_Ingot_Cane = registerBlock("tc_hepatizon_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Hollow_Ingot_Cane = registerBlock("tc_hollow_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Ichor_Slime_Crystal_Cane = registerBlock("tc_ichor_slime_crystal_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Knightslime_Ingot_Cane = registerBlock("tc_knightslime_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Manyullyn_Ingot_Cane = registerBlock("tc_manyullyn_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Modifier_Crystal_Cane = registerBlock("tc_modifier_crystal_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Necronium_Bone_Cane = registerBlock("tc_necronium_bone_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Necrotic_Bone_Cane = registerBlock("tc_necrotic_bone_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Pigiron_Ingot_Cane = registerBlock("tc_pigiron_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Queens_Slime_Ingot_Cane = registerBlock("tc_queens_slime_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Rose_Gold_Ingot_Cane = registerBlock("tc_rose_gold_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Sky_Slime_Crystal_Cane = registerBlock("tc_sky_slime_crystal_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Slimesteel_Ingot_Cane = registerBlock("tc_slimesteel_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block TC_Soulsteel_Ingot_Cane = registerBlock("tc_soulsteel_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);


    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, Identifier.of(GrowableOres.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> tab) {
        return Registry.register(Registries.ITEM, Identifier.of(GrowableOres.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks(){
        Logger.getLogger("register mod blocks" + GrowableOres.MOD_ID);
    }
}

