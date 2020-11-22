package com.mastefchief.halomc;

import com.mastefchief.halomc.setup.ClientSetup;
import com.mastefchief.halomc.setup.Registration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("halomc")
public class HaloMC {
	private static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "halomc";

	public HaloMC() {
		Registration.init();

		FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientSetup::init);
	}

	public static final ItemGroup ITEM_GROUP = new ItemGroup("halomcTab") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(Registration.ARMOR_BUILDER_ITEM.get());
		}
	};
}
