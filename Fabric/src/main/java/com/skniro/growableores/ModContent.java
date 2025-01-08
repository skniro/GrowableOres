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
        if (FabricLoader.getInstance().isModLoaded("betternether") || GrowableOresConfig.All_Item_Mode) {
            GrowableBetterNetherOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("energizedpower") || GrowableOresConfig.All_Item_Mode) {
            GrowableEnergizedPowerOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("biomesoplenty") || GrowableOresConfig.All_Item_Mode) {
            GrowableBiomesOPlentyOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("draconicevolution") || GrowableOresConfig.All_Item_Mode) {
            GrowableDraconicEvolutionOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("extremereactors") || GrowableOresConfig.All_Item_Mode) {
            GrowableExtremeReactorsOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("galosphere") || GrowableOresConfig.All_Item_Mode) {
            GrowableGalosphereOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("gobber2") || GrowableOresConfig.All_Item_Mode) {
            GrowableGobberOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("gtceu") || GrowableOresConfig.All_Item_Mode) {
            GrowableGregTechCEuModernOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("mna") || GrowableOresConfig.All_Item_Mode) {
            GrowableManaandArtificeOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("mysticalagradditions") || GrowableOresConfig.All_Item_Mode) {
            GrowableMysticalAgradditionsBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("mysticalagriculture") || GrowableOresConfig.All_Item_Mode) {
            GrowableMysticalAgricultureBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("railcraft") || GrowableOresConfig.All_Item_Mode) {
            GrowableRailcraftOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("rftoolsbase") || GrowableOresConfig.All_Item_Mode) {
            GrowableRFToolsOresBlocks.registerModBlocks();
        }
        if (FabricLoader.getInstance().isModLoaded("tconstruct") || GrowableOresConfig.All_Item_Mode) {
            GrowableTinkersConstructBlocks.registerModBlocks();
        }

    }

    public static void CreativeTab() {
    }
}
