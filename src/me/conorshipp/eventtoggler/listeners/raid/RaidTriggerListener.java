package me.conorshipp.eventtoggler.listeners.raid;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.raid.RaidTriggerEvent;

import me.conorshipp.eventtoggler.Main;

public class RaidTriggerListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("RaidTriggerEvent");
  
  public RaidTriggerListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }
  
  @EventHandler
  public void onRaidTrigger(RaidTriggerEvent e) {
    e.setCancelled(this.cancelled);
  }

}
