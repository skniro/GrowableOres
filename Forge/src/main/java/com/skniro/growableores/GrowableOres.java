package com.skniro.growableores;

import com.skniro.growableores.block.GrowableOresBlocks;
import com.skniro.growableores.client.GrowableOresClient;
import com.skniro.growableores.item.MapleItems;
import net.minecraft.block.BlockRenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GrowableOres.MODID)
public class GrowableOres {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "growable_ores";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogManager.getLogger();


    public GrowableOres() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        GrowableOresBlocks.registerMapleBlocks(modEventBus);
        MapleItems.registerModItems(modEventBus);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }



    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {


        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            GrowableOresClient.onInitializeClient(event);
        }
    }

}
