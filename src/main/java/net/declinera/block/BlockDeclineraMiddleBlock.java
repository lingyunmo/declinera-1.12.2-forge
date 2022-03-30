
package net.declinera.block;

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

import net.declinera.creativetab.TabDeclineraCentral;
import net.declinera.ElementsDeclineraMod;

@ElementsDeclineraMod.ModElement.Tag
public class BlockDeclineraMiddleBlock extends ElementsDeclineraMod.ModElement {
	@GameRegistry.ObjectHolder("declinera:declinera_middle_block")
	public static final Block block = null;
	public BlockDeclineraMiddleBlock(ElementsDeclineraMod instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("declinera_middle_block"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("declinera:declinera_middle_block", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("declinera_middle_block");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 10);
			setHardness(5F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabDeclineraCentral.tab);
		}
	}
}
