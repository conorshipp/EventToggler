package me.conorshipp.eventtoggler.listeners.player;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketFillEvent;

import me.conorshipp.eventtoggler.Main;

public class PlayerBucketFillListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("PlayerBucketFillEvent");
  
  public PlayerBucketFillListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onPlayerBucketFill(PlayerBucketFillEvent e) {
    e.setCancelled(this.cancelled);
  }

}
