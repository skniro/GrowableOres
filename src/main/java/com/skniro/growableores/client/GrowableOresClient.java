package com.skniro.growableores.client;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.GrowableOresBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.SugarCaneBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.sound.BlockSoundGroup;

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

        //Powah Rearchitected and Powah
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Steel_Energized_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Uraninite_Ore_Dense_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Ender_Core_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Crystal_Spirited_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Crystal_Nitro_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Crystal_Niotic_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.Crystal_Blazing_Cane, RenderLayer.getCutout());

        //Industrial Revolution
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.IR_Lead_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.IR_nikolite_Cane , RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.IR_silver_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.IR_tin_ore_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.IR_tungsten_Cane, RenderLayer.getCutout());

        //Modern Industrialization
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.MI_antimony_Cane , RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.MI_bauxite_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.MI_iridium_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.MI_lead_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.MI_lignite_coal_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.MI_monazite_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.MI_nickel_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.MI_platinum_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.MI_quartz_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.MI_salt_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.MI_tin_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.MI_titanium_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.MI_tungsten_Cane, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.MI_uranium_Cane, RenderLayer.getCutout());

    }
}
