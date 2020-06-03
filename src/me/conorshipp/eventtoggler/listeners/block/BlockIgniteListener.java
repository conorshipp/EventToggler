package me.conorshipp.eventtoggler.listeners.block;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockIgniteEvent;

import me.conorshipp.eventtoggler.Main;

public class BlockIgniteListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("BlockIgniteEvent");

  public BlockIgniteListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onBlockIgnite(BlockIgniteEvent e) {
    e.setCancelled(this.cancelled);
  }

}
