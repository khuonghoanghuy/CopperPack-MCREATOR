
package com.huyth.copperpack.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import com.huyth.copperpack.init.CopperpackModTabs;
import com.huyth.copperpack.init.CopperpackModItems;

public class PolozoAxeItem extends AxeItem {
	public PolozoAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 852;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 20f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 34;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CopperpackModItems.POLOZO_INGOT));
			}
		}, 1, -3f, new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_TOOLS));
		setRegistryName("polozo_axe");
	}
}
