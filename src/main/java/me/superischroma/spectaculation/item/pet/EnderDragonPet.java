package me.superischroma.spectaculation.item.pet;

import me.superischroma.spectaculation.item.*;
import me.superischroma.spectaculation.skill.MiningSkill;
import me.superischroma.spectaculation.skill.Skill;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Rock; // Assuming you can spawn a Rock entity
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.scheduler.BukkitRunnable;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RockPet extends Pet implements Rideable {

    private static final double PER_DEFENSE = 0.1;
    private static final double PER_TRUE_DEFENSE = 0.05;
    public static final String IS_RIDING_ROCK_PET_METADATA = "isRidingRockPet";

    @Override
    public List<PetAbility> getPetAbilities(SItem instance) {
        int level = getLevel(instance);
        BigDecimal defense = new BigDecimal(level * PER_DEFENSE).setScale(1, RoundingMode.HALF_EVEN);
        BigDecimal trueDefense = new BigDecimal(level * PER_TRUE_DEFENSE).setScale(1, RoundingMode.HALF_EVEN);

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
        }));

        return abilities;
    }

    @Override
    public String getURL() {
        return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2IyYjVkNDhlNTc1Nzc1NjNhY2EzMTczNTUxOWNiNjIyMjE5YmMwNThiMWYzNDY0OGI2N2I4ZTcxYmMwZm
    
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
