
package net.mcreator.declinera.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.declinera.item.ItemDeclineraPrimary;
import net.mcreator.declinera.block.BlockDeclineraPrimaryOre;
import net.mcreator.declinera.ElementsDeclineraMod;

@ElementsDeclineraMod.ModElement.Tag
public class RecipeDeclineraPrimaryOreSmelting extends ElementsDeclineraMod.ModElement {
	public RecipeDeclineraPrimaryOreSmelting(ElementsDeclineraMod instance) {
		super(instance, 71);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockDeclineraPrimaryOre.block, (int) (1)), new ItemStack(ItemDeclineraPrimary.block, (int) (1)),
				2.4499999999999997F);
	}
}
