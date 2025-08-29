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

public class GrowableOritechBlocks {
    //Oritech
    public static final Block OT_Adamant_Ingot_Cane = registerBlock("ot_adamant_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block OT_Biosteel_Ingot_Cane = registerBlock("ot_biosteel_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block OT_Duratium_Ingot_Cane = registerBlock("ot_duratium_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block OT_Electrum_Ingot_Cane = registerBlock("ot_electrum_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block OT_Energite_Ingot_Cane = registerBlock("ot_energite_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block OT_Nickel_Ingot_Cane = registerBlock("ot_nickel_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block OT_Platinum_Ingot_Cane = registerBlock("ot_platinum_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block OT_Prometheum_Ingot_Cane = registerBlock("ot_prometheum_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block OT_Steel_Ingot_Cane = registerBlock("ot_steel_ingot_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block OT_Uranium_Crystal_Cane = registerBlock("ot_uranium_crystal_cane", new GrowableOreCaneBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GLASS).pistonBehavior(PistonBehavior.DESTROY)), GrowableOresItemGroups.Growable_Ores_Group);


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

