package me.conorshipp.eventtoggler.listeners.enchantment;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;

import me.conorshipp.eventtoggler.Main;

public class PrepareItemEnchantListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("PrepareItemEnchantEvent");

  public PrepareItemEnchantListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onPrepareItemEnchant(PrepareItemEnchantEvent e) {
    e.setCancelled(this.cancelled);
  }

}
