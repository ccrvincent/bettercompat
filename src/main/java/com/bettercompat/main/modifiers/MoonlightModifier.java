package com.bettercompat.main.modifiers;

import net.minecraft.util.Direction;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class MoonlightModifier extends Modifier {

	public MoonlightModifier() {
		super(0x6EB2EA);
	}
	
	@Override
	public void onBreakSpeed(IModifierToolStack tool, int level, BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		if(event.getPlayer().level.isNight() && isEffective) {
			event.setNewSpeed(event.getNewSpeed() * (level * 2f));
		}
	}
}
