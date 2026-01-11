package com.darkcore.core.api.chat;

import org.bukkit.entity.Player;
import com.darkcore.core.api.common.IResult;

public interface IChatManager {
    IResult<Void> sendMessage(Player player, String message);
    IResult<Void> broadcast(String message);
    IResult<Void> sendPrivateMessage(Player from, Player to, String message);
    
    IResult<Void> setChatPrefix(Player player, String prefix);
    String getChatPrefix(Player player);
    
    IResult<Void> mutePlayer(Player player, long durationMillis);
    IResult<Void> unmutePlayer(Player player);
    boolean isMuted(Player player);
    
    IResult<Void> setChatColor(Player player, String colorCode);
    String formatColors(String text);
    
    IResult<Void> clearChat();
}
