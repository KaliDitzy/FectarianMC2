package net.mcreator.fectaria.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WeightAttProcedure {
	@SubscribeEvent
	public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
		execute(event, event.getCrafting());
	}

	public static void execute(ItemStack itemstack) {
		execute(null, itemstack);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack) {
		if (itemstack.getItem() == Items.LEATHER_HELMET) {
			itemstack.getOrCreateTag().putDouble("weight", 1);
		} else {
			if (itemstack.getItem() == Items.IRON_HELMET) {
				itemstack.getOrCreateTag().putDouble("weight", 2);
			} else {
				if (itemstack.getItem() == Items.DIAMOND_HELMET) {
					itemstack.getOrCreateTag().putDouble("weight", 3);
				} else {
					if (itemstack.getItem() == Items.GOLDEN_HELMET) {
						itemstack.getOrCreateTag().putDouble("weight", 4);
					} else {
						if (itemstack.getItem() == Items.NETHERITE_HELMET) {
							itemstack.getOrCreateTag().putDouble("weight", 5);
						}
					}
				}
			}
		}
		if (itemstack.getItem() == Items.LEATHER_CHESTPLATE) {
			itemstack.getOrCreateTag().putDouble("weight", 1);
		} else {
			if (itemstack.getItem() == Items.IRON_CHESTPLATE) {
				itemstack.getOrCreateTag().putDouble("weight", 2);
			} else {
				if (itemstack.getItem() == Items.DIAMOND_CHESTPLATE) {
					itemstack.getOrCreateTag().putDouble("weight", 3);
				} else {
					if (itemstack.getItem() == Items.GOLDEN_CHESTPLATE) {
						itemstack.getOrCreateTag().putDouble("weight", 4);
					} else {
						if (itemstack.getItem() == Items.NETHERITE_CHESTPLATE) {
							itemstack.getOrCreateTag().putDouble("weight", 5);
						}
					}
				}
			}
		}
		if (itemstack.getItem() == Items.LEATHER_LEGGINGS) {
			itemstack.getOrCreateTag().putDouble("weight", 1);
		} else {
			if (itemstack.getItem() == Items.IRON_LEGGINGS) {
				itemstack.getOrCreateTag().putDouble("weight", 2);
			} else {
				if (itemstack.getItem() == Items.DIAMOND_LEGGINGS) {
					itemstack.getOrCreateTag().putDouble("weight", 3);
				} else {
					if (itemstack.getItem() == Items.GOLDEN_LEGGINGS) {
						itemstack.getOrCreateTag().putDouble("weight", 4);
					} else {
						if (itemstack.getItem() == Items.NETHERITE_LEGGINGS) {
							itemstack.getOrCreateTag().putDouble("weight", 5);
						}
					}
				}
			}
		}
		if (itemstack.getItem() == Items.LEATHER_BOOTS) {
			itemstack.getOrCreateTag().putDouble("weight", 1);
		} else {
			if (itemstack.getItem() == Items.IRON_BOOTS) {
				itemstack.getOrCreateTag().putDouble("weight", 2);
			} else {
				if (itemstack.getItem() == Items.DIAMOND_BOOTS) {
					itemstack.getOrCreateTag().putDouble("weight", 3);
				} else {
					if (itemstack.getItem() == Items.GOLDEN_BOOTS) {
						itemstack.getOrCreateTag().putDouble("weight", 4);
					} else {
						if (itemstack.getItem() == Items.NETHERITE_BOOTS) {
							itemstack.getOrCreateTag().putDouble("weight", 5);
						}
					}
				}
			}
		}
	}
}
