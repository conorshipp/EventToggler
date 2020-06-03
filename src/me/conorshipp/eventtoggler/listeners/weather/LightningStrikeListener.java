package me.conorshipp.eventtoggler.listeners.weather;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.LightningStrikeEvent;

import me.conorshipp.eventtoggler.Main;

public class LightningStrikeListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("LightningStrikeEvent");
  
  public LightningStrikeListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }
  
  @EventHandler
  public void onLightningStrike(LightningStrikeEvent e) {
    e.setCancelled(this.cancelled);
  }

}
