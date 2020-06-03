package me.conorshipp.eventtoggler.listeners.player;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEditBookEvent;

import me.conorshipp.eventtoggler.Main;

public class PlayerEditBookListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("PlayerEditBookEvent");
  
  public PlayerEditBookListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onPlayerEditBook(PlayerEditBookEvent e) {
    e.setCancelled(this.cancelled);
  }

}
