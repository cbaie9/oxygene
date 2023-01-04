
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package oxygene.init;

import oxygene.item.WoddenplatesItem;
import oxygene.item.SaltiumfragmentItem;
import oxygene.item.SaltiumItem;
import oxygene.item.PickerItem;
import oxygene.item.LavaresidueingotItem;
import oxygene.item.BurntbucketItem;

import oxygene.OxygeneMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class OxygeneModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OxygeneMod.MODID);
	public static final RegistryObject<Item> REGISTRYBLOCK = block(OxygeneModBlocks.REGISTRYBLOCK, null);
	public static final RegistryObject<Item> SALTIUM = REGISTRY.register("saltium", () -> new SaltiumItem());
	public static final RegistryObject<Item> OXYGENATIUM = block(OxygeneModBlocks.OXYGENATIUM, OxygeneModTabs.TAB_OXYGENEBASIC);
	public static final RegistryObject<Item> SALTIUMORE = block(OxygeneModBlocks.SALTIUMORE, OxygeneModTabs.TAB_OXYGENEBASIC);
	public static final RegistryObject<Item> WODDENPLATES = REGISTRY.register("woddenplates", () -> new WoddenplatesItem());
	public static final RegistryObject<Item> OXYGENATIUMEMPTY = block(OxygeneModBlocks.OXYGENATIUMEMPTY, OxygeneModTabs.TAB_OXYGENEBASIC);
	public static final RegistryObject<Item> BURNTBUCKET = REGISTRY.register("burntbucket", () -> new BurntbucketItem());
	public static final RegistryObject<Item> PICKER = REGISTRY.register("picker", () -> new PickerItem());
	public static final RegistryObject<Item> LAVARESIDUEINGOT = REGISTRY.register("lavaresidueingot", () -> new LavaresidueingotItem());
	public static final RegistryObject<Item> SALTIUMFRAGMENT = REGISTRY.register("saltiumfragment", () -> new SaltiumfragmentItem());
	public static final RegistryObject<Item> GREENSCREEN = block(OxygeneModBlocks.GREENSCREEN, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
