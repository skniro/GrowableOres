package com.skniro.growableores.datagen;


import com.skniro.growableores.GrowableOres;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;


public class GrowableLootTableGenerator extends FabricBlockLootTableProvider {
    protected GrowableLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        Registries.BLOCK.forEach(block -> {
            Identifier blockId = Registries.BLOCK.getId(block);
            if (blockId.getNamespace().equals(GrowableOres.MOD_ID)) {
                addDrop(block);
            }
        });
    }
}
