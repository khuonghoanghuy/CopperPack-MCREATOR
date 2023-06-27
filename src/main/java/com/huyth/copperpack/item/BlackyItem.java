
package com.huyth.copperpack.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.huyth.copperpack.init.CopperpackModTabs;

public class BlackyItem extends Item {
	public BlackyItem() {
		super(new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_MISC).stacksTo(64).rarity(Rarity.EPIC));
		setRegistryName("blacky");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
