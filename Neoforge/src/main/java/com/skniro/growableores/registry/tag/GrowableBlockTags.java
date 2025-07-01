package com.skniro.growableores.registry.tag;

import com.skniro.growableores.GrowableOres;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class GrowableBlockTags {
    public static final TagKey<Block> GrowBlock = of("growblock");



    private static TagKey<Block> of(String id) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(GrowableOres.MOD_ID ,id));
    }
}
