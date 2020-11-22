package com.mastefchief.halomc.setup;

import com.mastefchief.halomc.HaloMC;
import com.mastefchief.halomc.blocks.ArmorBuilderBlock;
import com.mastefchief.halomc.blocks.ArmorBuilderTile;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {

	private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, HaloMC.MOD_ID);
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HaloMC.MOD_ID);
	private static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, HaloMC.MOD_ID);

	public static void init() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		BLOCKS.register(modEventBus);
		ITEMS.register(modEventBus);
		TILES.register(modEventBus);
	}

	public static final RegistryObject<ArmorBuilderBlock> ARMOR_BUILDER_BLOCK = BLOCKS.register("armor_builder", ArmorBuilderBlock::new);
	public static final RegistryObject<Item> ARMOR_BUILDER_ITEM = ITEMS.register("armor_builder", () -> new BlockItem(ARMOR_BUILDER_BLOCK.get(), new Item.Properties().group(HaloMC.ITEM_GROUP)));
	public static final RegistryObject<TileEntityType<ArmorBuilderTile>> ARMOR_BUILDER_TILE = TILES.register("armor_builder", () -> TileEntityType.Builder.create(ArmorBuilderTile::new, ARMOR_BUILDER_BLOCK.get()).build(null));

}
