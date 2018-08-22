package eu.whoniverse.essentials;

import eu.whoniverse.essentials.commands.CommandsRegister;
import eu.whoniverse.essentials.events.EventsRegister;
import eu.whoniverse.essentials.utils.IO;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        new CommandsRegister(this);
        new EventsRegister(this);
        IO.createDir(getDataFolder().getPath());
    }

    @Override
    public void onDisable() {

    }

}