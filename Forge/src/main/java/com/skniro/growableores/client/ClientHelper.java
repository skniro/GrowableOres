package com.skniro.growableores.client;


import com.skniro.growableores.GrowableOres;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.resources.Identifier;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = GrowableOres.MOD_ID, value = Dist.CLIENT)
public class ClientHelper {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ForgeRegistries.BLOCKS.forEach(block -> {
                Identifier blockId = ForgeRegistries.BLOCKS.getKey(block);
                if (blockId != null && blockId.getNamespace().equals(GrowableOres.MOD_ID)) {
                    ModItemBlockRenderTypes.setRenderLayer(block, ChunkSectionLayer.CUTOUT);
                }
            });
        });
    }

    @SubscribeEvent
    public static void onParticleFactoryRegistration(RegisterParticleProvidersEvent event) {
    }
}
