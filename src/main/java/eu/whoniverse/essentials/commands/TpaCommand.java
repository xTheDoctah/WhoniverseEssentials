package eu.whoniverse.essentials.commands;

import com.google.gson.Gson;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;

public class TpaCommand {
    private static TpaCommand instance;

    public static TpaCommand getInstance() {
        if (instance == null)
            instance = new TpaCommand();
        return instance;
    }

    public class Tpa implements CommandExecutor {

        @Override
        public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
            System.out.println("sent");
            System.out.println(new Gson().toJson(new ItemStack(Material.ACACIA_BOAT, 1)));
            return true;
        }
    }

    public class TpaYes implements CommandExecutor {

        @Override
        public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
            System.out.println("Yes");
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
}
