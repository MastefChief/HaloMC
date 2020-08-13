package com.mastefchief.halomc.blocks;

import com.mastefchief.halomc.HaloMC;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class HaloBlock extends Block {

	public HaloBlock() {
		super(Block.Properties.create(Material.IRON)
				.hardnessAndResistance(5.0f, 6.0f)
				.sound(SoundType.METAL)
				.harvestLevel(3)
				.harvestTool(ToolType.PICKAXE)
		);
	}

}
