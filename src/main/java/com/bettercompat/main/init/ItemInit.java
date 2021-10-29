package com.bettercompat.main.init;

import com.bettercompat.main.BetterCompat;

import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterCompat.MODID);
    
    //better end
	public static final RegistryObject<Item> THALLASIUM_BUCKET = ITEMS.register("thallasium_bucket", 
			() -> new BucketItem(FluidInit.THALLASIUM,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("betterendforge") ? ItemGroup.MISC : null)));
	public static final RegistryObject<Item> TERMINITE_BUCKET = ITEMS.register("terminite_bucket", 
			() -> new BucketItem(FluidInit.TERMINITE,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("betterendforge") ? ItemGroup.MISC : null)));
	public static final RegistryObject<Item> AETERNIUM_BUCKET = ITEMS.register("aeternium_bucket", 
			() -> new BucketItem(FluidInit.AETERNIUM,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("betterendforge") ? ItemGroup.MISC : null)));
	
	//ores above diamonds
	public static final RegistryObject<Item> AMETHYST_BUCKET = ITEMS.register("amethyst_bucket", 
			() -> new BucketItem(FluidInit.AMETHYST,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("oresabovediamonds") ? ItemGroup.MISC : null)));
	public static final RegistryObject<Item> BLACKOPAL_BUCKET = ITEMS.register("blackopal_bucket", 
			() -> new BucketItem(FluidInit.BLACKOPAL,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("oresabovediamonds") ? ItemGroup.MISC : null)));
	public static final RegistryObject<Item> NETHERITEOPAL_BUCKET = ITEMS.register("netheriteopal_bucket", 
			() -> new BucketItem(FluidInit.NETHERITEOPAL,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("oresabovediamonds") ? ItemGroup.MISC : null)));
	
	//iceandfire
	public static final RegistryObject<Item> SAPPHIRE_BUCKET = ITEMS.register("sapphire_bucket", 
			() -> new BucketItem(FluidInit.SAPPHIRE,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("iceandfire") ? ItemGroup.MISC : null)));
	
	//endreborn
	public static final RegistryObject<Item> ENDORIUM_BUCKET = ITEMS.register("endorium_bucket", 
			() -> new BucketItem(FluidInit.ENDORIUM,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("endreborn") ? ItemGroup.MISC : null)));
	
	//druidcraft
	public static final RegistryObject<Item> MOONSTONE_BUCKET = ITEMS.register("moonstone_bucket", 
			() -> new BucketItem(FluidInit.MOONSTONE,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("druidcraft") ? ItemGroup.MISC : null)));
	
	//cyclic
	public static final RegistryObject<Item> CRYSTALLIZED_OBSIDIAN_BUCKET = ITEMS.register("crystallized_obsidian_bucket", 
			() -> new BucketItem(FluidInit.CRYSTALLIZED_OBSIDIAN,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("cyclic") ? ItemGroup.MISC : null)));
	
	//enderium
	public static final RegistryObject<Item> ENDERIUM_BUCKET = ITEMS.register("enderium_bucket", 
			() -> new BucketItem(FluidInit.ENDERIUM,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("enderium") ? ItemGroup.MISC : null)));
	
	//vulcanite
	public static final RegistryObject<Item> VULCANITE_BUCKET = ITEMS.register("vulcanite_bucket", 
			() -> new BucketItem(FluidInit.VULCANITE,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("vulcanite") ? ItemGroup.MISC : null)));
	
	//botania
	public static final RegistryObject<Item> MANASTEEL_BUCKET = ITEMS.register("manasteel_bucket", 
			() -> new BucketItem(FluidInit.MANASTEEL,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("botania") ? ItemGroup.MISC : null)));
	public static final RegistryObject<Item> ELEMENTIUM_BUCKET = ITEMS.register("elementium_bucket", 
			() -> new BucketItem(FluidInit.ELEMENTIUM,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("botania") ? ItemGroup.MISC : null)));
	public static final RegistryObject<Item> TERRASTEEL_BUCKET = ITEMS.register("terrasteel_bucket", 
			() -> new BucketItem(FluidInit.TERRASTEEL,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("botania") ? ItemGroup.MISC : null)));
	
	//mythic botany
	public static final RegistryObject<Item> ALFSTEEL_BUCKET = ITEMS.register("alfsteel_bucket", 
			() -> new BucketItem(FluidInit.ALFSTEEL,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("mythicbotany") ? ItemGroup.MISC : null)));
	
	//ae2
	public static final RegistryObject<Item> CERTUS_QUARTZ_BUCKET = ITEMS.register("certus_quartz_bucket",
			() -> new BucketItem(FluidInit.CERTUS_QUARTZ,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("appliedenergistics2") ? ItemGroup.MISC : null)));
	public static final RegistryObject<Item> FLUIX_BUCKET = ITEMS.register("fluix_bucket",
			() -> new BucketItem(FluidInit.FLUIX,
					new BucketItem.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ModList.get().isLoaded("appliedenergistics2") ? ItemGroup.MISC : null)));
	
}
