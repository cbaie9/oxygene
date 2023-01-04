package oxygene.procedures;

import oxygene.init.OxygeneModGameRules;

import oxygene.OxygeneMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.AnimalTameEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LiblogalltameProcedure {
	@SubscribeEvent
	public static void onEntityTamed(AnimalTameEvent event) {
		execute(event, event.getAnimal().level, event.getAnimal().getX(), event.getAnimal().getY(), event.getAnimal().getZ(), event.getAnimal(),
				event.getTamer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(OxygeneModGameRules.LOGSALL)) {
			OxygeneMod.LOGGER.debug((entity.getDisplayName().getString() + " is healed by " + sourceentity.getDisplayName().getString() + " at "
					+ " x : " + x + " y : " + y + " z : " + z));
		}
	}
}
