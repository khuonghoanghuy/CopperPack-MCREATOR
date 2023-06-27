
package com.huyth.copperpack.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.huyth.copperpack.init.CopperpackModTabs;
import com.huyth.copperpack.init.CopperpackModItems;

public class ScopindaSwordItem extends SwordItem {
	public ScopindaSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1444;
			}

			public float getSpeed() {
				return 13f;
			}

			public float getAttackDamageBonus() {
				return 19f;
			}

			public int getLevel() {
				return 7;
			}

			public int getEnchantmentValue() {
				return 49;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CopperpackModItems.SCOPINDA));
			}
		}, 3, -3f, new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_COMBAT));
		setRegistryName("scopinda_sword");
	}
}
