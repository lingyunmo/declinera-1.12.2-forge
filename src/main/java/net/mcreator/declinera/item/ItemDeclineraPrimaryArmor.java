
package net.mcreator.declinera.item;

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

import net.mcreator.declinera.creativetab.TabDeclineraBase;
import net.mcreator.declinera.ElementsDeclineraMod;

@ElementsDeclineraMod.ModElement.Tag
public class ItemDeclineraPrimaryArmor extends ElementsDeclineraMod.ModElement {
	@GameRegistry.ObjectHolder("declinera:declinera_primary_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("declinera:declinera_primary_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("declinera:declinera_primary_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("declinera:declinera_primary_armorboots")
	public static final Item boots = null;
	public ItemDeclineraPrimaryArmor(ElementsDeclineraMod instance) {
		super(instance, 39);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("DECLINERA_PRIMARY_ARMOR", "declinera:declineraprimary", 100,
				new int[]{9, 23, 20, 9}, 32,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 3f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("declinera_primary_armorhelmet")
				.setRegistryName("declinera_primary_armorhelmet").setCreativeTab(TabDeclineraBase.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("declinera_primary_armorbody")
				.setRegistryName("declinera_primary_armorbody").setCreativeTab(TabDeclineraBase.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("declinera_primary_armorlegs")
				.setRegistryName("declinera_primary_armorlegs").setCreativeTab(TabDeclineraBase.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("declinera_primary_armorboots")
				.setRegistryName("declinera_primary_armorboots").setCreativeTab(TabDeclineraBase.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("declinera:declinera_primary_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("declinera:declinera_primary_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("declinera:declinera_primary_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("declinera:declinera_primary_armorboots", "inventory"));
	}
}
