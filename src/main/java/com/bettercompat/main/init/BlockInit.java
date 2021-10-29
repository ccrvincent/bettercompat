package com.bettercompat.main.init;

import com.bettercompat.main.BetterCompat;

import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterCompat.MODID);
    
    //better end
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_THALLASIUM = BLOCKS
            .register("molten_thallasium_block", () -> new FlowingFluidBlock(FluidInit.THALLASIUM,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_TERMINITE = BLOCKS
            .register("molten_terminite_block", () -> new FlowingFluidBlock(FluidInit.TERMINITE,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_AETERNIUM = BLOCKS
            .register("molten_aeternium_block", () -> new FlowingFluidBlock(FluidInit.AETERNIUM,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //ores above diamonds
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_AMETHYST = BLOCKS
            .register("molten_amethyst_block", () -> new FlowingFluidBlock(FluidInit.AMETHYST,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_BLACKOPAL = BLOCKS
            .register("molten_blackopal_block", () -> new FlowingFluidBlock(FluidInit.BLACKOPAL,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_NETHERITEOPAL = BLOCKS
            .register("molten_netheriteopal_block", () -> new FlowingFluidBlock(FluidInit.NETHERITEOPAL,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //iceandfire
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_SAPPHIRE = BLOCKS
            .register("molten_sapphire_block", () -> new FlowingFluidBlock(FluidInit.SAPPHIRE,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //endreborn
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_ENDORIUM = BLOCKS
            .register("molten_endorium_block", () -> new FlowingFluidBlock(FluidInit.ENDORIUM,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //druidcraft
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_MOONSTONE = BLOCKS
            .register("molten_moonstone_block", () -> new FlowingFluidBlock(FluidInit.MOONSTONE,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //cyclic
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_CRYSTALLIZED_OBSIDIAN = BLOCKS
            .register("molten_crystallized_obsidian_block", () -> new FlowingFluidBlock(FluidInit.CRYSTALLIZED_OBSIDIAN,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //enderium
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_ENDERIUM = BLOCKS
            .register("molten_enderium_block", () -> new FlowingFluidBlock(FluidInit.ENDERIUM,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //vulcanite
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_VULCANITE = BLOCKS
            .register("molten_vulcanite_block", () -> new FlowingFluidBlock(FluidInit.VULCANITE,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //botania
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_MANASTEEL = BLOCKS
            .register("molten_manasteel_block", () -> new FlowingFluidBlock(FluidInit.MANASTEEL,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_ELEMENTIUM = BLOCKS
            .register("molten_elementium_block", () -> new FlowingFluidBlock(FluidInit.ELEMENTIUM,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_TERRASTEEL = BLOCKS
            .register("molten_terrasteel_block", () -> new FlowingFluidBlock(FluidInit.TERRASTEEL,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //mythic botany
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_ALFSTEEL = BLOCKS
            .register("molten_alfsteel_block", () -> new FlowingFluidBlock(FluidInit.ALFSTEEL,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    //ae2
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_CERTUS_QUARTZ = BLOCKS
            .register("molten_certus_quartz_block", () -> new FlowingFluidBlock(FluidInit.CERTUS_QUARTZ,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_FLUIX = BLOCKS
            .register("molten_fluix_block", () -> new FlowingFluidBlock(FluidInit.FLUIX,
                    Block.Properties.create(Material.LAVA).setLightLevel((state) -> {	return 15;	}).tickRandomly().hardnessAndResistance(100.0F).noDrops()));
    
    public static final RegistryObject<Block> BLOCK = BLOCKS.register("block", () -> new Block(Block.Properties.create(Material.LAVA)));
    
}
