package com.skniro.growableores.datagen;


import com.skniro.growableores.block.GrowableAEOresBlocks;
import com.skniro.growableores.block.GrowableVanillaOresBlocks;
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
        addDrop(GrowableVanillaOresBlocks.cinnabar_Cane);
        addDrop(GrowableVanillaOresBlocks.galena_Cane);
        addDrop(GrowableVanillaOresBlocks.iridium_Cane);
        addDrop(GrowableVanillaOresBlocks.lead_Cane);
        addDrop(GrowableVanillaOresBlocks.peridot_Cane);
        addDrop(GrowableVanillaOresBlocks.pyrite_Cane);
        addDrop(GrowableVanillaOresBlocks.ruby_Cane);
        addDrop(GrowableVanillaOresBlocks.sapphire_Cane);
        addDrop(GrowableVanillaOresBlocks.sodalite_Cane);
        addDrop(GrowableVanillaOresBlocks.bauxite_Cane);
        addDrop(GrowableVanillaOresBlocks.sheldonite_Cane);
        addDrop(GrowableVanillaOresBlocks.silver_Cane);
        addDrop(GrowableVanillaOresBlocks.sphalerite_Cane);
        addDrop(GrowableVanillaOresBlocks.tin_Cane);
        addDrop(GrowableVanillaOresBlocks.tungsten_Cane);

        //BetterEnd
        addDrop(GrowableVanillaOresBlocks.amber_Cane);
        addDrop(GrowableVanillaOresBlocks.ender_Cane);
        addDrop(GrowableVanillaOresBlocks.thallasium_Cane);

        //Maple
        addDrop(GrowableVanillaOresBlocks.Salt_Cane);

        //Powah Rearchitected and Powah
        addDrop(GrowableVanillaOresBlocks.Steel_Energized_Cane);
        addDrop(GrowableVanillaOresBlocks.Uraninite_Ore_Dense_Cane);
        addDrop(GrowableVanillaOresBlocks.Ender_Core_Cane);
        addDrop(GrowableVanillaOresBlocks.Crystal_Spirited_Cane);
        addDrop(GrowableVanillaOresBlocks.Crystal_Nitro_Cane);
        addDrop(GrowableVanillaOresBlocks.Crystal_Niotic_Cane);
        addDrop(GrowableVanillaOresBlocks.Crystal_Blazing_Cane);

        //Industrial Revolution
        addDrop(GrowableVanillaOresBlocks.IR_Lead_Cane);
        addDrop(GrowableVanillaOresBlocks.IR_nikolite_Cane );
        addDrop(GrowableVanillaOresBlocks.IR_silver_Cane);
        addDrop(GrowableVanillaOresBlocks.IR_tin_ore_Cane);
        addDrop(GrowableVanillaOresBlocks.IR_tungsten_Cane);

        //Modern Industrialization
        addDrop(GrowableVanillaOresBlocks.MI_antimony_Cane );
        addDrop(GrowableVanillaOresBlocks.MI_bauxite_Cane);
        addDrop(GrowableVanillaOresBlocks.MI_iridium_Cane);
        addDrop(GrowableVanillaOresBlocks.MI_lead_Cane);
        addDrop(GrowableVanillaOresBlocks.MI_lignite_coal_Cane);
        addDrop(GrowableVanillaOresBlocks.MI_monazite_Cane);
        addDrop(GrowableVanillaOresBlocks.MI_nickel_Cane);
        addDrop(GrowableVanillaOresBlocks.MI_platinum_Cane);
        addDrop(GrowableVanillaOresBlocks.MI_quartz_Cane);
        addDrop(GrowableVanillaOresBlocks.MI_salt_Cane);
        addDrop(GrowableVanillaOresBlocks.MI_tin_Cane);
        addDrop(GrowableVanillaOresBlocks.MI_titanium_Cane);
        addDrop(GrowableVanillaOresBlocks.MI_tungsten_Cane);
        addDrop(GrowableVanillaOresBlocks.MI_uranium_Cane);

        //ic2 and ic2c
        addDrop(GrowableVanillaOresBlocks.IC2_Aluminium_Cane);
        addDrop(GrowableVanillaOresBlocks.IC2_silver_Cane);
        addDrop(GrowableVanillaOresBlocks.IC2_Tin_Cane);
        addDrop(GrowableVanillaOresBlocks.IC2_Uranium_Cane);

        //Ad Astra!
        addDrop(GrowableVanillaOresBlocks.AD_Ostrum_Cane);
        addDrop(GrowableVanillaOresBlocks.AD_Ice_Shard_Cane);
        addDrop(GrowableVanillaOresBlocks.AD_Cheese_Cane);
        addDrop(GrowableVanillaOresBlocks.AD_Desh_Cane);
        addDrop(GrowableVanillaOresBlocks.AD_Calorite_Cane);

        //Create
        addDrop(GrowableVanillaOresBlocks.C_Andesite_Alloy_Cane);
        addDrop(GrowableVanillaOresBlocks.C_Brass_Ingot_Cane);
        addDrop(GrowableVanillaOresBlocks.C_Polished_Rose_Quartz_Cane);
        addDrop(GrowableVanillaOresBlocks.C_Zinc_Cane);

        //Thermal Series
        addDrop(GrowableVanillaOresBlocks.TF_Apatite_Cane);
        addDrop(GrowableVanillaOresBlocks.TF_Cinnabar_Cane);
        addDrop(GrowableVanillaOresBlocks.TF_Copper_Cane);
        addDrop(GrowableVanillaOresBlocks.TF_Lead_Cane);
        addDrop(GrowableVanillaOresBlocks.TF_Nickel_Cane);
        addDrop(GrowableVanillaOresBlocks.TF_Niter_Cane);
        addDrop(GrowableVanillaOresBlocks.TF_Ruby_Cane);
        addDrop(GrowableVanillaOresBlocks.TF_Sapphire_Cane);
        addDrop(GrowableVanillaOresBlocks.TF_Silver_Cane);
        addDrop(GrowableVanillaOresBlocks.TF_Sulfur_Cane);
        addDrop(GrowableVanillaOresBlocks.TF_Tin_Cane);


    }
}
