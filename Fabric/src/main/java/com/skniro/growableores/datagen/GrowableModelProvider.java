package com.skniro.growableores.datagen;

import com.skniro.growableores.GrowableOres;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class GrowableModelProvider extends FabricModelProvider {
    public GrowableModelProvider(FabricPackOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        BuiltInRegistries.BLOCK.forEach(block -> {
            Identifier blockId = BuiltInRegistries.BLOCK.getKey(block);
            if (blockId.getNamespace().equals(GrowableOres.MOD_ID)) {
                blockStateModelGenerator.createCrossBlockWithDefaultItem(block, BlockModelGenerators.PlantType.TINTED);
            }
        });

    }
    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

    }
}
