package com.darkcore.core.api.gui;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import com.darkcore.core.api.common.IResult;

public interface IGUIManager {
    IResult<Inventory> createGUI(String title, int rows);
    IResult<Void> openGUI(Player player, Inventory inventory);
    IResult<Void> closeGUI(Player player);
}
