package com.skniro.growableores.datagen;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.*;
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
      /*  //Village
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Iron_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Coal_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Diamond_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Lapis_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Redstone_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Nether_Quartz_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Copper_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Emerald_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Gold_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Blaze_Rod_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Ender_Pearl_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Netherite_Ingot_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Clay_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Slime_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Nether_Star_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Glowstone_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Bone_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Wool_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Egg_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Feather_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Gunpowder_Cane, BlockStateModelGenerator.CrossType.TINTED);

        //AE2
        blockStateModelGenerator.registerTintableCross(GrowableAEOresBlocks.certus_quartz_crystal_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableAEOresBlocks.fluix_crystal_Cane, BlockStateModelGenerator.CrossType.TINTED);

        //Tech Reborn
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.cinnabar_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.galena_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.iridium_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.lead_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.peridot_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.pyrite_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.ruby_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.sapphire_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.sheldonite_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.silver_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.sphalerite_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.tin_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.tungsten_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.sodalite_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableTechRebornOresBlocks.bauxite_Cane, BlockStateModelGenerator.CrossType.TINTED);

        //BetterEnd
        blockStateModelGenerator.registerTintableCross(GrowableBetterEndOresBlocks.amber_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableBetterEndOresBlocks.ender_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableBetterEndOresBlocks.thallasium_Cane, BlockStateModelGenerator.CrossType.TINTED);

        //Maple
        blockStateModelGenerator.registerTintableCross(GrowableMapleOresBlocks.Salt_Cane, BlockStateModelGenerator.CrossType.TINTED);

        //Powah Rearchitected and Powah
        blockStateModelGenerator.registerTintableCross(GrowablePowahOresBlocks.Steel_Energized_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowablePowahOresBlocks.Uraninite_Ore_Dense_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowablePowahOresBlocks.Ender_Core_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowablePowahOresBlocks.Crystal_Spirited_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowablePowahOresBlocks.Crystal_Nitro_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowablePowahOresBlocks.Crystal_Niotic_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowablePowahOresBlocks.Crystal_Blazing_Cane, BlockStateModelGenerator.CrossType.TINTED);

        //Industrial Revolution
        blockStateModelGenerator.registerTintableCross(GrowableIndustrialRevolutionOresBlocks.IR_Lead_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableIndustrialRevolutionOresBlocks.IR_nikolite_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableIndustrialRevolutionOresBlocks.IR_silver_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableIndustrialRevolutionOresBlocks.IR_tin_ore_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableIndustrialRevolutionOresBlocks.IR_tungsten_Cane, BlockStateModelGenerator.CrossType.TINTED);

        //Modern Industrialization
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_antimony_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_bauxite_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_iridium_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_lead_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_lignite_coal_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_monazite_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_nickel_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_platinum_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_quartz_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_salt_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_tin_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_titanium_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_tungsten_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableModernIndustrializationOresBlocks.MI_uranium_Cane, BlockStateModelGenerator.CrossType.TINTED);

        //ic2 and ic2c
        blockStateModelGenerator.registerTintableCross(GrowableICOresBlocks.IC2_Aluminium_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableICOresBlocks.IC2_silver_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableICOresBlocks.IC2_Tin_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableICOresBlocks.IC2_Uranium_Cane, BlockStateModelGenerator.CrossType.TINTED);

        //Ad Astra!
        blockStateModelGenerator.registerTintableCross(GrowableAdAstraOresBlocks.AD_Ostrum_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableAdAstraOresBlocks.AD_Ice_Shard_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableAdAstraOresBlocks.AD_Cheese_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableAdAstraOresBlocks.AD_Desh_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableAdAstraOresBlocks.AD_Calorite_Cane, BlockStateModelGenerator.CrossType.TINTED);

        //Create
        blockStateModelGenerator.registerTintableCross(GrowableCreateOresBlocks.C_Andesite_Alloy_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableCreateOresBlocks.C_Brass_Ingot_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableCreateOresBlocks.C_Polished_Rose_Quartz_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableCreateOresBlocks.C_Zinc_Cane, BlockStateModelGenerator.CrossType.TINTED);

        //Thermal Series
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Apatite_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Cinnabar_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Copper_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Lead_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Nickel_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Niter_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Ruby_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Sapphire_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Silver_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Sulfur_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableThermalSeriesOresBlocks.TF_Tin_Cane, BlockStateModelGenerator.CrossType.TINTED);


        //Mekanism
        blockStateModelGenerator.registerTintableCross(GrowableMekanismOresBlocks.MEK_Fluorite_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableMekanismOresBlocks.MEK_Lead_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableMekanismOresBlocks.MEK_Osmium_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableMekanismOresBlocks.MEK_Tin_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableMekanismOresBlocks.MEK_Uranium_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableMekanismOresBlocks.MEK_Steel_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableMekanismOresBlocks.MEK_Refined_Obsidian_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableMekanismOresBlocks.MEK_Refined_Glowstone_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableMekanismOresBlocks.MEK_Bronze_Cane, BlockStateModelGenerator.CrossType.TINTED);

        //BetterNether
        blockStateModelGenerator.registerTintableCross(GrowableBetterNetherOresBlocks.BN_Cincinnasite_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableBetterNetherOresBlocks.BN_Nether_Ruby_Cane, BlockStateModelGenerator.CrossType.TINTED);

        //EnergizedPower
        blockStateModelGenerator.registerTintableCross(GrowableEnergizedPowerOresBlocks.EP_Advanced_Alloy_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableEnergizedPowerOresBlocks.EP_Energized_Copper_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableEnergizedPowerOresBlocks.EP_Energized_Gold_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableEnergizedPowerOresBlocks.EP_Redstone_Alloy_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableEnergizedPowerOresBlocks.EP_Steel_Cane, BlockStateModelGenerator.CrossType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableEnergizedPowerOresBlocks.EP_Tin_Cane, BlockStateModelGenerator.CrossType.TINTED);
*/
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
