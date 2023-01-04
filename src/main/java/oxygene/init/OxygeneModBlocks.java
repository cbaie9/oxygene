
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package oxygene.init;

import oxygene.block.SaltiumoreBlock;
import oxygene.block.RegistryblockBlock;
import oxygene.block.OxygenatiumemptyBlock;
import oxygene.block.OxygenatiumBlock;
import oxygene.block.GreenscreenBlock;

import oxygene.OxygeneMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class OxygeneModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OxygeneMod.MODID);
	public static final RegistryObject<Block> REGISTRYBLOCK = REGISTRY.register("registryblock", () -> new RegistryblockBlock());
	public static final RegistryObject<Block> OXYGENATIUM = REGISTRY.register("oxygenatium", () -> new OxygenatiumBlock());
	public static final RegistryObject<Block> SALTIUMORE = REGISTRY.register("saltiumore", () -> new SaltiumoreBlock());
	public static final RegistryObject<Block> OXYGENATIUMEMPTY = REGISTRY.register("oxygenatiumempty", () -> new OxygenatiumemptyBlock());
	public static final RegistryObject<Block> GREENSCREEN = REGISTRY.register("greenscreen", () -> new GreenscreenBlock());
}
