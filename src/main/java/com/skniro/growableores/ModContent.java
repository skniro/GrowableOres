package com.skniro.growableores;


import com.skniro.growableores.block.*;
import com.skniro.growableores.conifg.Config;
import com.skniro.growableores.conifg.GrowableOresConfig;
import com.skniro.growableores.item.GrowableOresItems;
import com.skniro.growableores.util.GrowableOresItemGroups;
import net.fabricmc.loader.api.FabricLoader;


public class ModContent {


    public static void registerItem(){
        GrowableOresItems.shield_item();
    }
    public static void registerBlock(){
        GrowableOresItemGroups.vanilla_item();
        GrowableVanillaOresBlocks.registerModBlocks();
        if (FabricLoader.getInstance().isModLoaded("ae2") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.ae_item();
            GrowableAEOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("maple") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.maple_item();
            GrowableMapleOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("ad_astra") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.ad_item();
            GrowableAdAstraOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("betterend") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.betterend_item();
            GrowableBetterEndOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("create") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.c_item();
            GrowableCreateOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("ic2") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.ic_item();
            GrowableICOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("indrev") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.ir_item();
            GrowableIndustrialRevolutionOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("modern_industrialization") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.mi_item();
            GrowableModernIndustrializationOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("powah") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.powah_item();
            GrowablePowahOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.techreborn_item();
            GrowableTechRebornOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("thermal") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.tf_item();
            GrowableThermalSeriesOresBlocks.registerModBlocks();
        }
    }

    public static void CreativeTab() {
    }
}
