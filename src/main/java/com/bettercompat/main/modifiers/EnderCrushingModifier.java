package com.bettercompat.main.modifiers;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.monster.EndermiteEntity;
import net.minecraft.entity.monster.ShulkerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class EnderCrushingModifier extends Modifier {

	public EnderCrushingModifier() {
		super(0x6b807f);
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity attacker = context.getAttacker();
		LivingEntity target = context.getLivingTarget();
		if (attacker.getHeldEquipment() == tool.getItem()) {
			if (target instanceof EndermanEntity) {
				target.attackEntityFrom(DamageSource.GENERIC, level + 5.0f);
			}
			if (target instanceof EndermiteEntity) {
				target.attackEntityFrom(DamageSource.GENERIC, level + 1.0f);
			}
			if (target instanceof ShulkerEntity) {
				target.attackEntityFrom(DamageSource.GENERIC, level + 2.5f);
			}
			if (target instanceof EnderDragonEntity) {
				target.attackEntityFrom(DamageSource.GENERIC, level + 7.0f);
			}
		}
		return 0;
	}
	
	@Override
	public void onBreakSpeed(IModifierToolStack tool, int level, BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		PlayerEntity player = event.getPlayer();
		if(player.world.getWorldInfo() == World.THE_END && isEffective) {
			event.setNewSpeed(event.getNewSpeed() * (level * 0.25f));
		}
	}

}
