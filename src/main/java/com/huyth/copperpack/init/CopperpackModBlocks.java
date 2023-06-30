
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.huyth.copperpack.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

import com.huyth.copperpack.block.WoolDimensionPortalBlock;
import com.huyth.copperpack.block.WoalOreBlock;
import com.huyth.copperpack.block.WoalBlockBlock;
import com.huyth.copperpack.block.WhistOreBlock;
import com.huyth.copperpack.block.WhistBlockBlock;
import com.huyth.copperpack.block.SliverOreBlock;
import com.huyth.copperpack.block.SliverBlockBlock;
import com.huyth.copperpack.block.ScopindaOreBlock;
import com.huyth.copperpack.block.ScopindaBlockBlock;
import com.huyth.copperpack.block.RedustOreBlock;
import com.huyth.copperpack.block.RedustBlockBlock;
import com.huyth.copperpack.block.ReddyOreBlock;
import com.huyth.copperpack.block.ReddyDimensionPortalBlock;
import com.huyth.copperpack.block.ReddyBlockBlock;
import com.huyth.copperpack.block.PolozoOreBlock;
import com.huyth.copperpack.block.PolozoBlockBlock;
import com.huyth.copperpack.block.MagentaOreBlock;
import com.huyth.copperpack.block.MagentaBlockBlock;
import com.huyth.copperpack.block.LenonOreBlock;
import com.huyth.copperpack.block.LenonBlockBlock;
import com.huyth.copperpack.block.LazyFlowerBlock;
import com.huyth.copperpack.block.IcolyOreBlock;
import com.huyth.copperpack.block.IcolyBlockBlock;
import com.huyth.copperpack.block.HealthyFlowerBlock;
import com.huyth.copperpack.block.GreenOreBlock;
import com.huyth.copperpack.block.GreenBlockBlock;
import com.huyth.copperpack.block.GreeDaBlock;
import com.huyth.copperpack.block.GoldyOreBlock;
import com.huyth.copperpack.block.GoldyBlockBlock;
import com.huyth.copperpack.block.GoimOreBlock;
import com.huyth.copperpack.block.GoimBlockBlock;
import com.huyth.copperpack.block.GironOreBlock;
import com.huyth.copperpack.block.GironBlockBlock;
import com.huyth.copperpack.block.DusttinOreBlock;
import com.huyth.copperpack.block.DusttinBlockBlock;
import com.huyth.copperpack.block.DiagotOreBlock;
import com.huyth.copperpack.block.DiagotBlockBlock;
import com.huyth.copperpack.block.CoppyOreBlock;
import com.huyth.copperpack.block.CoppyBlockBlock;
import com.huyth.copperpack.block.CopperOreBlock;
import com.huyth.copperpack.block.CopperBlockBlock;
import com.huyth.copperpack.block.CoadyOreBlock;
import com.huyth.copperpack.block.CoadyBlockBlock;
import com.huyth.copperpack.block.BludyOreBlock;
import com.huyth.copperpack.block.BludyBlockBlock;
import com.huyth.copperpack.block.BlackyOreBlock;
import com.huyth.copperpack.block.BlackyBlockBlock;
import com.huyth.copperpack.block.BandiOreBlock;
import com.huyth.copperpack.block.BandiBlockBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CopperpackModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block COPPER_ORE = register(new CopperOreBlock());
	public static final Block COPPER_BLOCK = register(new CopperBlockBlock());
	public static final Block SLIVER_ORE = register(new SliverOreBlock());
	public static final Block SLIVER_BLOCK = register(new SliverBlockBlock());
	public static final Block DUSTTIN_ORE = register(new DusttinOreBlock());
	public static final Block DUSTTIN_BLOCK = register(new DusttinBlockBlock());
	public static final Block WOOL_DIMENSION_PORTAL = register(new WoolDimensionPortalBlock());
	public static final Block MAGENTA_ORE = register(new MagentaOreBlock());
	public static final Block MAGENTA_BLOCK = register(new MagentaBlockBlock());
	public static final Block GOLDY_ORE = register(new GoldyOreBlock());
	public static final Block GOLDY_BLOCK = register(new GoldyBlockBlock());
	public static final Block BLUDY_ORE = register(new BludyOreBlock());
	public static final Block BLUDY_BLOCK = register(new BludyBlockBlock());
	public static final Block REDUST_ORE = register(new RedustOreBlock());
	public static final Block REDUST_BLOCK = register(new RedustBlockBlock());
	public static final Block COPPY_ORE = register(new CoppyOreBlock());
	public static final Block COPPY_BLOCK = register(new CoppyBlockBlock());
	public static final Block DIAGOT_ORE = register(new DiagotOreBlock());
	public static final Block DIAGOT_BLOCK = register(new DiagotBlockBlock());
	public static final Block GREEN_ORE = register(new GreenOreBlock());
	public static final Block GREEN_BLOCK = register(new GreenBlockBlock());
	public static final Block COADY_ORE = register(new CoadyOreBlock());
	public static final Block COADY_BLOCK = register(new CoadyBlockBlock());
	public static final Block LENON_ORE = register(new LenonOreBlock());
	public static final Block LENON_BLOCK = register(new LenonBlockBlock());
	public static final Block ICOLY_ORE = register(new IcolyOreBlock());
	public static final Block ICOLY_BLOCK = register(new IcolyBlockBlock());
	public static final Block GOIM_ORE = register(new GoimOreBlock());
	public static final Block GOIM_BLOCK = register(new GoimBlockBlock());
	public static final Block REDDY_ORE = register(new ReddyOreBlock());
	public static final Block REDDY_BLOCK = register(new ReddyBlockBlock());
	public static final Block REDDY_DIMENSION_PORTAL = register(new ReddyDimensionPortalBlock());
	public static final Block WOAL_ORE = register(new WoalOreBlock());
	public static final Block WOAL_BLOCK = register(new WoalBlockBlock());
	public static final Block BLACKY_ORE = register(new BlackyOreBlock());
	public static final Block BLACKY_BLOCK = register(new BlackyBlockBlock());
	public static final Block GREE_DA = register(new GreeDaBlock());
	public static final Block LAZY_FLOWER = register(new LazyFlowerBlock());
	public static final Block POLOZO_ORE = register(new PolozoOreBlock());
	public static final Block POLOZO_BLOCK = register(new PolozoBlockBlock());
	public static final Block GIRON_ORE = register(new GironOreBlock());
	public static final Block GIRON_BLOCK = register(new GironBlockBlock());
	public static final Block HEALTHY_FLOWER = register(new HealthyFlowerBlock());
	public static final Block SCOPINDA_ORE = register(new ScopindaOreBlock());
	public static final Block SCOPINDA_BLOCK = register(new ScopindaBlockBlock());
	public static final Block BANDI_ORE = register(new BandiOreBlock());
	public static final Block BANDI_BLOCK = register(new BandiBlockBlock());
	public static final Block WHIST_ORE = register(new WhistOreBlock());
	public static final Block WHIST_BLOCK = register(new WhistBlockBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			GreeDaBlock.registerRenderLayer();
			LazyFlowerBlock.registerRenderLayer();
			HealthyFlowerBlock.registerRenderLayer();
		}
	}
}
