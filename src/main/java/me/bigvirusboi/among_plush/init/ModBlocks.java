package me.bigvirusboi.among_plush.init;

import me.bigvirusboi.among_plush.AmongPlushMod;
import me.bigvirusboi.among_plush.block.PlushBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {
    public static final Block PLUSH = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(AmongPlushMod.MOD_ID, "plush"),
            new PlushBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL)));

    public static void registerBlocks() {
        AmongPlushMod.LOGGER.info("Registering Mod Blocks for " + AmongPlushMod.MOD_ID);
    }
}
