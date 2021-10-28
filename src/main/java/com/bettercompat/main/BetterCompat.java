package com.bettercompat.main;

import com.bettercompat.main.init.BlockInit;
import com.bettercompat.main.init.EffectInit;
import com.bettercompat.main.init.FluidInit;
import com.bettercompat.main.init.ItemInit;
import com.bettercompat.main.init.ModifierInit;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BetterCompat.MODID)
public class BetterCompat
{
	public static final String MODID = "bettercompat";
	
    public BetterCompat() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FluidInit.FLUIDS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        ItemInit.ITEMS.register(modEventBus);
        EffectInit.EFFECT.register(modEventBus);
        ModifierInit.MODIFIERS.register(modEventBus);
        
    }
}
