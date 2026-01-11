package com.darkcore.core.api.kit;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import java.util.List;
import com.darkcore.core.api.common.IResult;

public interface IKitManager {
    IResult<Void> createKit(String name, List<ItemStack> items, long cooldownMillis);
    IResult<Void> giveKit(Player player, String name);
    boolean hasKitPermission(Player player, String name);
    long getRemainingCooldown(Player player, String name);
    IResult<Void> deleteKit(String name);
}
