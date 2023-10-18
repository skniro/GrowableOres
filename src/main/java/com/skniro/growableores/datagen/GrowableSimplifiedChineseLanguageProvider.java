package com.skniro.growableores.datagen;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.GrowableOresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class GrowableSimplifiedChineseLanguageProvider extends FabricLanguageProvider {
    public GrowableSimplifiedChineseLanguageProvider(FabricDataOutput dataGenerator){
        super(dataGenerator,"zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder){
        translationBuilder.add(GrowableOresBlocks.Coal_Cane,"煤矿石杆");
        translationBuilder.add(GrowableOresBlocks.Iron_Cane,"铁矿石杆");
        translationBuilder.add(GrowableOresBlocks.Diamond_Cane,"钻石矿石杆");
        translationBuilder.add(GrowableOresBlocks.Copper_Cane,"铜矿石杆");
        translationBuilder.add(GrowableOresBlocks.Emerald_Cane,"绿宝石矿石杆");
        translationBuilder.add(GrowableOresBlocks.Gold_Cane,"金矿石杆");
        translationBuilder.add(GrowableOresBlocks.Lapis_Cane,"青金石矿石杆");
        translationBuilder.add(GrowableOresBlocks.Nether_Quartz_Cane,"下届石英矿石杆");
        translationBuilder.add(GrowableOresBlocks.Redstone_Cane,"红石矿石杆");
        translationBuilder.add(GrowableOresBlocks.Blaze_Rod_Cane,"烈焰棒杆");
        translationBuilder.add(GrowableOresBlocks.Ender_Pearl_Cane,"末影珍珠杆");
        translationBuilder.add(GrowableOresBlocks.Netherite_Ingot_Cane,"下界合金杆");
        translationBuilder.add(GrowableOresBlocks.Clay_Cane,"粘土杆");
        translationBuilder.add(GrowableOresBlocks.Slime_Cane,"粘土杆");
        translationBuilder.add(GrowableOresBlocks.Bone_Cane,"骨头杆");
        translationBuilder.add(GrowableOresBlocks.Nether_Star_Cane,"下届星星杆");
        translationBuilder.add(GrowableOresBlocks.Glowstone_Cane,"閃光石矿石杆");

        // Copilot did translation. I am so sorry if its wrong.


        //ae2
        translationBuilder.add(GrowableOresBlocks.certus_quartz_crystal_Cane,"赛特斯石英矿石杆");
        translationBuilder.add(GrowableOresBlocks.fluix_crystal_Cane,"赛特斯石英矿石杆");

        //Tech Reborn
        translationBuilder.add(GrowableOresBlocks.cinnabar_Cane,"朱砂矿石杆");
        translationBuilder.add(GrowableOresBlocks.galena_Cane,"方铅矿石杆");
        translationBuilder.add(GrowableOresBlocks.iridium_Cane,"铱矿石杆");
        translationBuilder.add(GrowableOresBlocks.lead_Cane,"铅矿石杆");
        translationBuilder.add(GrowableOresBlocks.peridot_Cane,"翠绿橄榄石矿石杆");
        translationBuilder.add(GrowableOresBlocks.pyrite_Cane,"硫矿石杆");
        translationBuilder.add(GrowableOresBlocks.ruby_Cane,"红宝石矿石杆");
        translationBuilder.add(GrowableOresBlocks.sapphire_Cane,"蓝宝石矿石杆");
        translationBuilder.add(GrowableOresBlocks.sheldonite_Cane,"铂矿石杆");
        translationBuilder.add(GrowableOresBlocks.silver_Cane,"银矿石杆");
        translationBuilder.add(GrowableOresBlocks.sphalerite_Cane,"锌矿石杆");
        translationBuilder.add(GrowableOresBlocks.tin_Cane,"锡矿石杆");
        translationBuilder.add(GrowableOresBlocks.tungsten_Cane,"钨矿石杆");
        translationBuilder.add(GrowableOresBlocks.sodalite_Cane,"方钠石矿石杆");;
        translationBuilder.add(GrowableOresBlocks.bauxite_Cane,"铝土矿石杆");

        translationBuilder.add(GrowableOres.Growable_Ores_Group,"可生长矿石");

        //BetterEnd
        translationBuilder.add(GrowableOresBlocks.amber_Cane,"琥珀矿石杆");
        translationBuilder.add(GrowableOresBlocks.ender_Cane,"末影矿石杆");
        translationBuilder.add(GrowableOresBlocks.thallasium_Cane,"塔拉斯金矿石杆");

        //Maple
        translationBuilder.add(GrowableOresBlocks.Salt_Cane,"盐矿石杆");

        //Powah Rearchitected and Powah
        translationBuilder.add(GrowableOresBlocks.Steel_Energized_Cane,"充能钢杆");
        translationBuilder.add(GrowableOresBlocks.Uraninite_Ore_Dense_Cane,"晶质铀杆");
        translationBuilder.add(GrowableOresBlocks.Ender_Core_Cane,"末影核心杆");
        translationBuilder.add(GrowableOresBlocks.Crystal_Spirited_Cane,"富生水晶杆");
        translationBuilder.add(GrowableOresBlocks.Crystal_Nitro_Cane,"下届水晶杆");
        translationBuilder.add(GrowableOresBlocks.Crystal_Niotic_Cane,"钻石水晶杆");
        translationBuilder.add(GrowableOresBlocks.Crystal_Blazing_Cane,"烈焰水晶杆");

        //Industrial Revolution
        translationBuilder.add(GrowableOresBlocks.IR_Lead_Cane,"铅矿石杆(IR)");
        translationBuilder.add(GrowableOresBlocks.IR_nikolite_Cane ,"蓝石矿杆(IR)");
        translationBuilder.add(GrowableOresBlocks.IR_silver_Cane,"银矿石杆(IR)");
        translationBuilder.add(GrowableOresBlocks.IR_tin_ore_Cane,"锡矿石杆(IR)");
        translationBuilder.add(GrowableOresBlocks.IR_tungsten_Cane,"钨矿石杆(IR)");

        //Modern Industrialization
        translationBuilder.add(GrowableOresBlocks.MI_antimony_Cane , "锑矿石杆(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_bauxite_Cane, "铝土矿杆(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_iridium_Cane, "铱矿石杆(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_lead_Cane, "铅矿石杆(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_lignite_coal_Cane, "深层褐煤矿杆(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_monazite_Cane, "深层莫桑石矿杆(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_nickel_Cane, "镍矿石杆(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_platinum_Cane, "铂矿石杆(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_quartz_Cane, "石英矿石杆(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_salt_Cane, "盐矿石杆(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_tin_Cane, "锡矿石杆(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_titanium_Cane, "钛矿石杆(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_tungsten_Cane,"钨矿石杆(MI)");
        translationBuilder.add(GrowableOresBlocks.MI_uranium_Cane, "铀矿石杆(MI)");

        //ic2 and ic2c
        translationBuilder.add(GrowableOresBlocks.IC2_Aluminium_Cane, "铝矿石杆(IC2 or IC2C)");
        translationBuilder.add(GrowableOresBlocks.IC2_silver_Cane,"银矿石杆(IC2 or IC2C)");
        translationBuilder.add(GrowableOresBlocks.IC2_Tin_Cane, "锡矿石杆(IC2 or IC2C)");
        translationBuilder.add(GrowableOresBlocks.IC2_Uranium_Cane, "铀矿石杆(IC2 or IC2C)");

        //Ad Astra!
        translationBuilder.add(GrowableOresBlocks.AD_Ostrum_Cane, "紫金矿石杆(Ad Astra!)");
        translationBuilder.add(GrowableOresBlocks.AD_Ice_Shard_Cane, "冰晶矿石杆(Ad Astra!)");
        translationBuilder.add(GrowableOresBlocks.AD_Cheese_Cane, "奶酪矿石杆(Ad Astra!)");
        translationBuilder.add(GrowableOresBlocks.AD_Desh_Cane, "戴斯矿石杆(Ad Astra!)");
        translationBuilder.add(GrowableOresBlocks.AD_Calorite_Cane, "耐热金属矿石杆(Ad Astra!)");

        //Create
        translationBuilder.add(GrowableOresBlocks.C_Andesite_Alloy_Cane, "安山合金矿石杆(Create)");
        translationBuilder.add(GrowableOresBlocks.C_Brass_Ingot_Cane, "黄铜矿石杆(Create)");
        translationBuilder.add(GrowableOresBlocks.C_Polished_Rose_Quartz_Cane, "磨制玫瑰石英矿石杆(Create)");
        translationBuilder.add(GrowableOresBlocks.C_Zinc_Cane, "锌矿石杆(Create)");

        //Thermal Series
        translationBuilder.add(GrowableOresBlocks.TF_Apatite_Cane, "磷灰石矿石杆(Thermal)");
        translationBuilder.add(GrowableOresBlocks.TF_Cinnabar_Cane, "朱砂矿石杆(Thermal)");
        translationBuilder.add(GrowableOresBlocks.TF_Copper_Cane, "铜矿石杆(Thermal)");
        translationBuilder.add(GrowableOresBlocks.TF_Lead_Cane, "铅矿石杆(Thermal)");
        translationBuilder.add(GrowableOresBlocks.TF_Nickel_Cane, "镍矿石杆(Thermal)");
        translationBuilder.add(GrowableOresBlocks.TF_Niter_Cane, "硝石矿石杆(Thermal)");
        translationBuilder.add(GrowableOresBlocks.TF_Ruby_Cane, "红宝石矿石杆(Thermal)");
        translationBuilder.add(GrowableOresBlocks.TF_Sapphire_Cane, "蓝宝石矿石杆(Thermal)");
        translationBuilder.add(GrowableOresBlocks.TF_Silver_Cane, "银矿石杆(Thermal)");
        translationBuilder.add(GrowableOresBlocks.TF_Sulfur_Cane, "硫矿石杆(Thermal)");
        translationBuilder.add(GrowableOresBlocks.TF_Tin_Cane, "锡矿石杆(Thermal)");
    }
}
