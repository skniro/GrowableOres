package com.skniro.growableores.datagen;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.GrowableAEOresBlocks;
import com.skniro.growableores.block.GrowableVanillaOresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class GrowableSimplifiedChineseLanguageProvider extends FabricLanguageProvider {
    public GrowableSimplifiedChineseLanguageProvider(FabricDataOutput dataGenerator){
        super(dataGenerator,"zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder){
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
        translationBuilder.add(GrowableVanillaOresBlocks.cinnabar_Cane,"朱砂矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.galena_Cane,"方铅矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.iridium_Cane,"铱矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.lead_Cane,"铅矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.peridot_Cane,"翠绿橄榄石矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.pyrite_Cane,"硫矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.ruby_Cane,"红宝石矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.sapphire_Cane,"蓝宝石矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.sheldonite_Cane,"铂矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.silver_Cane,"银矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.sphalerite_Cane,"锌矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.tin_Cane,"锡矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.tungsten_Cane,"钨矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.sodalite_Cane,"方钠石矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.bauxite_Cane,"铝土矿石杆");

        translationBuilder.add(GrowableOres.Growable_Ores_Group,"可生长矿石");

        //BetterEnd
        translationBuilder.add(GrowableVanillaOresBlocks.amber_Cane,"琥珀矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.ender_Cane,"末影矿石杆");
        translationBuilder.add(GrowableVanillaOresBlocks.thallasium_Cane,"塔拉斯金矿石杆");

        //Maple
        translationBuilder.add(GrowableVanillaOresBlocks.Salt_Cane,"盐矿石杆");

        //Powah Rearchitected and Powah
        translationBuilder.add(GrowableVanillaOresBlocks.Steel_Energized_Cane,"充能钢杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Uraninite_Ore_Dense_Cane,"晶质铀杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Ender_Core_Cane,"末影核心杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Crystal_Spirited_Cane,"富生水晶杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Crystal_Nitro_Cane,"下届水晶杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Crystal_Niotic_Cane,"钻石水晶杆");
        translationBuilder.add(GrowableVanillaOresBlocks.Crystal_Blazing_Cane,"烈焰水晶杆");

        //Industrial Revolution
        translationBuilder.add(GrowableVanillaOresBlocks.IR_Lead_Cane,"铅矿石杆(IR)");
        translationBuilder.add(GrowableVanillaOresBlocks.IR_nikolite_Cane ,"蓝石矿杆(IR)");
        translationBuilder.add(GrowableVanillaOresBlocks.IR_silver_Cane,"银矿石杆(IR)");
        translationBuilder.add(GrowableVanillaOresBlocks.IR_tin_ore_Cane,"锡矿石杆(IR)");
        translationBuilder.add(GrowableVanillaOresBlocks.IR_tungsten_Cane,"钨矿石杆(IR)");

        //Modern Industrialization
        translationBuilder.add(GrowableVanillaOresBlocks.MI_antimony_Cane , "锑矿石杆(MI)");
        translationBuilder.add(GrowableVanillaOresBlocks.MI_bauxite_Cane, "铝土矿杆(MI)");
        translationBuilder.add(GrowableVanillaOresBlocks.MI_iridium_Cane, "铱矿石杆(MI)");
        translationBuilder.add(GrowableVanillaOresBlocks.MI_lead_Cane, "铅矿石杆(MI)");
        translationBuilder.add(GrowableVanillaOresBlocks.MI_lignite_coal_Cane, "深层褐煤矿杆(MI)");
        translationBuilder.add(GrowableVanillaOresBlocks.MI_monazite_Cane, "深层莫桑石矿杆(MI)");
        translationBuilder.add(GrowableVanillaOresBlocks.MI_nickel_Cane, "镍矿石杆(MI)");
        translationBuilder.add(GrowableVanillaOresBlocks.MI_platinum_Cane, "铂矿石杆(MI)");
        translationBuilder.add(GrowableVanillaOresBlocks.MI_quartz_Cane, "石英矿石杆(MI)");
        translationBuilder.add(GrowableVanillaOresBlocks.MI_salt_Cane, "盐矿石杆(MI)");
        translationBuilder.add(GrowableVanillaOresBlocks.MI_tin_Cane, "锡矿石杆(MI)");
        translationBuilder.add(GrowableVanillaOresBlocks.MI_titanium_Cane, "钛矿石杆(MI)");
        translationBuilder.add(GrowableVanillaOresBlocks.MI_tungsten_Cane,"钨矿石杆(MI)");
        translationBuilder.add(GrowableVanillaOresBlocks.MI_uranium_Cane, "铀矿石杆(MI)");

        //ic2 and ic2c
        translationBuilder.add(GrowableVanillaOresBlocks.IC2_Aluminium_Cane, "铝矿石杆(IC2 or IC2C)");
        translationBuilder.add(GrowableVanillaOresBlocks.IC2_silver_Cane,"银矿石杆(IC2 or IC2C)");
        translationBuilder.add(GrowableVanillaOresBlocks.IC2_Tin_Cane, "锡矿石杆(IC2 or IC2C)");
        translationBuilder.add(GrowableVanillaOresBlocks.IC2_Uranium_Cane, "铀矿石杆(IC2 or IC2C)");

        //Ad Astra!
        translationBuilder.add(GrowableVanillaOresBlocks.AD_Ostrum_Cane, "紫金矿石杆(Ad Astra!)");
        translationBuilder.add(GrowableVanillaOresBlocks.AD_Ice_Shard_Cane, "冰晶矿石杆(Ad Astra!)");
        translationBuilder.add(GrowableVanillaOresBlocks.AD_Cheese_Cane, "奶酪矿石杆(Ad Astra!)");
        translationBuilder.add(GrowableVanillaOresBlocks.AD_Desh_Cane, "戴斯矿石杆(Ad Astra!)");
        translationBuilder.add(GrowableVanillaOresBlocks.AD_Calorite_Cane, "耐热金属矿石杆(Ad Astra!)");

        //Create
        translationBuilder.add(GrowableVanillaOresBlocks.C_Andesite_Alloy_Cane, "安山合金矿石杆(Create)");
        translationBuilder.add(GrowableVanillaOresBlocks.C_Brass_Ingot_Cane, "黄铜矿石杆(Create)");
        translationBuilder.add(GrowableVanillaOresBlocks.C_Polished_Rose_Quartz_Cane, "磨制玫瑰石英矿石杆(Create)");
        translationBuilder.add(GrowableVanillaOresBlocks.C_Zinc_Cane, "锌矿石杆(Create)");

        //Thermal Series
        translationBuilder.add(GrowableVanillaOresBlocks.TF_Apatite_Cane, "磷灰石矿石杆(Thermal)");
        translationBuilder.add(GrowableVanillaOresBlocks.TF_Cinnabar_Cane, "朱砂矿石杆(Thermal)");
        translationBuilder.add(GrowableVanillaOresBlocks.TF_Copper_Cane, "铜矿石杆(Thermal)");
        translationBuilder.add(GrowableVanillaOresBlocks.TF_Lead_Cane, "铅矿石杆(Thermal)");
        translationBuilder.add(GrowableVanillaOresBlocks.TF_Nickel_Cane, "镍矿石杆(Thermal)");
        translationBuilder.add(GrowableVanillaOresBlocks.TF_Niter_Cane, "硝石矿石杆(Thermal)");
        translationBuilder.add(GrowableVanillaOresBlocks.TF_Ruby_Cane, "红宝石矿石杆(Thermal)");
        translationBuilder.add(GrowableVanillaOresBlocks.TF_Sapphire_Cane, "蓝宝石矿石杆(Thermal)");
        translationBuilder.add(GrowableVanillaOresBlocks.TF_Silver_Cane, "银矿石杆(Thermal)");
        translationBuilder.add(GrowableVanillaOresBlocks.TF_Sulfur_Cane, "硫矿石杆(Thermal)");
        translationBuilder.add(GrowableVanillaOresBlocks.TF_Tin_Cane, "锡矿石杆(Thermal)");
    }
}
