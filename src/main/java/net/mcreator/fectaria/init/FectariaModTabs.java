
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fectaria.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FectariaModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(FectariaModBlocks.CEDAR_LOG.get().asItem());
			tabData.accept(FectariaModBlocks.CEDAR_STRIPPED_LOG.get().asItem());
			tabData.accept(FectariaModBlocks.CEDAR_PLANKS.get().asItem());
			tabData.accept(FectariaModBlocks.CEDAR_SLAB.get().asItem());
			tabData.accept(FectariaModBlocks.CEDAR_STAIRS.get().asItem());
			tabData.accept(FectariaModBlocks.CEDAR_FENCE.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(FectariaModItems.DREAM_DWELLER_SPAWN_EGG.get());
		}

		if (tabData.getTab() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(FectariaModItems.DREAM_ESSENCE.get());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
		}

		if (tabData.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(FectariaModBlocks.BLUE_FLOWER.get().asItem());
			tabData.accept(FectariaModBlocks.DREAM_ESSENCE_ORE.get().asItem());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("fectaria", "machines"),
				builder -> builder.title(Component.translatable("item_group.fectaria.machines")).icon(() -> new ItemStack(FectariaModBlocks.MACHINE_CORE.get())).displayItems((parameters, tabData) -> {
					tabData.accept(FectariaModBlocks.MACHINE_CORE.get().asItem());
					tabData.accept(FectariaModBlocks.MACHINE_NODE.get().asItem());
				})

		);
	}
}
