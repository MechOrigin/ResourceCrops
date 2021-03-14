package net.fabricmc.crops.init;

import net.fabricmc.crops.Crops;
import net.fabricmc.crops.items.ItemCropGold;
import net.fabricmc.crops.items.ItemCropIron;
import net.fabricmc.crops.items.ItemSeedGold;
import net.fabricmc.crops.items.ItemSeedIron;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ItemInit {

    public static final ItemCropIron IRON_ESSENCE = Registry.register(Registry.ITEM, new Identifier(Crops.MOD_ID, "iron_essence"), new ItemCropIron(new Item.Settings().group(Crops.ITEM_GROUP)));

    public static final ItemSeedIron IRON_SEEDS = Registry.register(Registry.ITEM, new Identifier(Crops.MOD_ID, "iron_seeds"), new ItemSeedIron(BlockInit.IRON_PLANT,(new Item.Settings().group(Crops.ITEM_GROUP))));

    public static final ItemCropGold GOLD_ESSENCE = Registry.register(Registry.ITEM, new Identifier(Crops.MOD_ID, "gold_essence"), new ItemCropGold(new Item.Settings().group(Crops.ITEM_GROUP)));

    public static final ItemSeedGold GOLD_SEEDS = Registry.register(Registry.ITEM, new Identifier(Crops.MOD_ID, "gold_seeds"), new ItemSeedGold(BlockInit.GOLD_PLANT,(new Item.Settings().group(Crops.ITEM_GROUP))));


    public static void init() {
        
    }
}
