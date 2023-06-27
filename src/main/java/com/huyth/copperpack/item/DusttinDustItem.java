
package com.huyth.copperpack.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.huyth.copperpack.init.CopperpackModTabs;

public class DusttinDustItem extends Item {
	public DusttinDustItem() {
		super(new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_MISC).stacksTo(64).rarity(Rarity.RARE));
		setRegistryName("dusttin_dust");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
