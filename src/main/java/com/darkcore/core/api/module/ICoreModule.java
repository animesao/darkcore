package com.darkcore.core.api.module;

/**
 * Интерфейс для динамических модулей ядра.
 */
public interface ICoreModule {
    String getName();
    void onEnable();
    void onDisable();
    boolean isEnabled();
}
