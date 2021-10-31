package me.conorshipp.eventtoggler.listeners.vehicle;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleCreateEvent;

import me.conorshipp.eventtoggler.Main;

public class VehicleCreateListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("VehicleCreateEvent");
  
  public VehicleCreateListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }
  
  @EventHandler
  public void onVehicleCreate(VehicleCreateEvent e) {
    e.setCancelled(this.cancelled);
  }

}
