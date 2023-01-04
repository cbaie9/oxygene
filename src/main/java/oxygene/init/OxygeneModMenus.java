
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package oxygene.init;

import oxygene.world.inventory.ServerconfigMenu;
import oxygene.world.inventory.OxygenatiumguiMenu;
import oxygene.world.inventory.DebugoxgenatiumguiMenu;

import oxygene.OxygeneMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class OxygeneModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, OxygeneMod.MODID);
	public static final RegistryObject<MenuType<ServerconfigMenu>> SERVERCONFIG = REGISTRY.register("serverconfig",
			() -> IForgeMenuType.create(ServerconfigMenu::new));
	public static final RegistryObject<MenuType<OxygenatiumguiMenu>> OXYGENATIUMGUI = REGISTRY.register("oxygenatiumgui",
			() -> IForgeMenuType.create(OxygenatiumguiMenu::new));
	public static final RegistryObject<MenuType<DebugoxgenatiumguiMenu>> DEBUGOXGENATIUMGUI = REGISTRY.register("debugoxgenatiumgui",
			() -> IForgeMenuType.create(DebugoxgenatiumguiMenu::new));
}
