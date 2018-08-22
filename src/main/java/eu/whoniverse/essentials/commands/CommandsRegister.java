package eu.whoniverse.essentials.commands;

import org.bukkit.plugin.java.JavaPlugin;

public class CommandsRegister {
    public CommandsRegister(JavaPlugin plugin) {
        plugin.getCommand("tp").setExecutor(new TpCommand());
        plugin.getCommand("tphere").setExecutor(new TphereCommand());
        plugin.getCommand("tpa").setExecutor(TpaCommand.getInstance(plugin).new Tpa());
        plugin.getCommand("tpayes").setExecutor(TpaCommand.getInstance(plugin).new TpaYes());
        plugin.getCommand("tpano").setExecutor(TpaCommand.getInstance(plugin).new TpaNo());
        plugin.getCommand("money").setExecutor(new MoneyCommand(plugin));
    }
}
