package com.skniro.growableores.client;

import com.skniro.growableores.block.GrowableOresBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class GrowableOresClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Coal_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Iron_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Diamond_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Copper_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Emerald_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Gold_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Lapis_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Nether_Quartz_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Redstone_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Blaze_Rod_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Ender_Pearl_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Netherite_Ingot_Cane, RenderLayer.getCutout());


        //ae2
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.certus_quartz_crystal_Cane, RenderLayer.getCutout());

        //Tech Reborn
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.cinnabar_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.galena_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.iridium_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.lead_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.peridot_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.pyrite_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.ruby_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.sapphire_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.sheldonite_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.silver_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.sphalerite_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.tin_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.tungsten_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.sodalite_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.bauxite_Cane, RenderLayer.getCutout());

        //BetterEnd
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.amber_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.ender_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.thallasium_Cane, RenderLayer.getCutout());

        //Maple
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Salt_Cane, RenderLayer.getCutout());
    }
}
