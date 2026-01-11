package com.darkcore.core.config;

import org.bukkit.configuration.file.FileConfiguration;
import com.darkcore.core.DarkCoreMain;

public class CoreConfig {
    private final DarkCoreMain plugin;
    private FileConfiguration config;

    public CoreConfig(DarkCoreMain plugin) {
        this.plugin = plugin;
        plugin.saveDefaultConfig();
        this.config = plugin.getConfig();
    }

    public String getString(String path) {
        return config.getString(path);
    }

    public int getInt(String path) {
        return config.getInt(path);
    }

    public boolean getBoolean(String path) {
        return config.getBoolean(path);
    }

    public void reload() {
        plugin.reloadConfig();
        this.config = plugin.getConfig();
    }
}
