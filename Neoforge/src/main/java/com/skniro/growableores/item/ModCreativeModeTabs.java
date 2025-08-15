package com.skniro.growableores.item;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.*;
import com.skniro.growableores.conifg.GrowableOresConfig;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GrowableOres.MOD_ID);

    public static final DeferredHolder<CreativeModeTab,CreativeModeTab> Growable_Ores_Group = CREATIVE_MODE_TABS.register("test_group",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(GrowableVanillaOresBlocks.Iron_Cane.get()))
                    .title(Component.translatable("itemGroup.growable_ores.test_group"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(GrowableVanillaOresBlocks.Coal_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Iron_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Diamond_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Copper_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Emerald_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Gold_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Lapis_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Nether_Quartz_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Redstone_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Blaze_Rod_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Ender_Pearl_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Netherite_Ingot_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Netherite_Scrap_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Clay_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Slime_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Nether_Star_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Glowstone_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Bone_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Egg_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Feather_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Wool_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Gunpowder_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Leather_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Oak_Log_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Spruce_Log_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Birch_Log_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Jungle_Log_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Acacia_Log_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Dark_Oak_Log_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Mangrove_Log_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Bamboo_Block_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Cherry_Log_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Crimson_Stem_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Warped_Stem_Cane.get());
                        pOutput.accept(GrowableVanillaOresBlocks.Amethyst_Shard_Cane.get());

                        if(ModList.get().isLoaded("ad_astra") || GrowableOresConfig.All_Item_Mode) {
                            //Ad Astra!
                            pOutput.accept(GrowableAdAstraOresBlocks.AD_Ostrum_Cane.get());
                            pOutput.accept(GrowableAdAstraOresBlocks.AD_Ice_Shard_Cane.get());
                            pOutput.accept(GrowableAdAstraOresBlocks.AD_Cheese_Cane.get());
                            pOutput.accept(GrowableAdAstraOresBlocks.AD_Desh_Cane.get());
                            pOutput.accept(GrowableAdAstraOresBlocks.AD_Calorite_Cane.get());
                        }

                        if (ModList.get().isLoaded("ae2") || GrowableOresConfig.All_Item_Mode) {
                            //ae2
                            pOutput.accept(GrowableAEOresBlocks.certus_quartz_crystal_Cane.get());
                            pOutput.accept(GrowableAEOresBlocks.fluix_crystal_Cane.get());
                        }

                        if (ModList.get().isLoaded("betterend") || GrowableOresConfig.All_Item_Mode) {
                            //BetterEnd
                            pOutput.accept(GrowableBetterEndOresBlocks.amber_Cane.get());
                            pOutput.accept(GrowableBetterEndOresBlocks.ender_Cane.get());
                            pOutput.accept(GrowableBetterEndOresBlocks.thallasium_Cane.get());
                        }

                        if (ModList.get().isLoaded("powah") || GrowableOresConfig.All_Item_Mode) {
                            //Powah Rearchitected and Powah
                            pOutput.accept(GrowablePowahOresBlocks.Steel_Energized_Cane.get());
                            pOutput.accept(GrowablePowahOresBlocks.Uraninite_Ore_Dense_Cane.get());
                            pOutput.accept(GrowablePowahOresBlocks.Ender_Core_Cane.get());
                            pOutput.accept(GrowablePowahOresBlocks.Crystal_Spirited_Cane.get());
                            pOutput.accept(GrowablePowahOresBlocks.Crystal_Nitro_Cane.get());
                            pOutput.accept(GrowablePowahOresBlocks.Crystal_Niotic_Cane.get());
                            pOutput.accept(GrowablePowahOresBlocks.Crystal_Blazing_Cane.get());
                        }

                        if (ModList.get().isLoaded("create") || GrowableOresConfig.All_Item_Mode) {
                            //Create
                            pOutput.accept(GrowableCreateOresBlocks.C_Andesite_Alloy_Cane.get());
                            pOutput.accept(GrowableCreateOresBlocks.C_Brass_Ingot_Cane.get());
                            pOutput.accept(GrowableCreateOresBlocks.C_Zinc_Cane.get());
                            pOutput.accept(GrowableCreateOresBlocks.C_Polished_Rose_Quartz_Cane.get());
                        }

                        if (ModList.get().isLoaded("ic2") || GrowableOresConfig.All_Item_Mode) {
                            //ic2 and ic2c
                            pOutput.accept(GrowableICOresBlocks.IC2_Aluminium_Cane.get());
                            pOutput.accept(GrowableICOresBlocks.IC2_silver_Cane.get());
                            pOutput.accept(GrowableICOresBlocks.IC2_Tin_Cane.get());
                            pOutput.accept(GrowableICOresBlocks.IC2_Uranium_Cane.get());
                        }
                        if (ModList.get().isLoaded("thermal") || GrowableOresConfig.All_Item_Mode) {
                            //Thermal Series
                            pOutput.accept(GrowableThermalSeriesOresBlocks.TF_Apatite_Cane.get());
                            pOutput.accept(GrowableThermalSeriesOresBlocks.TF_Cinnabar_Cane.get());
                            pOutput.accept(GrowableThermalSeriesOresBlocks.TF_Copper_Cane.get());
                            pOutput.accept(GrowableThermalSeriesOresBlocks.TF_Lead_Cane.get());
                            pOutput.accept(GrowableThermalSeriesOresBlocks.TF_Nickel_Cane.get());
                            pOutput.accept(GrowableThermalSeriesOresBlocks.TF_Niter_Cane.get());
                            pOutput.accept(GrowableThermalSeriesOresBlocks.TF_Ruby_Cane.get());
                            pOutput.accept(GrowableThermalSeriesOresBlocks.TF_Sapphire_Cane.get());
                            pOutput.accept(GrowableThermalSeriesOresBlocks.TF_Silver_Cane.get());
                            pOutput.accept(GrowableThermalSeriesOresBlocks.TF_Sulfur_Cane.get());
                            pOutput.accept(GrowableThermalSeriesOresBlocks.TF_Tin_Cane.get());
                        }

                        if(ModList.get().isLoaded("ad_astra") || GrowableOresConfig.All_Item_Mode) {
                            //Ad Astra!
                            pOutput.accept(GrowableAdAstraOresBlocks.AD_Ostrum_Cane.get());
                            pOutput.accept(GrowableAdAstraOresBlocks.AD_Ice_Shard_Cane.get());
                            pOutput.accept(GrowableAdAstraOresBlocks.AD_Cheese_Cane.get());
                            pOutput.accept(GrowableAdAstraOresBlocks.AD_Desh_Cane.get());
                            pOutput.accept(GrowableAdAstraOresBlocks.AD_Calorite_Cane.get());
                        }

                        if(ModList.get().isLoaded("mekanism") || GrowableOresConfig.All_Item_Mode) {
                            //Mekanism
                            pOutput.accept(GrowableMekanismOresBlocks.MEK_Fluorite_Cane.get());
                            pOutput.accept(GrowableMekanismOresBlocks.MEK_Lead_Cane.get());
                            pOutput.accept(GrowableMekanismOresBlocks.MEK_Osmium_Cane.get());
                            pOutput.accept(GrowableMekanismOresBlocks.MEK_Tin_Cane.get());
                            pOutput.accept(GrowableMekanismOresBlocks.MEK_Uranium_Cane.get());
                            pOutput.accept(GrowableMekanismOresBlocks.MEK_Steel_Cane.get());
                            pOutput.accept(GrowableMekanismOresBlocks.MEK_Refined_Obsidian_Cane.get());
                            pOutput.accept(GrowableMekanismOresBlocks.MEK_Refined_Glowstone_Cane.get());
                            pOutput.accept(GrowableMekanismOresBlocks.MEK_Bronze_Cane.get());
                        }

                        if(ModList.get().isLoaded("betternether") || GrowableOresConfig.All_Item_Mode) {
                            //BetterNether
                            pOutput.accept(GrowableBetterNetherOresBlocks.BN_Cincinnasite_Cane.get());
                            pOutput.accept(GrowableBetterNetherOresBlocks.BN_Nether_Ruby_Cane.get());
                        }

                        if(ModList.get().isLoaded("energizedpower") || GrowableOresConfig.All_Item_Mode) {
                            pOutput.accept(GrowableEnergizedPowerOresBlocks.EP_Advanced_Alloy_Cane.get());
                            pOutput.accept(GrowableEnergizedPowerOresBlocks.EP_Energized_Copper_Cane.get());
                            pOutput.accept(GrowableEnergizedPowerOresBlocks.EP_Energized_Gold_Cane.get());
                            pOutput.accept(GrowableEnergizedPowerOresBlocks.EP_Redstone_Alloy_Cane.get());
                            pOutput.accept(GrowableEnergizedPowerOresBlocks.EP_Steel_Cane.get());
                            pOutput.accept(GrowableEnergizedPowerOresBlocks.EP_Tin_Cane.get());
                        }

                        if (ModList.get().isLoaded("biomesoplenty") || GrowableOresConfig.All_Item_Mode) {
                            //Biomes O' Plenty
                            pOutput.accept(GrowableBiomesOPlentyOresBlocks.BOP_Rose_Quartz_Chunk_Cane.get());
                        }

                        if (ModList.get().isLoaded("draconicevolution") || GrowableOresConfig.All_Item_Mode) {
                            //Draconic Evolution
                            pOutput.accept(GrowableDraconicEvolutionOresBlocks.DE_Awakened_Draconium_Ingot_Cane.get());
                            pOutput.accept(GrowableDraconicEvolutionOresBlocks.DE_Draconium_Ingot_Cane.get());
                        }

                        if (ModList.get().isLoaded("extremereactors") || GrowableOresConfig.All_Item_Mode) {
                            //Extreme Reactors
                            pOutput.accept(GrowableExtremeReactorsOresBlocks.ER_Anglesite_Crystal_Cane.get());
                            pOutput.accept(GrowableExtremeReactorsOresBlocks.ER_Benitoite_Crystal_Cane.get());
                            pOutput.accept(GrowableExtremeReactorsOresBlocks.ER_Blutonium_Ingot_Cane.get());
                            pOutput.accept(GrowableExtremeReactorsOresBlocks.ER_Cyanite_Ingot_Cane.get());
                            pOutput.accept(GrowableExtremeReactorsOresBlocks.ER_Graphite_Ingot_Cane.get());
                            pOutput.accept(GrowableExtremeReactorsOresBlocks.ER_Inanite_Ingot_Cane.get());
                            pOutput.accept(GrowableExtremeReactorsOresBlocks.ER_Insanite_Ingot_Cane.get());
                            pOutput.accept(GrowableExtremeReactorsOresBlocks.ER_Ludicrite_Ingot_Cane.get());
                            pOutput.accept(GrowableExtremeReactorsOresBlocks.ER_Magentite_Ingot_Cane.get());
                            pOutput.accept(GrowableExtremeReactorsOresBlocks.ER_Ridiculite_Ingot_Cane.get());
                            pOutput.accept(GrowableExtremeReactorsOresBlocks.ER_Yellorium_Ingot_Cane.get());
                        }

                        if (ModList.get().isLoaded("galosphere") || GrowableOresConfig.All_Item_Mode) {
                            //Galosphere
                            pOutput.accept(GrowableGalosphereOresBlocks.Galo_Allurite_Shard_Cane.get());
                            pOutput.accept(GrowableGalosphereOresBlocks.Galo_Lumiere_Shard_Cane.get());
                            pOutput.accept(GrowableGalosphereOresBlocks.Galo_Silver_Ingot_Cane.get());

                        }

                        if (ModList.get().isLoaded("gobber2") || GrowableOresConfig.All_Item_Mode) {
                            //Gobber2
                            pOutput.accept(GrowableGobberOresBlocks.Gobber_Gobber_Ingot_Cane.get());
                            pOutput.accept(GrowableGobberOresBlocks.Gobber_End_Gobber_Ingot_Cane.get());
                            pOutput.accept(GrowableGobberOresBlocks.Gobber_Nether_Gobber_Ingot_Cane.get());

                        }

                        if (ModList.get().isLoaded("gtceu") || GrowableOresConfig.All_Item_Mode) {
                            //GregTechCEu Modern
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Aluminium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Americium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Annealed_Copper_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Antimony_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Battery_Alloy_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Beryllium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Bismuth_Bronze_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Bismuth_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Black_Bronze_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Brass_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Bronze_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Chromium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Cobalt_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Cupronickel_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Darmstadtium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Duranium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Electrum_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Enriched_Naquadah_Trinium_Europium_Duranide_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Epoxy_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Europium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Amethyst_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Apatite_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Certus_Quartz_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Coke_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Glass_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Grossular_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Lapis_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Lazurite_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Malachite_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Monazite_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Nether_Quartz_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Olivine_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Opal_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Pyrope_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Quartzite_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Realgar_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Red_Garnet_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Rock_Salt_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Ruby_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Rutile_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Salt_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Sapphire_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Sodalite_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Spessartine_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Uvarovite_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Yellow_Garnet_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Almandine_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Andradite_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Blue_Topaz_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Cinnabar_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Coal_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Diamond_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Emerald_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Green_Sapphire_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Gallium_Arsenide_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Gallium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Graphene_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Indium_Gallium_Phosphide_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Indium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Indium_Tin_Barium_Titanium_Cuprate_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Iridium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Lead_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Magnalium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Magnesium_Diboride_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Magnetic_Iron_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Magnetic_Neodymium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Magnetic_Samarium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Manganese_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Manganese_Phosphide_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Mercury_Barium_Calcium_Cuprate_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Molybdenum_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Naquadah_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Naquadria_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Neodymium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Neutronium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Nichrome_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Nickel_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Nickel_Zinc_Ferrite_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Niobium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Niobium_Nitride_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Niobium_Titanium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Osmiridium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Osmium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Palladium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Platinum_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Plutonium_241_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Plutonium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Polybenzimidazole_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Polycaprolactam_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Polyethylene_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Polyphenylene_Sulfide_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Polytetrafluoroethylene_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Polyvinyl_Chloride_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Raw_Rubber_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Reinforced_Epoxy_Resin_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Rhodium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Riched_Naquadah_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Rose_Gold_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Rubber_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Ruridit_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Ruthenium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Ruthenium_Trinium_Americium_Neutronate_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Samarium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Samarium_Iron_Arsenic_Oxide_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Silicon_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Silicone_Rubber_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Silver_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Soldering_Alloy_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Stainless_Steel_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Steel_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Sterling_Silver_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Styrene_Butadiene_Rubber_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Tantalum_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Thorium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Tin_Alloy_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Tin_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Titanium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Trinium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Tritanium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Tungsten_Carbide_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Tungsten_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Ultimet_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_235_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_Rhodium_Dinaquadide_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_Triplatinum_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Vanadium_Gallium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Vanadium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Wrought_Iron_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Yttrium_Barium_Cuprate_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Yttrium_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Zinc_Ingot_Cane.get());
                            pOutput.accept(GrowableGregTechCEuModernOresBlocks.GTM_Invar_Ingot_Cane.get());
                        }

                        if (ModList.get().isLoaded("mna") || GrowableOresConfig.All_Item_Mode) {
                            //ManaandArtifice
                            pOutput.accept(GrowableManaandArtificeOresBlocks.MA_Animus_Dust_Cane.get());
                            pOutput.accept(GrowableManaandArtificeOresBlocks.MA_Arcane_Ash_Cane.get());
                            pOutput.accept(GrowableManaandArtificeOresBlocks.MA_Bone_Ash_Cane.get());
                            pOutput.accept(GrowableManaandArtificeOresBlocks.MA_Ironbark_Cane.get());
                            pOutput.accept(GrowableManaandArtificeOresBlocks.MA_Living_Flame_Cane.get());
                            pOutput.accept(GrowableManaandArtificeOresBlocks.MA_Mote_Air_Cane.get());
                            pOutput.accept(GrowableManaandArtificeOresBlocks.MA_Mote_Arcane_Cane.get());
                            pOutput.accept(GrowableManaandArtificeOresBlocks.MA_Mote_Earth_Cane.get());
                            pOutput.accept(GrowableManaandArtificeOresBlocks.MA_Mote_Ender_Cane.get());
                            pOutput.accept(GrowableManaandArtificeOresBlocks.MA_Mote_Fire_Cane.get());
                            pOutput.accept(GrowableManaandArtificeOresBlocks.MA_Mote_Water_Cane.get());
                            pOutput.accept(GrowableManaandArtificeOresBlocks.MA_Purified_Vinteum_Dust_Cane.get());
                            pOutput.accept(GrowableManaandArtificeOresBlocks.MA_Purified_Vinteum_Ingot_Cane.get());
                            pOutput.accept(GrowableManaandArtificeOresBlocks.MA_Resonating_Dust_Cane.get());
                            pOutput.accept(GrowableManaandArtificeOresBlocks.MA_Superheated_Purified_Vinteum_Ingot_Cane.get());
                            pOutput.accept(GrowableManaandArtificeOresBlocks.MA_Superheated_Vinteum_Ingot_Cane.get());
                            pOutput.accept(GrowableManaandArtificeOresBlocks.MA_Vinteum_Dust_Cane.get());
                            pOutput.accept(GrowableManaandArtificeOresBlocks.MA_Vinteum_Ingot_Cane.get());
                        }

                        if (ModList.get().isLoaded("mysticalagradditions") || GrowableOresConfig.All_Item_Mode) {
                            //Mystical Agradditions
                            pOutput.accept(GrowableMysticalAgradditionsBlocks.MAA_Awakened_Draconium_Essence_Cane.get());
                            pOutput.accept(GrowableMysticalAgradditionsBlocks.MAA_Dragon_Egg_Essence_Cane.get());
                            pOutput.accept(GrowableMysticalAgradditionsBlocks.MAA_Insanium_Essence_Cane.get());
                            pOutput.accept(GrowableMysticalAgradditionsBlocks.MAA_Insanium_Ingot_Cane.get());
                            pOutput.accept(GrowableMysticalAgradditionsBlocks.MAA_Nether_Star_Essence_Cane.get());
                            pOutput.accept(GrowableMysticalAgradditionsBlocks.MAA_Neutronium_Essence_Cane.get());
                            pOutput.accept(GrowableMysticalAgradditionsBlocks.MAA_Nitro_Crystal_Essence_Cane.get());
                        }

                        if (ModList.get().isLoaded("mysticalagriculture") || GrowableOresConfig.All_Item_Mode) {
                            //Mystical Agriculture
                            pOutput.accept(GrowableMysticalAgricultureBlocks.MAC_Imperium_Ingot_Cane.get());
                            pOutput.accept(GrowableMysticalAgricultureBlocks.MAC_Inferium_Ingot_Cane.get());
                            pOutput.accept(GrowableMysticalAgricultureBlocks.MAC_Prosperity_Ingot_Cane.get());
                            pOutput.accept(GrowableMysticalAgricultureBlocks.MAC_Prudentium_Ingot_Cane.get());
                            pOutput.accept(GrowableMysticalAgricultureBlocks.MAC_Soulium_Ingot_Cane.get());
                            pOutput.accept(GrowableMysticalAgricultureBlocks.MAC_Supremium_Ingot_Cane.get());
                            pOutput.accept(GrowableMysticalAgricultureBlocks.MAC_Tertium_Ingot_Cane.get());
                        }

                        if (ModList.get().isLoaded("railcraft") || GrowableOresConfig.All_Item_Mode) {
                            //Railcraft
                            pOutput.accept(GrowableRailcraftOresBlocks.RC_Brass_Ingot_Cane.get());
                            pOutput.accept(GrowableRailcraftOresBlocks.RC_Bronze_Ingot_Cane.get());
                            pOutput.accept(GrowableRailcraftOresBlocks.RC_Charcoal_Dust_Cane.get());
                            pOutput.accept(GrowableRailcraftOresBlocks.RC_Coal_Dust_Cane.get());
                            pOutput.accept(GrowableRailcraftOresBlocks.RC_Ender_Dust_Cane.get());
                            pOutput.accept(GrowableRailcraftOresBlocks.RC_Invar_Ingot_Cane.get());
                            pOutput.accept(GrowableRailcraftOresBlocks.RC_Lead_Ingot_Cane.get());
                            pOutput.accept(GrowableRailcraftOresBlocks.RC_Nickel_Ingot_Cane.get());
                            pOutput.accept(GrowableRailcraftOresBlocks.RC_Obsidian_Dust_Cane.get());
                            pOutput.accept(GrowableRailcraftOresBlocks.RC_Saltpeter_Dust_Cane.get());
                            pOutput.accept(GrowableRailcraftOresBlocks.RC_Silver_Ingot_Cane.get());
                            pOutput.accept(GrowableRailcraftOresBlocks.RC_Steel_Ingot_Cane.get());
                            pOutput.accept(GrowableRailcraftOresBlocks.RC_Sulfur_Dust_Cane.get());
                            pOutput.accept(GrowableRailcraftOresBlocks.RC_Tin_Ingot_Cane.get());
                            pOutput.accept(GrowableRailcraftOresBlocks.RC_Zinc_Ingot_Cane.get());
                        }

                        if (ModList.get().isLoaded("rftoolsbase") || GrowableOresConfig.All_Item_Mode) {
                            //RFTools
                            pOutput.accept(GrowableRFToolsOresBlocks.RFT_Dimensional_Shard_Cane.get());
                        }

                        if (ModList.get().isLoaded("tconstruct") || GrowableOresConfig.All_Item_Mode) {
                            //Tinkers' Construct
                            pOutput.accept(GrowableTinkersConstructBlocks.TC_Amethyst_Bronze_Ingot_Cane.get());
                            pOutput.accept(GrowableTinkersConstructBlocks.TC_Blazing_Bone_Cane.get());
                            pOutput.accept(GrowableTinkersConstructBlocks.TC_Cheese_Ingot_Cane.get());
                            pOutput.accept(GrowableTinkersConstructBlocks.TC_Cobalt_Ingot_Cane.get());
                            pOutput.accept(GrowableTinkersConstructBlocks.TC_Earth_Slime_Crystal_Cane.get());
                            pOutput.accept(GrowableTinkersConstructBlocks.TC_Ender_Slime_Crystal_Cane.get());
                            pOutput.accept(GrowableTinkersConstructBlocks.TC_Hepatizon_Ingot_Cane.get());
                            pOutput.accept(GrowableTinkersConstructBlocks.TC_Ichor_Slime_Crystal_Cane.get());
                            pOutput.accept(GrowableTinkersConstructBlocks.TC_Knightslime_Ingot_Cane.get());
                            pOutput.accept(GrowableTinkersConstructBlocks.TC_Manyullyn_Ingot_Cane.get());
                            pOutput.accept(GrowableTinkersConstructBlocks.TC_Modifier_Crystal_Cane.get());
                            pOutput.accept(GrowableTinkersConstructBlocks.TC_Necronium_Bone_Cane.get());
                            pOutput.accept(GrowableTinkersConstructBlocks.TC_Necrotic_Bone_Cane.get());
                            pOutput.accept(GrowableTinkersConstructBlocks.TC_Queens_Slime_Ingot_Cane.get());
                            pOutput.accept(GrowableTinkersConstructBlocks.TC_Rose_Gold_Ingot_Cane.get());
                            pOutput.accept(GrowableTinkersConstructBlocks.TC_Sky_Slime_Crystal_Cane.get());
                            pOutput.accept(GrowableTinkersConstructBlocks.TC_Slimesteel_Ingot_Cane.get());
                            pOutput.accept(GrowableTinkersConstructBlocks.TC_Soulsteel_Ingot_Cane.get());

                        }

                        if (ModList.get().isLoaded("modern_industrialization") || GrowableOresConfig.All_Item_Mode) {
                            //Modern Industrialization
                            pOutput.accept(GrowableModernIndustrializationOresBlocks.MI_antimony_Cane.get());
                            pOutput.accept(GrowableModernIndustrializationOresBlocks.MI_bauxite_Cane.get());
                            pOutput.accept(GrowableModernIndustrializationOresBlocks.MI_iridium_Cane.get());
                            pOutput.accept(GrowableModernIndustrializationOresBlocks.MI_lead_Cane.get());
                            pOutput.accept(GrowableModernIndustrializationOresBlocks.MI_lignite_coal_Cane.get());
                            pOutput.accept(GrowableModernIndustrializationOresBlocks.MI_monazite_Cane.get());
                            pOutput.accept(GrowableModernIndustrializationOresBlocks.MI_nickel_Cane.get());
                            pOutput.accept(GrowableModernIndustrializationOresBlocks.MI_platinum_Cane.get());
                            pOutput.accept(GrowableModernIndustrializationOresBlocks.MI_quartz_Cane.get());
                            pOutput.accept(GrowableModernIndustrializationOresBlocks.MI_salt_Cane.get());
                            pOutput.accept(GrowableModernIndustrializationOresBlocks.MI_tin_Cane.get());
                            pOutput.accept(GrowableModernIndustrializationOresBlocks.MI_titanium_Cane.get());
                            pOutput.accept(GrowableModernIndustrializationOresBlocks.MI_tungsten_Cane.get());
                            pOutput.accept(GrowableModernIndustrializationOresBlocks.MI_uranium_Cane.get());
                        }
                        if (ModList.get().isLoaded("techreborn") || GrowableOresConfig.All_Item_Mode) {
                            pOutput.accept(GrowableTechRebornOresBlocks.cinnabar_Cane.get());
                            pOutput.accept(GrowableTechRebornOresBlocks.galena_Cane.get());
                            pOutput.accept(GrowableTechRebornOresBlocks.iridium_Cane.get());
                            pOutput.accept(GrowableTechRebornOresBlocks.lead_Cane.get());
                            pOutput.accept(GrowableTechRebornOresBlocks.peridot_Cane.get());
                            pOutput.accept(GrowableTechRebornOresBlocks.pyrite_Cane.get());
                            pOutput.accept(GrowableTechRebornOresBlocks.ruby_Cane.get());
                            pOutput.accept(GrowableTechRebornOresBlocks.sapphire_Cane.get());
                            pOutput.accept(GrowableTechRebornOresBlocks.sheldonite_Cane.get());
                            pOutput.accept(GrowableTechRebornOresBlocks.silver_Cane.get());;
                            pOutput.accept(GrowableTechRebornOresBlocks.sphalerite_Cane.get());
                            pOutput.accept(GrowableTechRebornOresBlocks.tin_Cane.get());
                            pOutput.accept(GrowableTechRebornOresBlocks.tungsten_Cane.get());
                            pOutput.accept(GrowableTechRebornOresBlocks.sodalite_Cane.get());
                            pOutput.accept(GrowableTechRebornOresBlocks.bauxite_Cane.get());
                        }
                        if (ModList.get().isLoaded("maple") || GrowableOresConfig.All_Item_Mode) {
                            pOutput.accept(GrowableMapleOresBlocks.Salt_Cane.get());
                        }
                        if (ModList.get().isLoaded("indrev") || GrowableOresConfig.All_Item_Mode) {
                            pOutput.accept(GrowableIndustrialRevolutionOresBlocks.IR_Lead_Cane.get());
                            pOutput.accept(GrowableIndustrialRevolutionOresBlocks.IR_nikolite_Cane.get());
                            pOutput.accept(GrowableIndustrialRevolutionOresBlocks.IR_silver_Cane.get());
                            pOutput.accept(GrowableIndustrialRevolutionOresBlocks.IR_tin_ore_Cane.get());
                            pOutput.accept(GrowableIndustrialRevolutionOresBlocks.IR_tungsten_Cane.get());

                        }
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
