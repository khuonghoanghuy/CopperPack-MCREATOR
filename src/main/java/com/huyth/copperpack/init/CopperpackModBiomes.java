
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.huyth.copperpack.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;

import java.util.List;
import java.util.ArrayList;

import com.huyth.copperpack.world.biome.WoolBiomeBiome;
import com.huyth.copperpack.world.biome.ReddyBiomeBiome;
import com.huyth.copperpack.CopperpackMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CopperpackModBiomes {
	private static final List<Biome> REGISTRY = new ArrayList<>();
	public static Biome WOOL_BIOME = register("wool_biome", WoolBiomeBiome.createBiome());
	public static Biome REDDY_BIOME = register("reddy_biome", ReddyBiomeBiome.createBiome());

	private static Biome register(String registryname, Biome biome) {
		REGISTRY.add(biome.setRegistryName(new ResourceLocation(CopperpackMod.MODID, registryname)));
		return biome;
	}

	@SubscribeEvent
	public static void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Biome[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			WoolBiomeBiome.init();
			ReddyBiomeBiome.init();
		});
	}
}
