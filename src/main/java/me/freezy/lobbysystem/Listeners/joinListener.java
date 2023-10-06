package me.freezy.lobbysystem.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

@SuppressWarnings("deprecation")
public class joinListener implements Listener {
    public void onJoin(PlayerJoinEvent event) {
        Player player = (Player) event;

        event.setJoinMessage(ChatColor.AQUA + player.getName() + " has joined the server!");
    }
}
