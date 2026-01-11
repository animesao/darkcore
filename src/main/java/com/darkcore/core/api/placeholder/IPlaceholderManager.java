package com.darkcore.core.api.placeholder;

import org.bukkit.entity.Player;
import java.util.function.Function;

/**
 * API for internal placeholder support and integration with external providers.
 */
public interface IPlaceholderManager {
    void registerPlaceholder(String identifier, Function<Player, String> resolver);
    String replacePlaceholders(Player player, String text);
}
