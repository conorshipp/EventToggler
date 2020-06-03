package me.conorshipp.eventtoggler.listeners.block;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockCookEvent;

import me.conorshipp.eventtoggler.Main;

public class BlockCookListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("BlockCookEvent");

  public BlockCookListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onBlockCook(BlockCookEvent e) {
    e.setCancelled(this.cancelled);
  }

}
