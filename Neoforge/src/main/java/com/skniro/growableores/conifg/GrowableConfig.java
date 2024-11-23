package com.skniro.growableores.conifg;

import net.neoforged.neoforge.common.ModConfigSpec;
import net.neoforged.neoforge.common.NeoForgeConfig;

public class GrowableConfig {
    public static final ModConfigSpec GENERAL_SPEC;

    static {
        ModConfigSpec.Builder configBuilder = new ModConfigSpec.Builder();
        setupConfig(configBuilder);
        GENERAL_SPEC = configBuilder.build();
    }

    public static ModConfigSpec.BooleanValue All_Item_Mode;
    public static ModConfigSpec.IntValue Ore_Cane_Max_Height;
    private static void setupConfig(ModConfigSpec.Builder builder) {
        All_Item_Mode = builder.comment("Disable All Item Mode.")
                .define("All Item Mode",false);
        Ore_Cane_Max_Height = builder.comment("Control the max height of Ore cane. Default value is 3.")
                .defineInRange("Ore_Cane_Max_Height",3,1,128);
    }

}
