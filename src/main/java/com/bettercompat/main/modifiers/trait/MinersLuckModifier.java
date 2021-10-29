package com.bettercompat.main.modifiers.trait;

import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolHarvestContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class MinersLuckModifier extends Modifier {

	public MinersLuckModifier() {
		super(0x0b2476);
	}
	
	@Override
	public void afterBlockBreak(IModifierToolStack tool, int level, ToolHarvestContext context) {
		PlayerEntity player = context.getPlayer();
		boolean isEffective = context.isEffective();
		if (isEffective) {
			dropItem(player.world, player.getPosX(), player.getPosY(), player.getPosZ(), level * 0.01f);
		}
	}

	protected void dropItem(World world, double x, double y, double z, float chance) {
		ItemEntity item;
		if (!world.isRemote && RANDOM.nextFloat() < chance) {
			int rand = RANDOM.nextInt(3);
			switch (rand) {
			case 0:
				item = new ItemEntity(world, x, y, z, new ItemStack(Items.DIAMOND));
				world.addEntity(item);
				break;
			case 1:
				item = new ItemEntity(world, x, y, z, new ItemStack(Items.EMERALD));
				world.addEntity(item);
				break;
			case 2:
				item = new ItemEntity(world, x, y, z, new ItemStack(Items.GOLD_INGOT));
				world.addEntity(item);
				break;
			}
		}
	}	
}
