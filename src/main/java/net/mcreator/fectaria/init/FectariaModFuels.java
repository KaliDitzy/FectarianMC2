
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fectaria.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class FectariaModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == FectariaModBlocks.CEDAR_LOG.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == FectariaModBlocks.CEDAR_STRIPPED_LOG.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == FectariaModBlocks.CEDAR_PLANKS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == FectariaModBlocks.CEDAR_SLAB.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == FectariaModBlocks.CEDAR_FENCE.get().asItem())
			event.setBurnTime(300);
	}
}
