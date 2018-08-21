package eu.whoniverse.essentials;

import eu.whoniverse.essentials.commands.TpCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("tp").setExecutor(new TpCommand());
    }

    @Override
    public void onDisable() {

    }

}
