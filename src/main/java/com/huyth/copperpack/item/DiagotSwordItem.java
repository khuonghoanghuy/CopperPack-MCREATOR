
package com.huyth.copperpack.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.huyth.copperpack.init.CopperpackModTabs;
import com.huyth.copperpack.init.CopperpackModItems;

public class DiagotSwordItem extends SwordItem {
	public DiagotSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 569;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CopperpackModItems.DIAGOT_INGOT));
			}
		}, 3, -3f, new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_COMBAT));
		setRegistryName("diagot_sword");
	}
}
