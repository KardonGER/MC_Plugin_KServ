package de.kservsj.kardonger;

import de.kservsj.kardonger.events.KservListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public class KservSJ extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("KservSJ enabled");
        getServer().getPluginManager().registerEvents(new KservListener(),this);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("KservSJ disabled");
    }


}
