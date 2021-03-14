package net.fabricmc.crops;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.crops.init.BlockInit;
import net.fabricmc.crops.init.ItemInit;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class Crops implements ModInitializer {

	public static final String MOD_ID = "crops";
	public static ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "item_group"), () -> new ItemStack(ItemInit.IRON_ESSENCE));

	@Override
	public void onInitialize() {

		ItemInit.init();
		BlockInit.init();


	}
}
