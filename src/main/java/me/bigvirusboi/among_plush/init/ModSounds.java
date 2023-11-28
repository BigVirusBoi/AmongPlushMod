package me.bigvirusboi.among_plush.init;

import me.bigvirusboi.among_plush.AmongPlushMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class ModSounds {
    public static SoundEvent AMOGUS = registerSoundEvent("amogus");

    private static SoundEvent registerSoundEvent(String name) {
        ResourceLocation resource = new ResourceLocation(AmongPlushMod.MOD_ID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, resource, SoundEvent.createFixedRangeEvent(resource, 16));
    }

    public static void registerSounds() {
        AmongPlushMod.LOGGER.info("Registering Mod Sounds for " + AmongPlushMod.MOD_ID);
    }
}
