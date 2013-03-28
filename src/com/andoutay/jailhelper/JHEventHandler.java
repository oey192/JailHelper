package com.andoutay.jailhelper;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JHEventHandler implements Listener
{
	JailHelper plugin;
	
	JHEventHandler(JailHelper plugin)
	{
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent evt)
	{
		
	}
}
