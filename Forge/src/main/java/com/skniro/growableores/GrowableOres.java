package com.skniro.growableores;

import com.mojang.logging.LogUtils;
import com.skniro.growableores.block.*;
import com.skniro.growableores.conifg.Configuration;
import com.skniro.growableores.conifg.GrowableOresConfig;
import com.skniro.growableores.item.MapleItems;
import com.skniro.growableores.item.ModCreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GrowableOres.MOD_ID)
public class GrowableOres {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "growable_ores";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public GrowableOres(FMLJavaModLoadingContext context) {
        new Configuration(GrowableOresConfig.class, MOD_ID);
        var modEventBus = context.getModBusGroup();

        // Register the commonSetup method for modloading
        FMLCommonSetupEvent.getBus(modEventBus).addListener(this::commonSetup);
        GrowableVanillaOresBlocks.registerMapleBlocks(modEventBus);

        if(ModList.isLoaded("ad_astra") || GrowableOresConfig.All_Item_Mode) {
            GrowableAdAstraOresBlocks.registerAdAstraBlocks(modEventBus);
        }
        if (ModList.isLoaded("ae2") || GrowableOresConfig.All_Item_Mode) {
            GrowableAEOresBlocks.registerMapleBlocks(modEventBus);
        }
        if (ModList.isLoaded("create") || GrowableOresConfig.All_Item_Mode) {
            GrowableCreateOresBlocks.registerMapleBlocks(modEventBus);
        }
        if (ModList.isLoaded("betterend") || GrowableOresConfig.All_Item_Mode) {
            GrowableBetterEndOresBlocks.registerMapleBlocks(modEventBus);
        }
        if (ModList.isLoaded("ic2") || GrowableOresConfig.All_Item_Mode) {
            GrowableICOresBlocks.registerMapleBlocks(modEventBus);
        }
        if (ModList.isLoaded("powah") || GrowableOresConfig.All_Item_Mode) {
            GrowablePowahOresBlocks.registerMapleBlocks(modEventBus);
        }
        if (ModList.isLoaded("thermal") || GrowableOresConfig.All_Item_Mode) {
            GrowableThermalSeriesOresBlocks.registerMapleBlocks(modEventBus);
        }
        if (ModList.isLoaded("mekanism") || GrowableOresConfig.All_Item_Mode) {
            GrowableMekanismOresBlocks.registerModBlocks(modEventBus);
        }
        if (ModList.isLoaded("betternether") || GrowableOresConfig.All_Item_Mode) {
            GrowableBetterNetherOresBlocks.registerModBlocks(modEventBus);
        }
        if (ModList.isLoaded("energizedpower") || GrowableOresConfig.All_Item_Mode) {
            GrowableEnergizedPowerOresBlocks.registerModBlocks(modEventBus);
        }
        if (ModList.isLoaded("biomesoplenty") || GrowableOresConfig.All_Item_Mode) {
            GrowableBiomesOPlentyOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.isLoaded("draconicevolution") || GrowableOresConfig.All_Item_Mode) {
            GrowableDraconicEvolutionOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.isLoaded("bigreactors") || GrowableOresConfig.All_Item_Mode) {
            GrowableExtremeReactorsOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.isLoaded("galosphere") || GrowableOresConfig.All_Item_Mode) {
            GrowableGalosphereOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.isLoaded("gobber2") || GrowableOresConfig.All_Item_Mode) {
            GrowableGobberOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.isLoaded("gtceu") || GrowableOresConfig.All_Item_Mode) {
            GrowableGregTechCEuModernOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.isLoaded("mna") || GrowableOresConfig.All_Item_Mode) {
            GrowableManaandArtificeOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.isLoaded("mysticalagradditions") || GrowableOresConfig.All_Item_Mode) {
            GrowableMysticalAgradditionsBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.isLoaded("mysticalagriculture") || GrowableOresConfig.All_Item_Mode) {
            GrowableMysticalAgricultureBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.isLoaded("railcraft") || GrowableOresConfig.All_Item_Mode) {
            GrowableRailcraftOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.isLoaded("rftoolsbase") || GrowableOresConfig.All_Item_Mode) {
            GrowableRFToolsOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.isLoaded("tconstruct") || GrowableOresConfig.All_Item_Mode) {
            GrowableTinkersConstructBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.isLoaded("maple") || GrowableOresConfig.All_Item_Mode) {
            GrowableMapleOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.isLoaded("modern_industrialization") || GrowableOresConfig.All_Item_Mode) {
            GrowableModernIndustrializationOresBlocks.registerModBlocks(modEventBus);
        }
        if (ModList.isLoaded("techreborn") || GrowableOresConfig.All_Item_Mode) {
            GrowableTechRebornOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.isLoaded("indrev") || GrowableOresConfig.All_Item_Mode) {
            GrowableIndustrialRevolutionOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.isLoaded("oritech") || GrowableOresConfig.All_Item_Mode) {
            GrowableOritechBlocks.registerMapleBlocks(modEventBus);
        }
        if (ModList.isLoaded("electrodynamics") || GrowableOresConfig.All_Item_Mode) {
            GrowableElectroDynamicsOresBlocks.registerModBlocks(modEventBus);
        }
        MapleItems.registerModItems(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }

}
