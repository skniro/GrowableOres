package com.skniro.growableores;

import com.mojang.logging.LogUtils;
import com.skniro.growableores.block.*;
import com.skniro.growableores.conifg.Configuration;
import com.skniro.growableores.conifg.GrowableOresConfig;
import com.skniro.growableores.item.MapleItems;
import com.skniro.growableores.item.ModCreativeModeTabs;
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


    public GrowableOres(FMLJavaModLoadingContext context) {
        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GrowableConfig.GENERAL_SPEC, "growable_ores_config.toml");
        new Configuration(GrowableOresConfig.class, MOD_ID);
        IEventBus modEventBus = context.getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        GrowableVanillaOresBlocks.registerMapleBlocks(modEventBus);
        GrowableCustomOresBlocks.registerMapleBlocks(modEventBus);
        GrowableAdAstraOresBlocks.registerAdAstraBlocks(modEventBus);
        GrowableAEOresBlocks.registerMapleBlocks(modEventBus);
        GrowableCreateOresBlocks.registerMapleBlocks(modEventBus);
        GrowableBetterEndOresBlocks.registerMapleBlocks(modEventBus);
        GrowableICOresBlocks.registerMapleBlocks(modEventBus);
        GrowablePowahOresBlocks.registerMapleBlocks(modEventBus);
        GrowableThermalSeriesOresBlocks.registerMapleBlocks(modEventBus);
        GrowableMekanismOresBlocks.registerModBlocks(modEventBus);
        GrowableBetterNetherOresBlocks.registerModBlocks(modEventBus);
        GrowableEnergizedPowerOresBlocks.registerModBlocks(modEventBus);
        GrowableBiomesOPlentyOresBlocks.registerGrowableBlocks(modEventBus);
        GrowableDraconicEvolutionOresBlocks.registerGrowableBlocks(modEventBus);
        GrowableExtremeReactorsOresBlocks.registerGrowableBlocks(modEventBus);
        GrowableGalosphereOresBlocks.registerGrowableBlocks(modEventBus);
        GrowableGobberOresBlocks.registerGrowableBlocks(modEventBus);
        GrowableGregTechCEuModernOresBlocks.registerGrowableBlocks(modEventBus);
        GrowableManaandArtificeOresBlocks.registerGrowableBlocks(modEventBus);
        GrowableMysticalAgradditionsBlocks.registerGrowableBlocks(modEventBus);
        GrowableMysticalAgricultureBlocks.registerGrowableBlocks(modEventBus);
        GrowableRailcraftOresBlocks.registerGrowableBlocks(modEventBus);
        GrowableRFToolsOresBlocks.registerGrowableBlocks(modEventBus);
        GrowableTinkersConstructBlocks.registerGrowableBlocks(modEventBus);
        GrowableMapleOresBlocks.registerGrowableBlocks(modEventBus);
        GrowableModernIndustrializationOresBlocks.registerModBlocks(modEventBus);
        GrowableTechRebornOresBlocks.registerGrowableBlocks(modEventBus);
        GrowableIndustrialRevolutionOresBlocks.registerGrowableBlocks(modEventBus);
        GrowableOritechBlocks.registerMapleBlocks(modEventBus);
        GrowableElectroDynamicsOresBlocks.registerModBlocks(modEventBus);
        GrowableCobblemonOresBlocks.registerMapleBlocks(modEventBus);
        GrowableOccultismOresBlocks.registerMapleBlocks(modEventBus);
        GrowableAetherOresBlocks.registerMapleBlocks(modEventBus);
        GrowableMythicMetalsBlocks.registerMapleBlocks(modEventBus);

        MapleItems.registerModItems(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
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
