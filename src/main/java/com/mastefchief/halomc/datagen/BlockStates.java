package com.mastefchief.halomc.datagen;

import com.mastefchief.halomc.HaloMC;
import com.mastefchief.halomc.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;

public class BlockStates extends BlockStateProvider {

	public BlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, HaloMC.MOD_ID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		simpleBlock(Registration.ARMOR_BUILDER_BLOCK.get());
	}
}
