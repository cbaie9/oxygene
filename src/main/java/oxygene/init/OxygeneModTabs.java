
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package oxygene.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class OxygeneModTabs {
	public static CreativeModeTab TAB_OXYGENEBASIC;

	public static void load() {
		TAB_OXYGENEBASIC = new CreativeModeTab("taboxygenebasic") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(OxygeneModItems.SALTIUM.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
