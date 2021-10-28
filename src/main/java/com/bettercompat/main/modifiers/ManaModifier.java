package com.bettercompat.main.modifiers;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;
import vazkii.botania.api.mana.IManaUsingItem;
import vazkii.botania.api.mana.ManaItemHandler;

public class ManaModifier extends Modifier implements IManaUsingItem {
	
    private static final int LVL_1 = 40;
    private static final int LVL_2 = 60;
    private static final int LVL_3 = 80;
    private static final int LVL_4 = 100;
    private int useMana;
	
	public ManaModifier() {
		super(0x36d6c6);
	}
	
	@Override 
	public void onInventoryTick(IModifierToolStack tool, int level, World world, LivingEntity holder, int itemSlot, boolean isSelected, boolean isCorrectSlot, ItemStack stack) {
        if (level == 4)
        	useMana = LVL_4;
        if (level == 3) 
        	useMana = LVL_3;
        if (level == 2) 
        	useMana = LVL_2;
         else 
        	 useMana = LVL_1;
		if (!world.isRemote && holder instanceof PlayerEntity && stack.getDamage() > 0 
				&& ManaItemHandler.instance().requestManaExactForTool(stack, (PlayerEntity) holder, useMana, true)) {
			stack.setDamage(stack.getDamage() - 1);
		}
	}

	@Override
	public boolean usesMana(ItemStack stack) {
		return true;
	}

}
