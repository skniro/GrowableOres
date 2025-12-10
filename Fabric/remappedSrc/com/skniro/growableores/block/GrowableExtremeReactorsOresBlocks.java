package com.skniro.growableores.block;

import com.skniro.growableores.GrowableOres;
import com.skniro.growableores.block.init.GrowableOreCaneBlock;
import com.skniro.growableores.util.GrowableOresItemGroups;
import java.util.function.Function;
import java.util.logging.Logger;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public class GrowableExtremeReactorsOresBlocks {
    //Extreme Reactors
    public static final Block ER_Anglesite_Crystal_Cane = registerBlock("er_anglesite_crystal_cane", GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ER_Benitoite_Crystal_Cane = registerBlock("er_benitoite_crystal_cane", GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ER_Blutonium_Ingot_Cane = registerBlock("er_blutonium_ingot_cane", GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ER_Cyanite_Ingot_Cane = registerBlock("er_cyanite_ingot_cane", GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ER_Graphite_Ingot_Cane = registerBlock("er_graphite_ingot_cane", GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ER_Inanite_Ingot_Cane = registerBlock("er_inanite_ingot_cane", GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ER_Insanite_Ingot_Cane = registerBlock("er_insanite_ingot_cane", GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ER_Ludicrite_Ingot_Cane = registerBlock("er_ludicrite_ingot_cane", GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ER_Magentite_Ingot_Cane = registerBlock("er_magentite_ingot_cane", GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ER_Ridiculite_Ingot_Cane = registerBlock("er_ridiculite_ingot_cane", GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);
    public static final Block ER_Yellorium_Ingot_Cane = registerBlock("er_yellorium_ingot_cane", GrowableOreCaneBlock::new ,BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollision().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY),GrowableOresItemGroups.Growable_Ores_Group);


    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings, ResourceKey<CreativeModeTab> tab) {
        Block block = (Block)factory.apply(settings.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(GrowableOres.MOD_ID, name))));
        registerBlockItem(name, block, tab);
        return Registry.register(BuiltInRegistries.BLOCK, ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(GrowableOres.MOD_ID, name)), block);
    }

    private static Item registerBlockItem(String name, Block block, ResourceKey<CreativeModeTab> tab) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GrowableOres.MOD_ID, name)),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GrowableOres.MOD_ID, name)))));
    }

    public static void registerModBlocks(){
        Logger.getLogger("register mod blocks" + GrowableOres.MOD_ID);
    }
}

