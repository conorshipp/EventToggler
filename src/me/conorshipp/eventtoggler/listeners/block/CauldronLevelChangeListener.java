package me.conorshipp.eventtoggler.listeners.block;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.CauldronLevelChangeEvent;

import me.conorshipp.eventtoggler.Main;

public class CauldronLevelChangeListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("CauldronLevelChangeEvent");

  public CauldronLevelChangeListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onBlockPlace(CauldronLevelChangeEvent e) {
    e.setCancelled(this.cancelled);
  }

}
