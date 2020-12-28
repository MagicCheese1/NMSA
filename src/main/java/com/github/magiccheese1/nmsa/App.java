package com.github.magiccheese1.nmsa;

import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Stuck arrows, be gone!!");
        getServer().getPluginManager().registerEvents(new ProjectileListener(), this);
    }
}
