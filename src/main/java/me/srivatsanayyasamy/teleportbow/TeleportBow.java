package me.srivatsanayyasamy.teleportbow;

import me.srivatsanayyasamy.teleportbow.commands.GiveCommand;
import me.srivatsanayyasamy.teleportbow.listeners.TeleportBowListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class TeleportBow extends JavaPlugin {

    @Override
    public void onEnable() {

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getCommand("givebow").setExecutor(new GiveCommand(this));

        getServer().getPluginManager().registerEvents(new TeleportBowListener(this), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
