package com.skniro.growableores.registry.tag;

import com.skniro.growableores.GrowableOres;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

import java.util.logging.Logger;

public class GrowableBlockTags {
    public static final Tag<Block> GrowBlock = of("growblock");



    private static Tag<Block> of(String id) {
        return TagRegistry.block(new Identifier(GrowableOres.MOD_ID, id));
    }

    public static void registerBlockTags() {
        Logger.getLogger("register mod block tags" + GrowableOres.MOD_ID);
    }
}
