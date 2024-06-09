package com.skniro.growableores.datagen;

import com.skniro.growableores.block.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class GrowableModelProvider extends FabricModelProvider {
    public GrowableModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Village
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Iron_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Coal_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Diamond_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Lapis_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Redstone_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Nether_Quartz_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Copper_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Emerald_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Gold_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Blaze_Rod_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Ender_Pearl_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Netherite_Ingot_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Clay_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Slime_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Nether_Star_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Glowstone_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Bone_Cane, BlockStateModelGenerator.TintType.TINTED);

        //AE2
        blockStateModelGenerator.registerTintableCross(GrowableAEOresBlocks.certus_quartz_crystal_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableAEOresBlocks.fluix_crystal_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Tech Reborn
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.cinnabar_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.galena_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.iridium_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.lead_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.peridot_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.pyrite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.ruby_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.sapphire_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.sheldonite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.silver_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.sphalerite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.tin_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.tungsten_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.sodalite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.bauxite_Cane, BlockStateModelGenerator.TintType.TINTED);

        //BetterEnd
        blockStateModelGenerator.registerTintableCross(GrowableBetterEndOresBlocks.amber_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableBetterEndOresBlocks.ender_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableBetterEndOresBlocks.thallasium_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Maple
        blockStateModelGenerator.registerTintableCross(GrowableMapleOresBlocks.Salt_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Powah Rearchitected and Powah
        blockStateModelGenerator.registerTintableCross(GrowablePowahOresBlocks.Steel_Energized_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowablePowahOresBlocks.Uraninite_Ore_Dense_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowablePowahOresBlocks.Ender_Core_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowablePowahOresBlocks.Crystal_Spirited_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowablePowahOresBlocks.Crystal_Nitro_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowablePowahOresBlocks.Crystal_Niotic_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowablePowahOresBlocks.Crystal_Blazing_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Industrial Revolution
        blockStateModelGenerator.registerTintableCross(GrowableIndustrialRevolutionOresBlocks.IR_Lead_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableIndustrialRevolutionOresBlocks.IR_nikolite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableIndustrialRevolutionOresBlocks.IR_silver_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableIndustrialRevolutionOresBlocks.IR_tin_ore_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableIndustrialRevolutionOresBlocks.IR_tungsten_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Modern Industrialization
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_antimony_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_bauxite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_iridium_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_lead_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_lignite_coal_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_monazite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_nickel_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_platinum_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_quartz_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_salt_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_tin_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_titanium_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_tungsten_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_uranium_Cane, BlockStateModelGenerator.TintType.TINTED);

        //ic2 and ic2c
        blockStateModelGenerator.registerTintableCross(GrowableICOresBlocks.IC2_Aluminium_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableICOresBlocks.IC2_silver_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableICOresBlocks.IC2_Tin_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableICOresBlocks.IC2_Uranium_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Ad Astra!
        blockStateModelGenerator.registerTintableCross(GrowableAdAstraOresBlocks.AD_Ostrum_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableAdAstraOresBlocks.AD_Ice_Shard_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableAdAstraOresBlocks.AD_Cheese_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableAdAstraOresBlocks.AD_Desh_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableAdAstraOresBlocks.AD_Calorite_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Create
        blockStateModelGenerator.registerTintableCross(GrowableCreateOresBlocks.C_Andesite_Alloy_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableCreateOresBlocks.C_Brass_Ingot_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableCreateOresBlocks.C_Polished_Rose_Quartz_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableCreateOresBlocks.C_Zinc_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Thermal Series
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Apatite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Cinnabar_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Copper_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Lead_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Nickel_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Niter_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Ruby_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Sapphire_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Silver_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Sulfur_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Tin_Cane, BlockStateModelGenerator.TintType.TINTED);

    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
