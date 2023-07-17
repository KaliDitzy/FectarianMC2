
package net.mcreator.fectaria.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DreamEssenceItem extends Item {
	public DreamEssenceItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
