package com.darkcore.core;

import org.bukkit.plugin.java.JavaPlugin;
import com.darkcore.core.manager.PluginManager;
import com.darkcore.core.updater.CoreUpdater;
import com.darkcore.core.config.CoreConfig;

public class DarkCoreMain extends JavaPlugin {
    private static DarkCoreMain instance;
    private PluginManager pluginManager;
    private CoreConfig coreConfig;

    @Override
    public void onEnable() {
        instance = this;
        this.coreConfig = new CoreConfig(this);
        this.pluginManager = new PluginManager();
        
        // Initialize Updater
        CoreUpdater updater = new CoreUpdater(this);
        getServer().getPluginManager().registerEvents(updater, this);
        
        getLogger().info("DarkCore Engine v" + getDescription().getVersion() + " has been successfully initialized!");
    }

    public static DarkCoreMain getInstance() {
        return instance;
    }

    public PluginManager getCorePluginManager() {
        return pluginManager;
    }

    public CoreConfig getCoreConfig() {
        return coreConfig;
    }
}
