package eu.whoniverse.essentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class TpCommand implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            switch (strings.length) {
                case 0:
                    player.sendMessage("Args are missing!");
                    break;
                case 1:
                    Player player1 = Bukkit.getPlayer(strings[0]);
                    if (player1 == null) {
                        player.sendMessage("Player not exist or not online");
                    } else {
                        player.sendMessage("Teleporting...");
                        player.teleport(player1);
                    }
                    break;
                case 2:
                    player1 = Bukkit.getPlayer(strings[0]);
                    Player player2 = Bukkit.getPlayer(strings[1]);
                    if (player1 == null || player2 == null) {
                        player.sendMessage("One or more players do not exist.");
                    } else {
                        player.sendMessage(player.getName() + " is teleporting you to" + player2.getName());
                        player1.teleport(player2);
                    }
                    break;
                default:
                    player.sendMessage("Sorry! Max 2 Args on this command.");
                    break;
            }
        } else if (commandSender instanceof ConsoleCommandSender) {
            ConsoleCommandSender consoleCommandSender = (ConsoleCommandSender) commandSender;
            switch (strings.length) {
                case 0:
                    consoleCommandSender.sendMessage("Args are missing!");
                    break;
                case 2:
                    Player player1 = Bukkit.getPlayer(strings[0]);
                    Player player2 = Bukkit.getPlayer(strings[1]);
                    if (player1 == null || player2 == null) {
                        commandSender.sendMessage("One or more players do not exist.");
                    } else {
                        commandSender.sendMessage("The server is teleporting you to" + player2.getName());
                        player1.teleport(player2);
                    }
                    break;
                default:
                    consoleCommandSender.sendMessage("Sorry! U can teleport only one player to another!");

            }
        }
        return true;
    }
}
