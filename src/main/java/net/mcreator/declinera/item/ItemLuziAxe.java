
package net.mcreator.declinera.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemTool;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

import net.mcreator.declinera.creativetab.TabDeclineraBase;
import net.mcreator.declinera.ElementsDeclineraMod;

import java.util.Set;

@ElementsDeclineraMod.ModElement.Tag
public class ItemLuziAxe extends ElementsDeclineraMod.ModElement {
	@GameRegistry.ObjectHolder("declinera:luzi_axe")
	public static final Item block = null;
	public ItemLuziAxe(ElementsDeclineraMod instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
		}.setUnlocalizedName("luzi_axe").setRegistryName("luzi_axe").setCreativeTab(TabDeclineraBase.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("declinera:luzi_axe", "inventory"));
	}
	private static class ItemToolCustom extends ItemTool {
		private static final Set<Block> effective_items_set = com.google.common.collect.Sets
				.newHashSet(new Block[]{Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN,
						Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});
		protected ItemToolCustom() {
			super(EnumHelper.addToolMaterial("LUZI_AXE", 4, 660, 9f, 14f, 28), effective_items_set);
			this.attackDamage = 14f;
			this.attackSpeed = -2.8f;
		}

		@Override
		public float getDestroySpeed(ItemStack stack, IBlockState state) {
			Material material = state.getMaterial();
			return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE
					? super.getDestroySpeed(stack, state)
					: this.efficiency;
		}
	}
}
