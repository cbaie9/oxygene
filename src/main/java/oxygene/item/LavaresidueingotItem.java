
package oxygene.item;

import oxygene.init.OxygeneModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LavaresidueingotItem extends Item {
	public LavaresidueingotItem() {
		super(new Item.Properties().tab(OxygeneModTabs.TAB_OXYGENEBASIC).stacksTo(64).rarity(Rarity.COMMON));
	}
}
