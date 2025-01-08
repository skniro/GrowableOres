package com.skniro.growableores.registry.tag;

import com.skniro.growableores.GrowableOres;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.fluid.Fluid;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class GrowableFluidTags {
    public static final Tag<Fluid> GrowFluid = of("growfluid");



    private static Tag<Fluid> of(String id) {
        return TagRegistry.fluid(new Identifier(GrowableOres.MOD_ID ,id));
    }
}
