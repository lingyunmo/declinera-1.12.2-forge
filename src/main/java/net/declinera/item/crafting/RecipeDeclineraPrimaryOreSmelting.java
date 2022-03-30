
package net.declinera.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.declinera.item.ItemDeclineraPrimary;
import net.declinera.block.BlockDeclineraPrimaryOre;
import net.declinera.ElementsDeclineraMod;

@ElementsDeclineraMod.ModElement.Tag
public class RecipeDeclineraPrimaryOreSmelting extends ElementsDeclineraMod.ModElement {
	public RecipeDeclineraPrimaryOreSmelting(ElementsDeclineraMod instance) {
		super(instance, 80);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDeclineraPrimaryOre.block, (int) (1)), new ItemStack(ItemDeclineraPrimary.block, (int) (1)),
				2.4499999999999997F);
	}
}
