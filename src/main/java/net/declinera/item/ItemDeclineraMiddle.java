
package net.declinera.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.declinera.creativetab.TabDeclineraCentral;
import net.declinera.ElementsDeclineraMod;

@ElementsDeclineraMod.ModElement.Tag
public class ItemDeclineraMiddle extends ElementsDeclineraMod.ModElement {
	@GameRegistry.ObjectHolder("declinera:declinera_middle")
	public static final Item block = null;
	public ItemDeclineraMiddle(ElementsDeclineraMod instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("declinera:declinera_middle", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("declinera_middle");
			setRegistryName("declinera_middle");
			setCreativeTab(TabDeclineraCentral.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}
