package com.bettercompat.main.init;

import com.bettercompat.main.BetterCompat;

import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterCompat.MODID);
    
    //better end
	public static final RegistryObject<Item> THALLASIUM_BUCKET = ITEMS.register("thallasium_bucket", 
			() -> new BucketItem(FluidInit.THALLASIUM,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> TERMINITE_BUCKET = ITEMS.register("terminite_bucket", 
			() -> new BucketItem(FluidInit.TERMINITE,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> AETERNIUM_BUCKET = ITEMS.register("aeternium_bucket", 
			() -> new BucketItem(FluidInit.AETERNIUM,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	
	//ores above diamonds
	public static final RegistryObject<Item> AMETHYST_BUCKET = ITEMS.register("amethyst_bucket", 
			() -> new BucketItem(FluidInit.AMETHYST,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> BLACKOPAL_BUCKET = ITEMS.register("blackopal_bucket", 
			() -> new BucketItem(FluidInit.BLACKOPAL,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> NETHERITEOPAL_BUCKET = ITEMS.register("netheriteopal_bucket", 
			() -> new BucketItem(FluidInit.NETHERITEOPAL,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	
	//endreborn
	public static final RegistryObject<Item> ENDORIUM_BUCKET = ITEMS.register("endorium_bucket", 
			() -> new BucketItem(FluidInit.ENDORIUM,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	
	//druidcraft
	public static final RegistryObject<Item> MOONSTONE_BUCKET = ITEMS.register("moonstone_bucket", 
			() -> new BucketItem(FluidInit.MOONSTONE,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	
	//botania
	public static final RegistryObject<Item> MANASTEEL_BUCKET = ITEMS.register("manasteel_bucket", 
			() -> new BucketItem(FluidInit.MANASTEEL,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> ELEMENTIUM_BUCKET = ITEMS.register("elementium_bucket", 
			() -> new BucketItem(FluidInit.ELEMENTIUM,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> TERRASTEEL_BUCKET = ITEMS.register("terrasteel_bucket", 
			() -> new BucketItem(FluidInit.TERRASTEEL,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	
	//ae2
	public static final RegistryObject<Item> CERTUS_QUARTZ_BUCKET = ITEMS.register("certus_quartz_bucket",
			() -> new BucketItem(FluidInit.CERTUS_QUARTZ,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	public static final RegistryObject<Item> FLUIX_BUCKET = ITEMS.register("fluix_bucket",
			() -> new BucketItem(FluidInit.FLUIX,
					new BucketItem.Properties().craftRemainder(Items.BUCKET).stacksTo(1).tab(ItemGroup.TAB_MISC)));
	
}
