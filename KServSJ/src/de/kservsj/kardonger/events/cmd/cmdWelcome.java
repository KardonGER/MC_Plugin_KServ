package de.kservsj.kardonger.events.cmd;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

public class cmdWelcome {

    public cmdWelcome(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        String pname = p.getDisplayName();
        event.setJoinMessage("§6-=# Welcome " + pname + " to KServ #=-");
    }

}
