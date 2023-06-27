
package com.huyth.copperpack.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import com.huyth.copperpack.init.CopperpackModTabs;
import com.huyth.copperpack.init.CopperpackModItems;

public class GoimHoeItem extends HoeItem {
	public GoimHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 706;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 29;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CopperpackModItems.GOIM));
			}
		}, 0, -3f, new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_TOOLS));
		setRegistryName("goim_hoe");
	}
}
