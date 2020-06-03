package me.conorshipp.eventtoggler.listeners.block;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import me.conorshipp.eventtoggler.Main;

public class BlockBreakListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("BlockBreakEvent");

  public BlockBreakListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onBlockBreak(BlockBreakEvent e) {
    e.setCancelled(this.cancelled);
  }

}
