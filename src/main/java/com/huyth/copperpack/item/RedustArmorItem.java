
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

public abstract class RedustArmorItem extends ArmorItem {
	public RedustArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 19;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 8, 6, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 12;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CopperpackModItems.REDUST_DUST));
			}

			@Override
			public String getName() {
				return "redust_armor";
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

	public static class Helmet extends RedustArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_ARMOR));
			setRegistryName("redust_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "copperpack:textures/models/armor/redust_layer_1.png";
		}
	}

	public static class Chestplate extends RedustArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_ARMOR));
			setRegistryName("redust_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "copperpack:textures/models/armor/redust_layer_1.png";
		}
	}

	public static class Leggings extends RedustArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_ARMOR));
			setRegistryName("redust_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "copperpack:textures/models/armor/redust_layer_2.png";
		}
	}

	public static class Boots extends RedustArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_ARMOR));
			setRegistryName("redust_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "copperpack:textures/models/armor/redust_layer_1.png";
		}
	}
}
