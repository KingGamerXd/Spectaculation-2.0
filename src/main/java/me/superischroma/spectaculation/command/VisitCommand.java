package me.superischroma.spectaculation.command;


import me.superischroma.spectaculation.gui.VisitGUI;
import me.superischroma.spectaculation.user.PlayerUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

@CommandParameters(description = "Visit player island" , usage = "/<command> name" , aliases = "visit")
public class VisitCommand extends SCommand {
    @Override
    public void run(CommandSource sender, String[] args) {
        if (sender instanceof ConsoleCommandSender) throw new CommandFailException("Console senders cannot use this command!");
        if (args.length != 1){
            send(ChatColor.RED + "[ERROR] : " + ChatColor.GRAY + "Usage /visit name");
            return;
        }
        Player player = sender.getPlayer();
        OfflinePlayer targetPlayer = Bukkit.getOfflinePlayer(args[0]);
        if (PlayerUtils.getIslandLocation(targetPlayer.getUniqueId()) == null){
            player.sendMessage(ChatColor.RED + "[ERROR] : " + ChatColor.GRAY + "Island not found!");
            return;
        }
        new VisitGUI(args[0]).open(player);

    }
}
