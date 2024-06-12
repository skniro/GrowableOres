package com.skniro.growableores;

import com.skniro.growableores.block.GrowableVanillaOresBlocks;
import com.skniro.growableores.conifg.Configuration;
import com.skniro.growableores.conifg.GrowableOresConfig;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class GrowableOres implements ModInitializer {
    public static final String MOD_ID = "growable_ores";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);




     public static final ItemGroup Growable_Ores_Group = FabricItemGroupBuilder.build(
             new Identifier(MOD_ID, "test_group"),()-> new ItemStack(GrowableVanillaOresBlocks.Iron_Cane));

    @Override
    public void onInitialize() {
        new Configuration(GrowableOresConfig.class, MOD_ID);
        ModContent.registerItem();
        ModContent.registerBlock();
        ModContent.CreativeTab();
    }
}
