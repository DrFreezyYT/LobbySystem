package me.freezy.lobbysystem;

import me.freezy.lobbysystem.Listeners.joinListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class LobbySystem extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        // Register events
        getServer().getPluginManager().registerEvents(new joinListener(), this);
        // Register commands

        getLogger().info("The plugin was initialized!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("The plugin got stopped!");
    }
}
