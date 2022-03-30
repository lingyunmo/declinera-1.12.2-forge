
package net.declinera.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

import net.declinera.ElementsDeclineraMod;

@ElementsDeclineraMod.ModElement.Tag
public class TabDeclineraBase extends ElementsDeclineraMod.ModElement {
	public TabDeclineraBase(ElementsDeclineraMod instance) {
		super(instance, 49);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabdeclinera_base") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.LADDER, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
