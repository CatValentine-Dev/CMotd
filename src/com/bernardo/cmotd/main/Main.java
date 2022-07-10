package com.bernardo.cmotd.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin {
    public static Main instance;

    public Main() {
    }

    public static Main getInstance() {
        return instance;
    }

    public static void setInstance(Main instance) {
        Main.instance = instance;
    }

    public void onLoad() {
        instance = this;
        Bukkit.getConsoleSender().sendMessage("§eCMotd iniciando...");
    }

    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§a_-_-_-_-_-_-_-");
        Bukkit.getConsoleSender().sendMessage("§aCMotd ativado.");
        Bukkit.getConsoleSender().sendMessage("§a_-_-_-_-_-_-_-");
        Bukkit.getPluginManager().registerEvents(new Motd(), this);
        this.saveDefaultConfig();
    }



    public void onDisable() {
        instance = null;
        Bukkit.getConsoleSender().sendMessage("§4_-_-_-_-_-_-_-_-");
        Bukkit.getConsoleSender().sendMessage("§4CMotd desativado.");
        Bukkit.getConsoleSender().sendMessage("§4_-_-_-_-_-_-_-_-");
    }
}


