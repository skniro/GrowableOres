package com.skniro.growableores.datagen;


import com.skniro.growableores.block.GrowableOresBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.data.client.BlockStateModelGenerator;


public class GrowableLootTableGenerator extends FabricBlockLootTableProvider {
    public GrowableLootTableGenerator(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generate() {
        addDrop(GrowableOresBlocks.Coal_Cane);
        addDrop(GrowableOresBlocks.Iron_Cane);
        addDrop(GrowableOresBlocks.Diamond_Cane);
        addDrop(GrowableOresBlocks.Gold_Cane);
        addDrop(GrowableOresBlocks.Lapis_Cane);
        addDrop(GrowableOresBlocks.Nether_Quartz_Cane);
        addDrop(GrowableOresBlocks.Emerald_Cane);
        addDrop(GrowableOresBlocks.Copper_Cane);
        addDrop(GrowableOresBlocks.Redstone_Cane);
        addDrop(GrowableOresBlocks.Blaze_Rod_Cane);
        addDrop(GrowableOresBlocks.Ender_Pearl_Cane);
        addDrop(GrowableOresBlocks.Netherite_Ingot_Cane);
        addDrop(GrowableOresBlocks.Clay_Cane);

        //AE2
        addDrop(GrowableOresBlocks.certus_quartz_crystal_Cane);

        //Tech Reborn
        addDrop(GrowableOresBlocks.cinnabar_Cane);
        addDrop(GrowableOresBlocks.galena_Cane);
        addDrop(GrowableOresBlocks.iridium_Cane);
        addDrop(GrowableOresBlocks.lead_Cane);
        addDrop(GrowableOresBlocks.peridot_Cane);
        addDrop(GrowableOresBlocks.pyrite_Cane);
        addDrop(GrowableOresBlocks.ruby_Cane);
        addDrop(GrowableOresBlocks.sapphire_Cane);
        addDrop(GrowableOresBlocks.sodalite_Cane);
        addDrop(GrowableOresBlocks.bauxite_Cane);
        addDrop(GrowableOresBlocks.sheldonite_Cane);
        addDrop(GrowableOresBlocks.silver_Cane);
        addDrop(GrowableOresBlocks.sphalerite_Cane);
        addDrop(GrowableOresBlocks.tin_Cane);
        addDrop(GrowableOresBlocks.tungsten_Cane);

        //BetterEnd
        addDrop(GrowableOresBlocks.amber_Cane);
        addDrop(GrowableOresBlocks.ender_Cane);
        addDrop(GrowableOresBlocks.thallasium_Cane);

        //Maple
        addDrop(GrowableOresBlocks.Salt_Cane);

        //Powah Rearchitected and Powah
        addDrop(GrowableOresBlocks.Steel_Energized_Cane);
        addDrop(GrowableOresBlocks.Uraninite_Ore_Dense_Cane);
        addDrop(GrowableOresBlocks.Ender_Core_Cane);
        addDrop(GrowableOresBlocks.Crystal_Spirited_Cane);
        addDrop(GrowableOresBlocks.Crystal_Nitro_Cane);
        addDrop(GrowableOresBlocks.Crystal_Niotic_Cane);
        addDrop(GrowableOresBlocks.Crystal_Blazing_Cane);

        //Industrial Revolution
        addDrop(GrowableOresBlocks.IR_Lead_Cane);
        addDrop(GrowableOresBlocks.IR_nikolite_Cane );
        addDrop(GrowableOresBlocks.IR_silver_Cane);
        addDrop(GrowableOresBlocks.IR_tin_ore_Cane);
        addDrop(GrowableOresBlocks.IR_tungsten_Cane);

        //Modern Industrialization
        addDrop(GrowableOresBlocks.MI_antimony_Cane );
        addDrop(GrowableOresBlocks.MI_bauxite_Cane);
        addDrop(GrowableOresBlocks.MI_iridium_Cane);
        addDrop(GrowableOresBlocks.MI_lead_Cane);
        addDrop(GrowableOresBlocks.MI_lignite_coal_Cane);
        addDrop(GrowableOresBlocks.MI_monazite_Cane);
        addDrop(GrowableOresBlocks.MI_nickel_Cane);
        addDrop(GrowableOresBlocks.MI_platinum_Cane);
        addDrop(GrowableOresBlocks.MI_quartz_Cane);
        addDrop(GrowableOresBlocks.MI_salt_Cane);
        addDrop(GrowableOresBlocks.MI_tin_Cane);
        addDrop(GrowableOresBlocks.MI_titanium_Cane);
        addDrop(GrowableOresBlocks.MI_tungsten_Cane);
        addDrop(GrowableOresBlocks.MI_uranium_Cane);

        //ic2 and ic2c
        addDrop(GrowableOresBlocks.IC2_Aluminium_Cane);
        addDrop(GrowableOresBlocks.IC2_silver_Cane);
        addDrop(GrowableOresBlocks.IC2_Tin_Cane);
        addDrop(GrowableOresBlocks.IC2_Uranium_Cane);

        //Ad Astra!
        addDrop(GrowableOresBlocks.AD_Ostrum_Cane);
        addDrop(GrowableOresBlocks.AD_Ice_Shard_Cane);
        addDrop(GrowableOresBlocks.AD_Cheese_Cane);
        addDrop(GrowableOresBlocks.AD_Desh_Cane);
        addDrop(GrowableOresBlocks.AD_Calorite_Cane);

        //Create
        addDrop(GrowableOresBlocks.C_Andesite_Alloy_Cane);
        addDrop(GrowableOresBlocks.C_Brass_Ingot_Cane);
        addDrop(GrowableOresBlocks.C_Polished_Rose_Quartz_Cane);
        addDrop(GrowableOresBlocks.C_Zinc_Cane);

        //Thermal Series
        addDrop(GrowableOresBlocks.TF_Apatite_Cane);
        addDrop(GrowableOresBlocks.TF_Cinnabar_Cane);
        addDrop(GrowableOresBlocks.TF_Copper_Cane);
        addDrop(GrowableOresBlocks.TF_Lead_Cane);
        addDrop(GrowableOresBlocks.TF_Nickel_Cane);
        addDrop(GrowableOresBlocks.TF_Niter_Cane);
        addDrop(GrowableOresBlocks.TF_Ruby_Cane);
        addDrop(GrowableOresBlocks.TF_Sapphire_Cane);
        addDrop(GrowableOresBlocks.TF_Silver_Cane);
        addDrop(GrowableOresBlocks.TF_Sulfur_Cane);
        addDrop(GrowableOresBlocks.TF_Tin_Cane);


    }
}
