
package com.huyth.copperpack.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.huyth.copperpack.init.CopperpackModTabs;
import com.huyth.copperpack.init.CopperpackModItems;

public abstract class WoalArmorItem extends ArmorItem {
	public WoalArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 16;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 7, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 10;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CopperpackModItems.WOAL_DUST));
			}

			@Override
			public String getName() {
				return "woal_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends WoalArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_ARMOR));
			setRegistryName("woal_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "copperpack:textures/models/armor/woal_layer_1.png";
		}
	}

	public static class Chestplate extends WoalArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_ARMOR));
			setRegistryName("woal_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "copperpack:textures/models/armor/woal_layer_1.png";
		}
	}

	public static class Leggings extends WoalArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_ARMOR));
			setRegistryName("woal_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "copperpack:textures/models/armor/woal_layer_2.png";
		}
	}

	public static class Boots extends WoalArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_ARMOR));
			setRegistryName("woal_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "copperpack:textures/models/armor/woal_layer_1.png";
		}
	}
}
