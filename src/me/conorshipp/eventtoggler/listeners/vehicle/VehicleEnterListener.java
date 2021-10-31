package me.conorshipp.eventtoggler.listeners.vehicle;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleEnterEvent;

import me.conorshipp.eventtoggler.Main;

public class VehicleEnterListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("VehicleEnterEvent");
  
  public VehicleEnterListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }
  
  @EventHandler
  public void onVehicleEnter(VehicleEnterEvent e) {
    e.setCancelled(this.cancelled);
  }

}
