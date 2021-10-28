package com.bettercompat.main.modifiers;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class ClimeModifier extends Modifier {
	public ClimeModifier() {
		super(0xFF9031);
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity attacker = context.getAttacker();
		LivingEntity target = context.getLivingTarget();
		BlockPos pos = attacker.getPosition();
		float temperature = attacker.world.getBiome(pos).getTemperature(pos);
		if(attacker.world.isRemote && attacker.canEquip(tool.getItem())) {
			if (temperature >= 1.5f) {
				target.attackEntityFrom(DamageSource.ON_FIRE, 5f);
			}
			if (temperature <= 0.5f) {
				target.addPotionEffect(new EffectInstance(Effects.SLOWNESS));
				target.addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE));
			}
			target.addPotionEffect(new EffectInstance(Effects.WEAKNESS));
		}
		return 0;
	}
	
	@Override
	public void onBreakSpeed(IModifierToolStack tool, int level, BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		if (isEffective) {
			BlockPos pos = event.getPos();
			float temperature = event.getPlayer().world.getBiome(pos).getTemperature(pos);
			float b = temperature * level / 10;
			event.setNewSpeed(event.getNewSpeed() * (0.5f + b));
		}
	}
}
