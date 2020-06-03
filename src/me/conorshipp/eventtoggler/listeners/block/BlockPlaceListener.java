package me.conorshipp.eventtoggler.listeners.block;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import me.conorshipp.eventtoggler.Main;

public class BlockPlaceListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("BlockPlaceEvent");

  public BlockPlaceListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onBlockPlace(BlockPlaceEvent e) {
    e.setCancelled(this.cancelled);
  }

}
