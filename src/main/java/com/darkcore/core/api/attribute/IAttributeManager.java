package com.darkcore.core.api.attribute;

import org.bukkit.entity.LivingEntity;
import java.util.UUID;

/**
 * API for managing custom attributes like critical strike, life steal, etc.
 */
public interface IAttributeManager {
    void setAttribute(UUID entityId, String attribute, double value);
    double getAttribute(UUID entityId, String attribute);
    void addModifier(UUID entityId, String attribute, String source, double amount);
    void removeModifier(UUID entityId, String attribute, String source);
}
