package fr.n005.fall;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
    public void onEnable() {
        System.out.println("DropFall ok");
        getServer().getPluginManager().registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {

    }
}
