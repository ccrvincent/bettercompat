package com.bettercompat.main.modifiers;

import com.github.alexthe666.iceandfire.entity.EntityIceDragon;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class FieryModifier extends Modifier {

	public FieryModifier() {
		super(0xc28989);
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity attacker = context.getAttacker();
		LivingEntity target = context.getLivingTarget();
		if (attacker.getHeldEquipment() == tool.getItem()) {
			if (target instanceof EntityIceDragon) {
				target.attackEntityFrom(DamageSource.ON_FIRE, level + 12.5F);
			}
			target.setFire(5);
			target.applyKnockback(1F, attacker.getPosX(), attacker.getPosZ() - target.getPosZ());
		}
		return 0;
	}

}
