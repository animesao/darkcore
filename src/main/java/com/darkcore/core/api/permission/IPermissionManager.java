package com.darkcore.core.api.permission;

import org.bukkit.entity.Player;

/**
 * API для управления правами доступа.
 */
public interface IPermissionManager {
    void addPermission(Player player, String permission);
    void removePermission(Player player, String permission);
    boolean hasPermission(Player player, String permission);
}
