package com.skniro.growableores.registry.tag;

import com.skniro.growableores.GrowableOres;
import net.minecraft.fluid.Fluid;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GrowableFluidTags {
    public static final TagKey<Fluid> GrowFluid = of("growfluid");



    private static TagKey<Fluid> of(String id) {
        return TagKey.of(Registry.FLUID_KEY, new Identifier(GrowableOres.MOD_ID ,id));
    }
}
