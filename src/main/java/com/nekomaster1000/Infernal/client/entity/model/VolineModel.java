package com.nekomaster1000.Infernal.client.entity.model;// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.nekomaster1000.Infernal.entities.GlowsquitoEntity;
import com.nekomaster1000.Infernal.entities.VolineEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class VolineModel<T extends VolineEntity> extends EntityModel<T> {
	private final ModelRenderer body;
	private final ModelRenderer mouth;
	private final ModelRenderer mouth_inside;
	private final ModelRenderer leg_1;
	private final ModelRenderer leg_2;
	private final ModelRenderer leg_3;
	private final ModelRenderer leg_4;

	public VolineModel() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 20.0F, 4.0F);
		body.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -8.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, 24.0F, 0.0F);
		mouth.setTextureOffset(0, 16).addBox(-4.0F, -5.0F, -4.0F, 8.0F, 3.0F, 8.0F, 0.0F, false);

		mouth_inside = new ModelRenderer(this);
		mouth_inside.setRotationPoint(0.0F, -4.0F, 0.0F);
		mouth.addChild(mouth_inside);
		setRotationAngle(mouth_inside, -1.5708F, 0.0F, 0.0F);
		mouth_inside.setTextureOffset(0, 27).addBox(-4.0F, -4.0F, 1.0F, 4.0F, 4.0F, 0.0F, 0.0F, false);
		mouth_inside.setTextureOffset(8, 27).addBox(0.0F, -4.0F, 1.0F, 4.0F, 4.0F, 0.0F, 0.0F, false);
		mouth_inside.setTextureOffset(16, 27).addBox(0.0F, 0.0F, 1.0F, 4.0F, 4.0F, 0.0F, 0.0F, false);
		mouth_inside.setTextureOffset(24, 27).addBox(-4.0F, 0.0F, 1.0F, 4.0F, 4.0F, 0.0F, 0.0F, false);

		leg_1 = new ModelRenderer(this);
		leg_1.setRotationPoint(-2.0F, 22.0F, -2.0F);
		leg_1.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		leg_2 = new ModelRenderer(this);
		leg_2.setRotationPoint(2.0F, 22.0F, -2.0F);
		leg_2.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		leg_3 = new ModelRenderer(this);
		leg_3.setRotationPoint(-2.0F, 22.0F, 2.0F);
		leg_3.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		leg_4 = new ModelRenderer(this);
		leg_4.setRotationPoint(2.0F, 22.0F, 2.0F);
		leg_4.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.leg_1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leg_2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.leg_3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
		this.leg_4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.body.rotateAngleX = -MathHelper.abs(MathHelper.cos(limbSwing * 0.4662F) * 1.4F * limbSwingAmount);
	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha){
		body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
		mouth.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
		leg_1.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
		leg_2.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
		leg_3.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
		leg_4.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

}