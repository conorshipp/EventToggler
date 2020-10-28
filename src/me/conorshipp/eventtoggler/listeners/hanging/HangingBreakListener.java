package me.conorshipp.eventtoggler.listeners.hanging;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingBreakEvent;

import me.conorshipp.eventtoggler.Main;

public class HangingBreakListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("HangingBreakEvent");

  public HangingBreakListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onHangingBreak(HangingBreakEvent e) {
    e.setCancelled(this.cancelled);
  }

}
