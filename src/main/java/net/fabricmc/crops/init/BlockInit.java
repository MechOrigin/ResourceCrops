package net.fabricmc.crops.init;

import net.fabricmc.crops.Crops;
import net.fabricmc.crops.blocks.GoldPlant;
import net.fabricmc.crops.blocks.IronPlant;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockInit {

    public static final IronPlant IRON_PLANT = Registry.register(Registry.BLOCK, new Identifier(Crops.MOD_ID, "iron_plant"), new IronPlant(FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().strength(0.0F, 0.0F).sounds(BlockSoundGroup.CROP).nonOpaque()));

    public static final GoldPlant GOLD_PLANT = Registry.register(Registry.BLOCK, new Identifier(Crops.MOD_ID, "gold_plant"), new GoldPlant(FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().strength(0.0F, 0.0F).sounds(BlockSoundGroup.CROP).nonOpaque()));


    public static void init() {
        
    }

}
