
package net.mcreator.oakcitymod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.oakcitymod.itemgroup.OakCityItemGroup;
import net.mcreator.oakcitymod.OakCityModModElements;

import java.util.List;

@OakCityModModElements.ModElement.Tag
public class OakCoinsItem extends OakCityModModElements.ModElement {
	@ObjectHolder("oak_city_mod:oak_coins")
	public static final Item block = null;
	public OakCoinsItem(OakCityModModElements instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(OakCityItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("oak_coins");
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
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("1 Dollar"));
		}
	}
}
