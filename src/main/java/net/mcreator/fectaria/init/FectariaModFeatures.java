
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fectaria.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.fectaria.world.features.plants.BlueFlowerFeature;
import net.mcreator.fectaria.world.features.ores.DreamEssenceOreFeature;
import net.mcreator.fectaria.world.features.DirtHutFeature;
import net.mcreator.fectaria.FectariaMod;

@Mod.EventBusSubscriber
public class FectariaModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, FectariaMod.MODID);
	public static final RegistryObject<Feature<?>> BLUE_FLOWER = REGISTRY.register("blue_flower", BlueFlowerFeature::new);
	public static final RegistryObject<Feature<?>> DREAM_ESSENCE_ORE = REGISTRY.register("dream_essence_ore", DreamEssenceOreFeature::new);
	public static final RegistryObject<Feature<?>> DIRT_HUT = REGISTRY.register("dirt_hut", DirtHutFeature::new);
}
