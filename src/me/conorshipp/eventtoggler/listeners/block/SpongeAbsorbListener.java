package me.conorshipp.eventtoggler.listeners.block;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SpongeAbsorbEvent;

import me.conorshipp.eventtoggler.Main;

public class SpongeAbsorbListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("SpongeAbsorbEvent");

  public SpongeAbsorbListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onSpongeAbsorb(SpongeAbsorbEvent e) {
    e.setCancelled(this.cancelled);
  }

}
