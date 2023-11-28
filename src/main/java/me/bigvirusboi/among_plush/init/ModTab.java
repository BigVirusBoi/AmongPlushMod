package me.bigvirusboi.among_plush.init;

import me.bigvirusboi.among_plush.AmongPlushMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTab {
    public static CreativeModeTab TAB;

    public static void registerTab() {
        TAB = FabricItemGroup.builder()
                .title(Component.translatable("item_group." + AmongPlushMod.MOD_ID + ".mogus"))
                .displayItems((itemDisplayParameters, output) -> output.accept(ModBlocks.PLUSH))
                .icon(() -> new ItemStack(ModBlocks.PLUSH)).build();

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(AmongPlushMod.MOD_ID, "mogus"), TAB);
    }
}
