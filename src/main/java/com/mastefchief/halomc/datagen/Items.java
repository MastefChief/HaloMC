package com.mastefchief.halomc.datagen;

import com.mastefchief.halomc.HaloMC;
import com.mastefchief.halomc.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;

public class Items extends ItemModelProvider {

	public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, HaloMC.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		singleTexture(Registration.ARMOR_BUILDER_ITEM.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
				"layer0", new ResourceLocation(HaloMC.MOD_ID, "item/armor_builder_item"));
	}
}
