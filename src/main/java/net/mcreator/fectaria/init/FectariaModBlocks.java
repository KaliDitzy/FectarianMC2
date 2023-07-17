
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fectaria.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.fectaria.block.DreamEssenceOreBlock;
import net.mcreator.fectaria.block.BlueFlowerBlock;
import net.mcreator.fectaria.FectariaMod;

public class FectariaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FectariaMod.MODID);
	public static final RegistryObject<Block> BLUE_FLOWER = REGISTRY.register("blue_flower", () -> new BlueFlowerBlock());
	public static final RegistryObject<Block> DREAM_ESSENCE_ORE = REGISTRY.register("dream_essence_ore", () -> new DreamEssenceOreBlock());
}
