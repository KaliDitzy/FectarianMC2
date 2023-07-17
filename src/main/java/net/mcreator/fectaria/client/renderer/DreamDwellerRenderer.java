
package net.mcreator.fectaria.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fectaria.entity.DreamDwellerEntity;
import net.mcreator.fectaria.client.model.Modeldream_dweller;

public class DreamDwellerRenderer extends MobRenderer<DreamDwellerEntity, Modeldream_dweller<DreamDwellerEntity>> {
	public DreamDwellerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldream_dweller(context.bakeLayer(Modeldream_dweller.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DreamDwellerEntity entity) {
		return new ResourceLocation("fectaria:textures/entities/dreamdweller_texture.png");
	}
}
