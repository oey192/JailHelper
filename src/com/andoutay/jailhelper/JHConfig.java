package com.andoutay.jailhelper;

import org.bukkit.ChatColor;
import org.bukkit.configuration.Configuration;

public class JHConfig
{
private static Configuration config;
	
	public static int repeatTime;
	public static String loginMsg, repeatedMsg;
	private static JailHelper plugin;
	
	JHConfig(JailHelper plugin)
	{
		JHConfig.plugin = plugin;
		config = plugin.getConfig().getRoot();
		config.options().copyDefaults(true);
		plugin.saveConfig();
	}
	
	public static void onEnable()
	{
		loadConfigVals();
	}
	
	public static void reload()
	{
		plugin.reloadConfig();
		config = plugin.getConfig().getRoot();
		onEnable();
	}
	
	public static void loadConfigVals()
	{
		repeatTime = config.getInt("repeatTime");
		loginMsg = ChatColor.translateAlternateColorCodes('&', config.getString("loginMsg"));
		repeatedMsg = ChatColor.translateAlternateColorCodes('&',config.getString("repeatedMsg"));
	}
	
}
