package com.skniro.growableores;

import com.mojang.logging.LogUtils;
import com.skniro.growableores.block.*;
import com.skniro.growableores.conifg.Configuration;
import com.skniro.growableores.conifg.GrowableOresConfig;
import com.skniro.growableores.item.MapleItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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


    public GrowableOres() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        new Configuration(GrowableOresConfig.class, MOD_ID);
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        GrowableVanillaOresBlocks.registerMapleBlocks(modEventBus);
        if(ModList.get().isLoaded("ad_astra") || GrowableOresConfig.All_Item_Mode) {
            GrowableAdAstraOresBlocks.registerAdAstraBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("ae2") || GrowableOresConfig.All_Item_Mode) {
            GrowableAEOresBlocks.registerMapleBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("create") || GrowableOresConfig.All_Item_Mode) {
            GrowableCreateOresBlocks.registerMapleBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("betterend") || GrowableOresConfig.All_Item_Mode) {
            GrowableBetterEndOresBlocks.registerMapleBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("ic2") || GrowableOresConfig.All_Item_Mode) {
            GrowableICOresBlocks.registerMapleBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("powah") || GrowableOresConfig.All_Item_Mode) {
            GrowablePowahOresBlocks.registerMapleBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("thermal") || GrowableOresConfig.All_Item_Mode) {
            GrowableThermalSeriesOresBlocks.registerMapleBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("mekanism") || GrowableOresConfig.All_Item_Mode) {
            GrowableMekanismOresBlocks.registerModBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("betternether") || GrowableOresConfig.All_Item_Mode) {
            GrowableBetterNetherOresBlocks.registerModBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("energizedpower") || GrowableOresConfig.All_Item_Mode) {
            GrowableEnergizedPowerOresBlocks.registerModBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("biomesoplenty") || GrowableOresConfig.All_Item_Mode) {
            GrowableBiomesOPlentyOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("draconicevolution") || GrowableOresConfig.All_Item_Mode) {
            GrowableDraconicEvolutionOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("extremereactors") || GrowableOresConfig.All_Item_Mode) {
            GrowableExtremeReactorsOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("galosphere") || GrowableOresConfig.All_Item_Mode) {
            GrowableGalosphereOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("gobber2") || GrowableOresConfig.All_Item_Mode) {
            GrowableGobberOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("gtceu") || GrowableOresConfig.All_Item_Mode) {
            GrowableGregTechCEuModernOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("mna") || GrowableOresConfig.All_Item_Mode) {
            GrowableManaandArtificeOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("mysticalagradditions") || GrowableOresConfig.All_Item_Mode) {
            GrowableMysticalAgradditionsBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("mysticalagriculture") || GrowableOresConfig.All_Item_Mode) {
            GrowableMysticalAgricultureBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("railcraft") || GrowableOresConfig.All_Item_Mode) {
            GrowableRailcraftOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("rftoolsbase") || GrowableOresConfig.All_Item_Mode) {
            GrowableRFToolsOresBlocks.registerGrowableBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("tconstruct") || GrowableOresConfig.All_Item_Mode) {
            GrowableTinkersConstructBlocks.registerGrowableBlocks(modEventBus);
        }
        MapleItems.registerModItems(modEventBus);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }

}
