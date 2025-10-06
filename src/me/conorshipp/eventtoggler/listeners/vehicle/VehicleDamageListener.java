package me.conorshipp.eventtoggler.listeners.vehicle;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleDamageEvent;

import me.conorshipp.eventtoggler.Main;

public class VehicleDamageListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("VehicleDamageEvent");
  
  public VehicleDamageListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }
  
  @EventHandler
  public void onVehicleDamage(VehicleDamageEvent e) {
    e.setCancelled(this.cancelled);
  }

}
