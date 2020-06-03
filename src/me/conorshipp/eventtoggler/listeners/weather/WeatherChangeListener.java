package me.conorshipp.eventtoggler.listeners.weather;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

import me.conorshipp.eventtoggler.Main;

public class WeatherChangeListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("WeatherChangeEvent");
  
  public WeatherChangeListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }
  
  @EventHandler
  public void onWeatherChange(WeatherChangeEvent e) {
    e.setCancelled(this.cancelled);
  }

}
