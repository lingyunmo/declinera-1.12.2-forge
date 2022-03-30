
package net.declinera.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.declinera.creativetab.TabDeclineraBase;
import net.declinera.ElementsDeclineraMod;

@ElementsDeclineraMod.ModElement.Tag
public class ItemDeclineraEssentialArmor extends ElementsDeclineraMod.ModElement {
	@GameRegistry.ObjectHolder("declinera:declinera_essential_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("declinera:declinera_essential_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("declinera:declinera_essential_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("declinera:declinera_essential_armorboots")
	public static final Item boots = null;
	public ItemDeclineraEssentialArmor(ElementsDeclineraMod instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("DECLINERA_ESSENTIAL_ARMOR", "declinera:declineraessential", 15,
				new int[]{2, 6, 5, 2}, 9, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")),
				0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("declinera_essential_armorhelmet")
				.setRegistryName("declinera_essential_armorhelmet").setCreativeTab(TabDeclineraBase.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("declinera_essential_armorbody")
				.setRegistryName("declinera_essential_armorbody").setCreativeTab(TabDeclineraBase.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("declinera_essential_armorlegs")
				.setRegistryName("declinera_essential_armorlegs").setCreativeTab(TabDeclineraBase.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("declinera_essential_armorboots")
				.setRegistryName("declinera_essential_armorboots").setCreativeTab(TabDeclineraBase.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("declinera:declinera_essential_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("declinera:declinera_essential_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("declinera:declinera_essential_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("declinera:declinera_essential_armorboots", "inventory"));
	}
}
