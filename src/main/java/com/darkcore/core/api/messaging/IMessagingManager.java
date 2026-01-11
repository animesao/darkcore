package com.darkcore.core.api.messaging;

import org.bukkit.entity.Player;

/**
 * API для межсерверной и внутренней передачи сообщений.
 */
public interface IMessagingManager {
    void sendPluginMessage(Player player, String channel, byte[] data);
    void broadcastToServers(String message);
}
