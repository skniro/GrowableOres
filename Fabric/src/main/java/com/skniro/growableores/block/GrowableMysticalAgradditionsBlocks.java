package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.init.GrowableOreCaneBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.logging.Logger;

public class GrowableMysticalAgradditionsBlocks {
    //Mystical Agradditions
    public static final Block MAA_Awakened_Draconium_Essence_Cane = registerBlock("maa_awakened_draconium_essence_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block MAA_Dragon_Egg_Essence_Cane = registerBlock("maa_dragon_egg_essence_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block MAA_Insanium_Essence_Cane = registerBlock("maa_insanium_essence_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block MAA_Insanium_Ingot_Cane = registerBlock("maa_insanium_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block MAA_Nether_Star_Essence_Cane = registerBlock("maa_nether_star_essence_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block MAA_Neutronium_Essence_Cane = registerBlock("maa_neutronium_essence_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);
    public static final Block MAA_Nitro_Crystal_Essence_Cane = registerBlock("maa_nitro_crystal_essence_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.of(Material.PLANT,MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS)),GrowableOres.Growable_Ores_Group);

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

