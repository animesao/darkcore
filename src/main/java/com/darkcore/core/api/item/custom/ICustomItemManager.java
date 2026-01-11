package com.darkcore.core.api.item.custom;

import org.bukkit.inventory.ItemStack;
import org.bukkit.NamespacedKey;
import java.util.Optional;

/**
 * API for creating and managing items with custom logic, textures (via NBT/CustomModelData), and behaviors.
 */
public interface ICustomItemManager {
    void registerCustomItem(String id, ItemStack baseItem, int customModelData);
    ItemStack createCustomItem(String id);
    boolean isCustomItem(ItemStack item);
    Optional<String> getCustomItemId(ItemStack item);
    
    void addPersistentData(ItemStack item, String key, String value);
    String getPersistentData(ItemStack item, String key);
}
