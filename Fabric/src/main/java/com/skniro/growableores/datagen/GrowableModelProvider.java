package com.skniro.growableores.datagen;

import com.skniro.growableores.GrowableOres;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class GrowableModelProvider extends FabricModelProvider {
    public GrowableModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        Registries.BLOCK.forEach(block -> {
            Identifier blockId = Registries.BLOCK.getId(block);
            if (blockId.getNamespace().equals(GrowableOres.MOD_ID)) {
                blockStateModelGenerator.registerTintableCross(block, BlockStateModelGenerator.CrossType.TINTED);
            }
        });
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
