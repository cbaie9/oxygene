
package oxygene.item;

import oxygene.init.OxygeneModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SaltiumItem extends Item {
	public SaltiumItem() {
		super(new Item.Properties().tab(OxygeneModTabs.TAB_OXYGENEBASIC).stacksTo(64).rarity(Rarity.COMMON));
	}
}
