package eu.whoniverse.essentials.commands;

import com.google.gson.Gson;
import eu.whoniverse.essentials.models.EssPlayer;
import eu.whoniverse.essentials.utils.IO;
import eu.whoniverse.essentials.utils.Lang;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.nio.charset.StandardCharsets;

public class MoneyCommand implements CommandExecutor {
    private JavaPlugin plugin;

    public MoneyCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        commandSender.sendMessage(Lang.CURRENT_AMOUNT.replace("%money", new Gson().fromJson(IO.readFile(plugin.getDataFolder() + "/" + player.getUniqueId() + ".json", StandardCharsets.UTF_8), EssPlayer.class).getMoney().toString() + "$"));
        return true;
    }
}
