package com.skniro.growableores.datagen;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.GrowableOresBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Item;
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
      .add(GrowableOresBlocks.Coal_Cane)
      .add(GrowableOresBlocks.Iron_Cane)
      .add(GrowableOresBlocks.Diamond_Cane)
      .add(GrowableOresBlocks.Copper_Cane)
      .add(GrowableOresBlocks.Emerald_Cane)
      .add(GrowableOresBlocks.Gold_Cane)
      .add(GrowableOresBlocks.Lapis_Cane)
      .add(GrowableOresBlocks.Nether_Quartz_Cane)
      .add(GrowableOresBlocks.Redstone_Cane)
      .add(GrowableOresBlocks.Blaze_Rod_Cane)
      .add(GrowableOresBlocks.Ender_Pearl_Cane)
      .add(GrowableOresBlocks.Netherite_Ingot_Cane)
      .add(GrowableOresBlocks.Clay_Cane)
      .add(GrowableOresBlocks.Glowstone_Cane)
      .add(GrowableOresBlocks.Slime_Cane)
      .add(GrowableOresBlocks.Bone_Cane)
      .add(GrowableOresBlocks.Nether_Star_Cane)

      //ae2
      .add(GrowableOresBlocks.certus_quartz_crystal_Cane)
      .add(GrowableOresBlocks.fluix_crystal_Cane)

      //Tech Reborn
      .add(GrowableOresBlocks.cinnabar_Cane)
      .add(GrowableOresBlocks.galena_Cane)
      .add(GrowableOresBlocks.iridium_Cane)
      .add(GrowableOresBlocks.lead_Cane)
      .add(GrowableOresBlocks.peridot_Cane)
      .add(GrowableOresBlocks.pyrite_Cane)
      .add(GrowableOresBlocks.ruby_Cane)
      .add(GrowableOresBlocks.sapphire_Cane)
      .add(GrowableOresBlocks.sheldonite_Cane)
      .add(GrowableOresBlocks.silver_Cane)
      .add(GrowableOresBlocks.sphalerite_Cane)
      .add(GrowableOresBlocks.tin_Cane)
      .add(GrowableOresBlocks.tungsten_Cane)
      .add(GrowableOresBlocks.sodalite_Cane)
      .add(GrowableOresBlocks.bauxite_Cane)


      //BetterEnd
      .add(GrowableOresBlocks.amber_Cane)
      .add(GrowableOresBlocks.ender_Cane)
      .add(GrowableOresBlocks.thallasium_Cane)

      //Maple
      .add(GrowableOresBlocks.Salt_Cane)

      //Powah Rearchitected and Powah
      .add(GrowableOresBlocks.Steel_Energized_Cane)
      .add(GrowableOresBlocks.Uraninite_Ore_Dense_Cane)
      .add(GrowableOresBlocks.Ender_Core_Cane)
      .add(GrowableOresBlocks.Crystal_Spirited_Cane)
      .add(GrowableOresBlocks.Crystal_Nitro_Cane)
      .add(GrowableOresBlocks.Crystal_Niotic_Cane)
      .add(GrowableOresBlocks.Crystal_Blazing_Cane)

      //Industrial Revolution
      .add(GrowableOresBlocks.IR_Lead_Cane)
      .add(GrowableOresBlocks.IR_nikolite_Cane )
      .add(GrowableOresBlocks.IR_silver_Cane)
      .add(GrowableOresBlocks.IR_tin_ore_Cane)
      .add(GrowableOresBlocks.IR_tungsten_Cane)

      //Modern Industrialization
      .add(GrowableOresBlocks.MI_antimony_Cane )
      .add(GrowableOresBlocks.MI_bauxite_Cane)
      .add(GrowableOresBlocks.MI_iridium_Cane)
      .add(GrowableOresBlocks.MI_lead_Cane)
      .add(GrowableOresBlocks.MI_lignite_coal_Cane)
      .add(GrowableOresBlocks.MI_monazite_Cane)
      .add(GrowableOresBlocks.MI_nickel_Cane)
      .add(GrowableOresBlocks.MI_platinum_Cane)
      .add(GrowableOresBlocks.MI_quartz_Cane)
      .add(GrowableOresBlocks.MI_salt_Cane)
      .add(GrowableOresBlocks.MI_tin_Cane)
      .add(GrowableOresBlocks.MI_titanium_Cane)
      .add(GrowableOresBlocks.MI_tungsten_Cane)
      .add(GrowableOresBlocks.MI_uranium_Cane)


      //Ad Astra!
      .add(GrowableOresBlocks.AD_Ostrum_Cane)
      .add(GrowableOresBlocks.AD_Ice_Shard_Cane)
      .add(GrowableOresBlocks.AD_Cheese_Cane)
      .add(GrowableOresBlocks.AD_Desh_Cane)
      .add(GrowableOresBlocks.AD_Calorite_Cane)

      //Create
      .add(GrowableOresBlocks.C_Andesite_Alloy_Cane)
      .add(GrowableOresBlocks.C_Brass_Ingot_Cane)
      .add(GrowableOresBlocks.C_Polished_Rose_Quartz_Cane)
      .add(GrowableOresBlocks.C_Zinc_Cane);

   }
}