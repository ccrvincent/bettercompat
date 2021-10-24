package com.bettercompat.main.modifiers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class DarkMightModifier extends Modifier {
	
	public DarkMightModifier() {
		super(0x130935);
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity attacker = context.getAttacker();
		Entity target = context.getTarget();
		if(attacker instanceof PlayerEntity && target instanceof MobEntity) {
			if(damageDealt > 6) {
				attacker.addEffect(new EffectInstance(Effects.HARM, level, (int) damageDealt/12));
			}
		}
		return 0;
	}

}
