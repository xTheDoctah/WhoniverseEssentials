package eu.whoniverse.essentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;

public class TpaCommand {
    private static TpaCommand instance;
    private HashMap<Integer, Player> teleportList = new HashMap<>();
    private JavaPlugin plugin;

    private TpaCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    protected static TpaCommand getInstance(JavaPlugin plugin) {
        if (instance == null)
            instance = new TpaCommand(plugin);
        return instance;
    }

    public class Tpa implements CommandExecutor {
        @Override
        public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
            teleportList.put(1, Bukkit.getPlayer(strings[0]));
            new Timer(1).runTaskLaterAsynchronously(plugin, 1);
            return true;
        }
    }

    public class TpaYes implements CommandExecutor {
        @Override
        public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
            return true;
        }
    }

    public class TpaNo implements CommandExecutor {
        @Override
        public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
            System.out.println("No");
            return false;
        }
    }

    private class Timer extends BukkitRunnable {
        Integer id;

        public Timer(Integer id) {
            this.id = id;
        }

        @Override
        public void run() {
            teleportList.remove(id);
        }
    }
}
