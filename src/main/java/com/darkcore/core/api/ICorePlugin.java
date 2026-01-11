package com.darkcore.core.api;

public interface ICorePlugin {
    void onPluginEnable();
    void onPluginDisable();
    String getPluginName();
}
