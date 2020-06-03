package me.conorshipp.eventtoggler.listeners.player;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;

import me.conorshipp.eventtoggler.Main;

public class PlayerBucketEmptyListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("PlayerBucketEmptyEvent");
  
  public PlayerBucketEmptyListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onPlayerBucketEmpty(PlayerBucketEmptyEvent e) {
    e.setCancelled(this.cancelled);
  }

}
