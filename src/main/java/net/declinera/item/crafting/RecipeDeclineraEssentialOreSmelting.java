
package net.declinera.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.declinera.item.ItemDeclineraEssentialIngot;
import net.declinera.block.BlockDeclineraEssentialOre;
import net.declinera.ElementsDeclineraMod;

@ElementsDeclineraMod.ModElement.Tag
public class RecipeDeclineraEssentialOreSmelting extends ElementsDeclineraMod.ModElement {
	public RecipeDeclineraEssentialOreSmelting(ElementsDeclineraMod instance) {
		super(instance, 52);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDeclineraEssentialOre.block, (int) (1)),
				new ItemStack(ItemDeclineraEssentialIngot.block, (int) (1)), 0.7F);
	}
}
