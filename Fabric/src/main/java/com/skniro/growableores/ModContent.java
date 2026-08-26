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
        GrowableCustomOresBlocks.registerModBlocks();
        GrowableAEOresBlocks.registerModBlocks();
        GrowableMapleOresBlocks.registerModBlocks();
        GrowableAdAstraOresBlocks.registerModBlocks();
        GrowableBetterEndOresBlocks.registerModBlocks();
        GrowableCreateOresBlocks.registerModBlocks();
        GrowableICOresBlocks.registerModBlocks();
        GrowableIndustrialRevolutionOresBlocks.registerModBlocks();
        GrowableModernIndustrializationOresBlocks.registerModBlocks();
        GrowablePowahOresBlocks.registerModBlocks();
        GrowableTechRebornOresBlocks.registerModBlocks();
        GrowableThermalSeriesOresBlocks.registerModBlocks();
        GrowableMekanismOresBlocks.registerModBlocks();
        GrowableBetterNetherOresBlocks.registerModBlocks();
        GrowableEnergizedPowerOresBlocks.registerModBlocks();
        GrowableBiomesOPlentyOresBlocks.registerModBlocks();
        GrowableDraconicEvolutionOresBlocks.registerModBlocks();
        GrowableExtremeReactorsOresBlocks.registerModBlocks();
        GrowableGalosphereOresBlocks.registerModBlocks();
        GrowableGobberOresBlocks.registerModBlocks();
        GrowableGregTechCEuModernOresBlocks.registerModBlocks();
        GrowableManaandArtificeOresBlocks.registerModBlocks();
        GrowableMysticalAgradditionsBlocks.registerModBlocks();
        GrowableMysticalAgricultureBlocks.registerModBlocks();
        GrowableRailcraftOresBlocks.registerModBlocks();
        GrowableRFToolsOresBlocks.registerModBlocks();
        GrowableTinkersConstructBlocks.registerModBlocks();
        GrowableOritechBlocks.registerModBlocks();
        GrowableElectroDynamicsOresBlocks.registerModBlocks();
        GrowableCobblemonOresBlocks.registerModBlocks();
        GrowableOccultismOresBlocks.registerModBlocks();
        GrowableAetherOresBlocks.registerModBlocks();
        GrowableMythicMetalsBlocks.registerModBlocks();

        if (FabricLoader.getInstance().isModLoaded("ae2") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.ae_item();
        }
        if (FabricLoader.getInstance().isModLoaded("maple") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.maple_item();
        }
        if (FabricLoader.getInstance().isModLoaded("ad_astra") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.ad_item();
        }
        if (FabricLoader.getInstance().isModLoaded("betterend") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.betterend_item();
        }
        if (FabricLoader.getInstance().isModLoaded("create") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.c_item();
        }
        if (FabricLoader.getInstance().isModLoaded("ic2") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.ic_item();
        }
        if (FabricLoader.getInstance().isModLoaded("indrev") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.ir_item();
        }
        if (FabricLoader.getInstance().isModLoaded("modern_industrialization") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.mi_item();
        }
        if (FabricLoader.getInstance().isModLoaded("powah") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.powah_item();
        }
        if (FabricLoader.getInstance().isModLoaded("techreborn") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.techreborn_item();
        }
        if (FabricLoader.getInstance().isModLoaded("thermal") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.tf_item();
        }
        if (FabricLoader.getInstance().isModLoaded("mekanism") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.mek_item();
        }
        if (FabricLoader.getInstance().isModLoaded("betternether") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.bn_item();
        }
        if (FabricLoader.getInstance().isModLoaded("energizedpower") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.ep_item();
        }
        if (FabricLoader.getInstance().isModLoaded("biomesoplenty") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.bop_item();
        }
        if (FabricLoader.getInstance().isModLoaded("draconicevolution") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.de_item();
        }
        if (FabricLoader.getInstance().isModLoaded("bigreactors") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.er_item();
        }
        if (FabricLoader.getInstance().isModLoaded("galosphere") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.galo_item();
        }
        if (FabricLoader.getInstance().isModLoaded("gobber2") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.gobber_item();
        }
        if (FabricLoader.getInstance().isModLoaded("gtceu") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.gtceu_item();
        }
        if (FabricLoader.getInstance().isModLoaded("mna") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.ma_item();
        }
        if (FabricLoader.getInstance().isModLoaded("mysticalagradditions") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.maa_item();
        }
        if (FabricLoader.getInstance().isModLoaded("mysticalagriculture") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.mac_item();
        }
        if (FabricLoader.getInstance().isModLoaded("railcraft") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.rc_item();
        }
        if (FabricLoader.getInstance().isModLoaded("rftoolsbase") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.rft_item();
        }
        if (FabricLoader.getInstance().isModLoaded("tconstruct") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.tc_item();
        }
        if (FabricLoader.getInstance().isModLoaded("oritech") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.ot_item();
        }
        if (FabricLoader.getInstance().isModLoaded("electrodynamics") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.ed_item();
        }
        if (FabricLoader.getInstance().isModLoaded("cobblemon") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.clm_item();
        }
        if (FabricLoader.getInstance().isModLoaded("occultism") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.oc_item();
        }
        if (FabricLoader.getInstance().isModLoaded("aether") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.aet_item();
        }
        if (FabricLoader.getInstance().isModLoaded("mythicmetals") || GrowableOresConfig.All_Item_Mode) {
            GrowableOresItemGroups.mm_item();
        }
    }

    public static void CreativeTab() {
    }
}
