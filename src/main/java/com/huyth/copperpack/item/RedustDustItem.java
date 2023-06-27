
package com.huyth.copperpack.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.huyth.copperpack.init.CopperpackModTabs;

public class RedustDustItem extends Item {
	public RedustDustItem() {
		super(new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_MISC).stacksTo(64).rarity(Rarity.UNCOMMON));
		setRegistryName("redust_dust");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
