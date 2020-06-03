package me.conorshipp.eventtoggler.listeners.block;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFertilizeEvent;

import me.conorshipp.eventtoggler.Main;

public class BlockFertilizeListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("BlockFertilizeEvent");

  public BlockFertilizeListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onBlockFertilize(BlockFertilizeEvent e) {
    e.setCancelled(this.cancelled);
  }

}
