package com.skniro.growableores.datagen;


import com.skniro.growableores.block.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;


public class GrowableLootTableGenerator extends FabricBlockLootTableProvider {
    public GrowableLootTableGenerator(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generate() {
        addDrop(GrowableVanillaOresBlocks.Coal_Cane);
        addDrop(GrowableVanillaOresBlocks.Iron_Cane);
        addDrop(GrowableVanillaOresBlocks.Diamond_Cane);
        addDrop(GrowableVanillaOresBlocks.Gold_Cane);
        addDrop(GrowableVanillaOresBlocks.Lapis_Cane);
        addDrop(GrowableVanillaOresBlocks.Nether_Quartz_Cane);
        addDrop(GrowableVanillaOresBlocks.Emerald_Cane);
        addDrop(GrowableVanillaOresBlocks.Copper_Cane);
        addDrop(GrowableVanillaOresBlocks.Redstone_Cane);
        addDrop(GrowableVanillaOresBlocks.Blaze_Rod_Cane);
        addDrop(GrowableVanillaOresBlocks.Ender_Pearl_Cane);
        addDrop(GrowableVanillaOresBlocks.Netherite_Ingot_Cane);
        addDrop(GrowableVanillaOresBlocks.Clay_Cane);
        addDrop(GrowableVanillaOresBlocks.Slime_Cane);
        addDrop(GrowableVanillaOresBlocks.Nether_Star_Cane);
        addDrop(GrowableVanillaOresBlocks.Glowstone_Cane);
        addDrop(GrowableVanillaOresBlocks.Bone_Cane);

        //AE2
        addDrop(GrowableAEOresBlocks.certus_quartz_crystal_Cane);
        addDrop(GrowableAEOresBlocks.fluix_crystal_Cane);

        //Tech Reborn
        addDrop(GrowableTechRebornOresBlocks.cinnabar_Cane);
        addDrop(GrowableTechRebornOresBlocks.galena_Cane);
        addDrop(GrowableTechRebornOresBlocks.iridium_Cane);
        addDrop(GrowableTechRebornOresBlocks.lead_Cane);
        addDrop(GrowableTechRebornOresBlocks.peridot_Cane);
        addDrop(GrowableTechRebornOresBlocks.pyrite_Cane);
        addDrop(GrowableTechRebornOresBlocks.ruby_Cane);
        addDrop(GrowableTechRebornOresBlocks.sapphire_Cane);
        addDrop(GrowableTechRebornOresBlocks.sodalite_Cane);
        addDrop(GrowableTechRebornOresBlocks.bauxite_Cane);
        addDrop(GrowableTechRebornOresBlocks.sheldonite_Cane);
        addDrop(GrowableTechRebornOresBlocks.silver_Cane);
        addDrop(GrowableTechRebornOresBlocks.sphalerite_Cane);
        addDrop(GrowableTechRebornOresBlocks.tin_Cane);
        addDrop(GrowableTechRebornOresBlocks.tungsten_Cane);

        //BetterEnd
        addDrop(GrowableBetterEndOresBlocks.amber_Cane);
        addDrop(GrowableBetterEndOresBlocks.ender_Cane);
        addDrop(GrowableBetterEndOresBlocks.thallasium_Cane);

        //Maple
        addDrop(GrowableMapleOresBlocks.Salt_Cane);

        //Powah Rearchitected and Powah
        addDrop(GrowablePowahOresBlocks.Steel_Energized_Cane);
        addDrop(GrowablePowahOresBlocks.Uraninite_Ore_Dense_Cane);
        addDrop(GrowablePowahOresBlocks.Ender_Core_Cane);
        addDrop(GrowablePowahOresBlocks.Crystal_Spirited_Cane);
        addDrop(GrowablePowahOresBlocks.Crystal_Nitro_Cane);
        addDrop(GrowablePowahOresBlocks.Crystal_Niotic_Cane);
        addDrop(GrowablePowahOresBlocks.Crystal_Blazing_Cane);

        //Industrial Revolution
        addDrop(GrowableIndustrialRevolutionOresBlocks.IR_Lead_Cane);
        addDrop(GrowableIndustrialRevolutionOresBlocks.IR_nikolite_Cane );
        addDrop(GrowableIndustrialRevolutionOresBlocks.IR_silver_Cane);
        addDrop(GrowableIndustrialRevolutionOresBlocks.IR_tin_ore_Cane);
        addDrop(GrowableIndustrialRevolutionOresBlocks.IR_tungsten_Cane);

        //Modern Industrialization
        addDrop(GrowableModernIndustrializationOresBlocks.MI_antimony_Cane );
        addDrop(GrowableModernIndustrializationOresBlocks.MI_bauxite_Cane);
        addDrop(GrowableModernIndustrializationOresBlocks.MI_iridium_Cane);
        addDrop(GrowableModernIndustrializationOresBlocks.MI_lead_Cane);
        addDrop(GrowableModernIndustrializationOresBlocks.MI_lignite_coal_Cane);
        addDrop(GrowableModernIndustrializationOresBlocks.MI_monazite_Cane);
        addDrop(GrowableModernIndustrializationOresBlocks.MI_nickel_Cane);
        addDrop(GrowableModernIndustrializationOresBlocks.MI_platinum_Cane);
        addDrop(GrowableModernIndustrializationOresBlocks.MI_quartz_Cane);
        addDrop(GrowableModernIndustrializationOresBlocks.MI_salt_Cane);
        addDrop(GrowableModernIndustrializationOresBlocks.MI_tin_Cane);
        addDrop(GrowableModernIndustrializationOresBlocks.MI_titanium_Cane);
        addDrop(GrowableModernIndustrializationOresBlocks.MI_tungsten_Cane);
        addDrop(GrowableModernIndustrializationOresBlocks.MI_uranium_Cane);

        //ic2 and ic2c
        addDrop(GrowableICOresBlocks.IC2_Aluminium_Cane);
        addDrop(GrowableICOresBlocks.IC2_silver_Cane);
        addDrop(GrowableICOresBlocks.IC2_Tin_Cane);
        addDrop(GrowableICOresBlocks.IC2_Uranium_Cane);

        //Ad Astra!
        addDrop(GrowableAdAstraOresBlocks.AD_Ostrum_Cane);
        addDrop(GrowableAdAstraOresBlocks.AD_Ice_Shard_Cane);
        addDrop(GrowableAdAstraOresBlocks.AD_Cheese_Cane);
        addDrop(GrowableAdAstraOresBlocks.AD_Desh_Cane);
        addDrop(GrowableAdAstraOresBlocks.AD_Calorite_Cane);

        //Create
        addDrop(GrowableCreateOresBlocks.C_Andesite_Alloy_Cane);
        addDrop(GrowableCreateOresBlocks.C_Brass_Ingot_Cane);
        addDrop(GrowableCreateOresBlocks.C_Polished_Rose_Quartz_Cane);
        addDrop(GrowableCreateOresBlocks.C_Zinc_Cane);

        //Thermal Series
        addDrop(GrowableThermalSeriesOresBlocks.TF_Apatite_Cane);
        addDrop(GrowableThermalSeriesOresBlocks.TF_Cinnabar_Cane);
        addDrop(GrowableThermalSeriesOresBlocks.TF_Copper_Cane);
        addDrop(GrowableThermalSeriesOresBlocks.TF_Lead_Cane);
        addDrop(GrowableThermalSeriesOresBlocks.TF_Nickel_Cane);
        addDrop(GrowableThermalSeriesOresBlocks.TF_Niter_Cane);
        addDrop(GrowableThermalSeriesOresBlocks.TF_Ruby_Cane);
        addDrop(GrowableThermalSeriesOresBlocks.TF_Sapphire_Cane);
        addDrop(GrowableThermalSeriesOresBlocks.TF_Silver_Cane);
        addDrop(GrowableThermalSeriesOresBlocks.TF_Sulfur_Cane);
        addDrop(GrowableThermalSeriesOresBlocks.TF_Tin_Cane);


    }
}
