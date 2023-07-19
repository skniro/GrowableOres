package com.skniro.growableores.datagen;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.GrowableOresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class GrowableSimplifiedChineseLanguageProvider extends FabricLanguageProvider {
    public GrowableSimplifiedChineseLanguageProvider(FabricDataGenerator dataGenerator){
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

        //ae2
        translationBuilder.add(GrowableOresBlocks.certus_quartz_crystal_Cane,"赛特斯石英矿石杆");

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
    }
}
