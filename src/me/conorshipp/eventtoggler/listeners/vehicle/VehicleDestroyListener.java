package me.conorshipp.eventtoggler.listeners.vehicle;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleDestroyEvent;

import me.conorshipp.eventtoggler.Main;

public class VehicleDestroyListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("VehicleDestroyEvent");
  
  public VehicleDestroyListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }
  
  @EventHandler
  public void onVehicleDestroy(VehicleDestroyEvent e) {
    e.setCancelled(this.cancelled);
  }

}
