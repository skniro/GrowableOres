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

public class GrowableEnergizedPowerOresBlocks {
    //EnergizedPower
    public static final Block EP_Advanced_Alloy_Cane =registerBlock("ep_advanced_alloy_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block EP_Energized_Copper_Cane =registerBlock("ep_energized_copper_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block EP_Energized_Gold_Cane =registerBlock("ep_energized_gold_ingot_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block EP_Redstone_Alloy_Cane =registerBlock("ep_redstone_alloy_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block EP_Steel_Cane =registerBlock("ep_steel_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block EP_Tin_Cane =registerBlock("ep_tin_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);



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
