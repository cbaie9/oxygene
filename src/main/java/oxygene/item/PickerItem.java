
package oxygene.item;

import oxygene.procedures.PickerprocessProcedure;

import oxygene.init.OxygeneModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

public class PickerItem extends Item {
	public PickerItem() {
		super(new Item.Properties().tab(OxygeneModTabs.TAB_OXYGENEBASIC).durability(1000).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		PickerprocessProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}
}
