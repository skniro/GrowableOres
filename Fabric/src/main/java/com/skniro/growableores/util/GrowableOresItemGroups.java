package com.skniro.growableores.util;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.*;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class GrowableOresItemGroups {
    public static final ResourceKey<CreativeModeTab> Growable_Ores_Group = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(GrowableOres.MOD_ID, "test_group"));

    public static void vanilla_item() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Growable_Ores_Group, FabricCreativeModeTab.builder()
                .icon(() -> new ItemStack(GrowableVanillaOresBlocks.Iron_Cane))
                .title(Component.translatable("itemGroup.growable_ores.test_group"))
                .build()); // build() no longer registers by itself

        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            content.accept(GrowableVanillaOresBlocks.Coal_Cane);
            content.accept(GrowableVanillaOresBlocks.Iron_Cane);
            content.accept(GrowableVanillaOresBlocks.Diamond_Cane);
            content.accept(GrowableVanillaOresBlocks.Copper_Cane);
            content.accept(GrowableVanillaOresBlocks.Emerald_Cane);
            content.accept(GrowableVanillaOresBlocks.Gold_Cane);
            content.accept(GrowableVanillaOresBlocks.Lapis_Cane);
            content.accept(GrowableVanillaOresBlocks.Nether_Quartz_Cane);
            content.accept(GrowableVanillaOresBlocks.Redstone_Cane);
            content.accept(GrowableVanillaOresBlocks.Blaze_Rod_Cane);
            content.accept(GrowableVanillaOresBlocks.Ender_Pearl_Cane);
            content.accept(GrowableVanillaOresBlocks.Netherite_Ingot_Cane);
            content.accept(GrowableVanillaOresBlocks.Netherite_Scrap_Cane);
            content.accept(GrowableVanillaOresBlocks.Clay_Cane);
            content.accept(GrowableVanillaOresBlocks.Glowstone_Cane);
            content.accept(GrowableVanillaOresBlocks.Slime_Cane);
            content.accept(GrowableVanillaOresBlocks.Bone_Cane);
            content.accept(GrowableVanillaOresBlocks.Nether_Star_Cane);
            content.accept(GrowableVanillaOresBlocks.Egg_Cane);
            content.accept(GrowableVanillaOresBlocks.Wool_Cane);
            content.accept(GrowableVanillaOresBlocks.Gunpowder_Cane);
            content.accept(GrowableVanillaOresBlocks.Feather_Cane);
            content.accept(GrowableVanillaOresBlocks.Leather_Cane);
            content.accept(GrowableVanillaOresBlocks.Oak_Log_Cane);
            content.accept(GrowableVanillaOresBlocks.Spruce_Log_Cane);
            content.accept(GrowableVanillaOresBlocks.Birch_Log_Cane);
            content.accept(GrowableVanillaOresBlocks.Jungle_Log_Cane);
            content.accept(GrowableVanillaOresBlocks.Acacia_Log_Cane);
            content.accept(GrowableVanillaOresBlocks.Dark_Oak_Log_Cane);
            content.accept(GrowableVanillaOresBlocks.Mangrove_Log_Cane);
            content.accept(GrowableVanillaOresBlocks.Bamboo_Block_Cane);
            content.accept(GrowableVanillaOresBlocks.Cherry_Log_Cane);
            content.accept(GrowableVanillaOresBlocks.Crimson_Stem_Cane);
            content.accept(GrowableVanillaOresBlocks.Warped_Stem_Cane);
            content.accept(GrowableVanillaOresBlocks.Pale_Oak_Log_Cane);
            content.accept(GrowableVanillaOresBlocks.Amethyst_Shard_Cane);
            content.accept(GrowableVanillaOresBlocks.Prismarine_Crystals_Cane);
            content.accept(GrowableVanillaOresBlocks.Prismarine_Shard_Cane);
            content.accept(GrowableVanillaOresBlocks.Sand_Cane);
            content.accept(GrowableVanillaOresBlocks.String_Cane);
            content.accept(GrowableVanillaOresBlocks.Honeycomb_Cane);
            content.accept(GrowableVanillaOresBlocks.Echo_Shard_Cane);
            content.accept(GrowableVanillaOresBlocks.breeze_rod_Cane);

        });
    }
    public static void ae_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //ae2
            content.accept(GrowableAEOresBlocks.certus_quartz_crystal_Cane);
            content.accept(GrowableAEOresBlocks.fluix_crystal_Cane);
        });
    }

    public static void techreborn_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Tech Reborn
            content.accept(GrowableTechRebornOresBlocks.cinnabar_Cane);
            content.accept(GrowableTechRebornOresBlocks.galena_Cane);
            content.accept(GrowableTechRebornOresBlocks.iridium_Cane);
            content.accept(GrowableTechRebornOresBlocks.lead_Cane);
            content.accept(GrowableTechRebornOresBlocks.peridot_Cane);
            content.accept(GrowableTechRebornOresBlocks.pyrite_Cane);
            content.accept(GrowableTechRebornOresBlocks.ruby_Cane);
            content.accept(GrowableTechRebornOresBlocks.sapphire_Cane);
            content.accept(GrowableTechRebornOresBlocks.sheldonite_Cane);
            content.accept(GrowableTechRebornOresBlocks.silver_Cane);
            content.accept(GrowableTechRebornOresBlocks.sphalerite_Cane);
            content.accept(GrowableTechRebornOresBlocks.tin_Cane);
            content.accept(GrowableTechRebornOresBlocks.tungsten_Cane);
            content.accept(GrowableTechRebornOresBlocks.sodalite_Cane);
            content.accept(GrowableTechRebornOresBlocks.bauxite_Cane);
        });
    }

    public static void betterend_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //BetterEnd
            content.accept(GrowableBetterEndOresBlocks.amber_Cane);
            content.accept(GrowableBetterEndOresBlocks.ender_Cane);
            content.accept(GrowableBetterEndOresBlocks.thallasium_Cane);
        });
    }

    public static void maple_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Maple
            content.accept(GrowableMapleOresBlocks.Salt_Cane);
        });
    }
    public static void powah_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Powah Rearchitected and Powah
            content.accept(GrowablePowahOresBlocks.Steel_Energized_Cane);
            content.accept(GrowablePowahOresBlocks.Uraninite_Ore_Dense_Cane);
            content.accept(GrowablePowahOresBlocks.Ender_Core_Cane);
            content.accept(GrowablePowahOresBlocks.Crystal_Spirited_Cane);
            content.accept(GrowablePowahOresBlocks.Crystal_Nitro_Cane);
            content.accept(GrowablePowahOresBlocks.Crystal_Niotic_Cane);
            content.accept(GrowablePowahOresBlocks.Crystal_Blazing_Cane);
        });
    }

    public static void ir_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Industrial Revolution
            content.accept(GrowableIndustrialRevolutionOresBlocks.IR_Lead_Cane);
            content.accept(GrowableIndustrialRevolutionOresBlocks.IR_nikolite_Cane );
            content.accept(GrowableIndustrialRevolutionOresBlocks.IR_silver_Cane);
            content.accept(GrowableIndustrialRevolutionOresBlocks.IR_tin_ore_Cane);
            content.accept(GrowableIndustrialRevolutionOresBlocks.IR_tungsten_Cane);
        });
    }
    public static void mi_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
    //Modern Industrialization
            content.accept(GrowableModernIndustrializationOresBlocks.MI_antimony_Cane);
            content.accept(GrowableModernIndustrializationOresBlocks.MI_bauxite_Cane);
            content.accept(GrowableModernIndustrializationOresBlocks.MI_iridium_Cane);
            content.accept(GrowableModernIndustrializationOresBlocks.MI_lead_Cane);
            content.accept(GrowableModernIndustrializationOresBlocks.MI_lignite_coal_Cane);
            content.accept(GrowableModernIndustrializationOresBlocks.MI_monazite_Cane);
            content.accept(GrowableModernIndustrializationOresBlocks.MI_nickel_Cane);
            content.accept(GrowableModernIndustrializationOresBlocks.MI_platinum_Cane);
            content.accept(GrowableModernIndustrializationOresBlocks.MI_quartz_Cane);
            content.accept(GrowableModernIndustrializationOresBlocks.MI_salt_Cane);
            content.accept(GrowableModernIndustrializationOresBlocks.MI_tin_Cane);
            content.accept(GrowableModernIndustrializationOresBlocks.MI_titanium_Cane);
            content.accept(GrowableModernIndustrializationOresBlocks.MI_tungsten_Cane);
            content.accept(GrowableModernIndustrializationOresBlocks.MI_uranium_Cane);
        });
    }
    public static void ic_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //ic2 and ic2c
            content.accept(GrowableICOresBlocks.IC2_Aluminium_Cane);
            content.accept(GrowableICOresBlocks.IC2_silver_Cane);
            content.accept(GrowableICOresBlocks.IC2_Tin_Cane);
            content.accept(GrowableICOresBlocks.IC2_Uranium_Cane);
        });
    }
    public static void ad_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Ad Astra!
            content.accept(GrowableAdAstraOresBlocks.AD_Ostrum_Cane);
            content.accept(GrowableAdAstraOresBlocks.AD_Ice_Shard_Cane);
            content.accept(GrowableAdAstraOresBlocks.AD_Cheese_Cane);
            content.accept(GrowableAdAstraOresBlocks.AD_Desh_Cane);
            content.accept(GrowableAdAstraOresBlocks.AD_Calorite_Cane);
        });
    }
    public static void c_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Create
            content.accept(GrowableCreateOresBlocks.C_Andesite_Alloy_Cane);
            content.accept(GrowableCreateOresBlocks.C_Brass_Ingot_Cane);
            content.accept(GrowableCreateOresBlocks.C_Polished_Rose_Quartz_Cane);
            content.accept(GrowableCreateOresBlocks.C_Zinc_Cane);
        });
    }
    public static void tf_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Thermal Series
            content.accept(GrowableThermalSeriesOresBlocks.TF_Apatite_Cane);
            content.accept(GrowableThermalSeriesOresBlocks.TF_Cinnabar_Cane);
            content.accept(GrowableThermalSeriesOresBlocks.TF_Copper_Cane);
            content.accept(GrowableThermalSeriesOresBlocks.TF_Lead_Cane);
            content.accept(GrowableThermalSeriesOresBlocks.TF_Nickel_Cane);
            content.accept(GrowableThermalSeriesOresBlocks.TF_Niter_Cane);
            content.accept(GrowableThermalSeriesOresBlocks.TF_Ruby_Cane);
            content.accept(GrowableThermalSeriesOresBlocks.TF_Sapphire_Cane);
            content.accept(GrowableThermalSeriesOresBlocks.TF_Silver_Cane);
            content.accept(GrowableThermalSeriesOresBlocks.TF_Sulfur_Cane);
            content.accept(GrowableThermalSeriesOresBlocks.TF_Tin_Cane);
        });
    }


    public static void mek_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Mekanism
            content.accept(GrowableMekanismOresBlocks.MEK_Fluorite_Cane);
            content.accept(GrowableMekanismOresBlocks.MEK_Lead_Cane);
            content.accept(GrowableMekanismOresBlocks.MEK_Osmium_Cane);
            content.accept(GrowableMekanismOresBlocks.MEK_Tin_Cane);
            content.accept(GrowableMekanismOresBlocks.MEK_Uranium_Cane);
            content.accept(GrowableMekanismOresBlocks.MEK_Steel_Cane);
            content.accept(GrowableMekanismOresBlocks.MEK_Refined_Obsidian_Cane);
            content.accept(GrowableMekanismOresBlocks.MEK_Refined_Glowstone_Cane);
            content.accept(GrowableMekanismOresBlocks.MEK_Bronze_Cane);
        });
    }

    public static void bn_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //BetterNether
            content.accept(GrowableBetterNetherOresBlocks.BN_Cincinnasite_Cane);
            content.accept(GrowableBetterNetherOresBlocks.BN_Nether_Ruby_Cane);
        });
    }

    public static void ep_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //EnergizedPower
            content.accept(GrowableEnergizedPowerOresBlocks.EP_Advanced_Alloy_Cane);
            content.accept(GrowableEnergizedPowerOresBlocks.EP_Energized_Copper_Cane);
            content.accept(GrowableEnergizedPowerOresBlocks.EP_Energized_Gold_Cane);
            content.accept(GrowableEnergizedPowerOresBlocks.EP_Redstone_Alloy_Cane);
            content.accept(GrowableEnergizedPowerOresBlocks.EP_Steel_Cane);
            content.accept(GrowableEnergizedPowerOresBlocks.EP_Tin_Cane);
        });
    }

    public static void bop_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Biomes O' Plenty
            content.accept(GrowableBiomesOPlentyOresBlocks.BOP_Rose_Quartz_Chunk_Cane);
        });
    }

    public static void de_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Draconic Evolution
            content.accept(GrowableDraconicEvolutionOresBlocks.DE_Awakened_Draconium_Ingot_Cane);
            content.accept(GrowableDraconicEvolutionOresBlocks.DE_Draconium_Ingot_Cane);
        });
    }

    public static void er_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Extreme Reactors
            content.accept(GrowableExtremeReactorsOresBlocks.ER_Anglesite_Crystal_Cane);
            content.accept(GrowableExtremeReactorsOresBlocks.ER_Benitoite_Crystal_Cane);
            content.accept(GrowableExtremeReactorsOresBlocks.ER_Blutonium_Ingot_Cane);
            content.accept(GrowableExtremeReactorsOresBlocks.ER_Cyanite_Ingot_Cane);
            content.accept(GrowableExtremeReactorsOresBlocks.ER_Graphite_Ingot_Cane);
            content.accept(GrowableExtremeReactorsOresBlocks.ER_Inanite_Ingot_Cane);
            content.accept(GrowableExtremeReactorsOresBlocks.ER_Insanite_Ingot_Cane);
            content.accept(GrowableExtremeReactorsOresBlocks.ER_Ludicrite_Ingot_Cane);
            content.accept(GrowableExtremeReactorsOresBlocks.ER_Magentite_Ingot_Cane);
            content.accept(GrowableExtremeReactorsOresBlocks.ER_Ridiculite_Ingot_Cane);
            content.accept(GrowableExtremeReactorsOresBlocks.ER_Yellorium_Ingot_Cane);
        });
    }

    public static void galo_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Galosphere
            content.accept(GrowableGalosphereOresBlocks.Galo_Allurite_Shard_Cane);
            content.accept(GrowableGalosphereOresBlocks.Galo_Lumiere_Shard_Cane);
            content.accept(GrowableGalosphereOresBlocks.Galo_Silver_Ingot_Cane);
        });
    }

    public static void gobber_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Gobber2
            content.accept(GrowableGobberOresBlocks.Gobber_Gobber_Ingot_Cane);
            content.accept(GrowableGobberOresBlocks.Gobber_End_Gobber_Ingot_Cane);
            content.accept(GrowableGobberOresBlocks.Gobber_Nether_Gobber_Ingot_Cane);
        });
    }

    public static void gtceu_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //GregTechCEu Modern
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Aluminium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Americium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Annealed_Copper_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Antimony_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Battery_Alloy_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Beryllium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Bismuth_Bronze_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Bismuth_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Black_Bronze_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Brass_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Bronze_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Chromium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Cobalt_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Cupronickel_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Darmstadtium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Duranium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Electrum_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Enriched_Naquadah_Trinium_Europium_Duranide_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Epoxy_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Europium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Amethyst_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Apatite_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Certus_Quartz_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Coke_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Glass_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Grossular_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Lapis_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Lazurite_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Malachite_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Monazite_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Nether_Quartz_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Olivine_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Opal_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Pyrope_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Quartzite_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Realgar_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Red_Garnet_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Rock_Salt_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Ruby_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Rutile_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Salt_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Sapphire_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Sodalite_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Spessartine_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Uvarovite_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Yellow_Garnet_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Almandine_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Andradite_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Blue_Topaz_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Cinnabar_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Coal_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Diamond_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Emerald_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Green_Sapphire_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Gallium_Arsenide_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Gallium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Graphene_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Indium_Gallium_Phosphide_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Indium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Indium_Tin_Barium_Titanium_Cuprate_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Iridium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Lead_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Magnalium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Magnesium_Diboride_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Magnetic_Iron_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Magnetic_Neodymium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Magnetic_Samarium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Manganese_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Manganese_Phosphide_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Mercury_Barium_Calcium_Cuprate_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Molybdenum_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Naquadah_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Naquadria_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Neodymium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Neutronium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Nichrome_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Nickel_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Nickel_Zinc_Ferrite_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Niobium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Niobium_Nitride_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Niobium_Titanium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Osmiridium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Osmium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Palladium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Platinum_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Plutonium_241_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Plutonium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Polybenzimidazole_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Polycaprolactam_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Polyethylene_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Polyphenylene_Sulfide_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Polytetrafluoroethylene_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Polyvinyl_Chloride_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Raw_Rubber_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Reinforced_Epoxy_Resin_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Rhodium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Riched_Naquadah_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Rose_Gold_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Rubber_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Ruridit_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Ruthenium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Ruthenium_Trinium_Americium_Neutronate_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Samarium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Samarium_Iron_Arsenic_Oxide_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Silicon_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Silicone_Rubber_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Silver_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Soldering_Alloy_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Stainless_Steel_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Steel_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Sterling_Silver_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Styrene_Butadiene_Rubber_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Tantalum_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Thorium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Tin_Alloy_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Tin_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Titanium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Trinium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Tritanium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Tungsten_Carbide_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Tungsten_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Ultimet_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_235_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_Rhodium_Dinaquadide_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_Triplatinum_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Vanadium_Gallium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Vanadium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Wrought_Iron_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Yttrium_Barium_Cuprate_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Yttrium_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Zinc_Ingot_Cane);
            content.accept(GrowableGregTechCEuModernOresBlocks.GTM_Invar_Ingot_Cane);
        });
    }

    public static void ma_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //ManaandArtifice
            content.accept(GrowableManaandArtificeOresBlocks.MA_Animus_Dust_Cane);
            content.accept(GrowableManaandArtificeOresBlocks.MA_Arcane_Ash_Cane);
            content.accept(GrowableManaandArtificeOresBlocks.MA_Bone_Ash_Cane);
            content.accept(GrowableManaandArtificeOresBlocks.MA_Ironbark_Cane);
            content.accept(GrowableManaandArtificeOresBlocks.MA_Living_Flame_Cane);
            content.accept(GrowableManaandArtificeOresBlocks.MA_Mote_Air_Cane);
            content.accept(GrowableManaandArtificeOresBlocks.MA_Mote_Arcane_Cane);
            content.accept(GrowableManaandArtificeOresBlocks.MA_Mote_Earth_Cane);
            content.accept(GrowableManaandArtificeOresBlocks.MA_Mote_Ender_Cane);
            content.accept(GrowableManaandArtificeOresBlocks.MA_Mote_Fire_Cane);
            content.accept(GrowableManaandArtificeOresBlocks.MA_Mote_Water_Cane);
            content.accept(GrowableManaandArtificeOresBlocks.MA_Purified_Vinteum_Dust_Cane);
            content.accept(GrowableManaandArtificeOresBlocks.MA_Purified_Vinteum_Ingot_Cane);
            content.accept(GrowableManaandArtificeOresBlocks.MA_Resonating_Dust_Cane);
            content.accept(GrowableManaandArtificeOresBlocks.MA_Superheated_Purified_Vinteum_Ingot_Cane);
            content.accept(GrowableManaandArtificeOresBlocks.MA_Superheated_Vinteum_Ingot_Cane);
            content.accept(GrowableManaandArtificeOresBlocks.MA_Vinteum_Dust_Cane);
            content.accept(GrowableManaandArtificeOresBlocks.MA_Vinteum_Ingot_Cane);
        });
    }

    public static void maa_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Mystical Agradditions
            content.accept(GrowableMysticalAgradditionsBlocks.MAA_Awakened_Draconium_Essence_Cane);
            content.accept(GrowableMysticalAgradditionsBlocks.MAA_Dragon_Egg_Essence_Cane);
            content.accept(GrowableMysticalAgradditionsBlocks.MAA_Insanium_Essence_Cane);
            content.accept(GrowableMysticalAgradditionsBlocks.MAA_Insanium_Ingot_Cane);
            content.accept(GrowableMysticalAgradditionsBlocks.MAA_Nether_Star_Essence_Cane);
            content.accept(GrowableMysticalAgradditionsBlocks.MAA_Neutronium_Essence_Cane);
            content.accept(GrowableMysticalAgradditionsBlocks.MAA_Nitro_Crystal_Essence_Cane);
        });
    }

    public static void mac_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Mystical Agriculture
            content.accept(GrowableMysticalAgricultureBlocks.MAC_Imperium_Ingot_Cane);
            content.accept(GrowableMysticalAgricultureBlocks.MAC_Inferium_Ingot_Cane);
            content.accept(GrowableMysticalAgricultureBlocks.MAC_Prosperity_Ingot_Cane);
            content.accept(GrowableMysticalAgricultureBlocks.MAC_Prudentium_Ingot_Cane);
            content.accept(GrowableMysticalAgricultureBlocks.MAC_Soulium_Ingot_Cane);
            content.accept(GrowableMysticalAgricultureBlocks.MAC_Supremium_Ingot_Cane);
            content.accept(GrowableMysticalAgricultureBlocks.MAC_Tertium_Ingot_Cane);
        });
    }

    public static void rc_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Railcraft
            content.accept(GrowableRailcraftOresBlocks.RC_Brass_Ingot_Cane);
            content.accept(GrowableRailcraftOresBlocks.RC_Bronze_Ingot_Cane);
            content.accept(GrowableRailcraftOresBlocks.RC_Charcoal_Dust_Cane);
            content.accept(GrowableRailcraftOresBlocks.RC_Coal_Dust_Cane);
            content.accept(GrowableRailcraftOresBlocks.RC_Ender_Dust_Cane);
            content.accept(GrowableRailcraftOresBlocks.RC_Invar_Ingot_Cane);
            content.accept(GrowableRailcraftOresBlocks.RC_Lead_Ingot_Cane);
            content.accept(GrowableRailcraftOresBlocks.RC_Nickel_Ingot_Cane);
            content.accept(GrowableRailcraftOresBlocks.RC_Obsidian_Dust_Cane);
            content.accept(GrowableRailcraftOresBlocks.RC_Saltpeter_Dust_Cane);
            content.accept(GrowableRailcraftOresBlocks.RC_Silver_Ingot_Cane);
            content.accept(GrowableRailcraftOresBlocks.RC_Steel_Ingot_Cane);
            content.accept(GrowableRailcraftOresBlocks.RC_Sulfur_Dust_Cane);
            content.accept(GrowableRailcraftOresBlocks.RC_Tin_Ingot_Cane);
            content.accept(GrowableRailcraftOresBlocks.RC_Zinc_Ingot_Cane);
        });
    }

    public static void rft_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //RFTools
            content.accept(GrowableRFToolsOresBlocks.RFT_Dimensional_Shard_Cane);
        });
    }

    public static void tc_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Tinkers' Construct
            content.accept(GrowableTinkersConstructBlocks.TC_Amethyst_Bronze_Ingot_Cane);
            content.accept(GrowableTinkersConstructBlocks.TC_Blazing_Bone_Cane);
            content.accept(GrowableTinkersConstructBlocks.TC_Cheese_Ingot_Cane);
            content.accept(GrowableTinkersConstructBlocks.TC_Cobalt_Ingot_Cane);
            content.accept(GrowableTinkersConstructBlocks.TC_Earth_Slime_Crystal_Cane);
            content.accept(GrowableTinkersConstructBlocks.TC_Ender_Slime_Crystal_Cane);
            content.accept(GrowableTinkersConstructBlocks.TC_Hepatizon_Ingot_Cane);
            content.accept(GrowableTinkersConstructBlocks.TC_Ichor_Slime_Crystal_Cane);
            content.accept(GrowableTinkersConstructBlocks.TC_Knightslime_Ingot_Cane);
            content.accept(GrowableTinkersConstructBlocks.TC_Manyullyn_Ingot_Cane);
            content.accept(GrowableTinkersConstructBlocks.TC_Modifier_Crystal_Cane);
            content.accept(GrowableTinkersConstructBlocks.TC_Necronium_Bone_Cane);
            content.accept(GrowableTinkersConstructBlocks.TC_Necrotic_Bone_Cane);
            content.accept(GrowableTinkersConstructBlocks.TC_Queens_Slime_Ingot_Cane);
            content.accept(GrowableTinkersConstructBlocks.TC_Rose_Gold_Ingot_Cane);
            content.accept(GrowableTinkersConstructBlocks.TC_Sky_Slime_Crystal_Cane);
            content.accept(GrowableTinkersConstructBlocks.TC_Slimesteel_Ingot_Cane);
            content.accept(GrowableTinkersConstructBlocks.TC_Soulsteel_Ingot_Cane);
        });
    }

    public static void ot_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Oritech
            content.accept(GrowableOritechBlocks.OT_Adamant_Ingot_Cane);
            content.accept(GrowableOritechBlocks.OT_Biosteel_Ingot_Cane);
            content.accept(GrowableOritechBlocks.OT_Duratium_Ingot_Cane);
            content.accept(GrowableOritechBlocks.OT_Electrum_Ingot_Cane);
            content.accept(GrowableOritechBlocks.OT_Energite_Ingot_Cane);
            content.accept(GrowableOritechBlocks.OT_Nickel_Ingot_Cane);
            content.accept(GrowableOritechBlocks.OT_Platinum_Ingot_Cane);
            content.accept(GrowableOritechBlocks.OT_Prometheum_Ingot_Cane);
            content.accept(GrowableOritechBlocks.OT_Steel_Ingot_Cane);
            content.accept(GrowableOritechBlocks.OT_Uranium_Crystal_Cane);

        });
    }

    public static void ed_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Electro Dynamics
            content.accept(GrowableElectroDynamicsOresBlocks.ED_Ingot_Aluminum_Cane);
            content.accept(GrowableElectroDynamicsOresBlocks.ED_Ingot_Bronze_Cane);
            content.accept(GrowableElectroDynamicsOresBlocks.ED_Ingot_Chromium_Cane);
            content.accept(GrowableElectroDynamicsOresBlocks.ED_Ingot_Hsla_Steel_Cane);
            content.accept(GrowableElectroDynamicsOresBlocks.ED_Ingot_Lead_Cane);
            content.accept(GrowableElectroDynamicsOresBlocks.ED_Ingot_Lithium_Cane);
            content.accept(GrowableElectroDynamicsOresBlocks.ED_Ingot_Molybdenum_Cane);
            content.accept(GrowableElectroDynamicsOresBlocks.ED_Ingot_Silver_Cane);
            content.accept(GrowableElectroDynamicsOresBlocks.ED_Ingot_Stainless_Steel_Cane);
            content.accept(GrowableElectroDynamicsOresBlocks.ED_Ingot_Steel_Cane);
            content.accept(GrowableElectroDynamicsOresBlocks.ED_Ingot_Superconductive_Cane);
            content.accept(GrowableElectroDynamicsOresBlocks.ED_Ingot_Tin_Cane);
            content.accept(GrowableElectroDynamicsOresBlocks.ED_Ingot_Titanium_Cane);
            content.accept(GrowableElectroDynamicsOresBlocks.ED_Ingot_Titanium_Carbide_Cane);
            content.accept(GrowableElectroDynamicsOresBlocks.ED_Ingot_Vanadium_Cane);
            content.accept(GrowableElectroDynamicsOresBlocks.ED_Ingot_Vanadium_Steel_Cane);

        });
    }

    public static void clm_item() {
        CreativeModeTabEvents.modifyOutputEvent(Growable_Ores_Group).register(content -> {
            //Cobblemon
            content.accept(GrowableCobblemonOresBlocks.CLM_Dusk_Stone_Cane);
            content.accept(GrowableCobblemonOresBlocks.CLM_Dawn_Stone_Cane);
            content.accept(GrowableCobblemonOresBlocks.CLM_Fire_Stone_Cane);
            content.accept(GrowableCobblemonOresBlocks.CLM_Sun_Stone_Cane);
            content.accept(GrowableCobblemonOresBlocks.CLM_Thunder_Stone_Cane);
            content.accept(GrowableCobblemonOresBlocks.CLM_Shiny_Stone_Cane);
            content.accept(GrowableCobblemonOresBlocks.CLM_Ice_Stone_Cane);
            content.accept(GrowableCobblemonOresBlocks.CLM_Moon_Stone_Cane);
            content.accept(GrowableCobblemonOresBlocks.CLM_Leaf_Stone_Cane);
            content.accept(GrowableCobblemonOresBlocks.CLM_Water_Stone_Cane);

        });
    }
}
