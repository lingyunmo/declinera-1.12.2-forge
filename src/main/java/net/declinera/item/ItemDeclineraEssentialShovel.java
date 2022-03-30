
package net.declinera.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.declinera.creativetab.TabDeclineraBase;
import net.declinera.ElementsDeclineraMod;

import java.util.Set;
import java.util.HashMap;

@ElementsDeclineraMod.ModElement.Tag
public class ItemDeclineraEssentialShovel extends ElementsDeclineraMod.ModElement {
	@GameRegistry.ObjectHolder("declinera:declinera_essential_shovel")
	public static final Item block = null;
	public ItemDeclineraEssentialShovel(ElementsDeclineraMod instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("DECLINERA_ESSENTIAL_SHOVEL", 2, 250, 6f, 4f, 14)) {
			{
				this.attackSpeed = -2.7f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 2);
				return ret.keySet();
			}
		}.setUnlocalizedName("declinera_essential_shovel").setRegistryName("declinera_essential_shovel").setCreativeTab(TabDeclineraBase.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("declinera:declinera_essential_shovel", "inventory"));
	}
}
