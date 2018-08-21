package eu.whoniverse.essentials;

import eu.whoniverse.essentials.commands.TpCommand;
import eu.whoniverse.essentials.commands.TpaCommand;
import eu.whoniverse.essentials.commands.TphereCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("tp").setExecutor(new TpCommand());
        getCommand("tphere").setExecutor(new TphereCommand());
        getCommand("tpa").setExecutor(TpaCommand.getInstance().new Tpa());
        getCommand("tpayes").setExecutor(TpaCommand.getInstance().new TpaYes());
        getCommand("tpano").setExecutor(TpaCommand.getInstance().new TpaNo());
    }

    @Override
    public void onDisable() {

    }

}
