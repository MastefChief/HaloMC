package com.mastefchief.halomc.setup;

import com.mastefchief.halomc.HaloMC;
import com.mastefchief.halomc.blocks.ArmorBuilderRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = HaloMC.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {

	public static void init(final FMLClientSetupEvent event) {
		ArmorBuilderRenderer.register();
	}


}
