package com.bettercompat.main.modifiers;

import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class EnderCrushingModifier extends Modifier {

	public EnderCrushingModifier() {
		super(0x6b807f);
	}
	
	@Override
	public void onBreakSpeed(IModifierToolStack tool, int level, BreakSpeed event, Direction sideHit, boolean isEffective, float miningSpeedModifier) {
		if (Blocks.END_STONE != null && isEffective) {
			event.setNewSpeed(event.getNewSpeed() * (level * 2.00f));
		}
	}

}
