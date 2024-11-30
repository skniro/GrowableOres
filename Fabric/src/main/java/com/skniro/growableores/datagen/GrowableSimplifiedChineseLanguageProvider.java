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
        translationBuilder.add(GrowableVanillaOresBlocks.Clay_Cane,"粘土杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Slime_Cane,"史莱姆球杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Bone_Cane,"骨头杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Nether_Star_Cane,"下界之星杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Glowstone_Cane,"萤石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Wool_Cane,"羊毛杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Egg_Cane,"鸡蛋杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Feather_Cane,"羽毛杆");

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
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Anglesite_Crystal_Cane, "Anglesite Crystal 矿石杆(Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Benitoite_Crystal_Cane, "Benitoite Crystal 矿石杆(Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Blutonium_Ingot_Cane, "Blutonium Ingot 矿石杆(Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Cyanite_Ingot_Cane, "Cyanite Ingot 矿石杆(Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Graphite_Ingot_Cane, "Graphite Ingot 矿石杆(Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Inanite_Ingot_Cane, "Inanite Ingot 矿石杆(Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Insanite_Ingot_Cane, "Insanite Ingot 矿石杆(Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Ludicrite_Ingot_Cane, "Ludicrite Ingot 矿石杆(Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Magentite_Ingot_Cane, "Magentite Ingot 矿石杆(Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Ridiculite_Ingot_Cane, "Ridiculite Ingot 矿石杆(Extreme Reactors)");
        translationBuilder.add(GrowableExtremeReactorsOresBlocks.ER_Yellorium_Ingot_Cane, "黄铀矿石杆(Extreme Reactors)");



        //Galosphere
        translationBuilder.add(GrowableGalosphereOresBlocks.Galo_Allurite_Shard_Cane, "Allurite Shard 矿石杆(Galosphere)");
        translationBuilder.add(GrowableGalosphereOresBlocks.Galo_Lumiere_Shard_Cane, "Lumiere Shard 矿石杆(Galosphere)");
        translationBuilder.add(GrowableGalosphereOresBlocks.Galo_Silver_Ingot_Cane, "Silver Ingot 矿石杆(Galosphere)");



        //Gobber2
        translationBuilder.add(GrowableGobberOresBlocks.Gobber_Gobber_Ingot_Cane, "Gobber Ingot 矿石杆(Gobber2)");
        translationBuilder.add(GrowableGobberOresBlocks.Gobber_End_Gobber_Ingot_Cane, "End Gobber Ingot 矿石杆(Gobber2)");
        translationBuilder.add(GrowableGobberOresBlocks.Gobber_Nether_Gobber_Ingot_Cane, "Nether Gobber Ingot 矿石杆(Gobber2)");



        //GregTechCEu Modern
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Aluminium_Ingot_Cane, "Aluminium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Americium_Ingot_Cane, "Americium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Annealed_Copper_Ingot_Cane, "Annealed Copper Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Antimony_Ingot_Cane, "Antimony Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Battery_Alloy_Ingot_Cane, "Battery Alloy Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Beryllium_Ingot_Cane, "Beryllium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Bismuth_Bronze_Ingot_Cane, "Bismuth Bronze Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Bismuth_Ingot_Cane, "Bismuth Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Black_Bronze_Ingot_Cane, "Black Bronze Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Brass_Ingot_Cane, "Brass Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Bronze_Ingot_Cane, "Bronze Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Chromium_Ingot_Cane, "Chromium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Cobalt_Ingot_Cane, "Cobalt Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Cupronickel_Ingot_Cane, "Cupronickel Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Darmstadtium_Ingot_Cane, "Darmstadtium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Duranium_Ingot_Cane, "Duranium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Electrum_Ingot_Cane, "Electrum Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Enriched_Naquadah_Trinium_Europium_Duranide_Ingot_Cane, "Enriched Naquadah Trinium Europium Duranide Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Epoxy_Ingot_Cane, "Epoxy Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Europium_Ingot_Cane, "Europium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Amethyst_Cane, "Amethyst Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Apatite_Cane, "Apatite Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Certus_Quartz_Cane, "Certus Quartz Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Coke_Cane, "Coke Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Glass_Cane, "Glass Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Grossular_Cane, "Grossular Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Lapis_Cane, "Lapis Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Lazurite_Cane, "Lazurite Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Malachite_Cane, "Malachite Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Monazite_Cane, "Monazite Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Nether_Quartz_Cane, "Nether Quartz Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Olivine_Cane, "Olivine Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Opal_Cane, "Opal Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Pyrope_Cane, "Pyrope Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Quartzite_Cane, "Quartzite Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Realgar_Cane, "Realgar Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Red_Garnet_Cane, "Red Garnet Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Rock_Salt_Cane, "Rock Salt Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Ruby_Cane, "Ruby_ Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Rutile_Cane, "Rutile Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Salt_Cane, "Salt Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Sapphire_Cane, "Sapphire Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Sodalite_Cane, "Sodalite Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Spessartine_Cane, "Spessartine Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Uvarovite_Cane, "Uvarovite Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Yellow_Garnet_Cane, "Yellow Garnet Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Almandine_Cane, "Almandine Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Andradite_Cane, "Andradite Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Blue_Topaz_Cane, "Blue Topaz Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Cinnabar_Cane, "Cinnabar Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Coal_Cane, "Coal Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Diamond_Cane, "Diamond Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Emerald_Cane, "Emerald Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Exquisite_Green_Sapphire_Cane, "Green Sapphire Exquisite Gem 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Gallium_Arsenide_Ingot_Cane, "Gallium Arsenide Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Gallium_Ingot_Cane, "Gallium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Graphene_Ingot_Cane, "Graphene Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Indium_Gallium_Phosphide_Ingot_Cane, "Indium Gallium Phosphide Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Indium_Ingot_Cane, "Indium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Indium_Tin_Barium_Titanium_Cuprate_Ingot_Cane, "Indium Tin Barium Titanium Cuprate Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Iridium_Ingot_Cane, "Iridium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Lead_Ingot_Cane, "Lead Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Magnalium_Ingot_Cane, "Magnalium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Magnesium_Diboride_Ingot_Cane, "Magnesium Diboride Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Magnetic_Iron_Ingot_Cane, "Magnetic Iron Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Magnetic_Neodymium_Ingot_Cane, "Magnetic Neodymium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Magnetic_Samarium_Ingot_Cane, "Magnetic Samarium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Manganese_Ingot_Cane, "Manganese Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Manganese_Phosphide_Ingot_Cane, "Manganese Phosphide Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Mercury_Barium_Calcium_Cuprate_Ingot_Cane, "Mercury Barium Calcium Cuprate Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Molybdenum_Ingot_Cane, "Molybdenum Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Naquadah_Ingot_Cane, "Naquadah Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Naquadria_Ingot_Cane, "Naquadria Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Neodymium_Ingot_Cane, "Neodymium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Neutronium_Ingot_Cane, "Neutronium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Nichrome_Ingot_Cane, "Nichrome Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Nickel_Ingot_Cane, "Nickel Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Nickel_Zinc_Ferrite_Ingot_Cane, "Nickel Zinc Ferrite Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Niobium_Ingot_Cane, "Niobium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Niobium_Nitride_Ingot_Cane, "Niobium Nitride Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Niobium_Titanium_Ingot_Cane, "Niobium Titanium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Osmiridium_Ingot_Cane, "Osmiridium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Osmium_Ingot_Cane, "Osmium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Palladium_Ingot_Cane, "Palladium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Platinum_Ingot_Cane, "Platinum Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Plutonium_241_Ingot_Cane, "Plutonium 241 Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Plutonium_Ingot_Cane, "Plutonium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Polybenzimidazole_Ingot_Cane, "Polybenzimidazole Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Polycaprolactam_Ingot_Cane, "Polycaprolactam Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Polyethylene_Ingot_Cane, "EPolyethylene Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Polyphenylene_Sulfide_Ingot_Cane, "Polyphenylene Sulfide Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Polytetrafluoroethylene_Ingot_Cane, "Polytetrafluoroethylene Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Polyvinyl_Chloride_Ingot_Cane, "Polyvinyl Chloride Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Raw_Rubber_Ingot_Cane, "Raw Rubber Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Reinforced_Epoxy_Resin_Ingot_Cane, "Reinforced Epoxy Resin Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Rhodium_Ingot_Cane, "Rhodium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Riched_Naquadah_Ingot_Cane, "Riched Naquadah Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Rose_Gold_Ingot_Cane, "Rose Gold Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Rubber_Ingot_Cane, "Rubber Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Ruridit_Ingot_Cane, "Ruridit Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Ruthenium_Ingot_Cane, "Ruthenium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Ruthenium_Trinium_Americium_Neutronate_Ingot_Cane, "Ruthenium Trinium Americium Neutronate Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Samarium_Ingot_Cane, "Samarium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Samarium_Iron_Arsenic_Oxide_Ingot_Cane, "Samarium Iron Arsenic Oxide Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Silicon_Ingot_Cane, "Silicon Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Silicone_Rubber_Ingot_Cane, "Silicone Rubber Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Silver_Ingot_Cane, "Silver Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Soldering_Alloy_Ingot_Cane, "Soldering Alloy Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Stainless_Steel_Ingot_Cane, "Stainless Steel Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Steel_Ingot_Cane, "Steel Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Sterling_Silver_Ingot_Cane, "Sterling Silver Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Styrene_Butadiene_Rubber_Ingot_Cane, "Styrene Butadiene Rubber Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Tantalum_Ingot_Cane, "Tantalum Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Thorium_Ingot_Cane, "Thorium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Tin_Alloy_Ingot_Cane, "Tin Alloy Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Tin_Ingot_Cane, "Tin Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Titanium_Ingot_Cane, "Titanium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Trinium_Ingot_Cane, "Trinium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Tritanium_Ingot_Cane, "Tritanium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Tungsten_Carbide_Ingot_Cane, "Tungsten Carbide Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Tungsten_Ingot_Cane, "Tungsten Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Ultimet_Ingot_Cane, "Ultimet Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_235_Ingot_Cane, "Uranium 235 Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_Ingot_Cane, "Uranium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_Rhodium_Dinaquadide_Ingot_Cane, "Uranium Rhodium Dinaquadide Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Uranium_Triplatinum_Ingot_Cane, "Uranium Triplatinum Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Vanadium_Gallium_Ingot_Cane, "Vanadium Gallium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Vanadium_Ingot_Cane, "Vanadium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Wrought_Iron_Ingot_Cane, "Wrought Iron Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Yttrium_Barium_Cuprate_Ingot_Cane, "Yttrium Barium Cuprate Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Yttrium_Ingot_Cane, "Yttrium Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Zinc_Ingot_Cane, "Zinc Ingot 矿石杆(GregTechCEu Modern)");
        translationBuilder.add(GrowableGregTechCEuModernOresBlocks.GTM_Invar_Ingot_Cane, "Invar Ingot 矿石杆(GregTechCEu Modern)");

        //ManaandArtifice
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Animus_Dust_Cane, "Electrum Ingot 矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Arcane_Ash_Cane, "Electrum Ingot 矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Bone_Ash_Cane, "Electrum Ingot 矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Ironbark_Cane, "Electrum Ingot 矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Living_Flame_Cane, "Electrum Ingot 矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Mote_Air_Cane, "Mote Air 矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Mote_Arcane_Cane, "Mote Arcane 矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Mote_Earth_Cane, "Mote Earth 矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Mote_Ender_Cane, "Mote Ender 矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Mote_Fire_Cane, "Mote Fire 矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Mote_Water_Cane, "Mote Water 矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Purified_Vinteum_Dust_Cane, "Purified Vinteum Dust 矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Purified_Vinteum_Ingot_Cane, "Purified Vinteum Ingot 矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Resonating_Dust_Cane, "Resonating Dust 矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Superheated_Purified_Vinteum_Ingot_Cane, "Superheated Purified Vinteum Ingot 矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Superheated_Vinteum_Ingot_Cane, "Superheated Vinteum Ingot 矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Vinteum_Dust_Cane, "Vinteum Dust 矿石杆(魔法艺术3)");
        translationBuilder.add(GrowableManaandArtificeOresBlocks.MA_Vinteum_Ingot_Cane, "Vinteum Ingot 矿石杆(魔法艺术3)");



        //Mystical Agradditions
        translationBuilder.add(GrowableMysticalAgradditionsBlocks.MAA_Awakened_Draconium_Essence_Cane, "Awakened Draconium Essence 矿石杆(Mystical Agradditions)");
        translationBuilder.add(GrowableMysticalAgradditionsBlocks.MAA_Dragon_Egg_Essence_Cane, "Dragon Egg Essence 矿石杆(Mystical Agradditions)");
        translationBuilder.add(GrowableMysticalAgradditionsBlocks.MAA_Insanium_Essence_Cane, "Insanium Essence 矿石杆(Mystical Agradditions)");
        translationBuilder.add(GrowableMysticalAgradditionsBlocks.MAA_Insanium_Ingot_Cane, "Insanium Ingot 矿石杆(Mystical Agradditions)");
        translationBuilder.add(GrowableMysticalAgradditionsBlocks.MAA_Nether_Star_Essence_Cane, "Nether Star IEssence 矿石杆(Mystical Agradditions)");
        translationBuilder.add(GrowableMysticalAgradditionsBlocks.MAA_Neutronium_Essence_Cane, "Neutronium Essence 矿石杆(Mystical Agradditions)");
        translationBuilder.add(GrowableMysticalAgradditionsBlocks.MAA_Nitro_Crystal_Essence_Cane, "Nitro Crystal Essence 矿石杆(Mystical Agradditions)");


        //Mystical Agriculture
        translationBuilder.add(GrowableMysticalAgricultureBlocks.MAC_Imperium_Ingot_Cane, "Imperium Ingot 矿石杆(Mystical Agriculture)");
        translationBuilder.add(GrowableMysticalAgricultureBlocks.MAC_Inferium_Ingot_Cane, "Inferium Ingot 矿石杆(Mystical Agriculture)");
        translationBuilder.add(GrowableMysticalAgricultureBlocks.MAC_Prosperity_Ingot_Cane, "Prosperity Ingot 矿石杆(Mystical Agriculture)");
        translationBuilder.add(GrowableMysticalAgricultureBlocks.MAC_Prudentium_Ingot_Cane, "Prudentium Ingot 矿石杆(Mystical Agriculture)");
        translationBuilder.add(GrowableMysticalAgricultureBlocks.MAC_Soulium_Ingot_Cane, "Soulium Ingot 矿石杆(Mystical Agriculture)");
        translationBuilder.add(GrowableMysticalAgricultureBlocks.MAC_Supremium_Ingot_Cane, "Supremium Ingot 矿石杆(Mystical Agriculture)");
        translationBuilder.add(GrowableMysticalAgricultureBlocks.MAC_Tertium_Ingot_Cane, "Tertium Ingot 矿石杆(Mystical Agriculture)");


        //Railcraft
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Brass_Ingot_Cane, "Brass Ingot 矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Bronze_Ingot_Cane, "Bronze Ingot 矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Charcoal_Dust_Cane, "Charcoal Dust 矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Coal_Dust_Cane, "Coal Dust 矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Ender_Dust_Cane, "Ender Dust 矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Invar_Ingot_Cane, "Invar Ingot 矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Lead_Ingot_Cane, "Lead Ingot 矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Nickel_Ingot_Cane, "Nickel Ingot 矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Obsidian_Dust_Cane, "Obsidian Dust 矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Saltpeter_Dust_Cane, "Saltpeter Dust 矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Silver_Ingot_Cane, "Silver Ingot 矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Steel_Ingot_Cane, "Steel Ingot 矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Sulfur_Dust_Cane, "Sulfur Dust 矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Tin_Ingot_Cane, "Tin Ingot 矿石杆(Railcraft)");
        translationBuilder.add(GrowableRailcraftOresBlocks.RC_Zinc_Ingot_Cane, "Zinc Ingot 矿石杆(Railcraft)");



        //RFTools
        translationBuilder.add(GrowableRFToolsOresBlocks.RFT_Dimensional_Shard_Cane, "Dimensional Shard 矿石杆(RFTools)");



        //Tinkers' Construct
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Amethyst_Bronze_Ingot_Cane, "Electrum Ingot 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Ardite_Ingot_Cane, "Ardite Ingot 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Blazing_Bone_Cane, "Blazing Ingot 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Cheese_Ingot_Cane, "Cheese Ingot 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Cobalt_Ingot_Cane, "Cobalt Ingot 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Ender_Slime_Crystal_Cane, "Ender Slime Crystal 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Hepatizon_Ingot_Cane, "Hepatizon Ingot 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Hollow_Ingot_Cane, "Hollow Ingot 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Ichor_Slime_Crystal_Cane, "Ichor Slime Ingot 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Knightslime_Ingot_Cane, "Knightslime Ingot 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Manyullyn_Ingot_Cane, "Manyullyn Ingot 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Modifier_Crystal_Cane, "Modifier Crystal 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Necronium_Bone_Cane, "Necronium Ingot 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Necrotic_Bone_Cane, "Necrotic Ingot 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Pigiron_Ingot_Cane, "Pigiron Ingot 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Queens_Slime_Ingot_Cane, "Queens Slime Ingot 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Rose_Gold_Ingot_Cane, "Rose Gold Ingot 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Sky_Slime_Crystal_Cane, "Sky Slime Crystal 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Slimesteel_Ingot_Cane, "Slimesteel Ingot 矿石杆(Tinkers' Construct)");
        translationBuilder.add(GrowableTinkersConstructBlocks.TC_Soulsteel_Ingot_Cane, "Soulsteel Ingot 矿石杆(Tinkers' Construct)");
    }
}
