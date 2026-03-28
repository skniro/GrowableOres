package com.skniro.growableores.client;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
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
                ModItemBlockRenderTypes.setRenderLayer(block, ChunkSectionLayer.CUTOUT);
            }
        });
    }
}
