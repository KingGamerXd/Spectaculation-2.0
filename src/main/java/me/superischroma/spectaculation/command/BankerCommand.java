package me.superischroma.spectaculation.command;

import me.superischroma.spectaculation.gui.GUIType;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

@CommandParameters(description = "open banker gui" , aliases = "bank")
public class BankerCommand extends SCommand{
    @Override
    public void run(CommandSource sender, String[] args) {
        if (sender instanceof ConsoleCommandSender) throw new CommandFailException("Console senders cannot use this command!");
        Player player = sender.getPlayer();
        GUIType.BANKER.getGUI().open(player);

    }
}
