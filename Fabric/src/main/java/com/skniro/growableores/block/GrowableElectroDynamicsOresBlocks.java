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
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;
import java.util.logging.Logger;

public class GrowableElectroDynamicsOresBlocks {
    //Electro Dynamics
    public static final Block ED_Ingot_Aluminum_Cane =registerBlock("ed_ingot_aluminum_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Bronze_Cane = registerBlock("ed_ingot_bronze_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Chromium_Cane = registerBlock("ed_ingot_chromium_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Hsla_Steel_Cane = registerBlock("ed_ingot_hsla_steel_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Lead_Cane = registerBlock("ed_ingot_lead_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Lithium_Cane = registerBlock("ed_ingot_lithium_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Molybdenum_Cane = registerBlock("ed_ingot_molybdenum_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Silver_Cane = registerBlock("ed_ingot_silver_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Stainless_Steel_Cane = registerBlock("ed_ingot_stainless_steel_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Steel_Cane = registerBlock("ed_ingot_steel_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Superconductive_Cane = registerBlock("ed_ingot_superconductive_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Tin_Cane = registerBlock("ed_ingot_tin_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Titanium_Cane = registerBlock("ed_ingot_titanium_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Titanium_Carbide_Cane = registerBlock("ed_ingot_titanium_carbide_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Vanadium_Cane = registerBlock("ed_ingot_vanadium_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ED_Ingot_Vanadium_Steel_Cane = registerBlock("ed_ingot_vanadium_steel_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);

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

