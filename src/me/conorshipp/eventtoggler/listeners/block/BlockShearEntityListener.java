package me.conorshipp.eventtoggler.listeners.block;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockShearEntityEvent;

import me.conorshipp.eventtoggler.Main;

public class BlockShearEntityListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("BlockShearEntityEvent");

  public BlockShearEntityListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onBlockShearEntity(BlockShearEntityEvent e) {
    e.setCancelled(this.cancelled);
  }

}
