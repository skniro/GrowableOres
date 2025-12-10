package com.skniro.growableores.client;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class GrowableOresClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Registries.BLOCK.forEach(block -> {
            Identifier blockId = Registries.BLOCK.getId(block);
            if (blockId.getNamespace().equals(GrowableOres.MOD_ID)) {
                BlockRenderLayerMap.putBlock(block, BlockRenderLayer.CUTOUT);
            }
        });
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Coal_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Iron_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Diamond_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Copper_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Emerald_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Gold_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Lapis_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Nether_Quartz_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Redstone_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Blaze_Rod_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Ender_Pearl_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Netherite_Ingot_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Clay_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Slime_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Nether_Star_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Glowstone_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Bone_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Egg_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Wool_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Feather_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Gunpowder_Cane, BlockRenderLayer.CUTOUT);

        //ae2
        BlockRenderLayerMap.putBlock(GrowableAEOresBlocks.certus_quartz_crystal_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableAEOresBlocks.fluix_crystal_Cane, BlockRenderLayer.CUTOUT);

        //Tech Reborn
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.cinnabar_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.galena_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.iridium_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.lead_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.peridot_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.pyrite_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.ruby_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.sapphire_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.sheldonite_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.silver_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.sphalerite_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.tin_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.tungsten_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.sodalite_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.bauxite_Cane, BlockRenderLayer.CUTOUT);


        //BetterEnd
        BlockRenderLayerMap.putBlock(GrowableBetterEndOresBlocks.amber_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableBetterEndOresBlocks.ender_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableBetterEndOresBlocks.thallasium_Cane, BlockRenderLayer.CUTOUT);


        //Maple
        BlockRenderLayerMap.putBlock(GrowableMapleOresBlocks.Salt_Cane, BlockRenderLayer.CUTOUT);

        //Powah Rearchitected and Powah
        BlockRenderLayerMap.putBlock(GrowablePowahOresBlocks.Steel_Energized_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowablePowahOresBlocks.Uraninite_Ore_Dense_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowablePowahOresBlocks.Ender_Core_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowablePowahOresBlocks.Crystal_Spirited_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowablePowahOresBlocks.Crystal_Nitro_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowablePowahOresBlocks.Crystal_Niotic_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowablePowahOresBlocks.Crystal_Blazing_Cane, BlockRenderLayer.CUTOUT);

        //Industrial Revolution
        BlockRenderLayerMap.putBlock(GrowableIndustrialRevolutionOresBlocks.IR_Lead_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableIndustrialRevolutionOresBlocks.IR_nikolite_Cane , BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableIndustrialRevolutionOresBlocks.IR_silver_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableIndustrialRevolutionOresBlocks.IR_tin_ore_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableIndustrialRevolutionOresBlocks.IR_tungsten_Cane, BlockRenderLayer.CUTOUT);

        //Modern Industrialization
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_antimony_Cane , BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_bauxite_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_iridium_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_lead_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_lignite_coal_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_monazite_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_nickel_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_platinum_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_quartz_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_salt_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_tin_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_titanium_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_tungsten_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_uranium_Cane, BlockRenderLayer.CUTOUT);

        //ic2 and ic2c
        BlockRenderLayerMap.putBlock(GrowableICOresBlocks.IC2_Aluminium_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableICOresBlocks.IC2_silver_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableICOresBlocks.IC2_Tin_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableICOresBlocks.IC2_Uranium_Cane, BlockRenderLayer.CUTOUT);

        //Ad Astra!
        BlockRenderLayerMap.putBlock(GrowableAdAstraOresBlocks.AD_Ostrum_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableAdAstraOresBlocks.AD_Ice_Shard_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableAdAstraOresBlocks.AD_Cheese_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableAdAstraOresBlocks.AD_Desh_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableAdAstraOresBlocks.AD_Calorite_Cane, BlockRenderLayer.CUTOUT);

        //Create
        BlockRenderLayerMap.putBlock(GrowableCreateOresBlocks.C_Andesite_Alloy_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableCreateOresBlocks.C_Brass_Ingot_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableCreateOresBlocks.C_Polished_Rose_Quartz_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableCreateOresBlocks.C_Zinc_Cane, BlockRenderLayer.CUTOUT);

        //Thermal Series
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Apatite_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Cinnabar_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Copper_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Lead_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Nickel_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Niter_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Ruby_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Sapphire_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Silver_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Sulfur_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Tin_Cane, BlockRenderLayer.CUTOUT);

        //Mekanism
        BlockRenderLayerMap.putBlock(GrowableMekanismOresBlocks.MEK_Fluorite_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableMekanismOresBlocks.MEK_Lead_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableMekanismOresBlocks.MEK_Osmium_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableMekanismOresBlocks.MEK_Tin_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableMekanismOresBlocks.MEK_Uranium_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableMekanismOresBlocks.MEK_Steel_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableMekanismOresBlocks.MEK_Refined_Obsidian_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableMekanismOresBlocks.MEK_Refined_Glowstone_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableMekanismOresBlocks.MEK_Bronze_Cane, BlockRenderLayer.CUTOUT);

        //BetterNether
        BlockRenderLayerMap.putBlock(GrowableBetterNetherOresBlocks.BN_Cincinnasite_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableBetterNetherOresBlocks.BN_Nether_Ruby_Cane, BlockRenderLayer.CUTOUT);

        //EnergizedPower
        BlockRenderLayerMap.putBlock(GrowableEnergizedPowerOresBlocks.EP_Advanced_Alloy_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableEnergizedPowerOresBlocks.EP_Energized_Copper_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableEnergizedPowerOresBlocks.EP_Energized_Gold_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableEnergizedPowerOresBlocks.EP_Redstone_Alloy_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableEnergizedPowerOresBlocks.EP_Steel_Cane, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableEnergizedPowerOresBlocks.EP_Tin_Cane, BlockRenderLayer.CUTOUT);


    }
}
