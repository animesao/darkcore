package com.darkcore.core.manager;

import com.darkcore.core.api.ICorePlugin;
import java.util.HashMap;
import java.util.Map;

public class PluginManager {
    private final Map<String, ICorePlugin> plugins = new HashMap<>();

    public void registerPlugin(ICorePlugin plugin) {
        plugins.put(plugin.getPluginName(), plugin);
        plugin.onPluginEnable();
        System.out.println("Registered Core Plugin: " + plugin.getPluginName());
    }

    public void unregisterPlugin(String name) {
        ICorePlugin plugin = plugins.remove(name);
        if (plugin != null) {
            plugin.onPluginDisable();
        }
    }
}
