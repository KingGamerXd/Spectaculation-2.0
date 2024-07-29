package me.superischroma.spectaculation.item.pet;

import me.superischroma.spectaculation.item.*;
import me.superischroma.spectaculation.item.Rarity;
import me.superischroma.spectaculation.item.RarityValue;
import me.superischroma.spectaculation.item.SItem;
import me.superischroma.spectaculation.skill.CombatSkill;
import me.superischroma.spectaculation.skill.Skill;
import me.superischroma.spectaculation.skill.*;
import org.bukkit.ChatColor;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.entity.Entity;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RockPet extends Pet {

    @Override
    public List<PetAbility> getPetAbilities(SItem instance) {
        int level = getLevel(instance);
        BigDecimal defense = new BigDecimal(level * getPerDefense()).setScale(1, RoundingMode.HALF_EVEN);
        BigDecimal trueDefense = new BigDecimal(level * getPerTrueDefense()).setScale(1, RoundingMode.HALF_EVEN);

        List<PetAbility> abilities = new ArrayList<>(Collections.singletonList(new PetAbility() {
            @Override
            public String getName() {
                return "Rock Pet";
            }

            @Override
            public List<String> getDescription(SItem instance) {
                return Arrays.asList("Increases defense by " + ChatColor.GREEN + defense.toPlainString() +
                        "%" + ChatColor.GRAY + " while riding your rock.");
            }

            @Override
            public void onHurt(EntityDamageByEntityEvent e, Entity damager) {
                e.setDamage(e.getDamage() - ((e.getDamage() * defense.doubleValue()) * 0.01));
            }
        }));

        abilities.add(new PetAbility() {
            @Override
            public String getName() {
                return "True Resistance";
            }

            @Override
            public List<String> getDescription(SItem instance) {
                return Arrays.asList("Increases true defense by " + ChatColor.GREEN + trueDefense.toPlainString() +
                        "%" + ChatColor.GRAY + " while riding your rock.");
            }

            @Override
            public void onHurt(EntityDamageByEntityEvent e, Entity damager) {
                e.setDamage(e.getDamage() - ((e.getDamage() * trueDefense.doubleValue()) * 0.01));
            }
        });

        return abilities;
    }

    @Override
    public String getURL()
    {
        return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2IyYjVkNDhlNTc1Nzc1NjNhY2EzMTczNTUxOWNiNjIyMjE5YmMwNThiMWYzNDY0OGI2N2I4ZTcxYmMwZmEifX19";
    }
    @Override
    public GenericItemType getType()
    {
        return GenericItemType.PET;
    }

    public Skill getSkill() {
        return new MiningSkill();
    }

    @Override
    public String getDisplayName() {
        return "Rock Pet";
    }

    @Override
    public double getPerDefense() {
        return 0.1;
    }

    @Override
    public double getPerTrueDefense() {
        return 0.05; 
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON; 
    }
}
