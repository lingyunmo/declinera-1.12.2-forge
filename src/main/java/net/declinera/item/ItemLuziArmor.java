
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
public class ItemLuziArmor extends ElementsDeclineraMod.ModElement {
	@GameRegistry.ObjectHolder("declinera:luzi_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("declinera:luzi_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("declinera:luzi_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("declinera:luzi_armorboots")
	public static final Item boots = null;
	public ItemLuziArmor(ElementsDeclineraMod instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("LUZI_ARMOR", "declinera:luzi", 30, new int[]{4, 12, 10, 4}, 18,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("luzi_armorhelmet")
				.setRegistryName("luzi_armorhelmet").setCreativeTab(TabDeclineraBase.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("luzi_armorbody")
				.setRegistryName("luzi_armorbody").setCreativeTab(TabDeclineraBase.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("luzi_armorlegs")
				.setRegistryName("luzi_armorlegs").setCreativeTab(TabDeclineraBase.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("luzi_armorboots")
				.setRegistryName("luzi_armorboots").setCreativeTab(TabDeclineraBase.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("declinera:luzi_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("declinera:luzi_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("declinera:luzi_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("declinera:luzi_armorboots", "inventory"));
	}
}
