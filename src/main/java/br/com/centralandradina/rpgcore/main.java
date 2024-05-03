package br.com.centralandradina.rpgcore;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin
{
	/**
	 * hook plugin habilitado
	 */
	@Override
	public void onEnable()
	{
		Bukkit.getLogger().info("[RPGCore] Enabled");
	}

	/***
	 * hook plugin desabilitado
	 */
	@Override
	public void onDisable()
	{
		Bukkit.getLogger().info("[RPGCore] Disabled");
	}
}