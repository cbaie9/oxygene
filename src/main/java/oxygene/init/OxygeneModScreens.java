
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package oxygene.init;

import oxygene.client.gui.ServerconfigScreen;
import oxygene.client.gui.OxygenatiumguiScreen;
import oxygene.client.gui.DebugoxgenatiumguiScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OxygeneModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(OxygeneModMenus.SERVERCONFIG.get(), ServerconfigScreen::new);
			MenuScreens.register(OxygeneModMenus.OXYGENATIUMGUI.get(), OxygenatiumguiScreen::new);
			MenuScreens.register(OxygeneModMenus.DEBUGOXGENATIUMGUI.get(), DebugoxgenatiumguiScreen::new);
		});
	}
}
