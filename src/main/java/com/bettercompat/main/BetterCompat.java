package com.bettercompat.main;

import com.bettercompat.main.init.CompatBlocks;
import com.bettercompat.main.init.CompatFluids;
import com.bettercompat.main.init.CompatItems;
import com.bettercompat.main.modifiers.CompatEffects;
import com.bettercompat.main.modifiers.CompatModifiers;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BetterCompat.MODID)
public class BetterCompat
{
	public static final String MODID = "bettercompat";
	
    public BetterCompat() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        CompatFluids.FLUIDS.register(modEventBus);
        CompatBlocks.BLOCKS.register(modEventBus);
        CompatItems.ITEMS.register(modEventBus);
        CompatEffects.EFFECT.register(modEventBus);
        CompatModifiers.MODIFIERS.register(modEventBus);
        
    }
}