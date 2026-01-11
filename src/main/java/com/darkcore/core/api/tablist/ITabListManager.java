package com.darkcore.core.api.tablist;

import org.bukkit.entity.Player;

public interface ITabListManager {
    void setHeaderFooter(Player player, String header, String footer);
    void setPlayerName(Player player, String name);
}
