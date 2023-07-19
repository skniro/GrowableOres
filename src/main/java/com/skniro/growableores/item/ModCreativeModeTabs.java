package com.skniro.growableores.item;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.GrowableOresBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GrowableOres.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab Growable_Ores_Group;
    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        Growable_Ores_Group = event.registerCreativeModeTab(new ResourceLocation(GrowableOres.MODID, "test_group"),
                builder -> builder.icon(() -> new ItemStack(GrowableOresBlocks.Iron_Cane.get()))
                        .title(Component.translatable("growable_ores.test_group")));
    }
}
