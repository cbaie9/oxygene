
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package oxygene.init;

import oxygene.world.features.ores.SaltiumoreFeature;

import oxygene.OxygeneMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class OxygeneModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, OxygeneMod.MODID);
	public static final RegistryObject<Feature<?>> SALTIUMORE = REGISTRY.register("saltiumore", SaltiumoreFeature::feature);
}
