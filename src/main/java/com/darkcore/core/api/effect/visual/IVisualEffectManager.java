package com.darkcore.core.api.effect.visual;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.Color;

/**
 * API для создания продвинутых визуальных эффектов и частиц.
 */
public interface IVisualEffectManager {
    void spawnParticleLine(Location start, Location end, Particle particle, int count, double spacing);
    void spawnParticleCircle(Location center, double radius, Particle particle, int count);
    void spawnColoredParticle(Location loc, Particle particle, Color color, float size);
}
