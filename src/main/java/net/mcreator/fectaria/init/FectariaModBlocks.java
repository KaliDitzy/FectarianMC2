
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fectaria.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.fectaria.block.MachineNodeBlock;
import net.mcreator.fectaria.block.MachineCoreBlock;
import net.mcreator.fectaria.block.DreamEssenceOreBlock;
import net.mcreator.fectaria.block.CedarStrippedLogBlock;
import net.mcreator.fectaria.block.CedarStairsBlock;
import net.mcreator.fectaria.block.CedarSlabBlock;
import net.mcreator.fectaria.block.CedarPlanksBlock;
import net.mcreator.fectaria.block.CedarLogBlock;
import net.mcreator.fectaria.block.CedarFenceBlock;
import net.mcreator.fectaria.block.BlueFlowerBlock;
import net.mcreator.fectaria.FectariaMod;

public class FectariaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FectariaMod.MODID);
	public static final RegistryObject<Block> BLUE_FLOWER = REGISTRY.register("blue_flower", () -> new BlueFlowerBlock());
	public static final RegistryObject<Block> DREAM_ESSENCE_ORE = REGISTRY.register("dream_essence_ore", () -> new DreamEssenceOreBlock());
	public static final RegistryObject<Block> MACHINE_CORE = REGISTRY.register("machine_core", () -> new MachineCoreBlock());
	public static final RegistryObject<Block> MACHINE_NODE = REGISTRY.register("machine_node", () -> new MachineNodeBlock());
	public static final RegistryObject<Block> CEDAR_LOG = REGISTRY.register("cedar_log", () -> new CedarLogBlock());
	public static final RegistryObject<Block> CEDAR_STRIPPED_LOG = REGISTRY.register("cedar_stripped_log", () -> new CedarStrippedLogBlock());
	public static final RegistryObject<Block> CEDAR_PLANKS = REGISTRY.register("cedar_planks", () -> new CedarPlanksBlock());
	public static final RegistryObject<Block> CEDAR_SLAB = REGISTRY.register("cedar_slab", () -> new CedarSlabBlock());
	public static final RegistryObject<Block> CEDAR_STAIRS = REGISTRY.register("cedar_stairs", () -> new CedarStairsBlock());
	public static final RegistryObject<Block> CEDAR_FENCE = REGISTRY.register("cedar_fence", () -> new CedarFenceBlock());
}
