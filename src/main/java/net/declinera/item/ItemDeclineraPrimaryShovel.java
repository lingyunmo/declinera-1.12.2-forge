
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
public class ItemDeclineraPrimaryShovel extends ElementsDeclineraMod.ModElement {
	@GameRegistry.ObjectHolder("declinera:declinera_primary_shovel")
	public static final Item block = null;
	public ItemDeclineraPrimaryShovel(ElementsDeclineraMod instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("DECLINERA_PRIMARY_SHOVEL", 7, 1444, 13f, 8f, 49)) {
			{
				this.attackSpeed = -1f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 7);
				return ret.keySet();
			}
		}.setUnlocalizedName("declinera_primary_shovel").setRegistryName("declinera_primary_shovel").setCreativeTab(TabDeclineraBase.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("declinera:declinera_primary_shovel", "inventory"));
	}
}
