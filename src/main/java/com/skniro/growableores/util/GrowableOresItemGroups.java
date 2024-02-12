package com.skniro.growableores.util;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.*;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class GrowableOresItemGroups {
    public static final RegistryKey<ItemGroup> Growable_Ores_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(GrowableOres.MOD_ID, "test_group"));
    public static final RegistryKey<ItemGroup> Growable_AE_Ores_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(GrowableOres.MOD_ID, "test_group1"));
    public static final RegistryKey<ItemGroup> Growable_BetterEnd_Ores_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(GrowableOres.MOD_ID, "test_group2"));
    public static final RegistryKey<ItemGroup> Growable_TechReborn_Ores_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(GrowableOres.MOD_ID, "test_group3"));
    public static final RegistryKey<ItemGroup> Growable_Maple_Ores_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(GrowableOres.MOD_ID, "test_group4"));
    public static final RegistryKey<ItemGroup> Growable_Powah_Ores_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(GrowableOres.MOD_ID, "test_group5"));
    public static final RegistryKey<ItemGroup> Growable_IR_Ores_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(GrowableOres.MOD_ID, "test_group6"));
    public static final RegistryKey<ItemGroup> Growable_MI_Ores_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(GrowableOres.MOD_ID, "test_group7"));
    public static final RegistryKey<ItemGroup> Growable_IC_Ores_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(GrowableOres.MOD_ID, "test_group8"));
    public static final RegistryKey<ItemGroup> Growable_AD_Ores_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(GrowableOres.MOD_ID, "test_group9"));
    public static final RegistryKey<ItemGroup> Growable_C_Ores_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(GrowableOres.MOD_ID, "test_group10"));
    public static final RegistryKey<ItemGroup> Growable_TF_Ores_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(GrowableOres.MOD_ID, "test_group10"));


    public static void itemgroups() {
        Registry.register(Registries.ITEM_GROUP, Growable_Ores_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(GrowableVanillaOresBlocks.Iron_Cane))
                .displayName(Text.translatable("itemGroup.growable_ores.test_group"))
                .build()); // build() no longer registers by itself

        Registry.register(Registries.ITEM_GROUP, Growable_AE_Ores_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(GrowableAEOresBlocks.certus_quartz_crystal_Cane))
                .displayName(Text.translatable("itemGroup.growable_ores.test_group1"))
                .build()); // build() no longer registers by itself

        Registry.register(Registries.ITEM_GROUP, Growable_BetterEnd_Ores_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(GrowableBetterEndOresBlocks.amber_Cane))
                .displayName(Text.translatable("itemGroup.growable_ores.test_group2"))
                .build()); // build() no longer registers by itself

        Registry.register(Registries.ITEM_GROUP, Growable_TechReborn_Ores_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(GrowableTechRebornOresBlocks.cinnabar_Cane))
                .displayName(Text.translatable("itemGroup.growable_ores.test_group3"))
                .build()); // build() no longer registers by itself

        Registry.register(Registries.ITEM_GROUP, Growable_Maple_Ores_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(GrowableMapleOresBlocks.Salt_Cane))
                .displayName(Text.translatable("itemGroup.growable_ores.test_group4"))
                .build()); // build() no longer registers by itself

        Registry.register(Registries.ITEM_GROUP, Growable_Powah_Ores_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(GrowablePowahOresBlocks.Steel_Energized_Cane))
                .displayName(Text.translatable("itemGroup.growable_ores.test_group5"))
                .build()); // build() no longer registers by itself

        Registry.register(Registries.ITEM_GROUP, Growable_IR_Ores_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(GrowableIndustrialRevolutionOresBlocks.IR_Lead_Cane))
                .displayName(Text.translatable("itemGroup.growable_ores.test_group6"))
                .build()); // build() no longer registers by itself

        Registry.register(Registries.ITEM_GROUP, Growable_MI_Ores_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(GrowableModernIndustrializationOresBlocks.MI_antimony_Cane))
                .displayName(Text.translatable("itemGroup.growable_ores.test_group7"))
                .build()); // build() no longer registers by itself

        Registry.register(Registries.ITEM_GROUP, Growable_IC_Ores_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(GrowableICOresBlocks.IC2_Aluminium_Cane))
                .displayName(Text.translatable("itemGroup.growable_ores.test_group8"))
                .build()); // build() no longer registers by itself

        Registry.register(Registries.ITEM_GROUP, Growable_AD_Ores_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(GrowableAdAstraOresBlocks.AD_Ostrum_Cane))
                .displayName(Text.translatable("itemGroup.growable_ores.test_group9"))
                .build()); // build() no longer registers by itself

        Registry.register(Registries.ITEM_GROUP, Growable_C_Ores_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(GrowableCreateOresBlocks.C_Andesite_Alloy_Cane))
                .displayName(Text.translatable("itemGroup.growable_ores.test_group10"))
                .build()); // build() no longer registers by itself

        Registry.register(Registries.ITEM_GROUP, Growable_TF_Ores_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(GrowableThermalSeriesOresBlocks.TF_Apatite_Cane))
                .displayName(Text.translatable("itemGroup.growable_ores.test_group11"))
                .build()); // build() no longer registers by itself

    }

    public static void vanilla_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Ores_Group).register(content -> {
            content.add(GrowableVanillaOresBlocks.Coal_Cane);
            content.add(GrowableVanillaOresBlocks.Iron_Cane);
            content.add(GrowableVanillaOresBlocks.Diamond_Cane);
            content.add(GrowableVanillaOresBlocks.Copper_Cane);
            content.add(GrowableVanillaOresBlocks.Emerald_Cane);
            content.add(GrowableVanillaOresBlocks.Gold_Cane);
            content.add(GrowableVanillaOresBlocks.Lapis_Cane);
            content.add(GrowableVanillaOresBlocks.Nether_Quartz_Cane);
            content.add(GrowableVanillaOresBlocks.Redstone_Cane);
            content.add(GrowableVanillaOresBlocks.Blaze_Rod_Cane);
            content.add(GrowableVanillaOresBlocks.Ender_Pearl_Cane);
            content.add(GrowableVanillaOresBlocks.Netherite_Ingot_Cane);
            content.add(GrowableVanillaOresBlocks.Clay_Cane);
            content.add(GrowableVanillaOresBlocks.Glowstone_Cane);
            content.add(GrowableVanillaOresBlocks.Slime_Cane);
            content.add(GrowableVanillaOresBlocks.Bone_Cane);
            content.add(GrowableVanillaOresBlocks.Nether_Star_Cane);
        });
    }
    public static void ae_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_AE_Ores_Group).register(content -> {
            //ae2
            content.add(GrowableAEOresBlocks.certus_quartz_crystal_Cane);
            content.add(GrowableAEOresBlocks.fluix_crystal_Cane);
        });
    }

    public static void techreborn_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_TechReborn_Ores_Group).register(content -> {
            //Tech Reborn
            content.add(GrowableTechRebornOresBlocks.cinnabar_Cane);
            content.add(GrowableTechRebornOresBlocks.galena_Cane);
            content.add(GrowableTechRebornOresBlocks.iridium_Cane);
            content.add(GrowableTechRebornOresBlocks.lead_Cane);
            content.add(GrowableTechRebornOresBlocks.peridot_Cane);
            content.add(GrowableTechRebornOresBlocks.pyrite_Cane);
            content.add(GrowableTechRebornOresBlocks.ruby_Cane);
            content.add(GrowableTechRebornOresBlocks.sapphire_Cane);
            content.add(GrowableTechRebornOresBlocks.sheldonite_Cane);
            content.add(GrowableTechRebornOresBlocks.silver_Cane);
            content.add(GrowableTechRebornOresBlocks.sphalerite_Cane);
            content.add(GrowableTechRebornOresBlocks.tin_Cane);
            content.add(GrowableTechRebornOresBlocks.tungsten_Cane);
            content.add(GrowableTechRebornOresBlocks.sodalite_Cane);
            content.add(GrowableTechRebornOresBlocks.bauxite_Cane);
        });
    }

    public static void betterend_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_BetterEnd_Ores_Group).register(content -> {
            //BetterEnd
            content.add(GrowableBetterEndOresBlocks.amber_Cane);
            content.add(GrowableBetterEndOresBlocks.ender_Cane);
            content.add(GrowableBetterEndOresBlocks.thallasium_Cane);
        });
    }

    public static void maple_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Maple_Ores_Group).register(content -> {
            //Maple
            content.add(GrowableMapleOresBlocks.Salt_Cane);
        });
    }
    public static void powah_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_Powah_Ores_Group).register(content -> {
            //Powah Rearchitected and Powah
            content.add(GrowablePowahOresBlocks.Steel_Energized_Cane);
            content.add(GrowablePowahOresBlocks.Uraninite_Ore_Dense_Cane);
            content.add(GrowablePowahOresBlocks.Ender_Core_Cane);
            content.add(GrowablePowahOresBlocks.Crystal_Spirited_Cane);
            content.add(GrowablePowahOresBlocks.Crystal_Nitro_Cane);
            content.add(GrowablePowahOresBlocks.Crystal_Niotic_Cane);
            content.add(GrowablePowahOresBlocks.Crystal_Blazing_Cane);
        });
    }

    public static void ir_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_IR_Ores_Group).register(content -> {
            //Industrial Revolution
            content.add(GrowableIndustrialRevolutionOresBlocks.IR_Lead_Cane);
            content.add(GrowableIndustrialRevolutionOresBlocks.IR_nikolite_Cane );
            content.add(GrowableIndustrialRevolutionOresBlocks.IR_silver_Cane);
            content.add(GrowableIndustrialRevolutionOresBlocks.IR_tin_ore_Cane);
            content.add(GrowableIndustrialRevolutionOresBlocks.IR_tungsten_Cane);
        });
    }
    public static void mi_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_MI_Ores_Group).register(content -> {
    //Modern Industrialization
            content.add(GrowableModernIndustrializationOresBlocks.MI_antimony_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_bauxite_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_iridium_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_lead_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_lignite_coal_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_monazite_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_nickel_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_platinum_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_quartz_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_salt_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_tin_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_titanium_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_tungsten_Cane);
            content.add(GrowableModernIndustrializationOresBlocks.MI_uranium_Cane);
        });
    }
    public static void ic_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_IC_Ores_Group).register(content -> {
            //ic2 and ic2c
            content.add(GrowableICOresBlocks.IC2_Aluminium_Cane);
            content.add(GrowableICOresBlocks.IC2_silver_Cane);
            content.add(GrowableICOresBlocks.IC2_Tin_Cane);
            content.add(GrowableICOresBlocks.IC2_Uranium_Cane);
        });
    }
    public static void ad_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_AD_Ores_Group).register(content -> {
            //Ad Astra!
            content.add(GrowableAdAstraOresBlocks.AD_Ostrum_Cane);
            content.add(GrowableAdAstraOresBlocks.AD_Ice_Shard_Cane);
            content.add(GrowableAdAstraOresBlocks.AD_Cheese_Cane);
            content.add(GrowableAdAstraOresBlocks.AD_Desh_Cane);
            content.add(GrowableAdAstraOresBlocks.AD_Calorite_Cane);
        });
    }
    public static void c_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_C_Ores_Group).register(content -> {
            //Create
            content.add(GrowableCreateOresBlocks.C_Andesite_Alloy_Cane);
            content.add(GrowableCreateOresBlocks.C_Brass_Ingot_Cane);
            content.add(GrowableCreateOresBlocks.C_Polished_Rose_Quartz_Cane);
            content.add(GrowableCreateOresBlocks.C_Zinc_Cane);
        });
    }
    public static void tf_item() {
        ItemGroupEvents.modifyEntriesEvent(Growable_TF_Ores_Group).register(content -> {
            //Thermal Series
            content.add(GrowableThermalSeriesOresBlocks.TF_Apatite_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Cinnabar_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Copper_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Lead_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Nickel_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Niter_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Ruby_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Sapphire_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Silver_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Sulfur_Cane);
            content.add(GrowableThermalSeriesOresBlocks.TF_Tin_Cane);
        });
    }
}
