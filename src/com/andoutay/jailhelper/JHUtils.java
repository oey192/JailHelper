package com.andoutay.jailhelper;

import org.bukkit.plugin.Plugin;

import com.matejdro.bukkit.jail.Jail;
import com.matejdro.bukkit.jail.JailAPI;

public class JHUtils
{
	public static JailAPI getJailAPI(JailHelper plugin)
	{
		JailAPI jail = null;
		Plugin temp = plugin.getServer().getPluginManager().getPlugin("Jail");
		if (temp != null)
			jail = ((Jail)temp).API;
		else
			plugin.getServer().getPluginManager().disablePlugin(plugin);
		
		return jail;
	}
	
}
