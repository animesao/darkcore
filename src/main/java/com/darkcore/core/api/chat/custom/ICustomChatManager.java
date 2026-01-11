package com.darkcore.core.api.chat.custom;

import org.bukkit.entity.Player;
import java.util.List;

/**
 * API for managing custom chat channels, formats, and rich text components.
 */
public interface ICustomChatManager {
    void createChannel(String id, String format, String permission);
    void setPlayerChannel(Player player, String channelId);
    String getPlayerChannel(Player player);
    
    void registerChatFilter(String pattern, String replacement);
    String processChat(Player player, String message);
    
    void sendJsonMessage(Player player, String json);
}
