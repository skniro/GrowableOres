package com.skniro.growableores.registry.tag;

import com.skniro.growableores.GrowableOres;
import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class GrowableBlockTags {
    public static final Tag<Block> GrowBlock = of("growblock");



    private static Tag<Block> of(String id) {
        return new BlockTags.Wrapper(new ResourceLocation(GrowableOres.MODID ,id));
    }
}
