package me.conorshipp.eventtoggler.listeners.hanging;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingPlaceEvent;

import me.conorshipp.eventtoggler.Main;

public class HangingPlaceListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("HangingPlaceEvent");

  public HangingPlaceListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onHangingPlace(HangingPlaceEvent e) {
    e.setCancelled(this.cancelled);
  }

}
