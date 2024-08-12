package org.chinmay.nophantoms;

import org.bukkit.plugin.java.JavaPlugin;

public final class NoPhantoms extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new NaturalSpawnEvent(this), this);
        getServer().getPluginManager().registerEvents(new SpawnerEggSpawnEvent(this), this);
        getServer().getPluginManager().registerEvents(new SpawnerSpawnEvent(this), this);
        getLogger().info("NoPhantoms Enabled!");
        getLogger().info("Thank you for using my plugin");
        getLogger().info("Check more of my plugins @ spigot.chinmay.lol");

    }

    @Override
    public void onDisable() {
        saveConfig();
        getLogger().info("NoPhantoms Disabled!");
        getLogger().info("Thank you for using my plugin");
        getLogger().info("Check more of my plugins @ spigot.chinmay.lol");
    }
}
