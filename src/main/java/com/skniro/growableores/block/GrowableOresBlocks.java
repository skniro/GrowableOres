package com.skniro.growableores.block;

import com.google.common.collect.Sets;
import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.init.GrowableOreCaneBlock;
import com.skniro.growableores.item.GrowableOresBlockReedItem;
import com.skniro.growableores.item.ModCreativeModeTabs;
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

    //AE2
    public static Block fluix_crystal_Cane;
    public static Block certus_quartz_crystal_Cane;

    //ExtremeReactors
    public static Block ER_Anglesite_Crystal_Cane;
    public static Block ER_Benitoite_Crystal_Cane;
    public static Block ER_Blutonium_Ingot_Cane;
    public static Block ER_Cyanite_Ingot_Cane;
    public static Block ER_Graphite_Ingot_Cane;
    public static Block ER_Inanite_Ingot_Cane;
    public static Block ER_Insanite_Ingot_Cane;
    public static Block ER_Ludicrite_Ingot_Cane;
    public static Block ER_Magentite_Ingot_Cane;
    public static Block ER_Ridiculite_Ingot_Cane;
    public static Block ER_Yellorium_Ingot_Cane;

    //Tech Reborn
    public static Block cinnabar_Cane;
    public static Block galena_Cane;
    public static Block iridium_Cane;
    public static Block lead_Cane;
    public static Block peridot_Cane;
    public static Block pyrite_Cane;
    public static Block ruby_Cane;
    public static Block sapphire_Cane;
    public static Block sheldonite_Cane;
    public static Block silver_Cane;
    public static Block sphalerite_Cane;
    public static Block tin_Cane;
    public static Block tungsten_Cane;
    public static Block sodalite_Cane;
    public static Block bauxite_Cane;
    //ic2 and ic2c
    public static Block IC2_Aluminium_Cane;
    public static Block IC2_silver_Cane;
    public static Block IC2_Tin_Cane;
    public static Block IC2_Uranium_Cane;

    //Thermal Series
    public static Block TF_Apatite_Cane;
    public static Block TF_Cinnabar_Cane;
    public static Block TF_Copper_Cane;
    public static Block TF_Lead_Cane;
    public static Block TF_Nickel_Cane;
    public static Block TF_Niter_Cane;
    public static Block TF_Ruby_Cane;
    public static Block TF_Sapphire_Cane;
    public static Block TF_Silver_Cane;
    public static Block TF_Sulfur_Cane;
    public static Block TF_Tin_Cane;

    //Mekanism
    public static Block MEK_Fluorite_Cane;
    public static Block MEK_Lead_Cane;
    public static Block MEK_Osmium_Cane;
    public static Block MEK_Tin_Cane;
    public static Block MEK_Uranium_Cane;
    public static Block MEK_Steel_Cane;
    public static Block MEK_Refined_Obsidian_Cane;
    public static Block MEK_Refined_Glowstone_Cane;
    public static Block MEK_Bronze_Cane;

    //Tinkers' Construct
    public static Block TC_Amethyst_Bronze_Ingot_Cane;
    public static Block TC_Blazing_Bone_Cane;
    public static Block TC_Cheese_Ingot_Cane;
    public static Block TC_Cobalt_Ingot_Cane;
    public static Block TC_Earth_Slime_Crystal_Cane;
    public static Block TC_Ender_Slime_Crystal_Cane;
    public static Block TC_Hepatizon_Ingot_Cane;
    public static Block TC_Ichor_Slime_Crystal_Cane;
    public static Block TC_Knightslime_Ingot_Cane;
    public static Block TC_Manyullyn_Ingot_Cane;
    public static Block TC_Modifier_Crystal_Cane;
    public static Block TC_Necronium_Bone_Cane;
    public static Block TC_Necrotic_Bone_Cane;
    public static Block TC_Queens_Slime_Ingot_Cane;
    public static Block TC_Rose_Gold_Ingot_Cane;
    public static Block TC_Sky_Slime_Crystal_Cane;
    public static Block TC_Slimesteel_Ingot_Cane;
    public static Block TC_Soulsteel_Ingot_Cane;

    //RFTools
    public static Block RFT_Dimensional_Shard_Cane;

    //RailCraft
    public static Block RC_Brass_Ingot_Cane;
    public static Block RC_Bronze_Ingot_Cane;
    public static Block RC_Charcoal_Dust_Cane;
    public static Block RC_Coal_Dust_Cane;
    public static Block RC_Ender_Dust_Cane;
    public static Block RC_Invar_Ingot_Cane;
    public static Block RC_Lead_Ingot_Cane;
    public static Block RC_Nickel_Ingot_Cane;
    public static Block RC_Obsidian_Dust_Cane;
    public static Block RC_Saltpeter_Dust_Cane;
    public static Block RC_Silver_Ingot_Cane;
    public static Block RC_Steel_Ingot_Cane;
    public static Block RC_Sulfur_Dust_Cane;
    public static Block RC_Tin_Ingot_Cane;
    public static Block RC_Zinc_Ingot_Cane;



    @Nullable
    @SubscribeEvent
    public static void getRegisteredBlock(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        itemBlocks = new ArrayList<>();
        Iron_Cane =registerReedBlock("iron_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        Coal_Cane =registerReedBlock("coal_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Emerald_Cane =registerReedBlock("emerald_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Gold_Cane =registerReedBlock("gold_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Redstone_Cane =registerReedBlock("redstone_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Nether_Quartz_Cane =registerReedBlock("nether_quartz_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Lapis_Cane =registerReedBlock("lapis_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Diamond_Cane =registerReedBlock("diamond_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Blaze_Rod_Cane =registerReedBlock("blaze_rod_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Ender_Pearl_Cane =registerReedBlock("ender_pearl_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Slime_Cane = registerReedBlock("slime_cane",  new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Nether_Star_Cane = registerReedBlock("nether_star_cane",  new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Glowstone_Cane = registerReedBlock("glowstone_cane",  new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Bone_Cane = registerReedBlock("bone_cane",  new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Clay_Cane = registerReedBlock("clay_cane",  new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Egg_Cane = registerReedBlock("egg_cane",  new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Feather_Cane = registerReedBlock("feather_cane",  new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        Wool_Cane = registerReedBlock("wool_cane",  new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);

        //AE2
        certus_quartz_crystal_Cane = registerReedBlock("certus_quartz_crystal_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        fluix_crystal_Cane = registerReedBlock("fluix_crystal_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);

        //ExtremeReactors
        ER_Anglesite_Crystal_Cane = registerReedBlock("er_anglesite_crystal_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        ER_Benitoite_Crystal_Cane = registerReedBlock("er_benitoite_crystal_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        ER_Blutonium_Ingot_Cane = registerReedBlock("er_blutonium_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        ER_Cyanite_Ingot_Cane = registerReedBlock("er_cyanite_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        ER_Graphite_Ingot_Cane = registerReedBlock("er_graphite_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        ER_Inanite_Ingot_Cane = registerReedBlock("er_inanite_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        ER_Insanite_Ingot_Cane = registerReedBlock("er_insanite_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        ER_Ludicrite_Ingot_Cane = registerReedBlock("er_ludicrite_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        ER_Magentite_Ingot_Cane = registerReedBlock("er_magentite_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        ER_Ridiculite_Ingot_Cane = registerReedBlock("er_ridiculite_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        ER_Yellorium_Ingot_Cane = registerReedBlock("er_yellorium_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);

        //ic2
        IC2_Aluminium_Cane = registerReedBlock("ic_aluminium_ore_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        IC2_silver_Cane = registerReedBlock("ic_silver_ore_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        IC2_Tin_Cane = registerReedBlock("ic_tin_ore_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        IC2_Uranium_Cane = registerReedBlock("ic_uranium_ore_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);

        //mek
        MEK_Fluorite_Cane = registerReedBlock("mek_fluorite_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        MEK_Lead_Cane = registerReedBlock("mek_lead_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        MEK_Osmium_Cane = registerReedBlock("mek_osmium_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        MEK_Tin_Cane = registerReedBlock("mek_tin_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        MEK_Uranium_Cane = registerReedBlock("mek_uranium_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        MEK_Steel_Cane = registerReedBlock("mek_steel_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        MEK_Refined_Obsidian_Cane = registerReedBlock("mek_refined_obsidian_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        MEK_Refined_Glowstone_Cane = registerReedBlock("mek_refined_glowstone_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        MEK_Bronze_Cane = registerReedBlock("mek_bronze_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);

        //Tech reborn
        cinnabar_Cane = registerReedBlock("cinnabar_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        galena_Cane = registerReedBlock("galena_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        iridium_Cane = registerReedBlock("iridium_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        lead_Cane = registerReedBlock("lead_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        peridot_Cane = registerReedBlock("peridot_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        pyrite_Cane = registerReedBlock("pyrite_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        ruby_Cane = registerReedBlock("ruby_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        sapphire_Cane = registerReedBlock("sapphire_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        sheldonite_Cane = registerReedBlock("sheldonite_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        silver_Cane = registerReedBlock("silver_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        sodalite_Cane = registerReedBlock("sodalite_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        sphalerite_Cane = registerReedBlock("sphalerite_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        tin_Cane = registerReedBlock("tin_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        tungsten_Cane = registerReedBlock("tungsten_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        bauxite_Cane = registerReedBlock("bauxite_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);

        //ThermalSeries
        TF_Apatite_Cane = registerReedBlock("tf_apatite_ore_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        TF_Cinnabar_Cane = registerReedBlock("tf_cinnabar_ore_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        TF_Copper_Cane = registerReedBlock("tf_copper_ore_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        TF_Lead_Cane = registerReedBlock("tf_lead_ore_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        TF_Nickel_Cane = registerReedBlock("tf_nickel_ore_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        TF_Niter_Cane = registerReedBlock("tf_niter_ore_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        TF_Ruby_Cane = registerReedBlock("tf_ruby_ore_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        TF_Sapphire_Cane = registerReedBlock("tf_sapphire_ore_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        TF_Silver_Cane = registerReedBlock("tf_silver_ore_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        TF_Sulfur_Cane = registerReedBlock("tf_sulfur_ore_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);
        TF_Tin_Cane = registerReedBlock("tf_tin_ore_cane", new GrowableOreCaneBlock(),GrowableOres.Growable_Ores_Group, registry);

        //TinkersConstruct
        TC_Amethyst_Bronze_Ingot_Cane = registerReedBlock("tc_amethyst_bronze_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        TC_Blazing_Bone_Cane = registerReedBlock("tc_blazing_bone_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        TC_Cheese_Ingot_Cane = registerReedBlock("tc_cheese_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        TC_Cobalt_Ingot_Cane = registerReedBlock("tc_cobalt_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        TC_Earth_Slime_Crystal_Cane = registerReedBlock("tc_earth_slime_crystal_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        TC_Ender_Slime_Crystal_Cane = registerReedBlock("tc_ender_slime_crystal_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        TC_Hepatizon_Ingot_Cane = registerReedBlock("tc_hepatizon_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        TC_Ichor_Slime_Crystal_Cane = registerReedBlock("tc_ichor_slime_crystal_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        TC_Knightslime_Ingot_Cane = registerReedBlock("tc_knightslime_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        TC_Manyullyn_Ingot_Cane = registerReedBlock("tc_manyullyn_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        TC_Modifier_Crystal_Cane = registerReedBlock("tc_modifier_crystal_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        TC_Necronium_Bone_Cane = registerReedBlock("tc_necronium_bone_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        TC_Necrotic_Bone_Cane = registerReedBlock("tc_necrotic_bone_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        TC_Queens_Slime_Ingot_Cane = registerReedBlock("tc_queens_slime_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        TC_Rose_Gold_Ingot_Cane = registerReedBlock("tc_rose_gold_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        TC_Sky_Slime_Crystal_Cane = registerReedBlock("tc_sky_slime_crystal_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        TC_Slimesteel_Ingot_Cane = registerReedBlock("tc_slimesteel_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        TC_Soulsteel_Ingot_Cane = registerReedBlock("tc_soulsteel_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);

        //RFTools
        RFT_Dimensional_Shard_Cane = registerReedBlock("rft_dimensional_shard_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);

        //RailCraft
        RC_Brass_Ingot_Cane = registerReedBlock("rc_brass_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        RC_Bronze_Ingot_Cane = registerReedBlock("rc_bronze_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        RC_Charcoal_Dust_Cane = registerReedBlock("rc_charcoal_dust_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        RC_Coal_Dust_Cane = registerReedBlock("rc_coal_dust_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        RC_Ender_Dust_Cane = registerReedBlock("rc_ender_dust_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        RC_Invar_Ingot_Cane = registerReedBlock("rc_invar_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        RC_Lead_Ingot_Cane = registerReedBlock("rc_lead_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        RC_Nickel_Ingot_Cane = registerReedBlock("rc_nickel_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        RC_Obsidian_Dust_Cane = registerReedBlock("rc_obsidian_dust_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        RC_Saltpeter_Dust_Cane = registerReedBlock("rc_saltpeter_dust_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        RC_Silver_Ingot_Cane = registerReedBlock("rc_silver_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        RC_Steel_Ingot_Cane = registerReedBlock("rc_steel_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        RC_Sulfur_Dust_Cane = registerReedBlock("rc_sulfur_dust_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        RC_Tin_Ingot_Cane = registerReedBlock("rc_tin_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
        RC_Zinc_Ingot_Cane = registerReedBlock("rc_zinc_ingot_cane", new GrowableOreCaneBlock(), GrowableOres.Growable_Ores_Group, registry);
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

