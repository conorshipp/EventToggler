package me.conorshipp.eventtoggler.listeners.block;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDropItemEvent;

import me.conorshipp.eventtoggler.Main;

public class BlockDropItemListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("BlockDropItemEvent");

  public BlockDropItemListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onBlockDropItem(BlockDropItemEvent e) {
    e.setCancelled(this.cancelled);
  }

}
