package me.conorshipp.eventtoggler.listeners.enchantment;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;

import me.conorshipp.eventtoggler.Main;

public class EnchantItemListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("EnchantItemEvent");

  public EnchantItemListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onEnchantItem(EnchantItemEvent e) {
    e.setCancelled(this.cancelled);
  }

}
