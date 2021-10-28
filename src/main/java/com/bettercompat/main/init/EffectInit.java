package com.bettercompat.main.init;

import com.bettercompat.main.BetterCompat;
import com.bettercompat.main.modifiers.EnderferenceModifier;

import net.minecraft.potion.Effect;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import slimeknights.tconstruct.common.TinkerEffect;

public class EffectInit {
    public static final DeferredRegister<Effect> EFFECT = DeferredRegister.create(ForgeRegistries.POTIONS, BetterCompat.MODID);
    
    public static final RegistryObject<TinkerEffect> ENDERFERENCE = EFFECT.register("enderference", () -> EnderferenceModifier.Enderference);

}
