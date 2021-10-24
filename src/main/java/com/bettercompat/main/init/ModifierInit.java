package com.bettercompat.main.init;

import com.bettercompat.main.BetterCompat;
import com.bettercompat.main.modifiers.CrystalPowerModifier;
import com.bettercompat.main.modifiers.DarkMightModifier;
import com.bettercompat.main.modifiers.ElementalModifier;
import com.bettercompat.main.modifiers.EnderferenceModifier;
import com.bettercompat.main.modifiers.InclinedModifier;
import com.bettercompat.main.modifiers.LavaEfficiencyModifier;
import com.bettercompat.main.modifiers.MoonlightModifier;
import com.bettercompat.main.modifiers.QuartzInfusedModifier;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import slimeknights.tconstruct.library.modifiers.Modifier;

public class ModifierInit {
	public static final DeferredRegister<Modifier> MODIFIERS = DeferredRegister.create(Modifier.class, BetterCompat.MODID);
	
	public static final RegistryObject<Modifier> ENDERFERENCE = MODIFIERS.register("enderference", EnderferenceModifier::new);
	public static final RegistryObject<Modifier> QUARTZ_INFUSED = MODIFIERS.register("quartz_infused", QuartzInfusedModifier::new);
	public static final RegistryObject<Modifier> LAVA_EFFICIENCY = MODIFIERS.register("lava_efficiency", LavaEfficiencyModifier::new);
	public static final RegistryObject<Modifier> CRYSTAL_POWER = MODIFIERS.register("crystal_power", CrystalPowerModifier::new);
	public static final RegistryObject<Modifier> MOONLIGHT = MODIFIERS.register("moonlight", MoonlightModifier::new);
	public static final RegistryObject<Modifier> ELEMENTAL = MODIFIERS.register("elemental", ElementalModifier::new);
	public static final RegistryObject<Modifier> INCLINED = MODIFIERS.register("inclined", InclinedModifier::new);
	public static final RegistryObject<Modifier> DARK_MIGHT = MODIFIERS.register("dark_might", DarkMightModifier::new);
	

}
