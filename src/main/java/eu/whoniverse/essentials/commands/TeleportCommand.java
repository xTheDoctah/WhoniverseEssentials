package eu.whoniverse.essentials.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TeleportCommand implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings.length >= 1) {
            if (commandSender instanceof Player) {

            }
        } else {
            //TODO: Missing args
        }
        return true;
    }
}
