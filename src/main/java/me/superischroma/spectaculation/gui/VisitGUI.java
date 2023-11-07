package me.superischroma.spectaculation.gui;

import me.superischroma.spectaculation.user.PlayerUtils;
import me.superischroma.spectaculation.util.SLog;
import me.superischroma.spectaculation.util.SUtil;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class VisitGUI extends GUI{
    public VisitGUI(String target) {
        super("Visit " + target, 36);
        fill(BLACK_STAINED_GLASS_PANE);
        set(new GUIClickableItem() {
            @Override
            public void run(InventoryClickEvent e) {
                Player player = (Player) e.getWhoClicked();
                OfflinePlayer targetPlayer = Bukkit.getOfflinePlayer(target);
                player.teleport(PlayerUtils.getIslandLocation(targetPlayer.getUniqueId()));
                player.sendMessage(ChatColor.AQUA + "[SkyBlock] " + ChatColor.GRAY + "Teleported to " + ChatColor.YELLOW + target + ChatColor.GRAY + "'s island " + ChatColor.GREEN + "successfully!");


            }

            @Override
            public ItemStack getItem() {
                return SUtil.getStack(
                        ChatColor.GREEN + "Visit player island",
                        Material.SKULL_ITEM,
                        (byte) SkullType.PLAYER.ordinal(),
                        1,
                        ChatColor.GRAY + "Players:",
                        ChatColor.DARK_GRAY + " - " + ChatColor.GRAY + target,
                        " ",
                        ChatColor.GRAY + "Profile: " + ChatColor.YELLOW + "Cucumber",
                        " ",
                        ChatColor.GRAY + "Players: " + ChatColor.GREEN + target,
                        ChatColor.GRAY + "Server: " + ChatColor.DARK_GRAY + "Islands",
                        " ",
                        ChatColor.YELLOW + "Click to visit!"
                );
            }

            @Override
            public int getSlot() {
                return 13;
            }
        });


    }
}
