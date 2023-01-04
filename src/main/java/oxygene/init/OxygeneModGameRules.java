
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package oxygene.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OxygeneModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> DISABLEMULTIMODSFUNCTIONOXYGENE = GameRules.register("disablemultimodsfunctionoxygene",
			GameRules.Category.CHAT, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> LOGSALL = GameRules.register("logsall", GameRules.Category.PLAYER,
			GameRules.BooleanValue.create(false));
}
