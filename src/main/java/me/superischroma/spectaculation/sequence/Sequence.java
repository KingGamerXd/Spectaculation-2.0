package me.superischroma.spectaculation.sequence;

import org.bukkit.Location;
import org.bukkit.entity.Entity;

public interface Sequence
{
    void play(Location location);
    void play(Entity entity);
}