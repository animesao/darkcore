package com.darkcore.core.api.scoreboard;

import org.bukkit.entity.Player;
import java.util.List;

public interface IScoreboardManager {
    void setScoreboard(Player player, String title, List<String> lines);
    void updateLines(Player player, List<String> lines);
    void removeScoreboard(Player player);
}
