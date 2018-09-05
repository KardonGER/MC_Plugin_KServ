package de.kservsj.kardonger.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static org.bukkit.Bukkit.*;

public class KservListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        event.setJoinMessage("§6-=# Welcome to KServ #=-");
        Bukkit.getConsoleSender().sendMessage((event.getJoinMessage()));
    }

}
