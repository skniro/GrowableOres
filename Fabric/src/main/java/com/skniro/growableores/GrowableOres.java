package com.skniro.growableores;

import com.skniro.growableores.conifg.Configuration;
import com.skniro.growableores.conifg.GrowableOresConfig;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class GrowableOres implements ModInitializer {
    public static final String MOD_ID = "growable_ores";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        new Configuration(GrowableOresConfig.class, MOD_ID);
        ModContent.registerItem();
        ModContent.registerBlock();
        ModContent.CreativeTab();
    }
}
