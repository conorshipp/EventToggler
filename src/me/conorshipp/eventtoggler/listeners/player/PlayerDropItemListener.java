package me.conorshipp.eventtoggler.listeners.player;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

import me.conorshipp.eventtoggler.Main;

public class PlayerDropItemListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("PlayerDropItemEvent");
  
  public PlayerDropItemListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onPlayerDropItem(PlayerDropItemEvent e) {
    e.setCancelled(this.cancelled);
  }

}
