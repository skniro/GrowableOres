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

public class GrowableAdAstraOresBlocks {
    //Ad Astra!
    public static final Block AD_Ostrum_Cane =registerBlock("ad_mars_ore_ostrum_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block AD_Ice_Shard_Cane =registerBlock("ad_moon_ice_shard_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block AD_Cheese_Cane =registerBlock("ad_moon_ore_cheese_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block AD_Desh_Cane =registerBlock("ad_moon_ore_desh_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block AD_Calorite_Cane =registerBlock("ad_venus_calorite_ore_cane", new SugarCaneBlock(AbstractBlock.Settings.of(Material.PLANT).mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);



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

