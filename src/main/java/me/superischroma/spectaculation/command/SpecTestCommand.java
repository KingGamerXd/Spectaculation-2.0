package me.superischroma.spectaculation.command;



import me.superischroma.spectaculation.npc.SkyblockNPC;
import me.superischroma.spectaculation.npc.SkyblockNPCManager;

import java.util.Objects;

@CommandParameters(description = "Spec test command.", aliases = "test")
public class SpecTestCommand extends SCommand
{
    @Override
    public void run(CommandSource sender, String[] args)
    {
        for (SkyblockNPC npc : SkyblockNPCManager.getNPCS()){
            npc.showTo(sender.getPlayer());
            send("Loading npcs");
        }

    }
}
