package com.skniro.growableores;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class GrowableOres implements ModInitializer {
    public static final String MOD_ID = "growable_ores";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);






    @Override
    public void onInitialize() {
        ModContent.registerItem();
        ModContent.registerBlock();
        ModContent.CreativeTab();
    }
}
