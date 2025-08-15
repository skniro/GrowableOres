package com.skniro.growableores.item;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.*;
import com.skniro.growableores.conifg.GrowableOresConfig;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GrowableOres.MODID);

    public static final RegistryObject<CreativeModeTab> Growable_Ores_Group = CREATIVE_MODE_TABS.register("test_group",
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
                        pOutput.accept(GrowableVanillaOresBlocks.Pale_Oak_Log_Cane.get());
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
                    })
                    .build());





    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
