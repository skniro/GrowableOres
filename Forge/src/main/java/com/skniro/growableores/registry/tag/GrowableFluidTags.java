package com.skniro.growableores.registry.tag;

import com.skniro.growableores.GrowableOres;
import net.minecraft.fluid.Fluid;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.Tags;

public class GrowableFluidTags {
    public static final Tags.IOptionalNamedTag<Fluid> GrowFluid = of("growfluid");



    private static Tags.IOptionalNamedTag<Fluid> of(String id) {
        return FluidTags.createOptional(new ResourceLocation(GrowableOres.MOD_ID ,id));
    }
}
