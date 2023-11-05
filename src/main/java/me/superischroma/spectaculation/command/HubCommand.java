package me.superischroma.spectaculation.command;

import me.superischroma.spectaculation.Spectaculation;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

@CommandParameters(description = "Teleport to hub" , aliases = "hub")
public class HubCommand extends SCommand{


    @Override
    public void run(CommandSource sender, String[] args) {
        this.send(ChatColor.translateAlternateColorCodes('&' , "&7Sending you to the Hub..."));
        Player player = sender.getPlayer();
        player.teleport(new Location(
                Bukkit.getWorld(
                !plugin.config.getString("hub_world").isEmpty() ?
                 plugin.config.getString("hub_world") : "world"),
                -2.5, 70.0, -68.5 )
        );

    }
}
