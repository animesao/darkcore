package com.darkcore.core.api.pet;

import org.bukkit.entity.Player;
import org.bukkit.entity.Entity;

/**
 * API для системы питомцев.
 */
public interface IPetManager {
    Entity spawnPet(Player owner, String petType);
    void removePet(Player owner);
    boolean hasPet(Player owner);
}
