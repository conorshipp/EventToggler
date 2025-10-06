package me.conorshipp.eventtoggler.listeners.player;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerVelocityEvent;

import me.conorshipp.eventtoggler.Main;

public class PlayerVelocityListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("PlayerVelocityEvent");
  
  public PlayerVelocityListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onPlayerVelocity(PlayerVelocityEvent e) {
    e.setCancelled(this.cancelled);
  }

}
