package com.darkcore.core.api.world;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import com.darkcore.core.api.common.IResult;

public interface IWorldManager {
    IResult<World> createWorld(String name, World.Environment env);
    IResult<Void> deleteWorld(String name);
    World getWorld(String name);
    
    IResult<Void> setSpawn(World world, Location location);
    Location getSpawn(World world);
    
    IResult<Void> setWeather(World world, String type);
    IResult<Void> setTime(World world, long time);
    
    IResult<Entity> spawnEntity(Location loc, String entityType);
    IResult<Void> clearEntities(World world);
    
    boolean isProtected(Location location);
    IResult<Void> protectArea(Location pos1, Location pos2, String name);
}
