package com.bernardo.cmotd.main;

public class Config {
    public static String linha1 = Main.getInstance().getConfig().getString("linha1").replace("&", "§");
    public static String linha2 = Main.getInstance().getConfig().getString("linha2").replace("&", "§");

    public Config() {
    }
}
