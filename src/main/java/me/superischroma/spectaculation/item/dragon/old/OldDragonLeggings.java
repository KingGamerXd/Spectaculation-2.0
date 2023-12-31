package me.superischroma.spectaculation.item.dragon.old;

import me.superischroma.spectaculation.item.MaterialFunction;
import me.superischroma.spectaculation.item.Rarity;
import me.superischroma.spectaculation.item.GenericItemType;
import me.superischroma.spectaculation.item.SpecificItemType;
import me.superischroma.spectaculation.item.armor.LeatherArmorStatistics;

public class OldDragonLeggings implements MaterialFunction, LeatherArmorStatistics
{
    @Override
    public double getBaseHealth()
    {
        return 130;
    }

    @Override
    public double getBaseDefense()
    {
        return 140;
    }

    @Override
    public int getColor()
    {
        return 0xF0E6AA;
    }

    @Override
    public String getDisplayName()
    {
        return "Old Dragon Leggings";
    }

    @Override
    public Rarity getRarity()
    {
        return Rarity.LEGENDARY;
    }

    @Override
    public GenericItemType getType()
    {
        return GenericItemType.ARMOR;
    }

    @Override
    public SpecificItemType getSpecificType()
    {
        return SpecificItemType.LEGGINGS;
    }

    @Override
    public String getLore()
    {
        return null;
    }
}