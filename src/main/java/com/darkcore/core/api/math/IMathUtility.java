package com.darkcore.core.api.math;

import org.bukkit.Location;
import org.bukkit.util.Vector;

/**
 * Утилиты для математических расчетов в мире Minecraft.
 */
public interface IMathUtility {
    Vector getDirection(Location from, Location to);
    boolean isInside(Location loc, Location min, Location max);
    double getDistance(Location loc1, Location loc2);
}
