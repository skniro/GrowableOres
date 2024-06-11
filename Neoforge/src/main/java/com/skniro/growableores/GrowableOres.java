package com.skniro.growableores;

import com.mojang.logging.LogUtils;
import com.skniro.growableores.block.*;
import com.skniro.growableores.item.MapleItems;
import com.skniro.growableores.item.ModCreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(GrowableOres.MODID)
public class GrowableOres {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "growable_ores";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public GrowableOres(IEventBus modEventBus) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        // Register the Deferred Register to the mod event bus so blocks get registered
        GrowableVanillaOresBlocks.registerMapleBlocks(modEventBus);
        if(ModList.get().isLoaded("ad_astra")) {
            GrowableAdAstraOresBlocks.registerMapleBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("ae2")) {
            GrowableAEOresBlocks.registerMapleBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("create")) {
            GrowableCreateOresBlocks.registerMapleBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("betterend")) {
            GrowableBetterEndOresBlocks.registerMapleBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("ic2")) {
            GrowableICOresBlocks.registerMapleBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("powah")) {
            GrowablePowahOresBlocks.registerMapleBlocks(modEventBus);
        }
        if (ModList.get().isLoaded("thermal")) {
            GrowableThermalSeriesOresBlocks.registerMapleBlocks(modEventBus);
        }
        MapleItems.registerModItems(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        // Register ourselves for server and other game events we are interested in
        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }

}
