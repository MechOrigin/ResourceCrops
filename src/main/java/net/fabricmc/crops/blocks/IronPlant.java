package net.fabricmc.crops.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class IronPlant extends CropBlock {

	public IronPlant(Block.Settings builder) {
        super(builder);
	}

    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add((new TranslatableText("block.crops.iron_plant").formatted(Formatting.GREEN)));
    }

}
