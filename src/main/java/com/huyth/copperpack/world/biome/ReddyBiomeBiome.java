
package com.huyth.copperpack.world.biome;

import net.minecraftforge.common.BiomeManager;

import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilderBaseConfiguration;
import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.level.levelgen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.level.levelgen.placement.FrequencyWithExtraChanceDecoratorConfiguration;
import net.minecraft.world.level.levelgen.placement.FeatureDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoiseDependantDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.Features;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import java.util.Map;
import java.util.HashMap;

import com.huyth.copperpack.world.features.treedecorators.ReddyBiomeTrunkDecorator;
import com.huyth.copperpack.world.features.treedecorators.ReddyBiomeLeaveDecorator;
import com.huyth.copperpack.world.features.treedecorators.ReddyBiomeFruitDecorator;
import com.huyth.copperpack.init.CopperpackModBlocks;
import com.huyth.copperpack.init.CopperpackModBiomes;
import com.huyth.copperpack.CopperpackMod;

import com.google.common.collect.ImmutableList;

public class ReddyBiomeBiome {
	private static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = SurfaceBuilder.DEFAULT
			.configured(new SurfaceBuilderBaseConfiguration(CopperpackModBlocks.REDDY_BLOCK.defaultBlockState(),
					CopperpackModBlocks.REDDY_BLOCK.defaultBlockState(), CopperpackModBlocks.REDDY_BLOCK.defaultBlockState()));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(4159204).waterFogColor(329011).skyColor(7972607)
				.foliageColorOverride(10387789).grassColorOverride(9470285).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SURFACE_BUILDER);
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, register("trees", Feature.TREE
				.configured(
						(new TreeConfiguration.TreeConfigurationBuilder(new SimpleStateProvider(CopperpackModBlocks.REDUST_BLOCK.defaultBlockState()),
								new StraightTrunkPlacer(7, 2, 0), new SimpleStateProvider(CopperpackModBlocks.REDUST_ORE.defaultBlockState()),
								new SimpleStateProvider(Blocks.OAK_SAPLING.defaultBlockState()),
								new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)))
										.decorators(ImmutableList.of(ReddyBiomeLeaveDecorator.INSTANCE, ReddyBiomeTrunkDecorator.INSTANCE,
												ReddyBiomeFruitDecorator.INSTANCE))
										.build())
				.decorated(Features.Decorators.HEIGHTMAP_SQUARE)
				.decorated(FeatureDecorator.COUNT_EXTRA.configured(new FrequencyWithExtraChanceDecoratorConfiguration(1, 0.1F, 1)))));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				register("grass",
						Feature.RANDOM_PATCH.configured(Features.Configs.DEFAULT_GRASS_CONFIG).decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE)
								.decorated(FeatureDecorator.COUNT_NOISE.configured(new NoiseDependantDecoratorConfiguration(-0.8D, 5, 4)))));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				register("flower", Feature.FLOWER.configured(Features.Configs.DEFAULT_FLOWER_CONFIG).decorated(Features.Decorators.ADD_32)
						.decorated(Features.Decorators.HEIGHTMAP_SQUARE).count(4)));
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder().setPlayerCanSpawn();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.NONE).depth(0.1f).scale(0.2f)
				.temperature(0.5f).downfall(0.5f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build())
				.generationSettings(biomeGenerationSettings.build()).build();
	}

	public static void init() {
		Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new ResourceLocation(CopperpackMod.MODID, "reddy_biome"), SURFACE_BUILDER);
		CONFIGURED_FEATURES.forEach((resourceLocation, configuredFeature) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, resourceLocation,
				configuredFeature));
		BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(
				ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(CopperpackModBiomes.REDDY_BIOME)), 10));
	}

	private static final Map<ResourceLocation, ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = new HashMap<>();

	private static ConfiguredFeature<?, ?> register(String name, ConfiguredFeature<?, ?> configuredFeature) {
		CONFIGURED_FEATURES.put(new ResourceLocation(CopperpackMod.MODID, name + "_reddy_biome"), configuredFeature);
		return configuredFeature;
	}
}
