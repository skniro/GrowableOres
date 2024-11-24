package com.skniro.growableores.registry.tag;

import com.skniro.growableores.GrowableOres;
import net.minecraft.fluid.Fluid;
import net.minecraft.tag.FluidTags;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class GrowableFluidTags {
    public static final Tag<Fluid> GrowFluid = of("growfluid");



    private static Tag<Fluid> of(String id) {
        return new FluidTags.CachingTag(new Identifier(GrowableOres.MOD_ID, id));
    }
}
