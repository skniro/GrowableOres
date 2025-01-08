package com.skniro.growableores.registry.tag;

import com.skniro.growableores.GrowableOres;
import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class GrowableBlockTags {
    public static final Tags.IOptionalNamedTag<Block> GrowBlock = of("growblock");



    private static Tags.IOptionalNamedTag<Block> of(String id) {
        return BlockTags.createOptional(new ResourceLocation(GrowableOres.MOD_ID ,id));
    }
}
