package me.conorshipp.eventtoggler.listeners.block;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;

import me.conorshipp.eventtoggler.Main;

public class BlockDispenseListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("BlockDispenseEvent");

  public BlockDispenseListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onBlockDispense(BlockDispenseEvent e) {
    e.setCancelled(this.cancelled);
  }

}
