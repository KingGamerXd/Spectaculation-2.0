package me.superischroma.spectaculation.command;

import me.superischroma.spectaculation.gui.GUIType;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

@CommandParameters(description = "Open Anvil GUI" , aliases = "av")
public class AnvilCommand extends SCommand{
    @Override
    public void run(CommandSource sender, String[] args) {
        if (sender instanceof ConsoleCommandSender) throw new CommandFailException("Console senders cannot use this command!");
        Player player = sender.getPlayer();
        GUIType.ANVIL.getGUI().open(player);

    }
}
