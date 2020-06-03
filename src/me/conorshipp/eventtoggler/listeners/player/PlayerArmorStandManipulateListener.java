package me.conorshipp.eventtoggler.listeners.player;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;

import me.conorshipp.eventtoggler.Main;

public class PlayerArmorStandManipulateListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("PlayerArmorStandManipulateEvent");
  
  public PlayerArmorStandManipulateListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onPlayerArmorStandManipulate(PlayerArmorStandManipulateEvent e) {
    e.setCancelled(this.cancelled);
  }

}
