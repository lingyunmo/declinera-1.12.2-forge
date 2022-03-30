
package net.declinera.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.declinera.item.ItemDeclineraMiddleCore;
import net.declinera.ElementsDeclineraMod;

@ElementsDeclineraMod.ModElement.Tag
public class TabDeclineraCentral extends ElementsDeclineraMod.ModElement {
	public TabDeclineraCentral(ElementsDeclineraMod instance) {
		super(instance, 122);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabdeclinera_central") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemDeclineraMiddleCore.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
