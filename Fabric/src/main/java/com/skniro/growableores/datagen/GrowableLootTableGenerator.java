package com.skniro.growableores.datagen;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.skniro.growableores.GrowableOres;
import com.skniro.sknirolib.api.resource.conditions.LoadConditions;
import com.skniro.sknirolib.impl.resource.conditions.DefaultResourceConditionTypes;
import com.skniro.sknirolib.impl.resource.conditions.ResourceConditionsImpl;
import com.skniro.sknirolib.impl.resource.conditions.conditions.ItemExistResourceCondition;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;


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
