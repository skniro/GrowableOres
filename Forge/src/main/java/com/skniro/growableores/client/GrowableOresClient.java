package com.skniro.growableores.client;

import com.skniro.growableores.GrowableOres;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = GrowableOres.MODID,bus = Mod.EventBusSubscriber.Bus.MOD ,value = Dist.CLIENT)
public class GrowableOresClient {
    @SubscribeEvent
    public static void onInitializeClient(FMLClientSetupEvent event) {

    }
}
