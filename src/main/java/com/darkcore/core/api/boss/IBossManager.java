package com.darkcore.core.api.boss;

import org.bukkit.Location;
import org.bukkit.entity.LivingEntity;
import java.util.UUID;

public interface IBossManager {
    LivingEntity spawnBoss(String type, Location location, double health, double damage);
    boolean isBoss(UUID entityId);
    void setBossPhase(UUID entityId, int phase);
    void removeBoss(UUID entityId);
    void broadcastBossDeath(UUID entityId);
}
