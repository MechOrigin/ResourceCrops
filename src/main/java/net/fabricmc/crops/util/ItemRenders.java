package net.fabricmc.crops.util;

import net.fabricmc.crops.init.ItemInit;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

public class ItemRenders {

    public static void defineRenders() {
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xa0a5a9, ItemInit.IRON_SEEDS);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xa0a5a9, ItemInit.IRON_ESSENCE);

        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xffd700, ItemInit.GOLD_SEEDS);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xffd700, ItemInit.GOLD_ESSENCE);
    }
    
}
