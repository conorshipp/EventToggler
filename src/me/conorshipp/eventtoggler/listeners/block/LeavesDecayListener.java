package me.conorshipp.eventtoggler.listeners.block;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.LeavesDecayEvent;

import me.conorshipp.eventtoggler.Main;

public class LeavesDecayListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("LeavesDecayEvent");

  public LeavesDecayListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onLeavesDecay(LeavesDecayEvent e) {
    e.setCancelled(this.cancelled);
  }

}
