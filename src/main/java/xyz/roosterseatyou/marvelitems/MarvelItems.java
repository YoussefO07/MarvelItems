package xyz.roosterseatyou.marvelitems;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.roosterseatyou.marvelitems.items.infinitygauntlet.InfinityGauntlet;

import java.util.logging.Logger;

public final class MarvelItems extends JavaPlugin {
    private static Plugin instance;
    private static Logger logger;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        logger = getLogger();
        logger.info("MarvelItems enabled");
        loadItems();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Plugin getInstance() {
        return instance;
    }

    public static Logger logger() {
        return logger;
    }

    private static void loadItems() {
        InfinityGauntlet.init();
    }
}
