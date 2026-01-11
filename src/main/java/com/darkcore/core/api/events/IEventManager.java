package com.darkcore.core.api.events;

import org.bukkit.event.Event;

public interface IEventManager {
    void callEvent(Event event);
    void registerListener(Object listener);
}
