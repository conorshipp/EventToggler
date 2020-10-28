package me.conorshipp.eventtoggler.listeners.hanging;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;

import me.conorshipp.eventtoggler.Main;

public class HangingBreakByEntityListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("HangingBreakByEntityEvent");

  public HangingBreakByEntityListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onHangingBreakByEntity(HangingBreakByEntityEvent e) {
    e.setCancelled(this.cancelled);
  }

}
