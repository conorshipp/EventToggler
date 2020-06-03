package me.conorshipp.eventtoggler.listeners.weather;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.ThunderChangeEvent;

import me.conorshipp.eventtoggler.Main;

public class ThunderChangeListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("ThunderChangeEvent");
  
  public ThunderChangeListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }
  
  @EventHandler
  public void onThunderChange(ThunderChangeEvent e) {
    e.setCancelled(this.cancelled);
  }

}
