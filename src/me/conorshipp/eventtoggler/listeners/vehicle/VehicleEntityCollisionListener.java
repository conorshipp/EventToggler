package me.conorshipp.eventtoggler.listeners.vehicle;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleEntityCollisionEvent;

import me.conorshipp.eventtoggler.Main;

public class VehicleEntityCollisionListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("VehicleEntityCollisionEvent");
  
  public VehicleEntityCollisionListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }
  
  @EventHandler
  public void onVehicleEntityCollision(VehicleEntityCollisionEvent e) {
    e.setCancelled(this.cancelled);
  }

}
