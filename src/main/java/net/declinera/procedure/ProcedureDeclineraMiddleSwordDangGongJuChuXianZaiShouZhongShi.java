package net.declinera.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.declinera.ElementsDeclineraMod;

import java.util.Map;

@ElementsDeclineraMod.ModElement.Tag
public class ProcedureDeclineraMiddleSwordDangGongJuChuXianZaiShouZhongShi extends ElementsDeclineraMod.ModElement {
	public ProcedureDeclineraMiddleSwordDangGongJuChuXianZaiShouZhongShi(ElementsDeclineraMod instance) {
		super(instance, 123);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DeclineraMiddleSwordDangGongJuChuXianZaiShouZhongShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 60, (int) 1, (false), (false)));
	}
}
