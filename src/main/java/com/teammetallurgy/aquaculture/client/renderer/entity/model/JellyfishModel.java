package com.teammetallurgy.aquaculture.client.renderer.entity.model;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;

public class JellyfishModel<T extends Entity> extends EntityModel<T> {
    private final RendererModel head;
    private final RendererModel tentaclesMain;
    private final RendererModel tentaclesLeft;
    private final RendererModel tentaclesRight;
    private final RendererModel frill;
    private final RendererModel heart;

    public JellyfishModel() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.tentaclesLeft = new RendererModel(this, 0, 8);
        this.tentaclesLeft.setRotationPoint(0.0F, 15.0F, -4.0F);
        this.tentaclesLeft.addBox(2.0F, -3.0F, 0.0F, 0, 6, 12, 0.0F);
        this.tentaclesRight = new RendererModel(this, 0, 14);
        this.tentaclesRight.setRotationPoint(0.0F, 15.0F, -4.0F);
        this.tentaclesRight.addBox(-2.0F, -3.0F, 0.0F, 0, 6, 12, 0.0F);
        this.head = new RendererModel(this, 14, 0);
        this.head.setRotationPoint(0.0F, 15.0F, -3.5F);
        this.head.addBox(-2.5F, -2.5F, -5.0F, 5, 5, 5, 0.0F);
        this.tentaclesMain = new RendererModel(this, 0, 0);
        this.tentaclesMain.setRotationPoint(0.0F, 15.0F, -4.0F);
        this.tentaclesMain.addBox(0.0F, -3.0F, 0.0F, 0, 6, 14, 0.0F);
        this.heart = new RendererModel(this, 34, 0);
        this.heart.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.heart.addBox(-1.5F, -1.5F, -2.0F, 3, 3, 3, 0.0F);
        this.frill = new RendererModel(this, 0, 0);
        this.frill.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.frill.addBox(-3.0F, -3.0F, 0.0F, 6, 6, 1, 0.0F);
        this.head.addChild(this.heart);
        this.head.addChild(this.frill);
    }

    @Override
    public void render(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        this.tentaclesLeft.render(scale);
        this.tentaclesRight.render(scale);
        this.head.render(scale);
        this.tentaclesMain.render(scale);
    }
}