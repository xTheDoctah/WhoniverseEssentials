package eu.whoniverse.essentials;

import eu.whoniverse.essentials.commands.CommandRegister;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        new CommandRegister(this);
    }

    @Override
    public void onDisable() {

    }

}
