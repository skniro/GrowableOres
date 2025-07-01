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

public class GrowableRailcraftOresBlocks {
    //Railcraft
    public static final Block RC_Brass_Ingot_Cane = registerBlock("rc_brass_ingot_cane", GrowableOreCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block RC_Bronze_Ingot_Cane = registerBlock("rc_bronze_ingot_cane", GrowableOreCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block RC_Charcoal_Dust_Cane = registerBlock("rc_charcoal_dust_cane", GrowableOreCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block RC_Coal_Dust_Cane = registerBlock("rc_coal_dust_cane", GrowableOreCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block RC_Ender_Dust_Cane = registerBlock("rc_ender_dust_cane", GrowableOreCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block RC_Invar_Ingot_Cane = registerBlock("rc_invar_ingot_cane", GrowableOreCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block RC_Lead_Ingot_Cane = registerBlock("rc_lead_ingot_cane", GrowableOreCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block RC_Nickel_Ingot_Cane = registerBlock("rc_nickel_ingot_cane", GrowableOreCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block RC_Obsidian_Dust_Cane = registerBlock("rc_obsidian_dust_cane", GrowableOreCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block RC_Saltpeter_Dust_Cane = registerBlock("rc_saltpeter_dust_cane", GrowableOreCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block RC_Silver_Ingot_Cane = registerBlock("rc_silver_ingot_cane", GrowableOreCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block RC_Steel_Ingot_Cane = registerBlock("rc_steel_ingot_cane", GrowableOreCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block RC_Sulfur_Dust_Cane = registerBlock("rc_sulfur_dust_cane", GrowableOreCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block RC_Tin_Ingot_Cane = registerBlock("rc_tin_ingot_cane", GrowableOreCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block RC_Zinc_Ingot_Cane = registerBlock("rc_zinc_ingot_cane", GrowableOreCaneBlock::new ,AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).pistonBehavior(PistonBehavior.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);

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

