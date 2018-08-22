package eu.whoniverse.essentials.events;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class EventsRegister {
    public EventsRegister(JavaPlugin plugin) {
        Bukkit.getPluginManager().registerEvents(new PlayerJoinQuitEvent(plugin), plugin);
    }
}
