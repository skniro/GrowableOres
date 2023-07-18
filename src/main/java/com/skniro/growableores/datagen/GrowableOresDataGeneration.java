package com.skniro.growableores.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class GrowableOresDataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(GrowableLootTableGenerator::new);
        fabricDataGenerator.addProvider(GrowableEnglishLanguageProvider::new);
        fabricDataGenerator.addProvider(GrowableSimplifiedChineseLanguageProvider::new);
    }
}
