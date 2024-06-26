package br.com.centralandradina.RPGCore;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.configuration.file.FileConfiguration;

public class RPGCore extends JavaPlugin
{
	FileConfiguration config;
	
	/**
	 * hook plugin habilitado
	 */
	@Override
	public void onEnable()
	{
		// config
		config = this.getConfig();
		config.addDefault("ST.multiplier", 1);
		config.addDefault("ST.per_level.GENERIC_ARMOR", 0.6);
		config.addDefault("ST.per_level.GENERIC_ARMOR_TOUGHNESS", 0.7);
		config.addDefault("ST.per_level.GENERIC_ATTACK_DAMAGE", 0.7);
		config.addDefault("ST.per_level.GENERIC_ATTACK_KNOCKBACK", 0.2);
		config.addDefault("ST.per_level.GENERIC_KNOCKBACK_RESISTANCE", 0.1);

		config.addDefault("DX.multiplier", 1);
		config.addDefault("DX.per_level.GENERIC_ARMOR_TOUGHNESS", 0.3);
		config.addDefault("DX.per_level.GENERIC_ATTACK_SPEED", 0.3);
		config.addDefault("DX.per_level.GENERIC_MOVEMENT_SPEED", 0.2);
		config.addDefault("DX.per_level.GENERIC_FLYING_SPEED", 0.1);
		config.addDefault("DX.per_level.GENERIC_LUCK", 0.1);

		config.addDefault("IQ.multiplier", 1);
		config.addDefault("IQ.per_level.GENERIC_LUCK", 0.2);

		config.addDefault("HT.multiplier", 1);
		config.addDefault("HT.per_level.GENERIC_MAX_HEALTH", 0.2);
		config.addDefault("HT.per_level.GENERIC_MOVEMENT_SPEED", 0.2);
		config.addDefault("HT.per_level.GENERIC_MAX_ABSORPTION", 0.2);
		
		config.options().copyDefaults(true);
		saveConfig();

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

	/**
	 * manipula os atributos dos players (criar classe só para manipular players)
	 */
	// addSTPoint(Player, Value=1)
	// getST(Player)
	// setST(Player, Value)
	// addDXPoint(Player, Value=1)
	// getDX(Player)
	// setDX(Player, Value)
	// addIQPoint(Player, Value=1)
	// getIQ(Player)
	// setIQ(Player, Value)
	// addHTPoint(Player, Value=1)
	// getHT(Player)
	// setHT(Player, Value)

	// manipula os atributos modificadores

	// addAtribute(Player, Attribute, Value)
	// addArmor(Player, Value)
	// addArmorToughness(Player, Value)
	// addAttackDamage(Player, Value)
	// addAttackKnockback(Player, Value)
	// addAttackSpeed(Player, Value)
	// addFlySpeed(Player, Value)
	// addKnockbackResistance(Player, Value)
	// addLuck(Player, Value)
	// addMaxHealth(Player, Value)
	// addMovimentSpeed(Player, Value)

	/**
	 * manipula os atributos dos monstros (criar classe só para manipular os monstros)
	 */
	// addSTPoint(Monster, Value=1)
	// getST(Monster)
	// setST(Monster, Value)
	// addDXPoint(Monster, Value=1)
	// getDX(Monster)
	// setDX(Monster, Value)
	// addIQPoint(Monster, Value=1)
	// getIQ(Monster)
	// setIQ(Monster, Value)
	// addHTPoint(Monster, Value=1)
	// getHT(Monster)
	// setHT(Monster, Value)

	// addAtribute(Monster, Attribute, Value)
	// addArmor(Monster, Value)
	// addArmorToughness(Monster, Value)
	// addAttackDamage(Monster, Value)
	// addAttackKnockback(Monster, Value)
	// addKnockbackResistance(Monster, Value)
	// addMaxHealth(Monster, Value)
	// addMovimentSpeed(Monster, Value)
	// addFollowRange(Monster, Value)

	/**
	 * manipula os atributos dos itens (criar classe só pra manipular itens)
	 * 
	 * ao setar, ja adicionar um lore padrão para padronizar
	 */
	// addST(ItemStack, Value=1)
	// getST(ItemStack)
	// setST(ItemStack, Value)
	// addDX(ItemStack, Value=1)
	// getDX(ItemStack)
	// setDX(ItemStack, Value)
	// addIQ(ItemStack, Value=1)
	// getIQ(ItemStack)
	// setIQ(ItemStack, Value)
	// addHT(ItemStack, Value=1)
	// getHT(ItemStack)
	// setHT(ItemStack, Value)

	// Attribute.GENERIC_ARMOR
	// Attribute.GENERIC_ARMOR_TOUGHNESS
	// Attribute.GENERIC_ATTACK_DAMAGE
	// Attribute.GENERIC_ATTACK_KNOCKBACK
	// Attribute.GENERIC_ATTACK_SPEED
	// Attribute.GENERIC_FLYING_SPEED
	// Attribute.GENERIC_KNOCKBACK_RESISTANCE
	// Attribute.GENERIC_LUCK
	// Attribute.GENERIC_MAX_ABSORPTION ??
	// Attribute.GENERIC_MAX_HEALTH
	// Attribute.GENERIC_MOVEMENT_SPEED

	/**
	 * recalcula os atributos do minecraft, com base nos atributos RPG
	 * 
	 * zera todos os atributos modificadores, e recria-os
	 */
	// processAttributes // 
}