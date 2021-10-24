package com.bettercompat.main.modifiers;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class ElementalModifier extends Modifier {

	public ElementalModifier() {
		super(0xF697CB);
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity attacker = context.getAttacker();
		LivingEntity target = context.getLivingTarget();
		if (damageDealt > 0 && target.isAlive()) {
			int rand = RANDOM.nextInt();
			switch (rand) {
			case 0: // Water
				attacker.addEffect(new EffectInstance(Effects.ABSORPTION, level * 50));
				attacker.addEffect(new EffectInstance(Effects.WATER_BREATHING, level * 200));
				break;
			case 1: // Wind
				attacker.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, level * 50));
				attacker.addEffect(new EffectInstance(Effects.JUMP, level * 50));
				break;
			case 2: // Earth
				attacker.addEffect(new EffectInstance(Effects.DAMAGE_BOOST, level * 50));
				attacker.addEffect(new EffectInstance(Effects.SATURATION, level * 50));
				break;
			case 3: // Fire
				attacker.addEffect(new EffectInstance(Effects.FIRE_RESISTANCE, level * 50));
				attacker.addEffect(new EffectInstance(Effects.REGENERATION, level * 50));
				break;
			}
		}
		return 0;
	}

}
