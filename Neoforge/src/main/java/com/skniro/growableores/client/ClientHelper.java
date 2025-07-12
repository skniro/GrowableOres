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

@EventBusSubscriber(modid = GrowableOres.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientHelper {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            BuiltInRegistries.BLOCK.forEach(block -> {
                ResourceLocation blockId = BuiltInRegistries.BLOCK.getKey(block);
                if (blockId != null && blockId.getNamespace().equals(GrowableOres.MODID)) {
                    ItemBlockRenderTypes.setRenderLayer(block, RenderType.CUTOUT);
                }
            });
        });
    }
}
