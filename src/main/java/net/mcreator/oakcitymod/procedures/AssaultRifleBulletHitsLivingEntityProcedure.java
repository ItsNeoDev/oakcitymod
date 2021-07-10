package net.mcreator.oakcitymod.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.oakcitymod.particle.BloodParticle;
import net.mcreator.oakcitymod.OakCityModModElements;
import net.mcreator.oakcitymod.OakCityModMod;

import java.util.Map;

@OakCityModModElements.ModElement.Tag
public class AssaultRifleBulletHitsLivingEntityProcedure extends OakCityModModElements.ModElement {
	public AssaultRifleBulletHitsLivingEntityProcedure(OakCityModModElements instance) {
		super(instance, 12);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OakCityModMod.LOGGER.warn("Failed to load dependency x for procedure AssaultRifleBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OakCityModMod.LOGGER.warn("Failed to load dependency y for procedure AssaultRifleBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OakCityModMod.LOGGER.warn("Failed to load dependency z for procedure AssaultRifleBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OakCityModMod.LOGGER.warn("Failed to load dependency world for procedure AssaultRifleBulletHitsLivingEntity!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.addParticle(BloodParticle.particle, x, y, z, 0, 1, 0);
		world.addParticle(BloodParticle.particle, x, y, z, 0, 1, 2);
		world.addParticle(BloodParticle.particle, x, y, z, 3, 1, 0);
		world.addParticle(BloodParticle.particle, x, y, z, 1, 1, 1);
		world.addParticle(BloodParticle.particle, x, y, z, 0, 1, 3);
	}
}
