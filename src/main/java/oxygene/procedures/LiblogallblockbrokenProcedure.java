package oxygene.procedures;

import oxygene.init.OxygeneModGameRules;

import oxygene.OxygeneMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LiblogallblockbrokenProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(OxygeneModGameRules.LOGSALL)) {
			OxygeneMod.LOGGER.debug((entity.getDisplayName().getString() + " broke a block ( "
					+ (new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock())).getDisplayName().getString() + " ) at " + " x : " + x
					+ " y : " + y + " z : " + z));
		}
	}
}
