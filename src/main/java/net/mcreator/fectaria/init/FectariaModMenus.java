
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fectaria.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.fectaria.world.inventory.MachineCoreGUIMenu;
import net.mcreator.fectaria.FectariaMod;

public class FectariaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, FectariaMod.MODID);
	public static final RegistryObject<MenuType<MachineCoreGUIMenu>> MACHINE_CORE_GUI = REGISTRY.register("machine_core_gui", () -> IForgeMenuType.create(MachineCoreGUIMenu::new));
}
