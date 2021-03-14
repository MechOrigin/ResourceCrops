package net.fabricmc.crops;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.crops.util.BlockRenders;
import net.fabricmc.crops.util.ItemRenders;

public class CropsClient implements ClientModInitializer {

    public void onInitializeClient() {
        
        BlockRenders.defineRenders();
        ItemRenders.defineRenders();
    }
    
}
