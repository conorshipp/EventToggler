package me.conorshipp.eventtoggler.listeners.player;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;

import me.conorshipp.eventtoggler.Main;

public class PlayerSwapHandItemsListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("PlayerSwapHandItemsEvent");
  
  public PlayerSwapHandItemsListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onPlayerSwapHandItems(PlayerSwapHandItemsEvent e) {
    e.setCancelled(this.cancelled);
  }

}
