package com.skniro.growableores.client;

import com.google.common.base.Preconditions;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraftforge.client.loading.ClientModLoader;

import java.util.HashMap;
import java.util.Map;

public class ModItemBlockRenderTypes {
    private static final Map<Block, ChunkSectionLayer> TYPE_BY_BLOCK = new HashMap<>();

    public static synchronized void setRenderLayer(Block block, ChunkSectionLayer layer) {
        checkClientLoading();
        TYPE_BY_BLOCK.put(block, layer);
    }
    private static boolean cutoutLeaves;

    public static ChunkSectionLayer getChunkRenderType(BlockState state) {
        Block block = state.getBlock();
        if (block instanceof LeavesBlock) {
            return cutoutLeaves ? ChunkSectionLayer.CUTOUT : ChunkSectionLayer.SOLID;
        } else {
            ChunkSectionLayer layer = (ChunkSectionLayer)TYPE_BY_BLOCK.get(block);
            return layer != null ? layer : ChunkSectionLayer.SOLID;
        }
    }

    public static RenderType getMovingBlockRenderType(BlockState state) {
        Block block = state.getBlock();
        if (block instanceof LeavesBlock) {
            return cutoutLeaves ? RenderTypes.cutoutMovingBlock() : RenderTypes.solidMovingBlock();
        } else {
            ChunkSectionLayer layer = (ChunkSectionLayer)TYPE_BY_BLOCK.get(block);
            if (layer != null) {
                RenderType var10000;
                switch (layer) {
                    case SOLID -> var10000 = RenderTypes.solidMovingBlock();
                    case CUTOUT -> var10000 = RenderTypes.cutoutMovingBlock();
                    case TRANSLUCENT -> var10000 = RenderTypes.translucentMovingBlock();
                    default -> throw new MatchException((String)null, (Throwable)null);
                }

                return var10000;
            } else {
                return RenderTypes.solidMovingBlock();
            }
        }
    }
    public static RenderType getRenderType(BlockState state) {
        ChunkSectionLayer renderType = getChunkRenderType(state);
        return renderType == ChunkSectionLayer.TRANSLUCENT ? Sheets.translucentBlockItemSheet() : Sheets.cutoutBlockItemSheet();
    }


    private static void checkClientLoading() {
        Preconditions.checkState(ClientModLoader.isLoading(), "Render layers can only be set during client loading! This should ideally be done from `FMLClientSetupEvent`.");
    }

    public static void setRenderLayer(FlowingFluid flowingFluid, ChunkSectionLayer renderLayer4) {

    }
}
