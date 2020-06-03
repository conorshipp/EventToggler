package me.conorshipp.eventtoggler.listeners.player;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

import me.conorshipp.eventtoggler.Main;

public class PlayerBedEnterListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("PlayerBedEnterEvent");
  
  public PlayerBedEnterListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onPlayerBedEnter(PlayerBedEnterEvent e) {
    e.setCancelled(this.cancelled);
  }

}
