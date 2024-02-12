package com.skniro.growableores.datagen;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.GrowableAEOresBlocks;
import com.skniro.growableores.block.GrowableVanillaOresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class GrowableTagGenerator extends FabricTagProvider.BlockTagProvider {
   public GrowableTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
   }

   private static final TagKey<Block> GROWABLE_CANE = TagKey.of(RegistryKeys.BLOCK, new Identifier(GrowableOres.MOD_ID,"growable_cane"));
   @Override
   protected void configure(RegistryWrapper.WrapperLookup arg) {
      getOrCreateTagBuilder(GROWABLE_CANE)
      .add(GrowableVanillaOresBlocks.Coal_Cane)
      .add(GrowableVanillaOresBlocks.Iron_Cane)
      .add(GrowableVanillaOresBlocks.Diamond_Cane)
      .add(GrowableVanillaOresBlocks.Copper_Cane)
      .add(GrowableVanillaOresBlocks.Emerald_Cane)
      .add(GrowableVanillaOresBlocks.Gold_Cane)
      .add(GrowableVanillaOresBlocks.Lapis_Cane)
      .add(GrowableVanillaOresBlocks.Nether_Quartz_Cane)
      .add(GrowableVanillaOresBlocks.Redstone_Cane)
      .add(GrowableVanillaOresBlocks.Blaze_Rod_Cane)
      .add(GrowableVanillaOresBlocks.Ender_Pearl_Cane)
      .add(GrowableVanillaOresBlocks.Netherite_Ingot_Cane)
      .add(GrowableVanillaOresBlocks.Clay_Cane)
      .add(GrowableVanillaOresBlocks.Glowstone_Cane)
      .add(GrowableVanillaOresBlocks.Slime_Cane)
      .add(GrowableVanillaOresBlocks.Bone_Cane)
      .add(GrowableVanillaOresBlocks.Nether_Star_Cane)

      //ae2
      .add(GrowableAEOresBlocks.certus_quartz_crystal_Cane)
      .add(GrowableAEOresBlocks.fluix_crystal_Cane)

      //Tech Reborn
      .add(GrowableVanillaOresBlocks.cinnabar_Cane)
      .add(GrowableVanillaOresBlocks.galena_Cane)
      .add(GrowableVanillaOresBlocks.iridium_Cane)
      .add(GrowableVanillaOresBlocks.lead_Cane)
      .add(GrowableVanillaOresBlocks.peridot_Cane)
      .add(GrowableVanillaOresBlocks.pyrite_Cane)
      .add(GrowableVanillaOresBlocks.ruby_Cane)
      .add(GrowableVanillaOresBlocks.sapphire_Cane)
      .add(GrowableVanillaOresBlocks.sheldonite_Cane)
      .add(GrowableVanillaOresBlocks.silver_Cane)
      .add(GrowableVanillaOresBlocks.sphalerite_Cane)
      .add(GrowableVanillaOresBlocks.tin_Cane)
      .add(GrowableVanillaOresBlocks.tungsten_Cane)
      .add(GrowableVanillaOresBlocks.sodalite_Cane)
      .add(GrowableVanillaOresBlocks.bauxite_Cane)


      //BetterEnd
      .add(GrowableVanillaOresBlocks.amber_Cane)
      .add(GrowableVanillaOresBlocks.ender_Cane)
      .add(GrowableVanillaOresBlocks.thallasium_Cane)

      //Maple
      .add(GrowableVanillaOresBlocks.Salt_Cane)

      //Powah Rearchitected and Powah
      .add(GrowableVanillaOresBlocks.Steel_Energized_Cane)
      .add(GrowableVanillaOresBlocks.Uraninite_Ore_Dense_Cane)
      .add(GrowableVanillaOresBlocks.Ender_Core_Cane)
      .add(GrowableVanillaOresBlocks.Crystal_Spirited_Cane)
      .add(GrowableVanillaOresBlocks.Crystal_Nitro_Cane)
      .add(GrowableVanillaOresBlocks.Crystal_Niotic_Cane)
      .add(GrowableVanillaOresBlocks.Crystal_Blazing_Cane)

      //Industrial Revolution
      .add(GrowableVanillaOresBlocks.IR_Lead_Cane)
      .add(GrowableVanillaOresBlocks.IR_nikolite_Cane )
      .add(GrowableVanillaOresBlocks.IR_silver_Cane)
      .add(GrowableVanillaOresBlocks.IR_tin_ore_Cane)
      .add(GrowableVanillaOresBlocks.IR_tungsten_Cane)

      //Modern Industrialization
      .add(GrowableVanillaOresBlocks.MI_antimony_Cane )
      .add(GrowableVanillaOresBlocks.MI_bauxite_Cane)
      .add(GrowableVanillaOresBlocks.MI_iridium_Cane)
      .add(GrowableVanillaOresBlocks.MI_lead_Cane)
      .add(GrowableVanillaOresBlocks.MI_lignite_coal_Cane)
      .add(GrowableVanillaOresBlocks.MI_monazite_Cane)
      .add(GrowableVanillaOresBlocks.MI_nickel_Cane)
      .add(GrowableVanillaOresBlocks.MI_platinum_Cane)
      .add(GrowableVanillaOresBlocks.MI_quartz_Cane)
      .add(GrowableVanillaOresBlocks.MI_salt_Cane)
      .add(GrowableVanillaOresBlocks.MI_tin_Cane)
      .add(GrowableVanillaOresBlocks.MI_titanium_Cane)
      .add(GrowableVanillaOresBlocks.MI_tungsten_Cane)
      .add(GrowableVanillaOresBlocks.MI_uranium_Cane)

      //ic2 and ic2c
      .add(GrowableVanillaOresBlocks.IC2_Aluminium_Cane)
      .add(GrowableVanillaOresBlocks.IC2_silver_Cane)
      .add(GrowableVanillaOresBlocks.IC2_Tin_Cane)
      .add(GrowableVanillaOresBlocks.IC2_Uranium_Cane)

      //Ad Astra!
      .add(GrowableVanillaOresBlocks.AD_Ostrum_Cane)
      .add(GrowableVanillaOresBlocks.AD_Ice_Shard_Cane)
      .add(GrowableVanillaOresBlocks.AD_Cheese_Cane)
      .add(GrowableVanillaOresBlocks.AD_Desh_Cane)
      .add(GrowableVanillaOresBlocks.AD_Calorite_Cane)

      //Create
      .add(GrowableVanillaOresBlocks.C_Andesite_Alloy_Cane)
      .add(GrowableVanillaOresBlocks.C_Brass_Ingot_Cane)
      .add(GrowableVanillaOresBlocks.C_Polished_Rose_Quartz_Cane)
      .add(GrowableVanillaOresBlocks.C_Zinc_Cane)

      //Thermal Series
      .add(GrowableVanillaOresBlocks.TF_Apatite_Cane)
      .add(GrowableVanillaOresBlocks.TF_Cinnabar_Cane)
      .add(GrowableVanillaOresBlocks.TF_Copper_Cane)
      .add(GrowableVanillaOresBlocks.TF_Lead_Cane)
      .add(GrowableVanillaOresBlocks.TF_Nickel_Cane)
      .add(GrowableVanillaOresBlocks.TF_Niter_Cane)
      .add(GrowableVanillaOresBlocks.TF_Ruby_Cane)
      .add(GrowableVanillaOresBlocks.TF_Sapphire_Cane)
      .add(GrowableVanillaOresBlocks.TF_Silver_Cane)
      .add(GrowableVanillaOresBlocks.TF_Sulfur_Cane)
      .add(GrowableVanillaOresBlocks.TF_Tin_Cane);

   }
}