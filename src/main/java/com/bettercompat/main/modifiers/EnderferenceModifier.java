package com.bettercompat.main.modifiers;

import com.bettercompat.main.init.EffectInit;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class EnderferenceModifier extends Modifier {
	
	public EnderferenceModifier() {
		super(0x105A4B);
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity attacker = context.getAttacker();
		LivingEntity livingTarget = context.getLivingTarget();	
		int effectLevel = Math.min(8, EffectInit.ENDERFERENCE.get().getLevel(attacker) + 1);
		if (damageDealt > 0) {
			livingTarget.addEffect(new EffectInstance(EffectInit.ENDERFERENCE.get(), level * 50, effectLevel));
		}
		return 0;
	}
	
	@SubscribeEvent
	public void onEnderTeleport(EnderTeleportEvent event) {
		if(EffectInit.ENDERFERENCE.get().getLevel(event.getEntityLiving()) > 0) {
			event.setCanceled(true);
			event.isCanceled();
		}
	}

}
