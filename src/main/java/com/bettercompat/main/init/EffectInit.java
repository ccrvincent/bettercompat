package com.bettercompat.main.init;

import com.bettercompat.main.BetterCompat;

import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import slimeknights.tconstruct.common.TinkerEffect;

public class EffectInit {
    public static final DeferredRegister<Effect> EFFECT = DeferredRegister.create(ForgeRegistries.POTIONS, BetterCompat.MODID);
    
    public static final RegistryObject<TinkerEffect> ENDERFERENCE = EFFECT.register("enderference", () -> new TinkerEffect(EffectType.NEUTRAL, false));

}
