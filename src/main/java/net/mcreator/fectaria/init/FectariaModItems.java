
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fectaria.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.fectaria.item.DreamEssenceItem;
import net.mcreator.fectaria.FectariaMod;

public class FectariaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FectariaMod.MODID);
	public static final RegistryObject<Item> BLUE_FLOWER = block(FectariaModBlocks.BLUE_FLOWER);
	public static final RegistryObject<Item> DREAM_ESSENCE_ORE = block(FectariaModBlocks.DREAM_ESSENCE_ORE);
	public static final RegistryObject<Item> DREAM_ESSENCE = REGISTRY.register("dream_essence", () -> new DreamEssenceItem());
	public static final RegistryObject<Item> DREAM_DWELLER_SPAWN_EGG = REGISTRY.register("dream_dweller_spawn_egg", () -> new ForgeSpawnEggItem(FectariaModEntities.DREAM_DWELLER, -6710887, -3342337, new Item.Properties()));
	public static final RegistryObject<Item> MACHINE_CORE = block(FectariaModBlocks.MACHINE_CORE);
	public static final RegistryObject<Item> MACHINE_NODE = block(FectariaModBlocks.MACHINE_NODE);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
