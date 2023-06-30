
package com.huyth.copperpack.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import com.huyth.copperpack.init.CopperpackModTabs;
import com.huyth.copperpack.init.CopperpackModItems;

public class BandiHoeItem extends HoeItem {
	public BandiHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1561;
			}

			public float getSpeed() {
				return 13f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 7;
			}

			public int getEnchantmentValue() {
				return 52;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CopperpackModItems.BANDI_DUST));
			}
		}, 0, -3f, new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_TOOLS));
		setRegistryName("bandi_hoe");
	}
}
