package com.skniro.growableores.client;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.GrowableOresBlocks;
import com.skniro.growableores.item.ModCreativeModeTabs;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SugarCaneBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = GrowableOres.MODID,bus = Mod.EventBusSubscriber.Bus.MOD ,value = Dist.CLIENT)
public class GrowableOresClient {
    @SubscribeEvent
    public static void onInitializeClient(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Coal_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Iron_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Diamond_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Copper_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Emerald_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Gold_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Lapis_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Nether_Quartz_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Redstone_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Blaze_Rod_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Ender_Pearl_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Clay_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Slime_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Nether_Star_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Glowstone_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Bone_Cane.get(), RenderType.cutout());

        //ae2
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.fluix_crystal_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.certus_quartz_crystal_Cane.get(), RenderType.cutout());
        //Create
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.C_Andesite_Alloy_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.C_Brass_Ingot_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.C_Polished_Rose_Quartz_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.C_Zinc_Cane.get(), RenderType.cutout());

        //Thermal Series
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Apatite_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Cinnabar_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Copper_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Lead_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Nickel_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Niter_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Ruby_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Sapphire_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Silver_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Sulfur_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.TF_Tin_Cane.get(), RenderType.cutout());
        //BetterEnd
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.amber_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.ender_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.thallasium_Cane.get(), RenderType.cutout());

        //Ad Astra!
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.AD_Ostrum_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.AD_Ice_Shard_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.AD_Cheese_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.AD_Desh_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.AD_Calorite_Cane.get(), RenderType.cutout());

        //ic2 and ic2c
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks. IC2_Aluminium_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks. IC2_silver_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks. IC2_Tin_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks. IC2_Uranium_Cane.get(), RenderType.cutout());


        //Powah Rearchitected and Powah
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Steel_Energized_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Uraninite_Ore_Dense_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Ender_Core_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Crystal_Spirited_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Crystal_Nitro_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Crystal_Niotic_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.Crystal_Blazing_Cane.get(), RenderType.cutout());

        //BetterNether
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.MEK_Fluorite_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.MEK_Bronze_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.MEK_Lead_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.MEK_Osmium_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.MEK_Steel_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.MEK_Uranium_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.MEK_Tin_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.MEK_Refined_Glowstone_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.MEK_Refined_Obsidian_Cane.get(), RenderType.cutout());

        //EnergizedPower
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.EP_Advanced_Alloy_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.EP_Energized_Copper_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.EP_Energized_Gold_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.EP_Redstone_Alloy_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.EP_Steel_Cane.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GrowableOresBlocks.EP_Tin_Cane.get(), RenderType.cutout());
    }
}
