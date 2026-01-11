package com.darkcore.core.api.npc;

import org.bukkit.Location;
import java.util.UUID;

public interface INPCManager {
    UUID spawnNPC(String name, Location location, String skinName);
    void removeNPC(UUID id);
    void moveNPC(UUID id, Location location);
}
