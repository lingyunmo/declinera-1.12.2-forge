
package net.declinera.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.declinera.creativetab.TabDeclineraCentral;
import net.declinera.ElementsDeclineraMod;

import java.util.Set;
import java.util.HashMap;

@ElementsDeclineraMod.ModElement.Tag
public class ItemDeclineraMiddleHoe extends ElementsDeclineraMod.ModElement {
	@GameRegistry.ObjectHolder("declinera:declinera_middle_hoe")
	public static final Item block = null;
	public ItemDeclineraMiddleHoe(ElementsDeclineraMod instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("DECLINERA_MIDDLE_HOE", 10, 2380, 16f, 0f, 70)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 10);
				return ret.keySet();
			}
		}.setUnlocalizedName("declinera_middle_hoe").setRegistryName("declinera_middle_hoe").setCreativeTab(TabDeclineraCentral.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("declinera:declinera_middle_hoe", "inventory"));
	}
}
