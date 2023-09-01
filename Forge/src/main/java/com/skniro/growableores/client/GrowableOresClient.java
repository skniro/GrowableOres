package com.skniro.growableores.client;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.GrowableOresBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = GrowableOres.MODID,bus = Mod.EventBusSubscriber.Bus.MOD ,value = Dist.CLIENT)
public class GrowableOresClient {
    @SubscribeEvent
    public static void onInitializeClient(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Coal_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Iron_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Diamond_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Copper_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Emerald_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Gold_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Lapis_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Nether_Quartz_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Redstone_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Blaze_Rod_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Ender_Pearl_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Clay_Cane.get(), RenderType.cutout());

        //ae2
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.certus_quartz_crystal_Cane.get(), RenderType.cutout());
        //Create
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.C_Andesite_Alloy_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.C_Brass_Ingot_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.C_Polished_Rose_Quartz_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.C_Zinc_Cane.get(), RenderType.cutout());

        //Thermal Series
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Apatite_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Cinnabar_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Copper_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Lead_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Nickel_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Niter_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Ruby_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Sapphire_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Silver_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Sulfur_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Tin_Cane.get(), RenderType.cutout());
        //BetterEnd
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.amber_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.ender_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.thallasium_Cane.get(), RenderType.cutout());


        //Powah Rearchitected and Powah
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Steel_Energized_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Uraninite_Ore_Dense_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Ender_Core_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Crystal_Spirited_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Crystal_Nitro_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Crystal_Niotic_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Crystal_Blazing_Cane.get(), RenderType.cutout());
    }
}
