
package net.declinera.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.declinera.item.ItemLuziDust;
import net.declinera.block.BlockLuziOre;
import net.declinera.ElementsDeclineraMod;

@ElementsDeclineraMod.ModElement.Tag
public class RecipeLuziOreSmelting extends ElementsDeclineraMod.ModElement {
	public RecipeLuziOreSmelting(ElementsDeclineraMod instance) {
		super(instance, 64);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockLuziOre.block, (int) (1)), new ItemStack(ItemLuziDust.block, (int) (1)), 1.4F);
	}
}
