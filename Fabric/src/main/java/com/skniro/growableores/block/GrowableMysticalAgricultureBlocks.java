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

public class GrowableMysticalAgricultureBlocks {
    //MysticalAgriculture
    public static final Block MAC_Imperium_Ingot_Cane = registerBlock("mac_imperium_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MAC_Inferium_Ingot_Cane = registerBlock("mac_inferium_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MAC_Prosperity_Ingot_Cane = registerBlock("mac_prosperity_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MAC_Prudentium_Ingot_Cane = registerBlock("mac_prudentium_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MAC_Soulium_Ingot_Cane = registerBlock("mac_soulium_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MAC_Supremium_Ingot_Cane = registerBlock("mac_supremium_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block MAC_Tertium_Ingot_Cane = registerBlock("mac_tertium_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);

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

