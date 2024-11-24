package com.skniro.growableores.registry.tag;

import com.skniro.growableores.GrowableOres;
import net.minecraft.fluid.Fluid;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class GrowableFluidTags {
    public static final Tag<Fluid> GrowFluid = of("growfluid");



    private static Tag<Fluid> of(String id) {
        return new FluidTags.Wrapper(new ResourceLocation(GrowableOres.MODID ,id));
    }
}
