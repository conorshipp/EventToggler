package me.conorshipp.eventtoggler.listeners.block;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

import me.conorshipp.eventtoggler.Main;

public class SignChangeListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("SignChangeEvent");

  public SignChangeListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onSignChange(SignChangeEvent e) {
    e.setCancelled(this.cancelled);
  }

}
