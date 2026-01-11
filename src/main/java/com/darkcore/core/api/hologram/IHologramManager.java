package com.darkcore.core.api.hologram;

import org.bukkit.Location;
import java.util.List;
import java.util.UUID;

public interface IHologramManager {
    UUID createHologram(Location location, List<String> lines);
    void updateHologram(UUID id, List<String> lines);
    void deleteHologram(UUID id);
    void setLine(UUID id, int index, String text);
}
