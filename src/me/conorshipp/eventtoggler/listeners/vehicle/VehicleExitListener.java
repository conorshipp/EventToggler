package me.conorshipp.eventtoggler.listeners.vehicle;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleExitEvent;

import me.conorshipp.eventtoggler.Main;

public class VehicleExitListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("VehicleExitEvent");
  
  public VehicleExitListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }
  
  @EventHandler
  public void onVehicleExit(VehicleExitEvent e) {
    e.setCancelled(this.cancelled);
  }

}
