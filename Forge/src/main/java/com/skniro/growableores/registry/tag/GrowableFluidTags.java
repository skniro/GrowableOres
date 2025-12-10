package com.skniro.growableores.registry.tag;

import com.skniro.growableores.GrowableOres;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;

public class GrowableFluidTags {
    public static final TagKey<Fluid> GrowFluid = of("growfluid");



    private static TagKey<Fluid> of(String id) {
        return TagKey.create(Registries.FLUID, Identifier.fromNamespaceAndPath(GrowableOres.MOD_ID ,id));
    }
}
