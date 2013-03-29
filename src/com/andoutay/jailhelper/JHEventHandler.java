package com.andoutay.jailhelper;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.matejdro.bukkit.jail.JailAPI;

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
		JailAPI jail = JHUtils.getJailAPI(plugin);
		Player p = evt.getPlayer();
		String msg = JHUtils.formatMsgFromConfig(JHConfig.loginMsg, p, plugin);
		
		if (jail.isPlayerJailed(p.getName()) && p.hasPermission("jailhelper.showonlogin"))
			p.sendMessage(msg);
	}
}
