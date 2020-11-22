package com.mastefchief.halomc.blocks;

import com.mastefchief.halomc.setup.Registration;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.model.data.EmptyModelData;
import net.minecraftforge.fml.client.registry.ClientRegistry;

import java.util.Random;

public class ArmorBuilderRenderer extends TileEntityRenderer<ArmorBuilderTile> {

	public ArmorBuilderRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
		super(rendererDispatcherIn);
	}


	@Override
	public void render(ArmorBuilderTile tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
		if(!tileEntityIn.hasWorld())
			return;

		matrixStackIn.push();

		BlockPos pos = tileEntityIn.getPos();
		BlockState state = tileEntityIn.getWorld().getBlockState(pos);

		matrixStackIn.push();
		{
			matrixStackIn.scale(0.5f, 0.5f, 0.5f);
			matrixStackIn.translate(0.0, 0.0, 0.0);
			matrixStackIn.translate(-1.5, 0.0, -1.5);
			matrixStackIn.scale(5.0f, 5.0f, 5.0f);
			BlockRendererDispatcher dispatcher = Minecraft.getInstance().getBlockRendererDispatcher();
			IBakedModel model = dispatcher.getModelForState(state);
			IVertexBuilder builder = bufferIn.getBuffer(RenderType.getCutout());
			dispatcher.getBlockModelRenderer().renderModel(tileEntityIn.getWorld(), model, state, pos, matrixStackIn, builder, true, new Random(), state.getPositionRandom(pos), OverlayTexture.NO_OVERLAY);
		}
		matrixStackIn.pop();

		matrixStackIn.pop();
	}

	public static void register() {
		ClientRegistry.bindTileEntityRenderer(Registration.ARMOR_BUILDER_TILE.get(), ArmorBuilderRenderer::new);
	}
}
