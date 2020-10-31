package me.conorshipp.eventtoggler;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.conorshipp.eventtoggler.listeners.block.BlockBreakListener;
import me.conorshipp.eventtoggler.listeners.block.BlockBurnListener;
import me.conorshipp.eventtoggler.listeners.block.BlockCookListener;
import me.conorshipp.eventtoggler.listeners.block.BlockDispenseListener;
import me.conorshipp.eventtoggler.listeners.block.BlockDropItemListener;
import me.conorshipp.eventtoggler.listeners.block.BlockExplodeListener;
import me.conorshipp.eventtoggler.listeners.block.BlockFertilizeListener;
import me.conorshipp.eventtoggler.listeners.block.BlockGrowListener;
import me.conorshipp.eventtoggler.listeners.block.BlockIgniteListener;
import me.conorshipp.eventtoggler.listeners.block.BlockPistonExtendListener;
import me.conorshipp.eventtoggler.listeners.block.BlockPistonRetractListener;
import me.conorshipp.eventtoggler.listeners.block.BlockPlaceListener;
import me.conorshipp.eventtoggler.listeners.block.BlockShearEntityListener;
import me.conorshipp.eventtoggler.listeners.block.CauldronLevelChangeListener;
import me.conorshipp.eventtoggler.listeners.block.LeavesDecayListener;
import me.conorshipp.eventtoggler.listeners.block.MoistureChangeListener;
import me.conorshipp.eventtoggler.listeners.block.NotePlayListener;
import me.conorshipp.eventtoggler.listeners.block.SignChangeListener;
import me.conorshipp.eventtoggler.listeners.block.SpongeAbsorbListener;
import me.conorshipp.eventtoggler.listeners.enchantment.EnchantItemListener;
import me.conorshipp.eventtoggler.listeners.enchantment.PrepareItemEnchantListener;
import me.conorshipp.eventtoggler.listeners.hanging.HangingBreakByEntityListener;
import me.conorshipp.eventtoggler.listeners.hanging.HangingBreakListener;
import me.conorshipp.eventtoggler.listeners.hanging.HangingPlaceListener;
import me.conorshipp.eventtoggler.listeners.player.AsyncPlayerChatListener;
import me.conorshipp.eventtoggler.listeners.player.PlayerArmorStandManipulateListener;
import me.conorshipp.eventtoggler.listeners.player.PlayerBedEnterListener;
import me.conorshipp.eventtoggler.listeners.player.PlayerBucketEmptyListener;
import me.conorshipp.eventtoggler.listeners.player.PlayerBucketFillListener;
import me.conorshipp.eventtoggler.listeners.player.PlayerDropItemListener;
import me.conorshipp.eventtoggler.listeners.player.PlayerEditBookListener;
import me.conorshipp.eventtoggler.listeners.weather.LightningStrikeListener;
import me.conorshipp.eventtoggler.listeners.weather.ThunderChangeListener;
import me.conorshipp.eventtoggler.listeners.weather.WeatherChangeListener;

public class Main extends JavaPlugin {

  private static Main INSTANCE;
  
  @Override
  public void onEnable() {
    INSTANCE = this;
    this.saveDefaultConfig();
    // block events
    new BlockBreakListener(this);
    new BlockBurnListener(this);
    new BlockCookListener(this);
    new BlockDispenseListener(this);
    new BlockDropItemListener(this);
    new BlockExplodeListener(this);
    new BlockFertilizeListener(this);
    new BlockGrowListener(this);
    new BlockIgniteListener(this);
    new BlockPistonExtendListener(this);
    new BlockPistonRetractListener(this);
    new BlockPlaceListener(this);
    new BlockShearEntityListener(this);
    new CauldronLevelChangeListener(this);
    new LeavesDecayListener(this);
    new MoistureChangeListener(this);
    new NotePlayListener(this);
    new SignChangeListener(this);
    new SpongeAbsorbListener(this);
    // player events
    new AsyncPlayerChatListener(this);
    new PlayerArmorStandManipulateListener(this);
    new PlayerBedEnterListener(this);
    new PlayerBucketEmptyListener(this);
    new PlayerBucketFillListener(this);
    new PlayerDropItemListener(this);
    new PlayerEditBookListener(this);
    // weather events
    new LightningStrikeListener(this);
    new ThunderChangeListener(this);
    new WeatherChangeListener(this);
    // hanging events
    new HangingBreakByEntityListener(this);
    new HangingBreakListener(this);
    new HangingPlaceListener(this);
    // enchantment events
    new EnchantItemListener(this);
    new PrepareItemEnchantListener(this);
    Bukkit.getConsoleSender().sendMessage("[EventToggler] Plugin Enabled");
  }
  
  @Override
  public void onDisable() {
    Bukkit.getConsoleSender().sendMessage("[EventToggler] Plugin Disabled");
  }
  
  @Override
  public void onLoad() {
    Bukkit.getConsoleSender().sendMessage("[EventToggler] Plugin Loading");
  }
  
  public static Main getInstance() {
    return INSTANCE;
  }

}
