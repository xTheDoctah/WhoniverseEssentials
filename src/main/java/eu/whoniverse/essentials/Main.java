package eu.whoniverse.essentials;

import eu.whoniverse.essentials.commands.TpCommand;
import eu.whoniverse.essentials.commands.TphereCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("tp").setExecutor(new TpCommand());
        getCommand("tphere").setExecutor(new TphereCommand());
    }

    @Override
    public void onDisable() {

    }

}
