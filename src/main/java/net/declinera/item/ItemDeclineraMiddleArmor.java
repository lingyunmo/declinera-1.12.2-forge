
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

import net.declinera.creativetab.TabDeclineraCentral;
import net.declinera.ElementsDeclineraMod;

@ElementsDeclineraMod.ModElement.Tag
public class ItemDeclineraMiddleArmor extends ElementsDeclineraMod.ModElement {
	@GameRegistry.ObjectHolder("declinera:declinera_middle_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("declinera:declinera_middle_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("declinera:declinera_middle_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("declinera:declinera_middle_armorboots")
	public static final Item boots = null;
	public ItemDeclineraMiddleArmor(ElementsDeclineraMod instance) {
		super(instance, 48);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("DECLINERA_MIDDLE_ARMOR", "declinera:declineramiddle", 75,
				new int[]{10, 30, 25, 10}, 45,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("declinera_middle_armorhelmet")
				.setRegistryName("declinera_middle_armorhelmet").setCreativeTab(TabDeclineraCentral.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("declinera_middle_armorbody")
				.setRegistryName("declinera_middle_armorbody").setCreativeTab(TabDeclineraCentral.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("declinera_middle_armorlegs")
				.setRegistryName("declinera_middle_armorlegs").setCreativeTab(TabDeclineraCentral.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("declinera_middle_armorboots")
				.setRegistryName("declinera_middle_armorboots").setCreativeTab(TabDeclineraCentral.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("declinera:declinera_middle_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("declinera:declinera_middle_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("declinera:declinera_middle_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("declinera:declinera_middle_armorboots", "inventory"));
	}
}
