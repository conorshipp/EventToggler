package me.conorshipp.eventtoggler.listeners.block;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.NotePlayEvent;

import me.conorshipp.eventtoggler.Main;

public class NotePlayListener implements Listener {
  
  private boolean cancelled = Main.getInstance().getConfig().getBoolean("NotePlayEvent");

  public NotePlayListener(Main plugin) {
    Bukkit.getPluginManager().registerEvents(this, plugin);
  }

  @EventHandler
  public void onNotePlay(NotePlayEvent e) {
    e.setCancelled(this.cancelled);
  }

}
