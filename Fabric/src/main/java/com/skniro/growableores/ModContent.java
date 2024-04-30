package com.skniro.growableores;


import com.skniro.growableores.block.*;
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
        if (FabricLoader.getInstance().isModLoaded("ae2")) {
            GrowableOresItemGroups.ae_item();
            GrowableAEOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("maple")) {
            GrowableOresItemGroups.maple_item();
            GrowableMapleOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("ad_astra")) {
            GrowableOresItemGroups.ad_item();
            GrowableAdAstraOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("betterend")) {
            GrowableOresItemGroups.betterend_item();
            GrowableBetterEndOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("create")) {
            GrowableOresItemGroups.c_item();
            GrowableCreateOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("ic2")) {
            GrowableOresItemGroups.ic_item();
            GrowableICOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("indrev")) {
            GrowableOresItemGroups.ir_item();
            GrowableIndustrialRevolutionOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("modern_industrialization")) {
            GrowableOresItemGroups.mi_item();
            GrowableModernIndustrializationOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("powah")) {
            GrowableOresItemGroups.powah_item();
            GrowablePowahOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            GrowableOresItemGroups.techreborn_item();
            GrowableTechRebornOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("thermal")) {
            GrowableOresItemGroups.tf_item();
            GrowableThermalSeriesOresBlocks.registerModBlocks();
        }
    }

    public static void CreativeTab() {
    }
}
