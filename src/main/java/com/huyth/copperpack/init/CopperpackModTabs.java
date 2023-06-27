
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.huyth.copperpack.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CopperpackModTabs {
	public static CreativeModeTab TAB_COPPER_PACK_ARMOR;
	public static CreativeModeTab TAB_COPPER_PACK_TOOLS;
	public static CreativeModeTab TAB_COPPER_PACK_COMBAT;
	public static CreativeModeTab TAB_COPPER_PACK_BLOCK;
	public static CreativeModeTab TAB_COPPER_PACK_MISC;
	public static CreativeModeTab TAB_COPPER_PACK_PORTAL_IGNITER;
	public static CreativeModeTab TAB_COPPER_PACK_PLANTS;

	public static void load() {
		TAB_COPPER_PACK_ARMOR = new CreativeModeTab("tabcopper_pack_armor") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CopperpackModItems.COPPER_ARMOR_CHESTPLATE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_COPPER_PACK_TOOLS = new CreativeModeTab("tabcopper_pack_tools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CopperpackModItems.COPPER_AXE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_COPPER_PACK_COMBAT = new CreativeModeTab("tabcopper_pack_combat") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CopperpackModItems.COPPER_SWORD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_COPPER_PACK_BLOCK = new CreativeModeTab("tabcopper_pack_block") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CopperpackModBlocks.COPPER_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_COPPER_PACK_MISC = new CreativeModeTab("tabcopper_pack_misc") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CopperpackModItems.COPPER_INGOT);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_COPPER_PACK_PORTAL_IGNITER = new CreativeModeTab("tabcopper_pack_portal_igniter") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CopperpackModItems.WOOL_DIMENSION);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_COPPER_PACK_PLANTS = new CreativeModeTab("tabcopper_pack_plants") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CopperpackModBlocks.GREE_DA);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
