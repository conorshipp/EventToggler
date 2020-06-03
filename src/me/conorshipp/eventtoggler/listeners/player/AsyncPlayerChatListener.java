package me.conorshipp.eventtoggler.listeners.player;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import me.conorshipp.eventtoggler.Main;

public class AsyncPlayerChatListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("AsyncPlayerChatEvent");

  public AsyncPlayerChatListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onAsyncPlayerChat(AsyncPlayerChatEvent e) {
    e.setCancelled(this.cancelled);
  }

}
