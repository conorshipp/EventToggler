package me.conorshipp.eventtoggler.listeners.block;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockExplodeEvent;

import me.conorshipp.eventtoggler.Main;

public class BlockExplodeListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("BlockExplodeEvent");

  public BlockExplodeListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onBlockExplode(BlockExplodeEvent e) {
    e.setCancelled(this.cancelled);
  }

}
