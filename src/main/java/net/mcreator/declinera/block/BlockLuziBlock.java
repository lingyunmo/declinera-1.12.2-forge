
package net.mcreator.declinera.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.declinera.creativetab.TabDeclineraBase;
import net.mcreator.declinera.ElementsDeclineraMod;

@ElementsDeclineraMod.ModElement.Tag
public class BlockLuziBlock extends ElementsDeclineraMod.ModElement {
	@GameRegistry.ObjectHolder("declinera:luzi_block")
	public static final Block block = null;
	public BlockLuziBlock(ElementsDeclineraMod instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("luzi_block"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("declinera:luzi_block", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("luzi_block");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 4);
			setHardness(5F);
			setResistance(10F);
			setLightLevel(0.066666666667F);
			setLightOpacity(255);
			setCreativeTab(TabDeclineraBase.tab);
		}
	}
}
