package com.bettercompat.main.modifiers;

import mythicbotany.ModItems;
import mythicbotany.alftools.AlfsteelSword;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;
import vazkii.botania.api.mana.IManaUsingItem;
import vazkii.botania.common.core.handler.ModSounds;
import vazkii.botania.common.entity.EntityManaBurst;

public class GreaterManaBurstModifier extends Modifier implements IManaUsingItem {

	public GreaterManaBurstModifier() {
		super(0xffc54f);
	}
	
	@Override
	public float beforeEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damage, float baseKnockback, float knockback) {
		PlayerEntity player = context.getPlayerAttacker();
		LivingEntity target = context.getLivingTarget();
        if (!player.getHeldItemMainhand().isEmpty() && player.getCooledAttackStrength(0.0F) == 1.0F) {
            EntityManaBurst burst = ((AlfsteelSword) ModItems.alfsteelSword).getBurst(player, ModItems.alfsteelSword.getDefaultInstance());
            player.world.addEntity(burst);
            player.getHeldItemMainhand().damageItem(2, player, (p) -> {
                p.sendBreakAnimation(Hand.MAIN_HAND);
            });
            player.world.playSound(null, player.getPosX(), player.getPosY(), player.getPosZ(), ModSounds.terraBlade, SoundCategory.PLAYERS, 0.4F, 1.4F);
        }
        return knockback;
	}

	@Override
	public boolean usesMana(ItemStack stack) {
		return true;
	}
	
	

}
