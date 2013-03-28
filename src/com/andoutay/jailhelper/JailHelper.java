package com.andoutay.jailhelper;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class JailHelper extends JavaPlugin
{
	public static Logger log = Logger.getLogger("Minecraft");
	public static String logPref = "[JailHelper] ";
	public static String chPref = ChatColor.GOLD + logPref + ChatColor.RESET;
	
	public void onLoad()
	{
		//set up config
	}
	
	public void onEnable()
	{
		//check for Jail - if it doens't exist - disable this
		
		getServer().getPluginManager().registerEvents(new JHEventHandler(this), this);
		
		log.info(logPref + "enabled");
	}
	
	public void onDisable()
	{
		log.info(logPref + "disabled");
	}


}
