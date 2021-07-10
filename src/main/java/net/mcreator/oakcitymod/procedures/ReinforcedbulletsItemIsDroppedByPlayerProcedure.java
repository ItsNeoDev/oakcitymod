package net.mcreator.oakcitymod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;

import net.mcreator.oakcitymod.OakCityModModElements;
import net.mcreator.oakcitymod.OakCityModMod;

import java.util.Map;

@OakCityModModElements.ModElement.Tag
public class ReinforcedbulletsItemIsDroppedByPlayerProcedure extends OakCityModModElements.ModElement {
	public ReinforcedbulletsItemIsDroppedByPlayerProcedure(OakCityModModElements instance) {
		super(instance, 26);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OakCityModMod.LOGGER.warn("Failed to load dependency x for procedure ReinforcedbulletsItemIsDroppedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OakCityModMod.LOGGER.warn("Failed to load dependency y for procedure ReinforcedbulletsItemIsDroppedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OakCityModMod.LOGGER.warn("Failed to load dependency z for procedure ReinforcedbulletsItemIsDroppedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OakCityModMod.LOGGER.warn("Failed to load dependency world for procedure ReinforcedbulletsItemIsDroppedByPlayer!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 4, Explosion.Mode.DESTROY);
		}
	}
}
