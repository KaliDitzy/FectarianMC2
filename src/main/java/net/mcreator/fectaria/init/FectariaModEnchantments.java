
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fectaria.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.fectaria.enchantment.PoisonTippedEnchantment;
import net.mcreator.fectaria.FectariaMod;

public class FectariaModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, FectariaMod.MODID);
	public static final RegistryObject<Enchantment> POISON_TIPPED = REGISTRY.register("poison_tipped", () -> new PoisonTippedEnchantment());
}
