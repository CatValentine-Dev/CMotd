package com.bernardo.cmotd.main;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class Motd implements Listener {
    public Motd() {
    }

    @EventHandler
    public void onMotd(ServerListPingEvent e) {
        e.setMotd(String.valueOf(Config.linha1 + "\n" + Config.linha2));
    }
}
