package eu.whoniverse.essentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class TphereCommand implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            switch (strings.length) {
                case 0:
                    player.sendMessage("Args missing!");
                    break;
                default:
                    Arrays.asList(strings).forEach(item -> {
                        if (Bukkit.getPlayer(item) == null) {
                            player.sendMessage(item + " does not exists!");
                        } else {
                            Bukkit.getPlayer(item).sendMessage("U're gonna be teleported to " + player.getName());
                            Bukkit.getPlayer(item).teleport(player);
                        }
                    });
                    break;
            }
        } else {
            commandSender.sendMessage("Only a player can perform this command!");
        }
        return true;
    }
}
