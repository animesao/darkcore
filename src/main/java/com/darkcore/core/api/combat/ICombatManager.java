package com.darkcore.core.api.combat;

import org.bukkit.entity.Player;
import java.util.UUID;

public interface ICombatManager {
    void enterCombat(Player player, Player opponent);
    void exitCombat(Player player);
    boolean isInCombat(Player player);
    long getRemainingTime(Player player);
    UUID getLastOpponent(Player player);
}
