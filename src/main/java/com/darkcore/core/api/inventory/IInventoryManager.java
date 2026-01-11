package com.darkcore.core.api.inventory;

import org.bukkit.inventory.ItemStack;
import org.bukkit.entity.Player;

/**
 * API для продвинутого управления инвентарем и предметами.
 */
public interface IInventoryManager {
    void giveItem(Player player, ItemStack item);
    boolean hasItem(Player player, ItemStack item, int amount);
    void removeItem(Player player, ItemStack item, int amount);
    void clearInventory(Player player);
    void fillInventory(Player player, ItemStack item);
}
