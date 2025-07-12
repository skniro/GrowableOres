package com.skniro.growableores.util;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.*;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class GrowableOresItemGroups {
    public static final RegistryKey<ItemGroup> Growable_Ores_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(GrowableOres.MOD_ID, "test_group"));

    public static void vanilla_item() {
        Registry.register(Registries.ITEM_GROUP, Growable_Ores_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(GrowableVanillaOresBlocks.Iron_Cane))
                .displayName(Text.translatable("itemGroup.growable_ores.test_group"))
                .build()); // build() no longer registers by itself

        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            content.add(GrowableVanillaOresBlocks.Coal_Cane);
            content.add(GrowableVanillaOresBlocks.Iron_Cane);
            content.add(GrowableVanillaOresBlocks.Diamond_Cane);
            content.add(GrowableVanillaOresBlocks.Copper_Cane);
            content.add(GrowableVanillaOresBlocks.Emerald_Cane);
            content.add(GrowableVanillaOresBlocks.Gold_Cane);
            content.add(GrowableVanillaOresBlocks.Lapis_Cane);
            content.add(GrowableVanillaOresBlocks.Nether_Quartz_Cane);
            content.add(GrowableVanillaOresBlocks.Redstone_Cane);
            content.add(GrowableVanillaOresBlocks.Blaze_Rod_Cane);
            content.add(GrowableVanillaOresBlocks.Ender_Pearl_Cane);
            content.add(GrowableVanillaOresBlocks.Netherite_Ingot_Cane);
            content.add(GrowableVanillaOresBlocks.Clay_Cane);
            content.add(GrowableVanillaOresBlocks.Glowstone_Cane);
            content.add(GrowableVanillaOresBlocks.Slime_Cane);
            content.add(GrowableVanillaOresBlocks.Bone_Cane);
            content.add(GrowableVanillaOresBlocks.Nether_Star_Cane);
            content.add(GrowableVanillaOresBlocks.Egg_Cane);
            content.add(GrowableVanillaOresBlocks.Wool_Cane);
            content.add(GrowableVanillaOresBlocks.Feather_Cane);
            content.add(GrowableVanillaOresBlocks.Gunpowder_Cane);
            content.add(GrowableVanillaOresBlocks.Leather_Cane);
        });
    }
    public static void ae_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //ae2
            content.add(GrowableAEOresBlocks.certus_quartz_crystal_Cane);
            content.add(GrowableAEOresBlocks.fluix_crystal_Cane);
        });
    }

    public static void techreborn_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //Tech Reborn
            content.add(GrowableTechRebornOresBlocks.cinnabar_Cane);
            content.add(GrowableTechRebornOresBlocks.galena_Cane);
            content.add(GrowableTechRebornOresBlocks.iridium_Cane);
            content.add(GrowableTechRebornOresBlocks.lead_Cane);
            content.add(GrowableTechRebornOresBlocks.peridot_Cane);
            content.add(GrowableTechRebornOresBlocks.pyrite_Cane);
            content.add(GrowableTechRebornOresBlocks.ruby_Cane);
            content.add(GrowableTechRebornOresBlocks.sapphire_Cane);
            content.add(GrowableTechRebornOresBlocks.sheldonite_Cane);
            content.add(GrowableTechRebornOresBlocks.silver_Cane);
            content.add(GrowableTechRebornOresBlocks.sphalerite_Cane);
            content.add(GrowableTechRebornOresBlocks.tin_Cane);
            content.add(GrowableTechRebornOresBlocks.tungsten_Cane);
            content.add(GrowableTechRebornOresBlocks.sodalite_Cane);
            content.add(GrowableTechRebornOresBlocks.bauxite_Cane);
        });
    }

    public static void betterend_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //BetterEnd
            content.add(GrowableBetterEndOresBlocks.amber_Cane);
            content.add(GrowableBetterEndOresBlocks.ender_Cane);
            content.add(GrowableBetterEndOresBlocks.thallasium_Cane);
        });
    }

    public static void maple_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //Maple
            content.add(GrowableMapleOresBlocks.Salt_Cane);
        });
    }
    public static void powah_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //Powah Rearchitected and Powah
            content.add(GrowablePowahOresBlocks.Steel_Energized_Cane);
            content.add(GrowablePowahOresBlocks.Uraninite_Ore_Dense_Cane);
            content.add(GrowablePowahOresBlocks.Ender_Core_Cane);
            content.add(GrowablePowahOresBlocks.Crystal_Spirited_Cane);
            content.add(GrowablePowahOresBlocks.Crystal_Nitro_Cane);
            content.add(GrowablePowahOresBlocks.Crystal_Niotic_Cane);
            content.add(GrowablePowahOresBlocks.Crystal_Blazing_Cane);
        });
    }

    public static void ir_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //Industrial Revolution
            content.add(GrowableIndustrialRevolutionOresBlocks.IR_Lead_Cane);
            content.add(GrowableIndustrialRevolutionOresBlocks.IR_nikolite_Cane );
            content.add(GrowableIndustrialRevolutionOresBlocks.IR_silver_Cane);
            content.add(GrowableIndustrialRevolutionOresBlocks.IR_tin_ore_Cane);
            content.add(GrowableIndustrialRevolutionOresBlocks.IR_tungsten_Cane);
        });
    }
    public static void mi_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
    //Modern Industrialization
            content.add(GrowableModernIndustrializationOresBlocks.MI_antimony_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_bauxite_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_iridium_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_lead_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_lignite_coal_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_monazite_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_nickel_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_platinum_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_quartz_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_salt_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_tin_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_titanium_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_tungsten_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_uranium_Cane);
        });
    }
    public static void ic_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //ic2 and ic2c
            content.add(GrowableICOresBlocks.IC2_Aluminium_Cane);
            content.add(GrowableICOresBlocks.IC2_silver_Cane);
            content.add(GrowableICOresBlocks.IC2_Tin_Cane);
            content.add(GrowableICOresBlocks.IC2_Uranium_Cane);
        });
    }
    public static void ad_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //Ad Astra!
            content.add(GrowableAdAstraOresBlocks.AD_Ostrum_Cane);
            content.add(GrowableAdAstraOresBlocks.AD_Ice_Shard_Cane);
            content.add(GrowableAdAstraOresBlocks.AD_Cheese_Cane);
            content.add(GrowableAdAstraOresBlocks.AD_Desh_Cane);
            content.add(GrowableAdAstraOresBlocks.AD_Calorite_Cane);
        });
    }
    public static void c_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //Create
            content.add(GrowableCreateOresBlocks.C_Andesite_Alloy_Cane);
            content.add(GrowableCreateOresBlocks.C_Brass_Ingot_Cane);
            content.add(GrowableCreateOresBlocks.C_Polished_Rose_Quartz_Cane);
            content.add(GrowableCreateOresBlocks.C_Zinc_Cane);
        });
    }
    public static void tf_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //Thermal Series
            content.add(GrowableThermalSeriesOresBlocks.TF_Apatite_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Cinnabar_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Copper_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Lead_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Nickel_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Niter_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Ruby_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Sapphire_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Silver_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Sulfur_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Tin_Cane);
        });
    }


    public static void mek_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //Mekanism
            content.add(GrowableMekanismOresBlocks.MEK_Fluorite_Cane);
            content.add(GrowableMekanismOresBlocks.MEK_Lead_Cane);
            content.add(GrowableMekanismOresBlocks.MEK_Osmium_Cane);
            content.add(GrowableMekanismOresBlocks.MEK_Tin_Cane);
            content.add(GrowableMekanismOresBlocks.MEK_Uranium_Cane);
            content.add(GrowableMekanismOresBlocks.MEK_Steel_Cane);
            content.add(GrowableMekanismOresBlocks.MEK_Refined_Obsidian_Cane);
            content.add(GrowableMekanismOresBlocks.MEK_Refined_Glowstone_Cane);
            content.add(GrowableMekanismOresBlocks.MEK_Bronze_Cane);
        });
    }

    public static void bn_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //BetterNether
            content.add(GrowableBetterNetherOresBlocks.BN_Cincinnasite_Cane);
            content.add(GrowableBetterNetherOresBlocks.BN_Nether_Ruby_Cane);
        });
    }

    public static void ep_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //EnergizedPower
            content.add(GrowableEnergizedPowerOresBlocks.EP_Advanced_Alloy_Cane);
            content.add(GrowableEnergizedPowerOresBlocks.EP_Energized_Copper_Cane);
            content.add(GrowableEnergizedPowerOresBlocks.EP_Energized_Gold_Cane);
            content.add(GrowableEnergizedPowerOresBlocks.EP_Redstone_Alloy_Cane);
            content.add(GrowableEnergizedPowerOresBlocks.EP_Steel_Cane);
            content.add(GrowableEnergizedPowerOresBlocks.EP_Tin_Cane);
        });
    }

    public static void bop_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //Biomes O' Plenty
            content.add(GrowableBiomesOPlentyOresBlocks.BOP_Rose_Quartz_Chunk_Cane);
        });
    }

    public static void de_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //Draconic Evolution
            content.add(GrowableDraconicEvolutionOresBlocks.DE_Awakened_Draconium_Ingot_Cane);
            content.add(GrowableDraconicEvolutionOresBlocks.DE_Draconium_Ingot_Cane);
        });
    }

    public static void er_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //Extreme Reactors
            content.add(GrowableExtremeReactorsOresBlocks.ER_Anglesite_Crystal_Cane);
            content.add(GrowableExtremeReactorsOresBlocks.ER_Benitoite_Crystal_Cane);
            content.add(GrowableExtremeReactorsOresBlocks.ER_Blutonium_Ingot_Cane);
            content.add(GrowableExtremeReactorsOresBlocks.ER_Cyanite_Ingot_Cane);
            content.add(GrowableExtremeReactorsOresBlocks.ER_Graphite_Ingot_Cane);
            content.add(GrowableExtremeReactorsOresBlocks.ER_Inanite_Ingot_Cane);
            content.add(GrowableExtremeReactorsOresBlocks.ER_Insanite_Ingot_Cane);
            content.add(GrowableExtremeReactorsOresBlocks.ER_Ludicrite_Ingot_Cane);
            content.add(GrowableExtremeReactorsOresBlocks.ER_Magentite_Ingot_Cane);
            content.add(GrowableExtremeReactorsOresBlocks.ER_Ridiculite_Ingot_Cane);
            content.add(GrowableExtremeReactorsOresBlocks.ER_Yellorium_Ingot_Cane);
        });
    }

    public static void galo_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //Galosphere
            content.add(GrowableGalosphereOresBlocks.Galo_Allurite_Shard_Cane);
            content.add(GrowableGalosphereOresBlocks.Galo_Lumiere_Shard_Cane);
            content.add(GrowableGalosphereOresBlocks.Galo_Silver_Ingot_Cane);
        });
    }

    public static void gobber_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //Gobber2
            content.add(GrowableGobberOresBlocks.Gobber_Gobber_Ingot_Cane);
            content.add(GrowableGobberOresBlocks.Gobber_End_Gobber_Ingot_Cane);
            content.add(GrowableGobberOresBlocks.Gobber_Nether_Gobber_Ingot_Cane);
        });
    }

    public static void gtceu_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //GregTechCEu Modern
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Aluminium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Americium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Annealed_Copper_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Antimony_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Battery_Alloy_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Beryllium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Bismuth_Bronze_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Bismuth_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Black_Bronze_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Brass_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Bronze_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Chromium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Cobalt_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Cupronickel_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Darmstadtium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Duranium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Electrum_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Enriched_Naquadah_Trinium_Europium_Duranide_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Epoxy_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Europium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Amethyst_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Apatite_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Certus_Quartz_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Coke_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Glass_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Grossular_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Lapis_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Lazurite_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Malachite_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Monazite_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Nether_Quartz_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Olivine_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Opal_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Pyrope_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Quartzite_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Realgar_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Red_Garnet_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Rock_Salt_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Ruby_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Rutile_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Salt_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Sapphire_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Sodalite_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Spessartine_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Uvarovite_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Yellow_Garnet_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Almandine_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Andradite_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Blue_Topaz_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Cinnabar_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Coal_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Diamond_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Emerald_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Green_Sapphire_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Gallium_Arsenide_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Gallium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Graphene_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Indium_Gallium_Phosphide_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Indium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Indium_Tin_Barium_Titanium_Cuprate_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Iridium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Lead_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Magnalium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Magnesium_Diboride_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Magnetic_Iron_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Magnetic_Neodymium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Magnetic_Samarium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Manganese_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Manganese_Phosphide_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Mercury_Barium_Calcium_Cuprate_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Molybdenum_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Naquadah_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Naquadria_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Neodymium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Neutronium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Nichrome_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Nickel_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Nickel_Zinc_Ferrite_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Niobium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Niobium_Nitride_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Niobium_Titanium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Osmiridium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Osmium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Palladium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Platinum_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Plutonium_241_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Plutonium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Polybenzimidazole_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Polycaprolactam_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Polyethylene_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Polyphenylene_Sulfide_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Polytetrafluoroethylene_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Polyvinyl_Chloride_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Raw_Rubber_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Reinforced_Epoxy_Resin_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Rhodium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Riched_Naquadah_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Rose_Gold_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Rubber_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Ruridit_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Ruthenium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Ruthenium_Trinium_Americium_Neutronate_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Samarium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Samarium_Iron_Arsenic_Oxide_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Silicon_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Silicone_Rubber_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Silver_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Soldering_Alloy_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Stainless_Steel_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Steel_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Sterling_Silver_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Styrene_Butadiene_Rubber_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Tantalum_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Thorium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Tin_Alloy_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Tin_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Titanium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Trinium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Tritanium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Tungsten_Carbide_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Tungsten_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Ultimet_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_235_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_Rhodium_Dinaquadide_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_Triplatinum_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Vanadium_Gallium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Vanadium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Wrought_Iron_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Yttrium_Barium_Cuprate_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Yttrium_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Zinc_Ingot_Cane);
            content.add(GrowableGregTechCEuModernOresBlocks.GTM_Invar_Ingot_Cane);
        });
    }

    public static void ma_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //ManaandArtifice
            content.add(GrowableManaandArtificeOresBlocks.MA_Animus_Dust_Cane);
            content.add(GrowableManaandArtificeOresBlocks.MA_Arcane_Ash_Cane);
            content.add(GrowableManaandArtificeOresBlocks.MA_Bone_Ash_Cane);
            content.add(GrowableManaandArtificeOresBlocks.MA_Ironbark_Cane);
            content.add(GrowableManaandArtificeOresBlocks.MA_Living_Flame_Cane);
            content.add(GrowableManaandArtificeOresBlocks.MA_Mote_Air_Cane);
            content.add(GrowableManaandArtificeOresBlocks.MA_Mote_Arcane_Cane);
            content.add(GrowableManaandArtificeOresBlocks.MA_Mote_Earth_Cane);
            content.add(GrowableManaandArtificeOresBlocks.MA_Mote_Ender_Cane);
            content.add(GrowableManaandArtificeOresBlocks.MA_Mote_Fire_Cane);
            content.add(GrowableManaandArtificeOresBlocks.MA_Mote_Water_Cane);
            content.add(GrowableManaandArtificeOresBlocks.MA_Purified_Vinteum_Dust_Cane);
            content.add(GrowableManaandArtificeOresBlocks.MA_Purified_Vinteum_Ingot_Cane);
            content.add(GrowableManaandArtificeOresBlocks.MA_Resonating_Dust_Cane);
            content.add(GrowableManaandArtificeOresBlocks.MA_Superheated_Purified_Vinteum_Ingot_Cane);
            content.add(GrowableManaandArtificeOresBlocks.MA_Superheated_Vinteum_Ingot_Cane);
            content.add(GrowableManaandArtificeOresBlocks.MA_Vinteum_Dust_Cane);
            content.add(GrowableManaandArtificeOresBlocks.MA_Vinteum_Ingot_Cane);
        });
    }

    public static void maa_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //Mystical Agradditions
            content.add(GrowableMysticalAgradditionsBlocks.MAA_Awakened_Draconium_Essence_Cane);
            content.add(GrowableMysticalAgradditionsBlocks.MAA_Dragon_Egg_Essence_Cane);
            content.add(GrowableMysticalAgradditionsBlocks.MAA_Insanium_Essence_Cane);
            content.add(GrowableMysticalAgradditionsBlocks.MAA_Insanium_Ingot_Cane);
            content.add(GrowableMysticalAgradditionsBlocks.MAA_Nether_Star_Essence_Cane);
            content.add(GrowableMysticalAgradditionsBlocks.MAA_Neutronium_Essence_Cane);
            content.add(GrowableMysticalAgradditionsBlocks.MAA_Nitro_Crystal_Essence_Cane);
        });
    }

    public static void mac_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //Mystical Agriculture
            content.add(GrowableMysticalAgricultureBlocks.MAC_Imperium_Ingot_Cane);
            content.add(GrowableMysticalAgricultureBlocks.MAC_Inferium_Ingot_Cane);
            content.add(GrowableMysticalAgricultureBlocks.MAC_Prosperity_Ingot_Cane);
            content.add(GrowableMysticalAgricultureBlocks.MAC_Prudentium_Ingot_Cane);
            content.add(GrowableMysticalAgricultureBlocks.MAC_Soulium_Ingot_Cane);
            content.add(GrowableMysticalAgricultureBlocks.MAC_Supremium_Ingot_Cane);
            content.add(GrowableMysticalAgricultureBlocks.MAC_Tertium_Ingot_Cane);
        });
    }

    public static void rc_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //Railcraft
            content.add(GrowableRailcraftOresBlocks.RC_Brass_Ingot_Cane);
            content.add(GrowableRailcraftOresBlocks.RC_Bronze_Ingot_Cane);
            content.add(GrowableRailcraftOresBlocks.RC_Charcoal_Dust_Cane);
            content.add(GrowableRailcraftOresBlocks.RC_Coal_Dust_Cane);
            content.add(GrowableRailcraftOresBlocks.RC_Ender_Dust_Cane);
            content.add(GrowableRailcraftOresBlocks.RC_Invar_Ingot_Cane);
            content.add(GrowableRailcraftOresBlocks.RC_Lead_Ingot_Cane);
            content.add(GrowableRailcraftOresBlocks.RC_Nickel_Ingot_Cane);
            content.add(GrowableRailcraftOresBlocks.RC_Obsidian_Dust_Cane);
            content.add(GrowableRailcraftOresBlocks.RC_Saltpeter_Dust_Cane);
            content.add(GrowableRailcraftOresBlocks.RC_Silver_Ingot_Cane);
            content.add(GrowableRailcraftOresBlocks.RC_Steel_Ingot_Cane);
            content.add(GrowableRailcraftOresBlocks.RC_Sulfur_Dust_Cane);
            content.add(GrowableRailcraftOresBlocks.RC_Tin_Ingot_Cane);
            content.add(GrowableRailcraftOresBlocks.RC_Zinc_Ingot_Cane);
        });
    }

    public static void rft_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //RFTools
            content.add(GrowableRFToolsOresBlocks.RFT_Dimensional_Shard_Cane);
        });
    }

    public static void tc_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            //Tinkers' Construct
            content.add(GrowableTinkersConstructBlocks.TC_Amethyst_Bronze_Ingot_Cane);
            content.add(GrowableTinkersConstructBlocks.TC_Blazing_Bone_Cane);
            content.add(GrowableTinkersConstructBlocks.TC_Cheese_Ingot_Cane);
            content.add(GrowableTinkersConstructBlocks.TC_Cobalt_Ingot_Cane);
            content.add(GrowableTinkersConstructBlocks.TC_Earth_Slime_Crystal_Cane);
            content.add(GrowableTinkersConstructBlocks.TC_Ender_Slime_Crystal_Cane);
            content.add(GrowableTinkersConstructBlocks.TC_Hepatizon_Ingot_Cane);
            content.add(GrowableTinkersConstructBlocks.TC_Ichor_Slime_Crystal_Cane);
            content.add(GrowableTinkersConstructBlocks.TC_Knightslime_Ingot_Cane);
            content.add(GrowableTinkersConstructBlocks.TC_Manyullyn_Ingot_Cane);
            content.add(GrowableTinkersConstructBlocks.TC_Modifier_Crystal_Cane);
            content.add(GrowableTinkersConstructBlocks.TC_Necronium_Bone_Cane);
            content.add(GrowableTinkersConstructBlocks.TC_Necrotic_Bone_Cane);
            content.add(GrowableTinkersConstructBlocks.TC_Queens_Slime_Ingot_Cane);
            content.add(GrowableTinkersConstructBlocks.TC_Rose_Gold_Ingot_Cane);
            content.add(GrowableTinkersConstructBlocks.TC_Sky_Slime_Crystal_Cane);
            content.add(GrowableTinkersConstructBlocks.TC_Slimesteel_Ingot_Cane);
            content.add(GrowableTinkersConstructBlocks.TC_Soulsteel_Ingot_Cane);
        });
    }
}
