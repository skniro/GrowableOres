package com.skniro.growableores.client;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.GrowableOresBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = GrowableOres.MODID,bus = Mod.EventBusSubscriber.Bus.MOD ,value = Dist.CLIENT)
public class GrowableOresClient {
    @SubscribeEvent
    public static void onInitializeClient(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Coal_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Iron_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Diamond_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Copper_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Emerald_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Gold_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Lapis_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Nether_Quartz_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Redstone_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Blaze_Rod_Cane.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.Ender_Pearl_Cane.get(), RenderType.cutout());

        //ae2
        RenderTypeLookup.setRenderLayer(GrowableOresBlocks.certus_quartz_crystal_Cane.get(), RenderType.cutout());

    }
}
