package com.skniro.growableores.registry.tag;

import com.skniro.growableores.GrowableOres;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class GrowableBlockTags {
    public static final TagKey<Block> GrowBlock = of("growblock");



    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(GrowableOres.MOD_ID ,id));
    }
}
