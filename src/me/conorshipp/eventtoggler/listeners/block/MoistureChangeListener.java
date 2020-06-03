package me.conorshipp.eventtoggler.listeners.block;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.MoistureChangeEvent;

import me.conorshipp.eventtoggler.Main;

public class MoistureChangeListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("MoistureChangeEvent");

  public MoistureChangeListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onMoistureChange(MoistureChangeEvent e) {
    e.setCancelled(this.cancelled);
  }

}
