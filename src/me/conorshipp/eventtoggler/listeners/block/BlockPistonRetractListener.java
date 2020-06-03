package me.conorshipp.eventtoggler.listeners.block;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPistonRetractEvent;

import me.conorshipp.eventtoggler.Main;

public class BlockPistonRetractListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("BlockPistonRetractEvent");

  public BlockPistonRetractListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onPistonRetract(BlockPistonRetractEvent e) {
    e.setCancelled(this.cancelled);
  }

}
