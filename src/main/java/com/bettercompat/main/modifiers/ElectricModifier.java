package com.bettercompat.main.modifiers;

import com.github.alexthe666.iceandfire.entity.EntityFireDragon;
import com.github.alexthe666.iceandfire.entity.EntityIceDragon;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class ElectricModifier extends Modifier {

	public ElectricModifier() {
		super(0x9c86b4);
	}
	
	@Override
	public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) {
		LivingEntity attacker = context.getAttacker();
		LivingEntity target = context.getLivingTarget();
		if (attacker.getHeldEquipment() == tool.getItem()) {
            boolean flag = true;
            if(attacker instanceof PlayerEntity){
                if(((PlayerEntity)attacker).swingProgress > 0.2){
                    flag = false;
                }
            }
            if(!attacker.world.isRemote && flag){
                LightningBoltEntity lightningboltentity = EntityType.LIGHTNING_BOLT.create(target.world);
                lightningboltentity.moveForced(target.getPositionVec());
                if(!target.world.isRemote){
                    target.world.addEntity(lightningboltentity);
                }
            }
            if (target instanceof EntityFireDragon || target instanceof EntityIceDragon) {
                target.attackEntityFrom(DamageSource.LIGHTNING_BOLT, level + 8.5F);
            }
            target.applyKnockback(1F, attacker.getPosX() - target.getPosX(), attacker.getPosZ() - target.getPosZ());
        }
		return 0;
	}

}
