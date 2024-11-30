package com.skniro.growableores.client;


import com.skniro.growableores.GrowableOres;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;

@EventBusSubscriber(modid = GrowableOres.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientHelper {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            BuiltInRegistries.BLOCK.forEach(block -> {
                ResourceLocation blockId = BuiltInRegistries.BLOCK.getKey(block);
                if (blockId != null && blockId.getNamespace().equals(GrowableOres.MOD_ID)) {
                    ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
                }
            });
        });
    }

    @SubscribeEvent
    public static void onParticleFactoryRegistration(RegisterParticleProvidersEvent event) {
    }
}
