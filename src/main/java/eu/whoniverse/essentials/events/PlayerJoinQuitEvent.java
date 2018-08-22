package eu.whoniverse.essentials.events;

import eu.whoniverse.essentials.models.EssPlayer;
import eu.whoniverse.essentials.models.Settings;
import eu.whoniverse.essentials.utils.IO;
import eu.whoniverse.essentials.utils.Lang;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public class PlayerJoinQuitEvent implements Listener {
    private JavaPlugin plugin;

    public PlayerJoinQuitEvent(JavaPlugin plugin) {
        this.plugin = plugin;

    }

    @EventHandler
    public void PlayerJoinEvent(PlayerJoinEvent e) {

        Player p = e.getPlayer();
        try {
            if (IO.createFileIfNotExist(plugin.getDataFolder() + "/" + p.getUniqueId() + ".json")) {
                /*TODO:Change the money with the default from settings*/
                IO.writeFile(plugin.getDataFolder() + "/" + p.getUniqueId() + ".json", new EssPlayer(p.getName(), p.getLocation(), Settings.getInstance().getDefaultMoney()).toString());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        e.setJoinMessage(Lang.JOIN_MESSAGE.replace("%p", p.getName()));
    }

    @EventHandler
    public void PlayerQuitEvent(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        try {
            IO.writeFile(plugin.getDataFolder() + "/" + p.getUniqueId() + ".json", new EssPlayer(p.getLocation()).toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
