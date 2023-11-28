package me.bigvirusboi.among_plush;

import me.bigvirusboi.among_plush.init.ModBlocks;
import me.bigvirusboi.among_plush.init.ModItems;
import me.bigvirusboi.among_plush.init.ModSounds;
import me.bigvirusboi.among_plush.init.ModTab;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmongPlushMod implements ModInitializer {
    public static final String MOD_ID = "among_plush";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModSounds.registerSounds();
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        ModTab.registerTab();
    }
}
