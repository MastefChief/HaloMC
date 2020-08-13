package com.mastefchief.halomc.util;

import com.mastefchief.halomc.HaloMC;
import com.mastefchief.halomc.blocks.BlockItemBase;
import com.mastefchief.halomc.blocks.HaloBlock;
import com.mastefchief.halomc.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, HaloMC.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, HaloMC.MOD_ID);

	public static void init(){
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

	// Items
	public static final RegistryObject<Item> HALO = ITEMS.register("halo", ItemBase::new);


	// Blocks
	public static final RegistryObject<Block> HALO_BLOCK = BLOCKS.register("halo_block", HaloBlock::new);


	// Block Items
	public static final RegistryObject<Item> HALO_BLOCK_ITEM = ITEMS.register("halo_block", () -> new BlockItemBase(HALO_BLOCK.get()));
}
