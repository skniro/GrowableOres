package com.skniro.agree;

import com.skniro.agree.block.GrowableOresBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class GrowableOres implements ModInitializer {
    public static final String MOD_ID = "growable_ores";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);




     public static final RegistryKey<ItemGroup> Growable_Ores_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "test_group"));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM_GROUP, Growable_Ores_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(GrowableOresBlocks.Iron_Cane))
                .displayName(Text.translatable("itemGroup.growable_ores.test_group"))
                .build()); // build() no longer registers by itself
        ModContent.registerItem();
        ModContent.registerBlock();
        ModContent.CreativeTab();
    }
}
