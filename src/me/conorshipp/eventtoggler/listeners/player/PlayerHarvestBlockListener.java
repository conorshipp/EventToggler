package me.conorshipp.eventtoggler.listeners.player;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerHarvestBlockEvent;

import me.conorshipp.eventtoggler.Main;

public class PlayerHarvestBlockListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("PlayerHarvestBlockEvent");
  
  public PlayerHarvestBlockListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onPlayerHarvestBlock(PlayerHarvestBlockEvent e) {
    e.setCancelled(this.cancelled);
  }

}
