package com.skniro.growableores.datagen;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.GrowableOresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class GrowableEnglishLanguageProvider extends FabricLanguageProvider {
    public GrowableEnglishLanguageProvider(FabricDataOutput dataGenerator){
        super(dataGenerator,"en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(GrowableOresBlocks.Coal_Cane,"Coal Reed");
        translationBuilder.add(GrowableOresBlocks.Iron_Cane,"Iron Reed");
        translationBuilder.add(GrowableOresBlocks.Diamond_Cane,"Diamond Reed");
        translationBuilder.add(GrowableOresBlocks.Copper_Cane,"Copper Reed");
        translationBuilder.add(GrowableOresBlocks.Emerald_Cane,"Emerald Reed");
        translationBuilder.add(GrowableOresBlocks.Gold_Cane,"Gold Reed");
        translationBuilder.add(GrowableOresBlocks.Lapis_Cane,"Lapis Reed");
        translationBuilder.add(GrowableOresBlocks.Nether_Quartz_Cane,"Nether Quartz Reed");
        translationBuilder.add(GrowableOresBlocks.Redstone_Cane,"Redstone Reed");
        translationBuilder.add(GrowableOresBlocks.Blaze_Rod_Cane,"Blaze Rod Reed");
        translationBuilder.add(GrowableOresBlocks.Ender_Pearl_Cane,"Ender Pearl Reed");
        translationBuilder.add(GrowableOresBlocks.Netherite_Ingot_Cane,"Netherite Ingot Reed");


        //ae2
        translationBuilder.add(GrowableOresBlocks.certus_quartz_crystal_Cane,"Certus Quartz Crystal Reed");

        //Tech Reborn
        translationBuilder.add(GrowableOresBlocks.cinnabar_Cane,"Cinnabar Reed");
        translationBuilder.add(GrowableOresBlocks.galena_Cane,"Galena Reed");
        translationBuilder.add(GrowableOresBlocks.iridium_Cane,"Iridium Reed");
        translationBuilder.add(GrowableOresBlocks.lead_Cane,"Lead Reed");
        translationBuilder.add(GrowableOresBlocks.peridot_Cane,"Peridot Reed");
        translationBuilder.add(GrowableOresBlocks.pyrite_Cane,"Sulfur Reed");
        translationBuilder.add(GrowableOresBlocks.ruby_Cane,"Ruby Reed");
        translationBuilder.add(GrowableOresBlocks.sapphire_Cane,"Sapphire Reed");
        translationBuilder.add(GrowableOresBlocks.sheldonite_Cane,"Platinum Reed");
        translationBuilder.add(GrowableOresBlocks.silver_Cane,"Silver Reed");
        translationBuilder.add(GrowableOresBlocks.sphalerite_Cane,"Sphalerite Reed");
        translationBuilder.add(GrowableOresBlocks.tin_Cane,"Tin Reed");
        translationBuilder.add(GrowableOresBlocks.tungsten_Cane,"Tungsten Reed");
        translationBuilder.add(GrowableOresBlocks.sodalite_Cane,"Sodalite Reed");;
        translationBuilder.add(GrowableOresBlocks.bauxite_Cane,"Bauxite Reed");

        translationBuilder.add(GrowableOres.Growable_Ores_Group,"Growable Ores");

        //BetterEnd
        translationBuilder.add(GrowableOresBlocks.amber_Cane,"Amber Reed");
        translationBuilder.add(GrowableOresBlocks.ender_Cane,"Ender Reed");
        translationBuilder.add(GrowableOresBlocks.thallasium_Cane,"Thallasium Reed");

        //Maple
        translationBuilder.add(GrowableOresBlocks.Salt_Cane,"Salt Reed");
    }
}
