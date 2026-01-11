package com.darkcore.core.api.player;

import org.bukkit.entity.Player;
import java.util.UUID;
import java.util.Optional;
import java.util.Map;
import com.darkcore.core.api.common.IResult;

public interface IPlayerDataManager {
    IResult<Void> setStat(UUID uuid, String key, Object value);
    IResult<Object> getStat(UUID uuid, String key);
    IResult<Map<String, Object>> getAllStats(UUID uuid);
    boolean hasStat(UUID uuid, String key);
    IResult<Void> removeStat(UUID uuid, String key);
    
    IResult<Void> setLevel(Player player, int level);
    int getLevel(Player player);
    IResult<Void> addExperience(Player player, double amount);
    double getExperience(Player player);
    
    IResult<Void> setRank(Player player, String rank);
    String getRank(Player player);
    boolean hasPermission(Player player, String permission);
    
    IResult<Void> freezePlayer(Player player);
    IResult<Void> unfreezePlayer(Player player);
    boolean isFrozen(Player player);
    
    IResult<Void> setVanished(Player player, boolean vanished);
    boolean isVanished(Player player);
    
    Optional<Player> getPlayer(String name);
    IResult<Void> teleportToLobby(Player player);
}
