package com.skniro.growableores.datagen;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.*;
import com.skniro.growableores.util.GrowableOresItemGroups;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class GrowableSimplifiedChineseLanguageProvider extends FabricLanguageProvider {
    public GrowableSimplifiedChineseLanguageProvider(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup){
        super(dataGenerator,"zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder){
        translationBuilder.add(GrowableVanillaOresBlocks.Coal_Cane,"煤矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Iron_Cane,"铁矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Diamond_Cane,"钻石矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Copper_Cane,"铜矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Emerald_Cane,"绿宝石矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Gold_Cane,"金矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Lapis_Cane,"青金石矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Nether_Quartz_Cane,"下界石英矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Redstone_Cane,"红石矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Blaze_Rod_Cane,"烈焰棒杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Ender_Pearl_Cane,"末影珍珠杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Netherite_Ingot_Cane,"下界合金杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Netherite_Scrap_Cane,"下界合金碎片杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Clay_Cane,"粘土杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Slime_Cane,"史莱姆球杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Bone_Cane,"骨头杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Nether_Star_Cane,"下界之星杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Glowstone_Cane,"萤石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Wool_Cane,"羊毛杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Egg_Cane,"鸡蛋杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Gunpowder_Cane,"火药杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Feather_Cane,"羽毛杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Leather_Cane,"皮革杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Oak_Log_Cane, "橡木原木杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Spruce_Log_Cane, "云杉原木杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Birch_Log_Cane, "白桦原木杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Jungle_Log_Cane, "丛林原木杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Acacia_Log_Cane, "金合欢原木杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Dark_Oak_Log_Cane, "深色橡木原木杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Mangrove_Log_Cane, "红树原木杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Bamboo_Block_Cane, "竹块杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Cherry_Log_Cane, "樱花原木杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Crimson_Stem_Cane, "绯红菌柄杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Warped_Stem_Cane, "诡异菌柄杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Pale_Oak_Log_Cane, "苍白橡木原木杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Amethyst_Shard_Cane, "紫水晶杆");

        // Copilot did translation. I am so sorry if its wrong.
        // Don't worry about translation. I will fix it. Thanks you make this mod better.


        //ae2
        translationBuilder.add(GrowableAEOresBlocks.certus_quartz_crystal_Cane,"赛特斯石英矿石杆(应用能源2)");
        translationBuilder.add(GrowableAEOresBlocks.fluix_crystal_Cane,"福鲁伊克斯矿石杆(应用能源2)");

        //Tech Reborn
        translationBuilder.add(GrowableTechRebornOresBlocks.cinnabar_Cane,"朱砂矿石杆(科技复兴)");
        translationBuilder.add(GrowableTechRebornOresBlocks.galena_Cane,"方铅矿石杆(科技复兴)");
        translationBuilder.add(GrowableTechRebornOresBlocks.iridium_Cane,"铱矿石杆(科技复兴)");
        translationBuilder.add(GrowableTechRebornOresBlocks.lead_Cane,"铅矿石杆(科技复兴)");
        translationBuilder.add(GrowableTechRebornOresBlocks.peridot_Cane,"翠绿橄榄石矿石杆(科技复兴)");
        translationBuilder.add(GrowableTechRebornOresBlocks.pyrite_Cane,"硫矿石杆(科技复兴)");
        translationBuilder.add(GrowableTechRebornOresBlocks.ruby_Cane,"红宝石矿石杆(科技复兴)");
        translationBuilder.add(GrowableTechRebornOresBlocks.sapphire_Cane,"蓝宝石矿石杆(科技复兴)");
        translationBuilder.add(GrowableTechRebornOresBlocks.sheldonite_Cane,"铂矿石杆(科技复兴)");
        translationBuilder.add(GrowableTechRebornOresBlocks.silver_Cane,"银矿石杆(科技复兴)");
        translationBuilder.add(GrowableTechRebornOresBlocks.sphalerite_Cane,"锌矿石杆(科技复兴)");
        translationBuilder.add(GrowableTechRebornOresBlocks.tin_Cane,"锡矿石杆(科技复兴)");
        translationBuilder.add(GrowableTechRebornOresBlocks.tungsten_Cane,"钨矿石杆(科技复兴)");
        translationBuilder.add(GrowableTechRebornOresBlocks.sodalite_Cane,"方钠石矿石杆(科技复兴)");
        translationBuilder.add(GrowableTechRebornOresBlocks.bauxite_Cane,"铝土矿石杆(科技复兴)");

        translationBuilder.add(GrowableOresItemGroups.Growable_Ores_Group,"可生长矿石");

        //BetterEnd
        translationBuilder.add(GrowableBetterEndOresBlocks.amber_Cane,"琥珀矿石杆(更好的末地)");
        translationBuilder.add(GrowableBetterEndOresBlocks.ender_Cane,"末影矿石杆(更好的末地)");
        translationBuilder.add(GrowableBetterEndOresBlocks.thallasium_Cane,"塔拉斯金矿石杆(更好的末地)");

        //Maple
        translationBuilder.add(GrowableMapleOresBlocks.Salt_Cane,"盐矿石杆(枫)");

        //Powah Rearchitected and Powah
        translationBuilder.add(GrowablePowahOresBlocks.Steel_Energized_Cane,"充能钢杆(Powah)");
        translationBuilder.add(GrowablePowahOresBlocks.Uraninite_Ore_Dense_Cane,"晶质铀杆(Powah)");
        translationBuilder.add(GrowablePowahOresBlocks.Ender_Core_Cane,"末影核心杆(Powah)");
        translationBuilder.add(GrowablePowahOresBlocks.Crystal_Spirited_Cane,"富生水晶杆(Powah)");
        translationBuilder.add(GrowablePowahOresBlocks.Crystal_Nitro_Cane,"下界水晶杆(Powah)");
        translationBuilder.add(GrowablePowahOresBlocks.Crystal_Niotic_Cane,"钻石水晶杆(Powah)");
        translationBuilder.add(GrowablePowahOresBlocks.Crystal_Blazing_Cane,"烈焰水晶杆(Powah)");

        //Industrial Revolution
        translationBuilder.add(GrowableIndustrialRevolutionOresBlocks.IR_Lead_Cane,"铅矿石杆(工业革命)");
        translationBuilder.add(GrowableIndustrialRevolutionOresBlocks.IR_nikolite_Cane ,"蓝石矿杆(工业革命)");
        translationBuilder.add(GrowableIndustrialRevolutionOresBlocks.IR_silver_Cane,"银矿石杆(工业革命)");
        translationBuilder.add(GrowableIndustrialRevolutionOresBlocks.IR_tin_ore_Cane,"锡矿石杆(工业革命)");
        translationBuilder.add(GrowableIndustrialRevolutionOresBlocks.IR_tungsten_Cane,"钨矿石杆(工业革命)");

        //Modern Industrialization
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_antimony_Cane , "锑矿石杆(现代工业化)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_bauxite_Cane, "铝土矿杆(现代工业化)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_iridium_Cane, "铱矿石杆(现代工业化)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_lead_Cane, "铅矿石杆(现代工业化)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_lignite_coal_Cane, "深层褐煤矿杆(现代工业化)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_monazite_Cane, "深层莫桑石矿杆(现代工业化)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_nickel_Cane, "镍矿石杆(现代工业化)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_platinum_Cane, "铂矿石杆(现代工业化)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_quartz_Cane, "石英矿石杆(现代工业化)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_salt_Cane, "盐矿石杆(现代工业化)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_tin_Cane, "锡矿石杆(现代工业化)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_titanium_Cane, "钛矿石杆(现代工业化)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_tungsten_Cane,"钨矿石杆(现代工业化)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_uranium_Cane, "铀矿石杆(现代工业化)");

        //ic2 and ic2c
        translationBuilder.add(GrowableICOresBlocks.IC2_Aluminium_Cane, "铝矿石杆(IC2 or IC2C)");
        translationBuilder.add(GrowableICOresBlocks.IC2_silver_Cane,"银矿石杆(IC2 or IC2C)");
        translationBuilder.add(GrowableICOresBlocks.IC2_Tin_Cane, "锡矿石杆(IC2 or IC2C)");
        translationBuilder.add(GrowableICOresBlocks.IC2_Uranium_Cane, "铀矿石杆(IC2 or IC2C)");

        //Ad Astra!
        translationBuilder.add(GrowableAdAstraOresBlocks.AD_Ostrum_Cane, "紫金矿石杆(Ad Astra!)");
        translationBuilder.add(GrowableAdAstraOresBlocks.AD_Ice_Shard_Cane, "冰晶矿石杆(Ad Astra!)");
        translationBuilder.add(GrowableAdAstraOresBlocks.AD_Cheese_Cane, "奶酪矿石杆(Ad Astra!)");
        translationBuilder.add(GrowableAdAstraOresBlocks.AD_Desh_Cane, "戴斯矿石杆(Ad Astra!)");
        translationBuilder.add(GrowableAdAstraOresBlocks.AD_Calorite_Cane, "耐热金属矿石杆(Ad Astra!)");

        //Create
        translationBuilder.add(GrowableCreateOresBlocks.C_Andesite_Alloy_Cane, "安山合金矿石杆(机械动力)");
        translationBuilder.add(GrowableCreateOresBlocks.C_Brass_Ingot_Cane, "黄铜矿石杆(机械动力)");
        translationBuilder.add(GrowableCreateOresBlocks.C_Polished_Rose_Quartz_Cane, "磨制玫瑰石英矿石杆(机械动力)");
        translationBuilder.add(GrowableCreateOresBlocks.C_Zinc_Cane, "锌矿石杆(机械动力)");

        //Thermal Series
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Apatite_Cane, "磷灰石矿石杆(热力系列)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Cinnabar_Cane, "朱砂矿石杆(热力系列)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Copper_Cane, "铜矿石杆(热力系列)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Lead_Cane, "铅矿石杆(热力系列)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Nickel_Cane, "镍矿石杆(热力系列)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Niter_Cane, "硝石矿石杆(热力系列)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Ruby_Cane, "红宝石矿石杆(热力系列)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Sapphire_Cane, "蓝宝石矿石杆(热力系列)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Silver_Cane, "银矿石杆(热力系列)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Sulfur_Cane, "硫矿石杆(热力系列)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Tin_Cane, "锡矿石杆(热力系列)");

        //Mekanism
        translationBuilder.add(GrowableMekanismOresBlocks.MEK_Fluorite_Cane, "氟石矿石杆(通用机械MEK)");
        translationBuilder.add(GrowableMekanismOresBlocks.MEK_Lead_Cane, "铅矿石杆(通用机械MEK)");
        translationBuilder.add(GrowableMekanismOresBlocks.MEK_Osmium_Cane, "锇矿石杆(通用机械MEK)");
        translationBuilder.add(GrowableMekanismOresBlocks.MEK_Tin_Cane, "锡矿石杆(通用机械MEK)");
        translationBuilder.add(GrowableMekanismOresBlocks.MEK_Uranium_Cane, "铀矿石杆(通用机械MEK)");
        translationBuilder.add(GrowableMekanismOresBlocks.MEK_Steel_Cane, "钢矿石杆(通用机械MEK)");
        translationBuilder.add(GrowableMekanismOresBlocks.MEK_Refined_Obsidian_Cane, "强化黑曜石矿石杆(通用机械MEK)");
        translationBuilder.add(GrowableMekanismOresBlocks.MEK_Refined_Glowstone_Cane, "强化荧石矿石杆(通用机械MEK)");
        translationBuilder.add(GrowableMekanismOresBlocks.MEK_Bronze_Cane, "青铜矿石杆(通用机械MEK)");

        //BetterNether
        translationBuilder.add(GrowableBetterNetherOresBlocks.BN_Cincinnasite_Cane, "辛辛那金矿石矿石杆(更好的下界)");
        translationBuilder.add(GrowableBetterNetherOresBlocks.BN_Nether_Ruby_Cane, "下界红宝石矿石杆(更好的下界)");

        //EnergizedPower
        translationBuilder.add(GrowableEnergizedPowerOresBlocks.EP_Advanced_Alloy_Cane, "高级合金矿石杆(EnergizedPower)");
        translationBuilder.add(GrowableEnergizedPowerOresBlocks.EP_Energized_Copper_Cane, "充能铜矿石杆(EnergizedPower)");
        translationBuilder.add(GrowableEnergizedPowerOresBlocks.EP_Energized_Gold_Cane, "充能金矿石杆(EnergizedPower)");
        translationBuilder.add(GrowableEnergizedPowerOresBlocks.EP_Redstone_Alloy_Cane, "红石合金矿石杆(EnergizedPower)");
        translationBuilder.add(GrowableEnergizedPowerOresBlocks.EP_Steel_Cane, "钢矿石杆(EnergizedPower)");
        translationBuilder.add(GrowableEnergizedPowerOresBlocks.EP_Tin_Cane, "锡矿石杆(EnergizedPower)");

        //Biomes O' Plenty
        translationBuilder.add(GrowableBiomesOPlentyOresBlocks.BOP_Rose_Quartz_Chunk_Cane, "玫瑰石英矿石杆(超多生物群系)");



        //龙之进化
        translationBuilder.add(GrowableDraconicEvolutionOresBlocks.DE_Awakened_Draconium_Ingot_Cane, "觉醒龙矿石杆(龙之进化)");
        translationBuilder.add(GrowableDraconicEvolutionOresBlocks.DE_Draconium_Ingot_Cane, "龙矿石杆(龙之进化)");



        //Extreme Reactors
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Anglesite_Crystal_Cane, "硫酸铅晶体矿石杆(Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Benitoite_Crystal_Cane, "蓝锥晶体矿石杆(Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Blutonium_Ingot_Cane, "蓝钚矿石杆(Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Cyanite_Ingot_Cane, "蓝晶矿石杆(Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Graphite_Ingot_Cane, "石墨棒矿石杆(Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Inanite_Ingot_Cane, "虚无锭矿石杆 (Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Insanite_Ingot_Cane, "疯狂锭矿石杆 (Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Ludicrite_Ingot_Cane, "奇异锭矿石杆 (Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Magentite_Ingot_Cane, "磁晶矿锭矿石杆 (Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Ridiculite_Ingot_Cane, "荒谬锭矿石杆 (Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Yellorium_Ingot_Cane, "黄铀矿石杆(Extreme Reactors)");



        //Galosphere
        translationBuilder.add(GrowableGalosphereOresBlocks.Galo_Allurite_Shard_Cane, "幽蓝晶矿石杆(Galosphere)");
        translationBuilder.add(GrowableGalosphereOresBlocks.Galo_Lumiere_Shard_Cane, "荧黄晶矿石杆(Galosphere)");
        translationBuilder.add(GrowableGalosphereOresBlocks.Galo_Silver_Ingot_Cane, "银矿石杆(Galosphere)");



        //Gobber2
        translationBuilder.add(GrowableGobberOresBlocks.Gobber_Gobber_Ingot_Cane, "戈伯矿石杆(Gobber2)");
        translationBuilder.add(GrowableGobberOresBlocks.Gobber_End_Gobber_Ingot_Cane, "末影戈伯矿石杆(Gobber2)");
        translationBuilder.add(GrowableGobberOresBlocks.Gobber_Nether_Gobber_Ingot_Cane, "地狱戈伯矿石杆(Gobber2)");



        //GregTechCEu Modern
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Aluminium_Ingot_Cane, "铝矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Americium_Ingot_Cane, "镅矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Annealed_Copper_Ingot_Cane, "退火铜矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Antimony_Ingot_Cane, "锑矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Battery_Alloy_Ingot_Cane, "电池合金矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Beryllium_Ingot_Cane, "铍矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Bismuth_Bronze_Ingot_Cane, "铋青铜矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Bismuth_Ingot_Cane, "铋矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Black_Bronze_Ingot_Cane, "黑青铜矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Brass_Ingot_Cane, "黄铜矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Bronze_Ingot_Cane, "铜矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Chromium_Ingot_Cane, "铬矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Cobalt_Ingot_Cane, "钴矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Cupronickel_Ingot_Cane, "白铜矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Darmstadtium_Ingot_Cane, "鐽矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Duranium_Ingot_Cane, "铿铀矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Electrum_Ingot_Cane, "琥珀金矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Enriched_Naquadah_Trinium_Europium_Duranide_Ingot_Cane, "富集硅岩凯金铕铿铀合金矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Epoxy_Ingot_Cane, "环氧树脂条矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Europium_Ingot_Cane, "铕矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Amethyst_Cane, "精致的紫水晶杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Apatite_Cane, "精致的磷灰石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Certus_Quartz_Cane, "精致的赛特斯石英杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Coke_Cane, "精致的焦煤杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Glass_Cane, "精致的玻璃杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Grossular_Cane, "精致的钙铝榴石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Lapis_Cane, "精致的青金石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Lazurite_Cane, "精致的蓝金石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Malachite_Cane, "精致的孔雀石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Monazite_Cane, "精致的独居石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Nether_Quartz_Cane, "精致的下界石英杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Olivine_Cane, "精致的橄榄石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Opal_Cane, "精致的猫眼石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Pyrope_Cane, "精致的镁铝榴石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Quartzite_Cane, "精致的石英岩杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Realgar_Cane, "精致的雄黄杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Red_Garnet_Cane, "精致的红石榴石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Rock_Salt_Cane, "精致的红石榴石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Ruby_Cane, "精致的红宝石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Rutile_Cane, "精致的金红石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Salt_Cane, "精致的盐杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Sapphire_Cane, "精致的蓝宝石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Sodalite_Cane, "S精致的方钠石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Spessartine_Cane, "精致的锰铝榴石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Uvarovite_Cane, "精致的钙铬榴石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Yellow_Garnet_Cane, "精致的黄石榴石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Almandine_Cane, "精致的铁铝榴石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Andradite_Cane, "精致的钙铁榴石矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Blue_Topaz_Cane, "精致的蓝黄玉矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Cinnabar_Cane, "精致的朱砂矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Coal_Cane, "精致的煤炭杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Diamond_Cane, "精致的钻石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Emerald_Cane, "精致的绿宝石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Green_Sapphire_Cane, "精致的绿色蓝宝石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Gallium_Arsenide_Ingot_Cane, "砷化镓矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Gallium_Ingot_Cane, "镓矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Graphene_Ingot_Cane, "石墨烯矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Indium_Gallium_Phosphide_Ingot_Cane, "磷化铟镓矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Indium_Ingot_Cane, "铟矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Indium_Tin_Barium_Titanium_Cuprate_Ingot_Cane, "铟锡钡钛铜氧合金石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Iridium_Ingot_Cane, "铱矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Lead_Ingot_Cane, "铅矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Magnalium_Ingot_Cane, "镁铝合金矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Magnesium_Diboride_Ingot_Cane, "二硼化镁矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Magnetic_Iron_Ingot_Cane, "磁化铁矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Magnetic_Neodymium_Ingot_Cane, "磁化钕矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Magnetic_Samarium_Ingot_Cane, "磁化钐矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Manganese_Ingot_Cane, "锰矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Manganese_Phosphide_Ingot_Cane, "磷化锰矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Mercury_Barium_Calcium_Cuprate_Ingot_Cane, "汞钡钙铜氧化物矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Molybdenum_Ingot_Cane, "钼矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Naquadah_Ingot_Cane, "硅岩矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Naquadria_Ingot_Cane, "超能硅岩矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Neodymium_Ingot_Cane, "钕矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Neutronium_Ingot_Cane, "中子素矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Nichrome_Ingot_Cane, "镍铬合金矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Nickel_Ingot_Cane, "镍矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Nickel_Zinc_Ferrite_Ingot_Cane, "镍锌铁氧体矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Niobium_Ingot_Cane, "铌矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Niobium_Nitride_Ingot_Cane, "氮化铌矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Niobium_Titanium_Ingot_Cane, "铌钛合金矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Osmiridium_Ingot_Cane, "铱锇合金矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Osmium_Ingot_Cane, "锇矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Palladium_Ingot_Cane, "钯矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Platinum_Ingot_Cane, "铂矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Plutonium_241_Ingot_Cane, "钚-241矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Plutonium_Ingot_Cane, "钚矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Polybenzimidazole_Ingot_Cane, "聚苯并咪唑条矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Polycaprolactam_Ingot_Cane, "聚己内酰胺条矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Polyethylene_Ingot_Cane, "聚乙烯条矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Polyphenylene_Sulfide_Ingot_Cane, "聚苯硫醚条矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Polytetrafluoroethylene_Ingot_Cane, "聚四氟乙烯矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Polyvinyl_Chloride_Ingot_Cane, "聚氯乙烯条矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Raw_Rubber_Ingot_Cane, "生橡胶条矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Reinforced_Epoxy_Resin_Ingot_Cane, "增强环氧树脂片条矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Rhodium_Ingot_Cane, "铑矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Riched_Naquadah_Ingot_Cane, "富集硅岩矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Rose_Gold_Ingot_Cane, "玫瑰金矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Rubber_Ingot_Cane, "橡胶条矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Ruridit_Ingot_Cane, "钌铱合金矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Ruthenium_Ingot_Cane, "钌矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Ruthenium_Trinium_Americium_Neutronate_Ingot_Cane, "钌凯金镅中子素氧化物矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Samarium_Ingot_Cane, "钐矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Samarium_Iron_Arsenic_Oxide_Ingot_Cane, "钐铁砷氧化物矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Silicon_Ingot_Cane, "硅矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Silicone_Rubber_Ingot_Cane, "硅橡胶条矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Silver_Ingot_Cane, "银矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Soldering_Alloy_Ingot_Cane, "焊锡矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Stainless_Steel_Ingot_Cane, "不锈钢矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Steel_Ingot_Cane, "钢矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Sterling_Silver_Ingot_Cane, "标准纯银矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Styrene_Butadiene_Rubber_Ingot_Cane, "丁苯橡胶条矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Tantalum_Ingot_Cane, "钽矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Thorium_Ingot_Cane, "钍矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Tin_Alloy_Ingot_Cane, "锡铁合金矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Tin_Ingot_Cane, "锡矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Titanium_Ingot_Cane, "钛矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Trinium_Ingot_Cane, "凯金 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Tritanium_Ingot_Cane, "三钛矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Tungsten_Carbide_Ingot_Cane, "碳化钨矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Tungsten_Ingot_Cane, "钨矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Ultimet_Ingot_Cane, "哈氏合金矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_235_Ingot_Cane, "铀-235矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_Ingot_Cane, "铀矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_Rhodium_Dinaquadide_Ingot_Cane, "铀铑硅岩合金矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_Triplatinum_Ingot_Cane, "三铂化铀矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Vanadium_Gallium_Ingot_Cane, "钒镓合金矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Vanadium_Ingot_Cane, "钒矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Wrought_Iron_Ingot_Cane, "锻铁矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Yttrium_Barium_Cuprate_Ingot_Cane, "钇钡铜氧化物矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Yttrium_Ingot_Cane, "钇矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Zinc_Ingot_Cane, "锌矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Invar_Ingot_Cane, "殷钢矿石杆(GregTechCEu Modern)");

        //ManaandArtifice
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Animus_Dust_Cane, "赋灵粉 矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Arcane_Ash_Cane, "奥术粉末矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Bone_Ash_Cane, "骨灰矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Ironbark_Cane, "铁树皮矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Living_Flame_Cane, "活火矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Mote_Air_Cane, "气涌微核矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Mote_Arcane_Cane, "魔法微核矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Mote_Earth_Cane, "大地微核矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Mote_Ender_Cane, "末影微核矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Mote_Fire_Cane, "火炎微核矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Mote_Water_Cane, "流水微核矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Purified_Vinteum_Dust_Cane, "纯净温特姆粉末矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Purified_Vinteum_Ingot_Cane, "纯净温特姆锭矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Resonating_Dust_Cane, "共振之尘矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Superheated_Purified_Vinteum_Ingot_Cane, "超热纯净温特姆锭矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Superheated_Vinteum_Ingot_Cane, "超热温特姆锭矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Vinteum_Dust_Cane, "温特姆粉末矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Vinteum_Ingot_Cane, "温特姆锭矿石杆(魔法艺术3)");



        //Mystical Agradditions
        translationBuilder.add(GrowableMysticalAgradditionsBlocks.MAA_Awakened_Draconium_Essence_Cane, "觉醒龙精华矿石杆(Mystical Agradditions)");
        translationBuilder.add(GrowableMysticalAgradditionsBlocks.MAA_Dragon_Egg_Essence_Cane, "龙精华矿石杆(Mystical Agradditions)");
        translationBuilder.add(GrowableMysticalAgradditionsBlocks.MAA_Insanium_Essence_Cane, "究极精华矿石杆(Mystical Agradditions)");
        translationBuilder.add(GrowableMysticalAgradditionsBlocks.MAA_Insanium_Ingot_Cane, "究极精华锭矿石杆(Mystical Agradditions)");
        translationBuilder.add(GrowableMysticalAgradditionsBlocks.MAA_Nether_Star_Essence_Cane, "下界之星精华矿石杆(Mystical Agradditions)");
        translationBuilder.add(GrowableMysticalAgradditionsBlocks.MAA_Neutronium_Essence_Cane, "中子素精华矿石杆(Mystical Agradditions)");
        translationBuilder.add(GrowableMysticalAgradditionsBlocks.MAA_Nitro_Crystal_Essence_Cane, "下界水晶精华矿石杆(Mystical Agradditions)");


        //Mystical Agriculture
        translationBuilder.add(GrowableMysticalAgricultureBlocks.MAC_Imperium_Ingot_Cane, "高级精华锭矿石杆(Mystical Agriculture)");
        translationBuilder.add(GrowableMysticalAgricultureBlocks.MAC_Inferium_Ingot_Cane, "下级精华锭矿石杆(Mystical Agriculture)");
        translationBuilder.add(GrowableMysticalAgricultureBlocks.MAC_Prosperity_Ingot_Cane, "活化水晶锭 矿石杆(Mystical Agriculture)");
        translationBuilder.add(GrowableMysticalAgricultureBlocks.MAC_Prudentium_Ingot_Cane, "初级精华锭矿石杆(Mystical Agriculture)");
        translationBuilder.add(GrowableMysticalAgricultureBlocks.MAC_Soulium_Ingot_Cane, "离魂锭矿石杆(Mystical Agriculture)");
        translationBuilder.add(GrowableMysticalAgricultureBlocks.MAC_Supremium_Ingot_Cane, "终极精华锭矿石杆(Mystical Agriculture)");
        translationBuilder.add(GrowableMysticalAgricultureBlocks.MAC_Tertium_Ingot_Cane, "中级精华锭矿石杆(Mystical Agriculture)");


        //Railcraft
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Brass_Ingot_Cane, "黄铜矿石杆 (Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Bronze_Ingot_Cane, "青铜矿石杆 (Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Charcoal_Dust_Cane, "木炭粉矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Coal_Dust_Cane, "煤炭粉矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Ender_Dust_Cane, "末影珍珠粉矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Invar_Ingot_Cane, "殷钢矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Lead_Ingot_Cane, "铅锭矿石杆 (Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Nickel_Ingot_Cane, "镍锭矿石杆 (Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Obsidian_Dust_Cane, "黑曜石粉矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Saltpeter_Dust_Cane, "硝石矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Silver_Ingot_Cane, "银矿石杆 (Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Steel_Ingot_Cane, "钢矿石杆 (Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Sulfur_Dust_Cane, "硫矿石杆 (Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Tin_Ingot_Cane, "锡矿石杆 (Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Zinc_Ingot_Cane, "锌矿石杆 (Railcraft)");



        //RFTools
        translationBuilder.add(GrowableRFToolsOresBlocks.RFT_Dimensional_Shard_Cane, "空间碎片矿石杆(RFTools)");



        //Tinkers' Construct
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Amethyst_Bronze_Ingot_Cane, "琥珀金矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Blazing_Bone_Cane, "烈焰之骨矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Cheese_Ingot_Cane, "奶酪矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Cobalt_Ingot_Cane, "钴矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Ender_Slime_Crystal_Cane, "末影黏液水晶矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Hepatizon_Ingot_Cane, "黑色科林斯青铜矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Ichor_Slime_Crystal_Cane, "灵浆水晶矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Knightslime_Ingot_Cane, "骑士史莱姆矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Manyullyn_Ingot_Cane, "玛玉灵矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Modifier_Crystal_Cane, "强化水晶矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Necronium_Bone_Cane, "辐射之骨矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Necrotic_Bone_Cane, "噬生之骨矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Queens_Slime_Ingot_Cane, "皇后史莱姆矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Rose_Gold_Ingot_Cane, "玫瑰金锭矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Sky_Slime_Crystal_Cane, "碧空黏液水晶 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Slimesteel_Ingot_Cane, "黏钢矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Soulsteel_Ingot_Cane, "魂钢矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Earth_Slime_Crystal_Cane, "大地黏液水晶(Tinkers' Construct)");
    }
}
