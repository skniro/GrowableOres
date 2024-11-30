package com.skniro.growableores.registry.tag;

import com.skniro.growableores.GrowableOres;
import net.minecraft.fluid.Fluid;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class GrowableFluidTags {
    public static final TagKey<Fluid> GrowFluid = of("growfluid");



    private static TagKey<Fluid> of(String id) {
        return TagKey.of(RegistryKeys.FLUID, Identifier.of(GrowableOres.MOD_ID ,id));
    }
}
