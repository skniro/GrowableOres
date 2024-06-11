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
        translationBuilder.add(GrowableVanillaOresBlocks.Nether_Quartz_Cane,"下届石英矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Redstone_Cane,"红石矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Blaze_Rod_Cane,"烈焰棒杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Ender_Pearl_Cane,"末影珍珠杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Netherite_Ingot_Cane,"下界合金杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Clay_Cane,"粘土杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Slime_Cane,"史莱姆球杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Bone_Cane,"骨头杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Nether_Star_Cane,"下届之星杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Glowstone_Cane,"萤石杆");

        // Copilot did translation. I am so sorry if its wrong.
        // Don't worry about translation. I will fix it. Thanks you make this mod better.


        //ae2
        translationBuilder.add(GrowableAEOresBlocks.certus_quartz_crystal_Cane,"赛特斯石英矿石杆");
        translationBuilder.add(GrowableAEOresBlocks.fluix_crystal_Cane,"福鲁伊克斯矿石杆");

        //Tech Reborn
        translationBuilder.add(GrowableTechRebornOresBlocks.cinnabar_Cane,"朱砂矿石杆");
        translationBuilder.add(GrowableTechRebornOresBlocks.galena_Cane,"方铅矿石杆");
        translationBuilder.add(GrowableTechRebornOresBlocks.iridium_Cane,"铱矿石杆");
        translationBuilder.add(GrowableTechRebornOresBlocks.lead_Cane,"铅矿石杆");
        translationBuilder.add(GrowableTechRebornOresBlocks.peridot_Cane,"翠绿橄榄石矿石杆");
        translationBuilder.add(GrowableTechRebornOresBlocks.pyrite_Cane,"硫矿石杆");
        translationBuilder.add(GrowableTechRebornOresBlocks.ruby_Cane,"红宝石矿石杆");
        translationBuilder.add(GrowableTechRebornOresBlocks.sapphire_Cane,"蓝宝石矿石杆");
        translationBuilder.add(GrowableTechRebornOresBlocks.sheldonite_Cane,"铂矿石杆");
        translationBuilder.add(GrowableTechRebornOresBlocks.silver_Cane,"银矿石杆");
        translationBuilder.add(GrowableTechRebornOresBlocks.sphalerite_Cane,"锌矿石杆");
        translationBuilder.add(GrowableTechRebornOresBlocks.tin_Cane,"锡矿石杆");
        translationBuilder.add(GrowableTechRebornOresBlocks.tungsten_Cane,"钨矿石杆");
        translationBuilder.add(GrowableTechRebornOresBlocks.sodalite_Cane,"方钠石矿石杆");
        translationBuilder.add(GrowableTechRebornOresBlocks.bauxite_Cane,"铝土矿石杆");

        translationBuilder.add(GrowableOresItemGroups.Growable_Ores_Group,"可生长矿石");

        //BetterEnd
        translationBuilder.add(GrowableBetterEndOresBlocks.amber_Cane,"琥珀矿石杆");
        translationBuilder.add(GrowableBetterEndOresBlocks.ender_Cane,"末影矿石杆");
        translationBuilder.add(GrowableBetterEndOresBlocks.thallasium_Cane,"塔拉斯金矿石杆");

        //Maple
        translationBuilder.add(GrowableMapleOresBlocks.Salt_Cane,"盐矿石杆");

        //Powah Rearchitected and Powah
        translationBuilder.add(GrowablePowahOresBlocks.Steel_Energized_Cane,"充能钢杆");
        translationBuilder.add(GrowablePowahOresBlocks.Uraninite_Ore_Dense_Cane,"晶质铀杆");
        translationBuilder.add(GrowablePowahOresBlocks.Ender_Core_Cane,"末影核心杆");
        translationBuilder.add(GrowablePowahOresBlocks.Crystal_Spirited_Cane,"富生水晶杆");
        translationBuilder.add(GrowablePowahOresBlocks.Crystal_Nitro_Cane,"下届水晶杆");
        translationBuilder.add(GrowablePowahOresBlocks.Crystal_Niotic_Cane,"钻石水晶杆");
        translationBuilder.add(GrowablePowahOresBlocks.Crystal_Blazing_Cane,"烈焰水晶杆");

        //Industrial Revolution
        translationBuilder.add(GrowableIndustrialRevolutionOresBlocks.IR_Lead_Cane,"铅矿石杆(IR)");
        translationBuilder.add(GrowableIndustrialRevolutionOresBlocks.IR_nikolite_Cane ,"蓝石矿杆(IR)");
        translationBuilder.add(GrowableIndustrialRevolutionOresBlocks.IR_silver_Cane,"银矿石杆(IR)");
        translationBuilder.add(GrowableIndustrialRevolutionOresBlocks.IR_tin_ore_Cane,"锡矿石杆(IR)");
        translationBuilder.add(GrowableIndustrialRevolutionOresBlocks.IR_tungsten_Cane,"钨矿石杆(IR)");

        //Modern Industrialization
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_antimony_Cane , "锑矿石杆(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_bauxite_Cane, "铝土矿杆(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_iridium_Cane, "铱矿石杆(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_lead_Cane, "铅矿石杆(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_lignite_coal_Cane, "深层褐煤矿杆(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_monazite_Cane, "深层莫桑石矿杆(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_nickel_Cane, "镍矿石杆(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_platinum_Cane, "铂矿石杆(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_quartz_Cane, "石英矿石杆(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_salt_Cane, "盐矿石杆(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_tin_Cane, "锡矿石杆(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_titanium_Cane, "钛矿石杆(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_tungsten_Cane,"钨矿石杆(MI)");
        translationBuilder.add(GrowableModernIndustrializationOresBlocks.MI_uranium_Cane, "铀矿石杆(MI)");

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
        translationBuilder.add(GrowableCreateOresBlocks.C_Andesite_Alloy_Cane, "安山合金矿石杆(Create)");
        translationBuilder.add(GrowableCreateOresBlocks.C_Brass_Ingot_Cane, "黄铜矿石杆(Create)");
        translationBuilder.add(GrowableCreateOresBlocks.C_Polished_Rose_Quartz_Cane, "磨制玫瑰石英矿石杆(Create)");
        translationBuilder.add(GrowableCreateOresBlocks.C_Zinc_Cane, "锌矿石杆(Create)");

        //Thermal Series
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Apatite_Cane, "磷灰石矿石杆(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Cinnabar_Cane, "朱砂矿石杆(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Copper_Cane, "铜矿石杆(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Lead_Cane, "铅矿石杆(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Nickel_Cane, "镍矿石杆(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Niter_Cane, "硝石矿石杆(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Ruby_Cane, "红宝石矿石杆(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Sapphire_Cane, "蓝宝石矿石杆(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Silver_Cane, "银矿石杆(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Sulfur_Cane, "硫矿石杆(Thermal)");
        translationBuilder.add(GrowableThermalSeriesOresBlocks.TF_Tin_Cane, "锡矿石杆(Thermal)");
    }
}
