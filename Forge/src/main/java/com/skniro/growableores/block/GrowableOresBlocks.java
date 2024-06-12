package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.item.MapleItems;
import com.skniro.growableores.item.ModCreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SugarCaneBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class GrowableOresBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GrowableOres.MODID);

    //Village
    public static final RegistryObject<Block> Iron_Cane =registerBlock("iron_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Coal_Cane =registerBlock("coal_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Emerald_Cane =registerBlock("emerald_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Gold_Cane =registerBlock("gold_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Redstone_Cane =registerBlock("redstone_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Nether_Quartz_Cane =registerBlock("nether_quartz_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Lapis_Cane =registerBlock("lapis_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Diamond_Cane =registerBlock("diamond_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Copper_Cane =registerBlock("copper_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Blaze_Rod_Cane =registerBlock("blaze_rod_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Ender_Pearl_Cane =registerBlock("ender_pearl_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)),ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Clay_Cane = registerBlock("clay_cane", () ->  new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Slime_Cane = registerBlock("slime_cane", () ->  new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Nether_Star_Cane = registerBlock("nether_star_cane", () ->  new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Glowstone_Cane = registerBlock("glowstone_cane", () ->  new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Bone_Cane = registerBlock("bone_cane", () ->  new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);

    //Ae2
    public static final RegistryObject<Block> certus_quartz_crystal_Cane =registerBlock("certus_quartz_crystal_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> fluix_crystal_Cane =registerBlock("fluix_crystal_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);


    //BetterEnd
    public static final RegistryObject<Block> amber_Cane =registerBlock("amber_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> ender_Cane =registerBlock("ender_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> thallasium_Cane =registerBlock("thallasium_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);

    //Powah Rearchitected and Powah
    public static final RegistryObject<Block> Steel_Energized_Cane =registerBlock("steel_energized_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Uraninite_Ore_Dense_Cane =registerBlock("uraninite_ore_dense_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Ender_Core_Cane =registerBlock("ender_core_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Crystal_Spirited_Cane =registerBlock("crystal_spirited_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Crystal_Nitro_Cane =registerBlock("crystal_nitro_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Crystal_Niotic_Cane =registerBlock("crystal_niotic_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> Crystal_Blazing_Cane =registerBlock("crystal_blazing_cane", () -> new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);

    //Create
    public static final RegistryObject<Block> C_Andesite_Alloy_Cane =registerBlock("c_andesite_alloy_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> C_Brass_Ingot_Cane =registerBlock("c_brass_ingot_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> C_Polished_Rose_Quartz_Cane =registerBlock("c_polished_rose_quartz_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> C_Zinc_Cane =registerBlock("c_zinc_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);

    //Ad Astra!
    public static final RegistryObject<Block> AD_Ostrum_Cane =registerBlock("ad_mars_ore_ostrum_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> AD_Ice_Shard_Cane =registerBlock("ad_moon_ice_shard_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> AD_Cheese_Cane =registerBlock("ad_moon_ore_cheese_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> AD_Desh_Cane =registerBlock("ad_moon_ore_desh_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> AD_Calorite_Cane =registerBlock("ad_venus_calorite_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);


    //Thermal Series
    public static final RegistryObject<Block> TF_Apatite_Cane =registerBlock("tf_apatite_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> TF_Cinnabar_Cane =registerBlock("tf_cinnabar_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> TF_Copper_Cane =registerBlock("tf_copper_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> TF_Lead_Cane =registerBlock("tf_lead_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> TF_Nickel_Cane =registerBlock("tf_nickel_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> TF_Niter_Cane =registerBlock("tf_niter_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> TF_Ruby_Cane =registerBlock("tf_ruby_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> TF_Sapphire_Cane =registerBlock("tf_sapphire_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> TF_Silver_Cane =registerBlock("tf_silver_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> TF_Sulfur_Cane =registerBlock("tf_sulfur_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block> TF_Tin_Cane =registerBlock("tf_tin_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);

    //ic2 and ic2c
    public static final RegistryObject<Block>  IC2_Aluminium_Cane =registerBlock("ic_aluminium_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block>  IC2_silver_Cane =registerBlock("ic_silver_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block>  IC2_Tin_Cane =registerBlock("ic_tin_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);
    public static final RegistryObject<Block>  IC2_Uranium_Cane =registerBlock("ic_uranium_ore_cane", () ->new SugarCaneBlock(BlockBehaviour.Properties.of(Material.PLANT,MaterialColor.TERRACOTTA_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)), ModCreativeModeTabs.Growable_Ores_Group);


    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return MapleItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTabs.Growable_Ores_Group)));
    }

    public static void registerMapleBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

