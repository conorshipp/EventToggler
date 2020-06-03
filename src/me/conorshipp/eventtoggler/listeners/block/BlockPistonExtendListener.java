package me.conorshipp.eventtoggler.listeners.block;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPistonExtendEvent;

import me.conorshipp.eventtoggler.Main;

public class BlockPistonExtendListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("BlockPistonExtendEvent");

  public BlockPistonExtendListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onPistonExtend(BlockPistonExtendEvent e) {
    e.setCancelled(this.cancelled);
  }

}
