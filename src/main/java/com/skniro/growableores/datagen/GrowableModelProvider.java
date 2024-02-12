package com.skniro.growableores.datagen;

import com.skniro.growableores.block.GrowableAEOresBlocks;
import com.skniro.growableores.block.GrowableVanillaOresBlocks;
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
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.cinnabar_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.galena_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.iridium_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.lead_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.peridot_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.pyrite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.ruby_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.sapphire_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.sheldonite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.silver_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.sphalerite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.tin_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.tungsten_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.sodalite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.bauxite_Cane, BlockStateModelGenerator.TintType.TINTED);

        //BetterEnd
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.amber_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.ender_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.thallasium_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Maple
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Salt_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Powah Rearchitected and Powah
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Steel_Energized_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Uraninite_Ore_Dense_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Ender_Core_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Crystal_Spirited_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Crystal_Nitro_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Crystal_Niotic_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.Crystal_Blazing_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Industrial Revolution
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.IR_Lead_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.IR_nikolite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.IR_silver_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.IR_tin_ore_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.IR_tungsten_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Modern Industrialization
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.MI_antimony_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.MI_bauxite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.MI_iridium_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.MI_lead_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.MI_lignite_coal_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.MI_monazite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.MI_nickel_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.MI_platinum_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.MI_quartz_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.MI_salt_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.MI_tin_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.MI_titanium_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.MI_tungsten_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.MI_uranium_Cane, BlockStateModelGenerator.TintType.TINTED);

        //ic2 and ic2c
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.IC2_Aluminium_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.IC2_silver_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.IC2_Tin_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.IC2_Uranium_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Ad Astra!
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.AD_Ostrum_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.AD_Ice_Shard_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.AD_Cheese_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.AD_Desh_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.AD_Calorite_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Create
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.C_Andesite_Alloy_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.C_Brass_Ingot_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.C_Polished_Rose_Quartz_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.C_Zinc_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Thermal Series
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.TF_Apatite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.TF_Cinnabar_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.TF_Copper_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.TF_Lead_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.TF_Nickel_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.TF_Niter_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.TF_Ruby_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.TF_Sapphire_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.TF_Silver_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.TF_Sulfur_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableVanillaOresBlocks.TF_Tin_Cane, BlockStateModelGenerator.TintType.TINTED);

    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
