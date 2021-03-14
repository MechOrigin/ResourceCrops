package net.fabricmc.crops.util;

import net.fabricmc.crops.init.BlockInit;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.render.RenderLayer;

public class BlockRenders {

    public static void defineRenders() {

        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.IRON_PLANT, RenderLayer.getCutoutMipped());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xa0a5a9, BlockInit.IRON_PLANT);

        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.GOLD_PLANT, RenderLayer.getCutoutMipped());
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xffd700, BlockInit.GOLD_PLANT);
    }
    
}
