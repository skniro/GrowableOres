package com.skniro.growableores.item;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.GrowableOresBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GrowableOres.MODID);

    public static final RegistryObject<CreativeModeTab> Growable_Ores_Group = CREATIVE_MODE_TABS.register("test_group",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(GrowableOresBlocks.Iron_Cane.get()))
                    .title(Component.translatable("itemGroup.growable_ores.test_group"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(GrowableOresBlocks.Coal_Cane.get());
                        pOutput.accept(GrowableOresBlocks.Iron_Cane.get());
                        pOutput.accept(GrowableOresBlocks.Diamond_Cane.get());
                        pOutput.accept(GrowableOresBlocks.Copper_Cane.get());
                        pOutput.accept(GrowableOresBlocks.Emerald_Cane.get());
                        pOutput.accept(GrowableOresBlocks.Gold_Cane.get());
                        pOutput.accept(GrowableOresBlocks.Lapis_Cane.get());
                        pOutput.accept(GrowableOresBlocks.Nether_Quartz_Cane.get());
                        pOutput.accept(GrowableOresBlocks.Redstone_Cane.get());
                        pOutput.accept(GrowableOresBlocks.Blaze_Rod_Cane.get());
                        pOutput.accept(GrowableOresBlocks.Ender_Pearl_Cane.get());
                        pOutput.accept(GrowableOresBlocks.Netherite_Ingot_Cane.get());
                        pOutput.accept(GrowableOresBlocks.Clay_Cane.get());

                        //ae2
                        pOutput.accept(GrowableOresBlocks.certus_quartz_crystal_Cane.get());

                        //Tech Reborn
            /*pOutput.accept(GrowableOresBlocks.cinnabar_Cane.get());
            pOutput.accept(GrowableOresBlocks.galena_Cane.get());
            pOutput.accept(GrowableOresBlocks.iridium_Cane.get());
            pOutput.accept(GrowableOresBlocks.lead_Cane.get());
            pOutput.accept(GrowableOresBlocks.peridot_Cane.get());
            pOutput.accept(GrowableOresBlocks.pyrite_Cane.get());
            pOutput.accept(GrowableOresBlocks.ruby_Cane.get());
            pOutput.accept(GrowableOresBlocks.sapphire_Cane.get());
            pOutput.accept(GrowableOresBlocks.sheldonite_Cane.get());
            pOutput.accept(GrowableOresBlocks.silver_Cane.get());
            pOutput.accept(GrowableOresBlocks.sphalerite_Cane.get());
            pOutput.accept(GrowableOresBlocks.tin_Cane.get());
            pOutput.accept(GrowableOresBlocks.tungsten_Cane.get());
            pOutput.accept(GrowableOresBlocks.sodalite_Cane.get());
            pOutput.accept(GrowableOresBlocks.bauxite_Cane.get());*/

                        //BetterEnd
                        pOutput.accept(GrowableOresBlocks.amber_Cane.get());
                        pOutput.accept(GrowableOresBlocks.ender_Cane.get());
                        pOutput.accept(GrowableOresBlocks.thallasium_Cane.get());

                        //Maple

                        //Powah Rearchitected and Powah
                        pOutput.accept(GrowableOresBlocks.Steel_Energized_Cane.get());
                        pOutput.accept(GrowableOresBlocks.Uraninite_Ore_Dense_Cane.get());
                        pOutput.accept(GrowableOresBlocks.Ender_Core_Cane.get());
                        pOutput.accept(GrowableOresBlocks.Crystal_Spirited_Cane.get());
                        pOutput.accept(GrowableOresBlocks.Crystal_Nitro_Cane.get());
                        pOutput.accept(GrowableOresBlocks.Crystal_Niotic_Cane.get());
                        pOutput.accept(GrowableOresBlocks.Crystal_Blazing_Cane.get());

                        //Create
                        pOutput.accept(GrowableOresBlocks.C_Andesite_Alloy_Cane.get());
                        pOutput.accept(GrowableOresBlocks.C_Brass_Ingot_Cane.get());
                        pOutput.accept(GrowableOresBlocks.C_Zinc_Cane.get());
                        pOutput.accept(GrowableOresBlocks.C_Polished_Rose_Quartz_Cane.get());

                        //Ad Astra!
                        pOutput.accept(GrowableOresBlocks.AD_Ostrum_Cane.get());
                        pOutput.accept(GrowableOresBlocks.AD_Ice_Shard_Cane.get());
                        pOutput.accept(GrowableOresBlocks.AD_Cheese_Cane.get());
                        pOutput.accept(GrowableOresBlocks.AD_Desh_Cane.get());
                        pOutput.accept(GrowableOresBlocks.AD_Calorite_Cane.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
