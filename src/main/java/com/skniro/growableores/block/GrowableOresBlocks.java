package com.skniro.growableores.block;

import com.google.common.collect.Sets;
import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.init.GrowableOreCaneBlock;
import com.skniro.growableores.item.GrowableOresBlockReedItem;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class GrowableOresBlocks {
    private static final Set<Block> CACHE = Sets.<Block>newHashSet();
    private static List<Item> itemBlocks;
    //Village
    public static Block Iron_Cane;
    public static Block Coal_Cane;
    public static Block Diamond_Cane;
    public static Block Copper_Cane;
    public static Block Emerald_Cane;
    public static Block Gold_Cane;
    public static Block Lapis_Cane;
    public static Block Nether_Quartz_Cane;
    public static Block Redstone_Cane;
    public static Block Blaze_Rod_Cane;
    public static Block Ender_Pearl_Cane;
    public static Block Clay_Cane;
    public static Block Slime_Cane;
    public static Block Nether_Star_Cane;
    public static Block Glowstone_Cane;
    public static Block Bone_Cane;
    public static Block Wool_Cane;
    public static Block Feather_Cane;
    public static Block Egg_Cane;


    @Nullable
    @SubscribeEvent
    public static void getRegisteredBlock(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        itemBlocks = new ArrayList<>();
        Iron_Cane =registerReedBlock("iron_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
/*        Coal_Cane =registerReedBlock("coal_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Emerald_Cane =registerReedBlock("emerald_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);*/
        Gold_Cane =registerReedBlock("gold_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
/*        Redstone_Cane =registerReedBlock("redstone_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Nether_Quartz_Cane =registerReedBlock("nether_quartz_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Lapis_Cane =registerReedBlock("lapis_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Diamond_Cane =registerReedBlock("diamond_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Copper_Cane =registerReedBlock("copper_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Blaze_Rod_Cane =registerReedBlock("blaze_rod_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Ender_Pearl_Cane =registerReedBlock("ender_pearl_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Slime_Cane = registerReedBlock("slime_cane",  new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Nether_Star_Cane = registerReedBlock("nether_star_cane",  new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Glowstone_Cane = registerReedBlock("glowstone_cane",  new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Bone_Cane = registerReedBlock("bone_cane",  new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Clay_Cane = registerReedBlock("clay_cane",  new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Egg_Cane = registerReedBlock("egg_cane",  new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Feather_Cane = registerReedBlock("feather_cane",  new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Wool_Cane = registerReedBlock("wool_cane",  new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);*/
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> reg = event.getRegistry();
        for (Item i : itemBlocks)
            reg.register(i);
    }

    private static Block registerReedBlock(String name, Block block, CreativeTabs tab,IForgeRegistry<Block> reg) {
        block.setRegistryName(name);
        block.setUnlocalizedName(GrowableOres.MOD_ID + "." + name);
        if (tab != null) block.setCreativeTab(tab);

        reg.register(block);

        Item item = new GrowableOresBlockReedItem(block, name);
        item.setRegistryName(block.getRegistryName());
        itemBlocks.add(item);
        return block;
    }

    public GrowableOresBlocks init() {


        return this;
    }
}

