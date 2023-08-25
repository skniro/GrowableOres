package com.skniro.growableores.datagen;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.GrowableOresBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.client.render.RenderLayer;

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

        //Powah Rearchitected and Powah
        translationBuilder.add(GrowableOresBlocks.Steel_Energized_Cane,"Steel Energized Reed");
        translationBuilder.add(GrowableOresBlocks.Uraninite_Ore_Dense_Cane,"Uraninite Ore Dense Reed");
        translationBuilder.add(GrowableOresBlocks.Ender_Core_Cane,"Ender Core Reed");
        translationBuilder.add(GrowableOresBlocks.Crystal_Spirited_Cane,"Crystal Spirited Reed");
        translationBuilder.add(GrowableOresBlocks.Crystal_Nitro_Cane,"Crystal Nitro Reed");
        translationBuilder.add(GrowableOresBlocks.Crystal_Niotic_Cane,"Crystal Niotic Reed");
        translationBuilder.add(GrowableOresBlocks.Crystal_Blazing_Cane,"Crystal Blazing Reed");

        //Industrial Revolution
        translationBuilder.add(GrowableOresBlocks.IR_Lead_Cane,"Lead Reed(IR)");
        translationBuilder.add(GrowableOresBlocks.IR_nikolite_Cane ,"Nikolite Reed(IR)");
        translationBuilder.add(GrowableOresBlocks.IR_silver_Cane,"Silver Reed(IR)");
        translationBuilder.add(GrowableOresBlocks.IR_tin_ore_Cane,"Tin Reed(IR)");
        translationBuilder.add(GrowableOresBlocks.IR_tungsten_Cane,"Tungsten Reed(IR)");

        //Modern Industrialization
        translationBuilder.add(GrowableOresBlocks.MI_antimony_Cane , "Antimony Reed(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_bauxite_Cane, "Bauxite Reed(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_iridium_Cane, "Iridium Reed(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_lead_Cane, "Lead Reed(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_lignite_coal_Cane, "Lignite Coal Reed(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_monazite_Cane, "Monazite Reed(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_nickel_Cane, "Nickel Reed(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_platinum_Cane, "Platinum Reed(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_quartz_Cane, "Quartz Reed(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_salt_Cane, "Salt Reed(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_tin_Cane, "Tin Reed(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_titanium_Cane, "Titanium Reed(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_tungsten_Cane,"Tungsten Reed(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_uranium_Cane, "Uranium Reed(MI)");

    }
}
