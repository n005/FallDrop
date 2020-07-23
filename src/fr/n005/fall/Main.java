package fr.n005.fall;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
    public void onEnable() {
        System.out.println("Test de spigot activé");
        getServer().getPluginManager().registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {

    }
}