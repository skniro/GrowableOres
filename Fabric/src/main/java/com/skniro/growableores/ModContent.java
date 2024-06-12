package com.skniro.growableores;


import com.skniro.growableores.block.*;
import com.skniro.growableores.conifg.GrowableOresConfig;
import com.skniro.growableores.item.GrowableOresItems;
import net.fabricmc.loader.api.FabricLoader;


public class ModContent {


    public static void registerItem(){
        GrowableOresItems.shield_item();
    }
    public static void registerBlock(){
        GrowableVanillaOresBlocks.registerModBlocks();
        if (FabricLoader.getInstance().isModLoaded("ae2") || GrowableOresConfig.All_Item_Mode) {
            GrowableAEOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("maple") || GrowableOresConfig.All_Item_Mode) {
            GrowableMapleOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("ad_astra") || GrowableOresConfig.All_Item_Mode) {
            GrowableAdAstraOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("betterend") || GrowableOresConfig.All_Item_Mode) {
            GrowableBetterEndOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("create") || GrowableOresConfig.All_Item_Mode) {
            GrowableCreateOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("ic2") || GrowableOresConfig.All_Item_Mode) {
            GrowableICOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("indrev") || GrowableOresConfig.All_Item_Mode) {
            GrowableIndustrialRevolutionOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("modern_industrialization") || GrowableOresConfig.All_Item_Mode) {
            GrowableModernIndustrializationOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("powah") || GrowableOresConfig.All_Item_Mode) {
            GrowablePowahOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn") || GrowableOresConfig.All_Item_Mode) {
            GrowableTechRebornOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("thermal") || GrowableOresConfig.All_Item_Mode) {
            GrowableThermalSeriesOresBlocks.registerModBlocks();
        }
    }

    public static void CreativeTab() {
    }
}
