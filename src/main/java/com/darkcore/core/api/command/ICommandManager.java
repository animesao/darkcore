package com.darkcore.core.api.command;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;

/**
 * API для динамической регистрации команд.
 */
public interface ICommandManager {
    void registerCommand(String name, CommandExecutor executor);
    void registerCommand(String name, CommandExecutor executor, TabCompleter completer);
    void unregisterCommand(String name);
}
