package com.darkcore.core.api.skin;

import org.bukkit.entity.Player;

/**
 * API для управления скинами игроков без перезахода.
 */
public interface ISkinManager {
    void setSkin(Player player, String skinName);
    void resetSkin(Player player);
    String getActiveSkin(Player player);
}
