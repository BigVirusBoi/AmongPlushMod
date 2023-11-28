package me.bigvirusboi.among_plush.init;

import me.bigvirusboi.among_plush.AmongPlushMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final BlockItem PLUSH = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(AmongPlushMod.MOD_ID, "plush"),
            new BlockItem(ModBlocks.PLUSH, new Item.Properties().food(new FoodProperties.Builder().alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.CONFUSION, 20, 4), 20).build())));

    public static void registerItems() {
        AmongPlushMod.LOGGER.info("Registering Mod Items for " + AmongPlushMod.MOD_ID);
    }
}
