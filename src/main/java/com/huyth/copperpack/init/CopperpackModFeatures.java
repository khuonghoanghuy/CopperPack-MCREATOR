
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.huyth.copperpack.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

import com.huyth.copperpack.world.features.plants.LazyFlowerFeature;
import com.huyth.copperpack.world.features.plants.HealthyFlowerFeature;
import com.huyth.copperpack.world.features.plants.GreeDaFeature;
import com.huyth.copperpack.world.features.ores.WoalOreFeature;
import com.huyth.copperpack.world.features.ores.SliverOreFeature;
import com.huyth.copperpack.world.features.ores.ScopindaOreFeature;
import com.huyth.copperpack.world.features.ores.RedustOreFeature;
import com.huyth.copperpack.world.features.ores.ReddyOreFeature;
import com.huyth.copperpack.world.features.ores.PolozoOreFeature;
import com.huyth.copperpack.world.features.ores.MagentaOreFeature;
import com.huyth.copperpack.world.features.ores.LenonOreFeature;
import com.huyth.copperpack.world.features.ores.IcolyOreFeature;
import com.huyth.copperpack.world.features.ores.GreenOreFeature;
import com.huyth.copperpack.world.features.ores.GoldyOreFeature;
import com.huyth.copperpack.world.features.ores.GoimOreFeature;
import com.huyth.copperpack.world.features.ores.GironOreFeature;
import com.huyth.copperpack.world.features.ores.DusttinOreFeature;
import com.huyth.copperpack.world.features.ores.DiagotOreFeature;
import com.huyth.copperpack.world.features.ores.CoppyOreFeature;
import com.huyth.copperpack.world.features.ores.CopperOreFeature;
import com.huyth.copperpack.world.features.ores.CoadyOreFeature;
import com.huyth.copperpack.world.features.ores.BludyOreFeature;
import com.huyth.copperpack.world.features.ores.BlackyOreFeature;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CopperpackModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(CopperOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CopperOreFeature.GENERATE_BIOMES,
				CopperOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SliverOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SliverOreFeature.GENERATE_BIOMES,
				SliverOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DusttinOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DusttinOreFeature.GENERATE_BIOMES,
				DusttinOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MagentaOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, MagentaOreFeature.GENERATE_BIOMES,
				MagentaOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GoldyOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GoldyOreFeature.GENERATE_BIOMES,
				GoldyOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BludyOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BludyOreFeature.GENERATE_BIOMES,
				BludyOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RedustOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RedustOreFeature.GENERATE_BIOMES,
				RedustOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CoppyOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CoppyOreFeature.GENERATE_BIOMES,
				CoppyOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DiagotOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DiagotOreFeature.GENERATE_BIOMES,
				DiagotOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GreenOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GreenOreFeature.GENERATE_BIOMES,
				GreenOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CoadyOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CoadyOreFeature.GENERATE_BIOMES,
				CoadyOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LenonOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LenonOreFeature.GENERATE_BIOMES,
				LenonOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(IcolyOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, IcolyOreFeature.GENERATE_BIOMES,
				IcolyOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GoimOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GoimOreFeature.GENERATE_BIOMES,
				GoimOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ReddyOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ReddyOreFeature.GENERATE_BIOMES,
				ReddyOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(WoalOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, WoalOreFeature.GENERATE_BIOMES,
				WoalOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BlackyOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BlackyOreFeature.GENERATE_BIOMES,
				BlackyOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GreeDaFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, GreeDaFeature.GENERATE_BIOMES,
				GreeDaFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LazyFlowerFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				LazyFlowerFeature.GENERATE_BIOMES, LazyFlowerFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PolozoOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PolozoOreFeature.GENERATE_BIOMES,
				PolozoOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GironOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GironOreFeature.GENERATE_BIOMES,
				GironOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(HealthyFlowerFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				HealthyFlowerFeature.GENERATE_BIOMES, HealthyFlowerFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ScopindaOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ScopindaOreFeature.GENERATE_BIOMES, ScopindaOreFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
