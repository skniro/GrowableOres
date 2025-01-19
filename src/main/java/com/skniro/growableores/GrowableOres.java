package com.skniro.growableores;

import com.skniro.growableores.block.GrowableOresBlocks;
import com.skniro.growableores.client.GrowableOresClient;
import com.skniro.growableores.client.GrowableOresItemModel;
import com.skniro.growableores.item.MapleItems;
import com.skniro.growableores.item.ModCreativeModeTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

@Mod(modid = "growable_ores", name = "GrowableOres", version = "3.0.0")
public class GrowableOres {
    @SidedProxy(clientSide="com.skniro.growableores.client.GrowableOresClient", serverSide="com.skniro.growableores.GrowableOresServer")
    public static GrowableOresServer proxy;
    public static final String MOD_ID = "growable_ores";
    private static ArrayList<GrowableOresItemModel> itemsToSetAsModels = new ArrayList<GrowableOresItemModel>();
    // Directly reference a slf4j logger
    public static Logger LOGGER;
    public static CreativeTabs Growable_Ores_Group = new ModCreativeModeTabs("GrowableOres");

    public static ArrayList<GrowableOresItemModel> getItem2Models() {
        return itemsToSetAsModels;
    }

    @Mod.Instance("growable_ores")
    public static GrowableOres instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER = event.getModLog();
        proxy.preInit(event);

        // Register the Deferred Register to the mod event bus so blocks get registered
        MinecraftForge.EVENT_BUS.register(GrowableOresBlocks.class);
        MinecraftForge.EVENT_BUS.register(MapleItems.class);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
        //new GrowableOresRecipes();
    }
}
