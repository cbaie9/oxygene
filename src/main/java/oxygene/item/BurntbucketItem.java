
package oxygene.item;

import oxygene.init.OxygeneModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BurntbucketItem extends Item {
	public BurntbucketItem() {
		super(new Item.Properties().tab(OxygeneModTabs.TAB_OXYGENEBASIC).stacksTo(1).rarity(Rarity.COMMON));
	}
}
