package net.mcreator.oakcitymod.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.oakcitymod.OakCityModModElements;
import net.mcreator.oakcitymod.OakCityModMod;

import java.util.Map;

@OakCityModModElements.ModElement.Tag
public class SniperprocedureProcedure extends OakCityModModElements.ModElement {
	public SniperprocedureProcedure(OakCityModModElements instance) {
		super(instance, 24);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OakCityModMod.LOGGER.warn("Failed to load dependency entity for procedure Sniperprocedure!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				OakCityModMod.LOGGER.warn("Failed to load dependency itemstack for procedure Sniperprocedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 100);
	}
}
