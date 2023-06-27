
package com.huyth.copperpack.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
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

public abstract class Magenta_WoolArmorItem extends ArmorItem {
	public Magenta_WoolArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 6, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.MAGENTA_WOOL));
			}

			@Override
			public String getName() {
				return "magenta_wool_armor";
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

	public static class Helmet extends Magenta_WoolArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_ARMOR));
			setRegistryName("magenta_wool_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "copperpack:textures/models/armor/magenta_wool_layer_1.png";
		}
	}

	public static class Chestplate extends Magenta_WoolArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_ARMOR));
			setRegistryName("magenta_wool_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "copperpack:textures/models/armor/magenta_wool_layer_1.png";
		}
	}

	public static class Leggings extends Magenta_WoolArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_ARMOR));
			setRegistryName("magenta_wool_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "copperpack:textures/models/armor/magenta_wool_layer_2.png";
		}
	}

	public static class Boots extends Magenta_WoolArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CopperpackModTabs.TAB_COPPER_PACK_ARMOR));
			setRegistryName("magenta_wool_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "copperpack:textures/models/armor/magenta_wool_layer_1.png";
		}
	}
}
