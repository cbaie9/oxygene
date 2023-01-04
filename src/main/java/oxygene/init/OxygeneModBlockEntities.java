
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package oxygene.init;

import oxygene.block.entity.RegistryblockBlockEntity;
import oxygene.block.entity.OxygenatiumemptyBlockEntity;
import oxygene.block.entity.OxygenatiumBlockEntity;

import oxygene.OxygeneMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class OxygeneModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, OxygeneMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> REGISTRYBLOCK = register("registryblock", OxygeneModBlocks.REGISTRYBLOCK,
			RegistryblockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OXYGENATIUM = register("oxygenatium", OxygeneModBlocks.OXYGENATIUM,
			OxygenatiumBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OXYGENATIUMEMPTY = register("oxygenatiumempty", OxygeneModBlocks.OXYGENATIUMEMPTY,
			OxygenatiumemptyBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
