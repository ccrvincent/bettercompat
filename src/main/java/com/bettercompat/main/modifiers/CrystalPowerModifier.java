package com.bettercompat.main.modifiers;


import net.minecraft.util.Direction;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class CrystalPowerModifier extends Modifier {
	
	public CrystalPowerModifier() {
		super(0xB859CB);
	}
	
	public void onBreakSpeed(IModifierToolStack tool, int level, BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		if(isEffective) {
			event.setNewSpeed(event.getNewSpeed() * (level * 2f));	
		}
	}
}
