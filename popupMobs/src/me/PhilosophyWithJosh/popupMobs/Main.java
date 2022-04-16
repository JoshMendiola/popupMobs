package me.PhilosophyWithJosh.popupMobs;

import org.bukkit.plugin.java.JavaPlugin;

import me.PhilosophyWithJosh.popupMobs.listeners.blockListener;


public class Main extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		new blockListener(this);
	}
}
