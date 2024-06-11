package com.skniro.growableores.client;

import com.skniro.growableores.block.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class GrowableOresClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableVanillaOresBlocks.Coal_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableVanillaOresBlocks.Iron_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableVanillaOresBlocks.Diamond_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableVanillaOresBlocks.Copper_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableVanillaOresBlocks.Emerald_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableVanillaOresBlocks.Gold_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableVanillaOresBlocks.Lapis_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableVanillaOresBlocks.Nether_Quartz_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableVanillaOresBlocks.Redstone_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableVanillaOresBlocks.Blaze_Rod_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableVanillaOresBlocks.Ender_Pearl_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableVanillaOresBlocks.Netherite_Ingot_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableVanillaOresBlocks.Clay_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableVanillaOresBlocks.Slime_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableVanillaOresBlocks.Nether_Star_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableVanillaOresBlocks.Glowstone_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableVanillaOresBlocks.Bone_Cane, RenderLayer.getCutout());

        //ae2
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableAEOresBlocks.certus_quartz_crystal_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableAEOresBlocks.fluix_crystal_Cane, RenderLayer.getCutout());

        //Tech Reborn
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableTechRebornOresBlocks.cinnabar_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableTechRebornOresBlocks.galena_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableTechRebornOresBlocks.iridium_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableTechRebornOresBlocks.lead_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableTechRebornOresBlocks.peridot_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableTechRebornOresBlocks.pyrite_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableTechRebornOresBlocks.ruby_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableTechRebornOresBlocks.sapphire_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableTechRebornOresBlocks.sheldonite_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableTechRebornOresBlocks.silver_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableTechRebornOresBlocks.sphalerite_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableTechRebornOresBlocks.tin_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableTechRebornOresBlocks.tungsten_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableTechRebornOresBlocks.sodalite_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableTechRebornOresBlocks.bauxite_Cane, RenderLayer.getCutout());


        //BetterEnd
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableBetterEndOresBlocks.amber_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableBetterEndOresBlocks.ender_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableBetterEndOresBlocks.thallasium_Cane, RenderLayer.getCutout());


        //Maple
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableMapleOresBlocks.Salt_Cane, RenderLayer.getCutout());

        //Powah Rearchitected and Powah
        BlockRenderLayerMap.INSTANCE.putBlock(GrowablePowahOresBlocks.Steel_Energized_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowablePowahOresBlocks.Uraninite_Ore_Dense_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowablePowahOresBlocks.Ender_Core_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowablePowahOresBlocks.Crystal_Spirited_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowablePowahOresBlocks.Crystal_Nitro_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowablePowahOresBlocks.Crystal_Niotic_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowablePowahOresBlocks.Crystal_Blazing_Cane, RenderLayer.getCutout());

        //Industrial Revolution
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableIndustrialRevolutionOresBlocks.IR_Lead_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableIndustrialRevolutionOresBlocks.IR_nikolite_Cane , RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableIndustrialRevolutionOresBlocks.IR_silver_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableIndustrialRevolutionOresBlocks.IR_tin_ore_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableIndustrialRevolutionOresBlocks.IR_tungsten_Cane, RenderLayer.getCutout());

        //Modern Industrialization
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableModernIndustrializationOresBlocks.MI_antimony_Cane , RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableModernIndustrializationOresBlocks.MI_bauxite_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableModernIndustrializationOresBlocks.MI_iridium_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableModernIndustrializationOresBlocks.MI_lead_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableModernIndustrializationOresBlocks.MI_lignite_coal_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableModernIndustrializationOresBlocks.MI_monazite_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableModernIndustrializationOresBlocks.MI_nickel_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableModernIndustrializationOresBlocks.MI_platinum_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableModernIndustrializationOresBlocks.MI_quartz_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableModernIndustrializationOresBlocks.MI_salt_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableModernIndustrializationOresBlocks.MI_tin_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableModernIndustrializationOresBlocks.MI_titanium_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableModernIndustrializationOresBlocks.MI_tungsten_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableModernIndustrializationOresBlocks.MI_uranium_Cane, RenderLayer.getCutout());

        //ic2 and ic2c
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableICOresBlocks.IC2_Aluminium_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableICOresBlocks.IC2_silver_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableICOresBlocks.IC2_Tin_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableICOresBlocks.IC2_Uranium_Cane, RenderLayer.getCutout());

        //Ad Astra!
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableAdAstraOresBlocks.AD_Ostrum_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableAdAstraOresBlocks.AD_Ice_Shard_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableAdAstraOresBlocks.AD_Cheese_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableAdAstraOresBlocks.AD_Desh_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableAdAstraOresBlocks.AD_Calorite_Cane, RenderLayer.getCutout());

        //Create
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableCreateOresBlocks.C_Andesite_Alloy_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableCreateOresBlocks.C_Brass_Ingot_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableCreateOresBlocks.C_Polished_Rose_Quartz_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableCreateOresBlocks.C_Zinc_Cane, RenderLayer.getCutout());

        //Thermal Series
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableThermalSeriesOresBlocks.TF_Apatite_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableThermalSeriesOresBlocks.TF_Cinnabar_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableThermalSeriesOresBlocks.TF_Copper_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableThermalSeriesOresBlocks.TF_Lead_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableThermalSeriesOresBlocks.TF_Nickel_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableThermalSeriesOresBlocks.TF_Niter_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableThermalSeriesOresBlocks.TF_Ruby_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableThermalSeriesOresBlocks.TF_Sapphire_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableThermalSeriesOresBlocks.TF_Silver_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableThermalSeriesOresBlocks.TF_Sulfur_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableThermalSeriesOresBlocks.TF_Tin_Cane, RenderLayer.getCutout());

    }
}
