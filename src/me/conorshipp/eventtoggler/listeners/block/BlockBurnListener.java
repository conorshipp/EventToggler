package me.conorshipp.eventtoggler.listeners.block;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBurnEvent;

import me.conorshipp.eventtoggler.Main;

public class BlockBurnListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("BlockBurnEvent");

  public BlockBurnListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onBlockBurn(BlockBurnEvent e) {
    e.setCancelled(this.cancelled);
  }

}
