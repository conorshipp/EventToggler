package me.conorshipp.eventtoggler.listeners.block;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockGrowEvent;

import me.conorshipp.eventtoggler.Main;

public class BlockGrowListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("BlockGrowEvent");

  public BlockGrowListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onBlockGrow(BlockGrowEvent e) {
    e.setCancelled(this.cancelled);
  }

}
