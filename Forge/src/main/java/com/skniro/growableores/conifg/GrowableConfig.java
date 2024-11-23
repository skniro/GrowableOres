package com.skniro.growableores.conifg;

import net.minecraftforge.common.ForgeConfigSpec;

public class GrowableConfig {
    public static final ForgeConfigSpec GENERAL_SPEC;

    static {
        ForgeConfigSpec.Builder configBuilder = new ForgeConfigSpec.Builder();
        setupConfig(configBuilder);
        GENERAL_SPEC = configBuilder.build();
    }

    public static ForgeConfigSpec.BooleanValue All_Item_Mode;
    public static ForgeConfigSpec.IntValue Ore_Cane_Max_Height;
    private static void setupConfig(ForgeConfigSpec.Builder builder) {
        All_Item_Mode = builder.comment("Disable All Item Mode.")
                .define("All Item Mode",false);
        Ore_Cane_Max_Height = builder.comment("Control the max height of Ore cane. Default value is 3.")
                .defineInRange("Ore_Cane_Max_Height",3,1,128);
    }

}
