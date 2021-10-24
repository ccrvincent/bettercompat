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
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_TERMINITE = BLOCKS
            .register("molten_terminite_block", () -> new FlowingFluidBlock(FluidInit.TERMINITE,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_AETERNIUM = BLOCKS
            .register("molten_aeternium_block", () -> new FlowingFluidBlock(FluidInit.AETERNIUM,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    
    //ores above diamonds
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_AMETHYST = BLOCKS
            .register("molten_amethyst_block", () -> new FlowingFluidBlock(FluidInit.AMETHYST,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_BLACKOPAL = BLOCKS
            .register("molten_blackopal_block", () -> new FlowingFluidBlock(FluidInit.BLACKOPAL,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_NETHERITEOPAL = BLOCKS
            .register("molten_netheriteopal_block", () -> new FlowingFluidBlock(FluidInit.NETHERITEOPAL,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    
    //endreborn
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_ENDORIUM = BLOCKS
            .register("molten_endorium_block", () -> new FlowingFluidBlock(FluidInit.ENDORIUM,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    
    //druidcraft
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_MOONSTONE = BLOCKS
            .register("molten_moonstone_block", () -> new FlowingFluidBlock(FluidInit.MOONSTONE,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    
    //botania
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_MANASTEEL = BLOCKS
            .register("molten_manasteel_block", () -> new FlowingFluidBlock(FluidInit.MANASTEEL,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_ELEMENTIUM = BLOCKS
            .register("molten_elementium_block", () -> new FlowingFluidBlock(FluidInit.ELEMENTIUM,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_TERRASTEEL = BLOCKS
            .register("molten_terrasteel_block", () -> new FlowingFluidBlock(FluidInit.TERRASTEEL,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    
    //ae2
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_CERTUS_QUARTZ = BLOCKS
            .register("molten_certus_quartz_block", () -> new FlowingFluidBlock(FluidInit.CERTUS_QUARTZ,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_FLUIX = BLOCKS
            .register("molten_fluix_block", () -> new FlowingFluidBlock(FluidInit.FLUIX,
                    Block.Properties.of(Material.LAVA).lightLevel((state) -> {	return 15;	}).randomTicks().strength(100.0F).noDrops()));
    
}
