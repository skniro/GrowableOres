package com.skniro.growableores;


import com.skniro.growableores.block.GrowableOresBlocks;
import com.skniro.growableores.item.GrowableOresItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;


public class ModContent {


    public static void registerItem(){
        GrowableOresItems.shield_item();
    }
    public static void registerBlock(){
        GrowableOresBlocks.registerModBlocks();

    }

    public static void CreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(GrowableOres.Growable_Ores_Group).register(content -> {
            content.add(GrowableOresBlocks.Coal_Cane);
            content.add(GrowableOresBlocks.Iron_Cane);
            content.add(GrowableOresBlocks.Diamond_Cane);
            content.add(GrowableOresBlocks.Copper_Cane);
            content.add(GrowableOresBlocks.Emerald_Cane);
            content.add(GrowableOresBlocks.Gold_Cane);
            content.add(GrowableOresBlocks.Lapis_Cane);
            content.add(GrowableOresBlocks.Nether_Quartz_Cane);
            content.add(GrowableOresBlocks.Redstone_Cane);
            content.add(GrowableOresBlocks.Blaze_Rod_Cane);
            content.add(GrowableOresBlocks.Ender_Pearl_Cane);
            content.add(GrowableOresBlocks.Netherite_Ingot_Cane);
            content.add(GrowableOresBlocks.Clay_Cane);
            content.add(GrowableOresBlocks.Glowstone_Cane);
            content.add(GrowableOresBlocks.Slime_Cane);
            content.add(GrowableOresBlocks.Bone_Cane);
            content.add(GrowableOresBlocks.Nether_Star_Cane);

            //ae2
            content.add(GrowableOresBlocks.certus_quartz_crystal_Cane);

            //Tech Reborn
            content.add(GrowableOresBlocks.cinnabar_Cane);
            content.add(GrowableOresBlocks.galena_Cane);
            content.add(GrowableOresBlocks.iridium_Cane);
            content.add(GrowableOresBlocks.lead_Cane);
            content.add(GrowableOresBlocks.peridot_Cane);
            content.add(GrowableOresBlocks.pyrite_Cane);
            content.add(GrowableOresBlocks.ruby_Cane);
            content.add(GrowableOresBlocks.sapphire_Cane);
            content.add(GrowableOresBlocks.sheldonite_Cane);
            content.add(GrowableOresBlocks.silver_Cane);
            content.add(GrowableOresBlocks.sphalerite_Cane);
            content.add(GrowableOresBlocks.tin_Cane);
            content.add(GrowableOresBlocks.tungsten_Cane);
            content.add(GrowableOresBlocks.sodalite_Cane);
            content.add(GrowableOresBlocks.bauxite_Cane);

            //BetterEnd
            content.add(GrowableOresBlocks.amber_Cane);
            content.add(GrowableOresBlocks.ender_Cane);
            content.add(GrowableOresBlocks.thallasium_Cane);

            //Maple
            content.add(GrowableOresBlocks.Salt_Cane);

            //Powah Rearchitected and Powah
            content.add(GrowableOresBlocks.Steel_Energized_Cane);
            content.add(GrowableOresBlocks.Uraninite_Ore_Dense_Cane);
            content.add(GrowableOresBlocks.Ender_Core_Cane);
            content.add(GrowableOresBlocks.Crystal_Spirited_Cane);
            content.add(GrowableOresBlocks.Crystal_Nitro_Cane);
            content.add(GrowableOresBlocks.Crystal_Niotic_Cane);
            content.add(GrowableOresBlocks.Crystal_Blazing_Cane);

            //Industrial Revolution
            content.add(GrowableOresBlocks.IR_Lead_Cane);
            content.add(GrowableOresBlocks.IR_nikolite_Cane );
            content.add(GrowableOresBlocks.IR_silver_Cane);
            content.add(GrowableOresBlocks.IR_tin_ore_Cane);
            content.add(GrowableOresBlocks.IR_tungsten_Cane);

            //Modern Industrialization
            content.add(GrowableOresBlocks.MI_antimony_Cane);
            content.add(GrowableOresBlocks.MI_bauxite_Cane);
            content.add(GrowableOresBlocks.MI_iridium_Cane);
            content.add(GrowableOresBlocks.MI_lead_Cane);
            content.add(GrowableOresBlocks.MI_lignite_coal_Cane);
            content.add(GrowableOresBlocks.MI_monazite_Cane);
            content.add(GrowableOresBlocks.MI_nickel_Cane);
            content.add(GrowableOresBlocks.MI_platinum_Cane);
            content.add(GrowableOresBlocks.MI_quartz_Cane);
            content.add(GrowableOresBlocks.MI_salt_Cane);
            content.add(GrowableOresBlocks.MI_tin_Cane);
            content.add(GrowableOresBlocks.MI_titanium_Cane);
            content.add(GrowableOresBlocks.MI_tungsten_Cane);
            content.add(GrowableOresBlocks.MI_uranium_Cane);

/*            //ic2 and ic2c
            content.add(GrowableOresBlocks.IC2_Aluminium_Cane);
            content.add(GrowableOresBlocks.IC2_silver_Cane);
            content.add(GrowableOresBlocks.IC2_Tin_Cane);
            content.add(GrowableOresBlocks.IC2_Uranium_Cane);*/

            //Ad Astra!
            content.add(GrowableOresBlocks.AD_Ostrum_Cane);
            content.add(GrowableOresBlocks.AD_Ice_Shard_Cane);
            content.add(GrowableOresBlocks.AD_Cheese_Cane);
            content.add(GrowableOresBlocks.AD_Desh_Cane);
            content.add(GrowableOresBlocks.AD_Calorite_Cane);

            //Create
            content.add(GrowableOresBlocks.C_Andesite_Alloy_Cane);
            content.add(GrowableOresBlocks.C_Brass_Ingot_Cane);
            content.add(GrowableOresBlocks.C_Polished_Rose_Quartz_Cane);
            content.add(GrowableOresBlocks.C_Zinc_Cane);

          /*  //Thermal Series
            content.add(GrowableOresBlocks.TF_Apatite_Cane);
            content.add(GrowableOresBlocks.TF_Cinnabar_Cane);
            content.add(GrowableOresBlocks.TF_Copper_Cane);
            content.add(GrowableOresBlocks.TF_Lead_Cane);
            content.add(GrowableOresBlocks.TF_Nickel_Cane);
            content.add(GrowableOresBlocks.TF_Niter_Cane);
            content.add(GrowableOresBlocks.TF_Ruby_Cane);
            content.add(GrowableOresBlocks.TF_Sapphire_Cane);
            content.add(GrowableOresBlocks.TF_Silver_Cane);
            content.add(GrowableOresBlocks.TF_Sulfur_Cane);
            content.add(GrowableOresBlocks.TF_Tin_Cane);*/

        });
    }
}
