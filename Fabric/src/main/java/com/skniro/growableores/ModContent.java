package com.skniro.growableores;


import com.skniro.growableores.block.*;
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
        if (FabricLoader.getInstance().isModLoaded("mekanism") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.mek_item();
            GrowableMekanismOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("betternether") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.bn_item();
            GrowableBetterNetherOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("energizedpower") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.ep_item();
            GrowableEnergizedPowerOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("biomesoplenty") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.bop_item();
            GrowableBiomesOPlentyOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("draconicevolution") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.de_item();
            GrowableDraconicEvolutionOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("extremereactors") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.er_item();
            GrowableExtremeReactorsOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("galosphere") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.galo_item();
            GrowableGalosphereOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("gobber2") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.gobber_item();
            GrowableGobberOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("gtceu") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.gtceu_item();
            GrowableGregTechCEuModernOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("mna") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.ma_item();
            GrowableManaandArtificeOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("mysticalagradditions") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.maa_item();
            GrowableMysticalAgradditionsBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("mysticalagriculture") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.mac_item();
            GrowableMysticalAgricultureBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("railcraft") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.rc_item();
            GrowableRailcraftOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("rftoolsbase") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.rft_item();
            GrowableRFToolsOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("tconstruct") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.tc_item();
            GrowableTinkersConstructBlocks.registerModBlocks();
        }
    }

    public static void CreativeTab() {
    }
}
