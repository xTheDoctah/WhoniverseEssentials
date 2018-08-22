package eu.whoniverse.essentials.commands;

import org.bukkit.plugin.java.JavaPlugin;

public class CommandRegister {
    public CommandRegister(JavaPlugin p) {
        p.getCommand("tp").setExecutor(new TpCommand());
        p.getCommand("tphere").setExecutor(new TphereCommand());
        p.getCommand("tpa").setExecutor(TpaCommand.getInstance().new Tpa());
        p.getCommand("tpayes").setExecutor(TpaCommand.getInstance().new TpaYes());
        p.getCommand("tpano").setExecutor(TpaCommand.getInstance().new TpaNo());
    }

}
