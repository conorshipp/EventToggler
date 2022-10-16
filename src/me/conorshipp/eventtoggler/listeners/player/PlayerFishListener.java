package me.conorshipp.eventtoggler.listeners.player;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

import me.conorshipp.eventtoggler.Main;

public class PlayerFishListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("PlayerFishEvent");
  
  public PlayerFishListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onPlayerFish(PlayerFishEvent e) {
    e.setCancelled(this.cancelled);
  }

}
