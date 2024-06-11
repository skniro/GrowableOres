package com.skniro.growableores.datagen;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.*;
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
              .add(GrowableTechRebornOresBlocks.cinnabar_Cane)
              .add(GrowableTechRebornOresBlocks.galena_Cane)
              .add(GrowableTechRebornOresBlocks.iridium_Cane)
              .add(GrowableTechRebornOresBlocks.lead_Cane)
              .add(GrowableTechRebornOresBlocks.peridot_Cane)
              .add(GrowableTechRebornOresBlocks.pyrite_Cane)
              .add(GrowableTechRebornOresBlocks.ruby_Cane)
              .add(GrowableTechRebornOresBlocks.sapphire_Cane)
              .add(GrowableTechRebornOresBlocks.sheldonite_Cane)
              .add(GrowableTechRebornOresBlocks.silver_Cane)
              .add(GrowableTechRebornOresBlocks.sphalerite_Cane)
              .add(GrowableTechRebornOresBlocks.tin_Cane)
              .add(GrowableTechRebornOresBlocks.tungsten_Cane)
              .add(GrowableTechRebornOresBlocks.sodalite_Cane)
              .add(GrowableTechRebornOresBlocks.bauxite_Cane)


              //BetterEnd
              .add(GrowableBetterEndOresBlocks.amber_Cane)
              .add(GrowableBetterEndOresBlocks.ender_Cane)
              .add(GrowableBetterEndOresBlocks.thallasium_Cane)

              //Maple
              .add(GrowableMapleOresBlocks.Salt_Cane)

              //Powah Rearchitected and Powah
              .add(GrowablePowahOresBlocks.Steel_Energized_Cane)
              .add(GrowablePowahOresBlocks.Uraninite_Ore_Dense_Cane)
              .add(GrowablePowahOresBlocks.Ender_Core_Cane)
              .add(GrowablePowahOresBlocks.Crystal_Spirited_Cane)
              .add(GrowablePowahOresBlocks.Crystal_Nitro_Cane)
              .add(GrowablePowahOresBlocks.Crystal_Niotic_Cane)
              .add(GrowablePowahOresBlocks.Crystal_Blazing_Cane)

              //Industrial Revolution
              .add(GrowableIndustrialRevolutionOresBlocks.IR_Lead_Cane)
              .add(GrowableIndustrialRevolutionOresBlocks.IR_nikolite_Cane )
              .add(GrowableIndustrialRevolutionOresBlocks.IR_silver_Cane)
              .add(GrowableIndustrialRevolutionOresBlocks.IR_tin_ore_Cane)
              .add(GrowableIndustrialRevolutionOresBlocks.IR_tungsten_Cane)

              //Modern Industrialization
              .add(GrowableModernIndustrializationOresBlocks.MI_antimony_Cane )
              .add(GrowableModernIndustrializationOresBlocks.MI_bauxite_Cane)
              .add(GrowableModernIndustrializationOresBlocks.MI_iridium_Cane)
              .add(GrowableModernIndustrializationOresBlocks.MI_lead_Cane)
              .add(GrowableModernIndustrializationOresBlocks.MI_lignite_coal_Cane)
              .add(GrowableModernIndustrializationOresBlocks.MI_monazite_Cane)
              .add(GrowableModernIndustrializationOresBlocks.MI_nickel_Cane)
              .add(GrowableModernIndustrializationOresBlocks.MI_platinum_Cane)
              .add(GrowableModernIndustrializationOresBlocks.MI_quartz_Cane)
              .add(GrowableModernIndustrializationOresBlocks.MI_salt_Cane)
              .add(GrowableModernIndustrializationOresBlocks.MI_tin_Cane)
              .add(GrowableModernIndustrializationOresBlocks.MI_titanium_Cane)
              .add(GrowableModernIndustrializationOresBlocks.MI_tungsten_Cane)
              .add(GrowableModernIndustrializationOresBlocks.MI_uranium_Cane)

              //ic2 and ic2c
              .add(GrowableICOresBlocks.IC2_Aluminium_Cane)
              .add(GrowableICOresBlocks.IC2_silver_Cane)
              .add(GrowableICOresBlocks.IC2_Tin_Cane)
              .add(GrowableICOresBlocks.IC2_Uranium_Cane)

              //Ad Astra!
              .add(GrowableAdAstraOresBlocks.AD_Ostrum_Cane)
              .add(GrowableAdAstraOresBlocks.AD_Ice_Shard_Cane)
              .add(GrowableAdAstraOresBlocks.AD_Cheese_Cane)
              .add(GrowableAdAstraOresBlocks.AD_Desh_Cane)
              .add(GrowableAdAstraOresBlocks.AD_Calorite_Cane)

              //Create
              .add(GrowableCreateOresBlocks.C_Andesite_Alloy_Cane)
              .add(GrowableCreateOresBlocks.C_Brass_Ingot_Cane)
              .add(GrowableCreateOresBlocks.C_Polished_Rose_Quartz_Cane)
              .add(GrowableCreateOresBlocks.C_Zinc_Cane)

              //Thermal Series
              .add(GrowableThermalSeriesOresBlocks.TF_Apatite_Cane)
              .add(GrowableThermalSeriesOresBlocks.TF_Cinnabar_Cane)
              .add(GrowableThermalSeriesOresBlocks.TF_Copper_Cane)
              .add(GrowableThermalSeriesOresBlocks.TF_Lead_Cane)
              .add(GrowableThermalSeriesOresBlocks.TF_Nickel_Cane)
              .add(GrowableThermalSeriesOresBlocks.TF_Niter_Cane)
              .add(GrowableThermalSeriesOresBlocks.TF_Ruby_Cane)
              .add(GrowableThermalSeriesOresBlocks.TF_Sapphire_Cane)
              .add(GrowableThermalSeriesOresBlocks.TF_Silver_Cane)
              .add(GrowableThermalSeriesOresBlocks.TF_Sulfur_Cane)
              .add(GrowableThermalSeriesOresBlocks.TF_Tin_Cane);

   }
}