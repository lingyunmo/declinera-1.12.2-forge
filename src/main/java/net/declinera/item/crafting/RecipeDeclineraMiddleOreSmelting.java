
package net.declinera.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.declinera.item.ItemDeclineraMiddle;
import net.declinera.block.BlockDeclineraMiddleOre;
import net.declinera.ElementsDeclineraMod;

@ElementsDeclineraMod.ModElement.Tag
public class RecipeDeclineraMiddleOreSmelting extends ElementsDeclineraMod.ModElement {
	public RecipeDeclineraMiddleOreSmelting(ElementsDeclineraMod instance) {
		super(instance, 112);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDeclineraMiddleOre.block, (int) (1)), new ItemStack(ItemDeclineraMiddle.block, (int) (1)), 3.5F);
	}
}
