package oxygene.procedures;

import oxygene.init.OxygeneModBlocks;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class ToolsdebugmodProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (DoubleArgumentType.getDouble(arguments, "n") == 86) {
			if (entity.getPersistentData().getBoolean("oxy_debug_mod")) {
				entity.getPersistentData().putBoolean("oxy_debug_mod", (false));
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Debug disabled"), (false));
			} else {
				entity.getPersistentData().putBoolean("oxy_debug_mod", (true));
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Debug actived"), (false));
			}
		} else if (DoubleArgumentType.getDouble(arguments, "n") == 123) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Ytb set"), (false));
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(OxygeneModBlocks.GREENSCREEN.get());
				_setstack.setCount(32);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (DoubleArgumentType.getDouble(arguments, "n") == 50) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("I hate rain"), (false));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "weather clear");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "gamerule doWeatherCycle false");
		} else if (DoubleArgumentType.getDouble(arguments, "n") == 51) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
						_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "gamerule doWeatherCycle true");
		} else if (DoubleArgumentType.getDouble(arguments, "n") == 24) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("No night"), (false));
			if (world instanceof ServerLevel _level)
				_level.setDayTime(1);
		} else if (DoubleArgumentType.getDouble(arguments, "n") == 24) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("No day"), (false));
			if (world instanceof ServerLevel _level)
				_level.setDayTime(13000);
		}
	}
}
