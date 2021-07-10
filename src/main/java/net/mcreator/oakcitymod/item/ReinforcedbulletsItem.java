
package net.mcreator.oakcitymod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.BlockState;

import net.mcreator.oakcitymod.procedures.ReinforcedbulletsItemIsDroppedByPlayerProcedure;
import net.mcreator.oakcitymod.itemgroup.OakCityItemGroup;
import net.mcreator.oakcitymod.OakCityModModElements;

import java.util.Map;
import java.util.HashMap;

@OakCityModModElements.ModElement.Tag
public class ReinforcedbulletsItem extends OakCityModModElements.ModElement {
	@ObjectHolder("oak_city_mod:reinforcedbullets")
	public static final Item block = null;
	public ReinforcedbulletsItem(OakCityModModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(OakCityItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("reinforcedbullets");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public boolean onDroppedByPlayer(ItemStack itemstack, PlayerEntity entity) {
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			World world = entity.world;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ReinforcedbulletsItemIsDroppedByPlayerProcedure.executeProcedure($_dependencies);
			}
			return true;
		}
	}
}
