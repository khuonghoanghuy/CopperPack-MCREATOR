
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.huyth.copperpack.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CopperpackModPotions {
	private static final List<Potion> REGISTRY = new ArrayList<>();
	public static final Potion LAZY_POTION = register(new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 6800, 0, false, false),
			new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 0, false, true), new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 0, false, true),
			new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 700, 0, false, true), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 700, 0, false, true))
					.setRegistryName("lazy_potion"));
	public static final Potion SUPER_HEALTH_POTION = register(
			new Potion(new MobEffectInstance(MobEffects.HEAL, 800, 0, false, true)).setRegistryName("super_health_potion"));
	public static final Potion HEALTHY_POTIONS = register(
			new Potion(new MobEffectInstance(MobEffects.HEAL, 5200, 0, false, true)).setRegistryName("healthy_potions"));

	private static Potion register(Potion potion) {
		REGISTRY.add(potion);
		return potion;
	}

	@SubscribeEvent
	public static void registerPotions(RegistryEvent.Register<Potion> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Potion[0]));
	}
}
