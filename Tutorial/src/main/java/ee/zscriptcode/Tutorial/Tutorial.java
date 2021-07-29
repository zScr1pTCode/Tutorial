package ee.zscriptcode.Tutorial;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class Tutorial extends JavaPlugin implements Listener {
    FileConfiguration config = getConfig();

    @Override
    public void onEnable() {
        getLogger().info("Plugin started.. Hey!");

        // Register our command "Tutorial" (set an instance of your command class as executor)
        this.getCommand("Tutorial").setExecutor(new CommandTutorial());

        // Register our command "Blocks" (set an instance of your command class as executor)
        this.getCommand("Blocks").setExecutor(new CommandBlocks());

        this.getCommand("fly").setExecutor(new FlyCommandListener());

        config.addDefault("YouAreBeautiful", true);
        config.options().copyDefaults(true);
        saveConfig();

        // Enable our class to check for new players using onPlayerJoin()
        getServer().getPluginManager().registerEvents(this, this);
    }

    // This method checks for incoming players and sends them a message

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled.. Goodbye!");
    }
}
