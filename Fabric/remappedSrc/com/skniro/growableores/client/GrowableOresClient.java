package com.skniro.growableores.client;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

@Environment(EnvType.CLIENT)
public class GrowableOresClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BuiltInRegistries.BLOCK.forEach(block -> {
            Identifier blockId = BuiltInRegistries.BLOCK.getKey(block);
            if (blockId.getNamespace().equals(GrowableOres.MOD_ID)) {
                BlockRenderLayerMap.putBlock(block, ChunkSectionLayer.CUTOUT);
            }
        });
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Coal_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Iron_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Diamond_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Copper_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Emerald_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Gold_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Lapis_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Nether_Quartz_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Redstone_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Blaze_Rod_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Ender_Pearl_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Netherite_Ingot_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Clay_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Slime_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Nether_Star_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Glowstone_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Bone_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Egg_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Wool_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Feather_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableVanillaOresBlocks.Gunpowder_Cane, ChunkSectionLayer.CUTOUT);

        //ae2
        BlockRenderLayerMap.putBlock(GrowableAEOresBlocks.certus_quartz_crystal_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableAEOresBlocks.fluix_crystal_Cane, ChunkSectionLayer.CUTOUT);

        //Tech Reborn
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.cinnabar_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.galena_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.iridium_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.lead_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.peridot_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.pyrite_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.ruby_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.sapphire_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.sheldonite_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.silver_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.sphalerite_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.tin_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.tungsten_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.sodalite_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableTechRebornOresBlocks.bauxite_Cane, ChunkSectionLayer.CUTOUT);


        //BetterEnd
        BlockRenderLayerMap.putBlock(GrowableBetterEndOresBlocks.amber_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableBetterEndOresBlocks.ender_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableBetterEndOresBlocks.thallasium_Cane, ChunkSectionLayer.CUTOUT);


        //Maple
        BlockRenderLayerMap.putBlock(GrowableMapleOresBlocks.Salt_Cane, ChunkSectionLayer.CUTOUT);

        //Powah Rearchitected and Powah
        BlockRenderLayerMap.putBlock(GrowablePowahOresBlocks.Steel_Energized_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowablePowahOresBlocks.Uraninite_Ore_Dense_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowablePowahOresBlocks.Ender_Core_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowablePowahOresBlocks.Crystal_Spirited_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowablePowahOresBlocks.Crystal_Nitro_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowablePowahOresBlocks.Crystal_Niotic_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowablePowahOresBlocks.Crystal_Blazing_Cane, ChunkSectionLayer.CUTOUT);

        //Industrial Revolution
        BlockRenderLayerMap.putBlock(GrowableIndustrialRevolutionOresBlocks.IR_Lead_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableIndustrialRevolutionOresBlocks.IR_nikolite_Cane , ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableIndustrialRevolutionOresBlocks.IR_silver_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableIndustrialRevolutionOresBlocks.IR_tin_ore_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableIndustrialRevolutionOresBlocks.IR_tungsten_Cane, ChunkSectionLayer.CUTOUT);

        //Modern Industrialization
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_antimony_Cane , ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_bauxite_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_iridium_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_lead_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_lignite_coal_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_monazite_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_nickel_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_platinum_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_quartz_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_salt_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_tin_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_titanium_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_tungsten_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableModernIndustrializationOresBlocks.MI_uranium_Cane, ChunkSectionLayer.CUTOUT);

        //ic2 and ic2c
        BlockRenderLayerMap.putBlock(GrowableICOresBlocks.IC2_Aluminium_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableICOresBlocks.IC2_silver_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableICOresBlocks.IC2_Tin_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableICOresBlocks.IC2_Uranium_Cane, ChunkSectionLayer.CUTOUT);

        //Ad Astra!
        BlockRenderLayerMap.putBlock(GrowableAdAstraOresBlocks.AD_Ostrum_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableAdAstraOresBlocks.AD_Ice_Shard_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableAdAstraOresBlocks.AD_Cheese_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableAdAstraOresBlocks.AD_Desh_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableAdAstraOresBlocks.AD_Calorite_Cane, ChunkSectionLayer.CUTOUT);

        //Create
        BlockRenderLayerMap.putBlock(GrowableCreateOresBlocks.C_Andesite_Alloy_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableCreateOresBlocks.C_Brass_Ingot_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableCreateOresBlocks.C_Polished_Rose_Quartz_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableCreateOresBlocks.C_Zinc_Cane, ChunkSectionLayer.CUTOUT);

        //Thermal Series
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Apatite_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Cinnabar_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Copper_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Lead_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Nickel_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Niter_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Ruby_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Sapphire_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Silver_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Sulfur_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableThermalSeriesOresBlocks.TF_Tin_Cane, ChunkSectionLayer.CUTOUT);

        //Mekanism
        BlockRenderLayerMap.putBlock(GrowableMekanismOresBlocks.MEK_Fluorite_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableMekanismOresBlocks.MEK_Lead_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableMekanismOresBlocks.MEK_Osmium_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableMekanismOresBlocks.MEK_Tin_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableMekanismOresBlocks.MEK_Uranium_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableMekanismOresBlocks.MEK_Steel_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableMekanismOresBlocks.MEK_Refined_Obsidian_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableMekanismOresBlocks.MEK_Refined_Glowstone_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableMekanismOresBlocks.MEK_Bronze_Cane, ChunkSectionLayer.CUTOUT);

        //BetterNether
        BlockRenderLayerMap.putBlock(GrowableBetterNetherOresBlocks.BN_Cincinnasite_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableBetterNetherOresBlocks.BN_Nether_Ruby_Cane, ChunkSectionLayer.CUTOUT);

        //EnergizedPower
        BlockRenderLayerMap.putBlock(GrowableEnergizedPowerOresBlocks.EP_Advanced_Alloy_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableEnergizedPowerOresBlocks.EP_Energized_Copper_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableEnergizedPowerOresBlocks.EP_Energized_Gold_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableEnergizedPowerOresBlocks.EP_Redstone_Alloy_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableEnergizedPowerOresBlocks.EP_Steel_Cane, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(GrowableEnergizedPowerOresBlocks.EP_Tin_Cane, ChunkSectionLayer.CUTOUT);


    }
}
