package com.skniro.growableores.datagen;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.GrowableOresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.SugarCaneBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TextureMap;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;

public class GrowableModelProvider extends FabricModelProvider {
    public GrowableModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Village
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Iron_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Coal_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Diamond_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Lapis_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Redstone_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Nether_Quartz_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Copper_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Emerald_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Gold_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Blaze_Rod_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Ender_Pearl_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Netherite_Ingot_Cane, BlockStateModelGenerator.TintType.TINTED);
        //AE2
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.certus_quartz_crystal_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Tech Reborn
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.cinnabar_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.galena_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.iridium_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.lead_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.peridot_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.pyrite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.ruby_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.sapphire_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.sheldonite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.silver_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.sphalerite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.tin_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.tungsten_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.sodalite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.bauxite_Cane, BlockStateModelGenerator.TintType.TINTED);

        //BetterEnd
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.amber_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.ender_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.thallasium_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Maple
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Salt_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Powah Rearchitected and Powah
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Steel_Energized_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Uraninite_Ore_Dense_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Ender_Core_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Crystal_Spirited_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Crystal_Nitro_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Crystal_Niotic_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.Crystal_Blazing_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Industrial Revolution
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.IR_Lead_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.IR_nikolite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.IR_silver_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.IR_tin_ore_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.IR_tungsten_Cane, BlockStateModelGenerator.TintType.TINTED);

        //Modern Industrialization
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.MI_antimony_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.MI_bauxite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.MI_iridium_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.MI_lead_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.MI_lignite_coal_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.MI_monazite_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.MI_nickel_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.MI_platinum_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.MI_quartz_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.MI_salt_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.MI_tin_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.MI_titanium_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.MI_tungsten_Cane, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(GrowableOresBlocks.MI_uranium_Cane, BlockStateModelGenerator.TintType.TINTED);
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
