package com.skniro.growableores.datagen;


import com.skniro.growableores.GrowableOres;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

import java.util.concurrent.CompletableFuture;


public class GrowableLootTableGenerator extends FabricBlockLootSubProvider {
    protected GrowableLootTableGenerator(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        BuiltInRegistries.BLOCK.forEach(block -> {
            Identifier blockId = BuiltInRegistries.BLOCK.getKey(block);
            if (blockId.getNamespace().equals(GrowableOres.MOD_ID)) {
                dropSelf(block);
            }
        });
    }
}
