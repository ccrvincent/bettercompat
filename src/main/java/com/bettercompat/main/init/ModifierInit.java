package com.bettercompat.main.init;

import com.bettercompat.main.BetterCompat;
import com.bettercompat.main.modifiers.BarterableModifier;
import com.bettercompat.main.modifiers.ClimeModifier;
import com.bettercompat.main.modifiers.CrystalPowerModifier;
import com.bettercompat.main.modifiers.CrystallizedModifier;
import com.bettercompat.main.modifiers.DarkMightModifier;
import com.bettercompat.main.modifiers.ElectricModifier;
import com.bettercompat.main.modifiers.ElementalModifier;
import com.bettercompat.main.modifiers.EnderCrushingModifier;
import com.bettercompat.main.modifiers.EnderferenceModifier;
import com.bettercompat.main.modifiers.FieryModifier;
import com.bettercompat.main.modifiers.FlorasBlessingModifier;
import com.bettercompat.main.modifiers.HolyModifier;
import com.bettercompat.main.modifiers.IcyModifier;
import com.bettercompat.main.modifiers.InclinedModifier;
import com.bettercompat.main.modifiers.LavaEfficiencyModifier;
import com.bettercompat.main.modifiers.ManaModifier;
import com.bettercompat.main.modifiers.MoonlightModifier;
import com.bettercompat.main.modifiers.ObsidianifiedModifier;
import com.bettercompat.main.modifiers.QuartzInfusedModifier;
import com.bettercompat.main.modifiers.RisingModifier;
import com.bettercompat.main.modifiers.SuperheatedModifier;

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
	public static final RegistryObject<Modifier> FIERY = MODIFIERS.register("fiery", FieryModifier::new);
	public static final RegistryObject<Modifier> ICY = MODIFIERS.register("icy", IcyModifier::new);
	public static final RegistryObject<Modifier> ELECTRIC = MODIFIERS.register("electric", ElectricModifier::new);
	public static final RegistryObject<Modifier> ENDER_CRUSHING = MODIFIERS.register("ender_crushing", EnderCrushingModifier::new);
	public static final RegistryObject<Modifier> FLORAS_BLESSING = MODIFIERS.register("floras_blessing", FlorasBlessingModifier::new);
	public static final RegistryObject<Modifier> HOLY = MODIFIERS.register("holy", HolyModifier::new);
	public static final RegistryObject<Modifier> MANA = MODIFIERS.register("mana", ManaModifier::new);
	public static final RegistryObject<Modifier> EXTRA_TEMPERATE = MODIFIERS.register("clime", ClimeModifier::new);
	public static final RegistryObject<Modifier> OBSIDIANIFIED = MODIFIERS.register("obsidianified", ObsidianifiedModifier::new);
	public static final RegistryObject<Modifier> CRYSTALLIED = MODIFIERS.register("crystallized", CrystallizedModifier::new);
	public static final RegistryObject<Modifier> BARTERABLE = MODIFIERS.register("barterable", BarterableModifier::new);
	public static final RegistryObject<Modifier> SUPERHEATED = MODIFIERS.register("superheated", SuperheatedModifier::new);
	public static final RegistryObject<Modifier> RISING = MODIFIERS.register("rising", RisingModifier::new);

}