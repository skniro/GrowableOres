package com.skniro.growableores.conifg;

public class GrowableOresConfig {
    @Config(config = "growableores", category = "function", key = "All Item Mode",comment = "Disable All Item Mode.")
    public static boolean All_Item_Mode = true;

    @Config(config = "growableores", category = "function", key = "Ore Cane Max Height",comment = "Control the max height of Ore cane. Default value is 3.")
    public static int Ore_Cane_Max_Height = 3;
}
