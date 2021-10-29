package com.bettercompat.main.modifiers;

import com.bettercompat.main.BetterCompat;
import com.bettercompat.main.modifiers.craftable.SentientModifier;
import com.bettercompat.main.modifiers.trait.AntiArmorModifier;
import com.bettercompat.main.modifiers.trait.BarterableModifier;
import com.bettercompat.main.modifiers.trait.BloodiedModifier;
import com.bettercompat.main.modifiers.trait.BoneShardModifier;
import com.bettercompat.main.modifiers.trait.ClimeModifier;
import com.bettercompat.main.modifiers.trait.CrystalPowerModifier;
import com.bettercompat.main.modifiers.trait.CrystallizedModifier;
import com.bettercompat.main.modifiers.trait.DarkMightModifier;
import com.bettercompat.main.modifiers.trait.ElectricModifier;
import com.bettercompat.main.modifiers.trait.ElementalModifier;
import com.bettercompat.main.modifiers.trait.EnderCrushingModifier;
import com.bettercompat.main.modifiers.trait.EnderferenceModifier;
import com.bettercompat.main.modifiers.trait.FieryModifier;
import com.bettercompat.main.modifiers.trait.FlorasBlessingModifier;
import com.bettercompat.main.modifiers.trait.HolyModifier;
import com.bettercompat.main.modifiers.trait.IcyModifier;
import com.bettercompat.main.modifiers.trait.InclinedModifier;
import com.bettercompat.main.modifiers.trait.LavaEfficiencyModifier;
import com.bettercompat.main.modifiers.trait.ManaModifier;
import com.bettercompat.main.modifiers.trait.MinersLuckModifier;
import com.bettercompat.main.modifiers.trait.MoonlightModifier;
import com.bettercompat.main.modifiers.trait.ObsidianifiedModifier;
import com.bettercompat.main.modifiers.trait.QuartzInfusedModifier;
import com.bettercompat.main.modifiers.trait.RisingModifier;
import com.bettercompat.main.modifiers.trait.SuperheatedModifier;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import slimeknights.tconstruct.library.modifiers.Modifier;

public class CompatModifiers {
	public static final DeferredRegister<Modifier> MODIFIERS = DeferredRegister.create(Modifier.class, BetterCompat.MODID);
	
		//trait
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
	public static final RegistryObject<Modifier> BONE_SHARD = MODIFIERS.register("bone_shard", BoneShardModifier::new);
	public static final RegistryObject<Modifier> MINERS_LUCK = MODIFIERS.register("miners_luck", MinersLuckModifier::new);
	public static final RegistryObject<Modifier> ANTI_ARMOR = MODIFIERS.register("anti_armor", AntiArmorModifier::new);
	public static final RegistryObject<Modifier> BLOODIED = MODIFIERS.register("bloodied", BloodiedModifier::new);
	
		//craftable
	public static final RegistryObject<Modifier> SENTIENT = MODIFIERS.register("sentient", SentientModifier::new);

}