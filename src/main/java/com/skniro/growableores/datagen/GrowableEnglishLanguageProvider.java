package com.skniro.growableores.datagen;

import com.skniro.growableores.block.*;
import com.skniro.growableores.util.GrowableOresItemGroups;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class GrowableEnglishLanguageProvider extends FabricLanguageProvider {
    public GrowableEnglishLanguageProvider(FabricDataOutput dataGenerator){
        super(dataGenerator,"en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(GrowableVanillaOresBlocks.Coal_Cane,"Coal Reed");
        translationBuilder.add(GrowableVanillaOresBlocks.Iron_Cane,"Iron Reed");
        translationBuilder.add(GrowableVanillaOresBlocks.Diamond_Cane,"Diamond Reed");
        translationBuilder.add(GrowableVanillaOresBlocks.Copper_Cane,"Copper Reed");
        translationBuilder.add(GrowableVanillaOresBlocks.Emerald_Cane,"Emerald Reed");
        translationBuilder.add(GrowableVanillaOresBlocks.Gold_Cane,"Gold Reed");
        translationBuilder.add(GrowableVanillaOresBlocks.Lapis_Cane,"Lapis Reed");
        translationBuilder.add(GrowableVanillaOresBlocks.Nether_Quartz_Cane,"Nether Quartz Reed");
        translationBuilder.add(GrowableVanillaOresBlocks.Redstone_Cane,"Redstone Reed");
        translationBuilder.add(GrowableVanillaOresBlocks.Blaze_Rod_Cane,"Blaze Rod Reed");
        translationBuilder.add(GrowableVanillaOresBlocks.Ender_Pearl_Cane,"Ender Pearl Reed");
        translationBuilder.add(GrowableVanillaOresBlocks.Netherite_Ingot_Cane,"Netherite Ingot Reed");
        translationBuilder.add(GrowableVanillaOresBlocks.Clay_Cane,"Clay Reed");
        translationBuilder.add(GrowableVanillaOresBlocks.Glowstone_Cane,"Glowstone Reed");
        translationBuilder.add(GrowableVanillaOresBlocks.Slime_Cane,"Slime Reed");
        translationBuilder.add(GrowableVanillaOresBlocks.Bone_Cane,"Bone Reed");
        translationBuilder.add(GrowableVanillaOresBlocks.Nether_Star_Cane,"Nether Star Reed");

        //ae2
        translationBuilder.add(GrowableAEOresBlocks.certus_quartz_crystal_Cane,"Certus Quartz Crystal Reed");
        translationBuilder.add(GrowableAEOresBlocks.fluix_crystal_Cane,"Fluix Crystal Reed");

        //Tech Reborn
        translationBuilder.add(GrowableTechRebornOresBlocks.cinnabar_Cane,"Cinnabar Reed");
        translationBuilder.add(GrowableTechRebornOresBlocks.galena_Cane,"Galena Reed");
        translationBuilder.add(GrowableTechRebornOresBlocks.iridium_Cane,"Iridium Reed");
        translationBuilder.add(GrowableTechRebornOresBlocks.lead_Cane,"Lead Reed");
        translationBuilder.add(GrowableTechRebornOresBlocks.peridot_Cane,"Peridot Reed");
        translationBuilder.add(GrowableTechRebornOresBlocks.pyrite_Cane,"Sulfur Reed");
        translationBuilder.add(GrowableTechRebornOresBlocks.ruby_Cane,"Ruby Reed");
        translationBuilder.add(GrowableTechRebornOresBlocks.sapphire_Cane,"Sapphire Reed");
        translationBuilder.add(GrowableTechRebornOresBlocks.sheldonite_Cane,"Platinum Reed");
        translationBuilder.add(GrowableTechRebornOresBlocks.silver_Cane,"Silver Reed");
        translationBuilder.add(GrowableTechRebornOresBlocks.sphalerite_Cane,"Sphalerite Reed");
        translationBuilder.add(GrowableTechRebornOresBlocks.tin_Cane,"Tin Reed");
        translationBuilder.add(GrowableTechRebornOresBlocks.tungsten_Cane,"Tungsten Reed");
        translationBuilder.add(GrowableTechRebornOresBlocks.sodalite_Cane,"Sodalite Reed");;
        translationBuilder.add(GrowableTechRebornOresBlocks.bauxite_Cane,"Bauxite Reed");

        translationBuilder.add(GrowableOresItemGroups.Growable_Ores_Group,"Growable Ores");

        //BetterEnd
        translationBuilder.add(GrowableBetterEndOresBlocks.amber_Cane,"Amber Reed");
        translationBuilder.add(GrowableBetterEndOresBlocks.ender_Cane,"Ender Reed");
        translationBuilder.add(GrowableBetterEndOresBlocks.thallasium_Cane,"Thallasium Reed");

        //Maple
        translationBuilder.add(GrowableMapleOresBlocks.Salt_Cane,"Salt Reed");

        //Powah Rearchitected and Powah
        translationBuilder.add(GrowablePowahOresBlocks.Steel_Energized_Cane,"Steel Energized Reed");
        translationBuilder.add(GrowablePowahOresBlocks.Uraninite_Ore_Dense_Cane,"Uraninite Ore Dense Reed");
        translationBuilder.add(GrowablePowahOresBlocks.Ender_Core_Cane,"Ender Core Reed");
        translationBuilder.add(GrowablePowahOresBlocks.Crystal_Spirited_Cane,"Crystal Spirited Reed");
        translationBuilder.add(GrowablePowahOresBlocks.Crystal_Nitro_Cane,"Crystal Nitro Reed");
        translationBuilder.add(GrowablePowahOresBlocks.Crystal_Niotic_Cane,"Crystal Niotic Reed");
        translationBuilder.add(GrowablePowahOresBlocks.Crystal_Blazing_Cane,"Crystal Blazing Reed");

        //Industrial Revolution
        translationBuilder.add(GrowableIndustrialRevolutionOresBlocks.IR_Lead_Cane,"Lead Reed(IR)");
        translationBuilder.add(GrowableIndustrialRevolutionOresBlocks.IR_nikolite_Cane ,"Nikolite Reed(IR)");
        translationBuilder.add(GrowableIndustrialRevolutionOresBlocks.IR_silver_Cane,"Silver Reed(IR)");
        translationBuilder.add(GrowableIndustrialRevolutionOresBlocks.IR_tin_ore_Cane,"Tin Reed(IR)");
        translationBuilder.add(GrowableIndustrialRevolutionOresBlocks.IR_tungsten_Cane,"Tungsten Reed(IR)");

        //Modern Industrialization
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_antimony_Cane , "Antimony Reed(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_bauxite_Cane, "Bauxite Reed(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_iridium_Cane, "Iridium Reed(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_lead_Cane, "Lead Reed(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_lignite_coal_Cane, "Lignite Coal Reed(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_monazite_Cane, "Monazite Reed(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_nickel_Cane, "Nickel Reed(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_platinum_Cane, "Platinum Reed(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_quartz_Cane, "Quartz Reed(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_salt_Cane, "Salt Reed(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_tin_Cane, "Tin Reed(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_titanium_Cane, "Titanium Reed(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_tungsten_Cane,"Tungsten Reed(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_uranium_Cane, "Uranium Reed(MI)");

        //ic2 and ic2c
        translationBuilder.add(GrowableICOresBlocks.IC2_Aluminium_Cane, "Aluminium Reed(IC2 or IC2C)");
        translationBuilder.add(GrowableICOresBlocks.IC2_silver_Cane,"Silver Reed(IC2 or IC2C)");
        translationBuilder.add(GrowableICOresBlocks.IC2_Tin_Cane, "Tin Reed(IC2 or IC2C)");
        translationBuilder.add(GrowableICOresBlocks.IC2_Uranium_Cane, "Uranium Reed(IC2 or IC2C)");

        //Ad Astra!
        translationBuilder.add(GrowableAdAstraOresBlocks.AD_Ostrum_Cane, "Ostrum Reed(Ad Astra!)");
        translationBuilder.add(GrowableAdAstraOresBlocks.AD_Ice_Shard_Cane, "Ice Shard Reed(Ad Astra!)");
        translationBuilder.add(GrowableAdAstraOresBlocks.AD_Cheese_Cane, "Cheese Reed(Ad Astra!)");
        translationBuilder.add(GrowableAdAstraOresBlocks.AD_Desh_Cane, "Desh Reed(Ad Astra!)");
        translationBuilder.add(GrowableAdAstraOresBlocks.AD_Calorite_Cane, "Calorite Reed(Ad Astra!)");

        //Create
        translationBuilder.add(GrowableCreateOresBlocks.C_Andesite_Alloy_Cane, "Andesite Alloy Reed(Create)");
        translationBuilder.add(GrowableCreateOresBlocks.C_Brass_Ingot_Cane, "Brass Ingot Reed(Create)");
        translationBuilder.add(GrowableCreateOresBlocks.C_Polished_Rose_Quartz_Cane, "Polished Rose Quartz Reed(Create)");
        translationBuilder.add(GrowableCreateOresBlocks.C_Zinc_Cane, "Zinc Reed(Create)");

        //Thermal Series
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Apatite_Cane, "Apatite Reed(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Cinnabar_Cane, "Cinnabar Reed(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Copper_Cane, "Copper Reed(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Lead_Cane, "Lead Reed(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Nickel_Cane, "Nickel Reed(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Niter_Cane, "Niter Reed(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Ruby_Cane, "Ruby Reed(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Sapphire_Cane, "Sapphire Reed(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Silver_Cane, "Silver Reed(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Sulfur_Cane, "Sulfur Reed(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Tin_Cane, "Tin Reed(Thermal)");

    }
}
