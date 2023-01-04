package oxygene.procedures;

import oxygene.init.OxygeneModGameRules;

import oxygene.OxygeneMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.FillBucketEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LiblogallfillbucketProcedure {
	@SubscribeEvent
	public static void onBucketFill(FillBucketEvent event) {
		execute(event, event.getLevel(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(OxygeneModGameRules.LOGSALL)) {
			OxygeneMod.LOGGER.debug((entity.getDisplayName().getString() + " fill a bucket at " + " x : " + x + " y : " + y + " z : " + z));
		}
	}
}
