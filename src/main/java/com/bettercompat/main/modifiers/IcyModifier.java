package com.bettercompat.main.modifiers;

import com.github.alexthe666.citadel.server.entity.datatracker.EntityPropertiesHandler;
import com.github.alexthe666.iceandfire.entity.EntityFireDragon;
import com.github.alexthe666.iceandfire.entity.props.FrozenEntityProperties;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class IcyModifier extends Modifier {
	
	public IcyModifier() {
		super(0xbadbe2);
	}

	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity target = context.getLivingTarget();
		LivingEntity attacker = context.getAttacker();
        if (attacker.isHolding(tool.getItem())) {
            if (target instanceof EntityFireDragon) {
                target.hurt(DamageSource.DROWN, level + 12.5F);
            }
            FrozenEntityProperties frozenProps = EntityPropertiesHandler.INSTANCE.getProperties(target, FrozenEntityProperties.class);
            frozenProps.setFrozenFor(200);
            target.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 100, 2));
            target.addEffect(new EffectInstance(Effects.DIG_SLOWDOWN, 100, 2));
            target.knockback(1F, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());
        }
		return 0;
	}

}
