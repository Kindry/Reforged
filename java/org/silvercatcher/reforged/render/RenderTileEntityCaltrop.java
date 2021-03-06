package org.silvercatcher.reforged.render;

import org.lwjgl.opengl.GL11;
import org.silvercatcher.reforged.ReforgedReferences.Textures;
import org.silvercatcher.reforged.models.ModelCaltrop;
import org.silvercatcher.reforged.models.ReforgedModel;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderTileEntityCaltrop extends TileEntitySpecialRenderer {
	
    private final ReforgedModel model;
    
    public RenderTileEntityCaltrop() {
    	model = new ModelCaltrop();
    }
    
    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale, int i) {
    	GL11.glPushMatrix();
    	GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
    	ResourceLocation textures = Textures.CALTROP;
    	Minecraft.getMinecraft().renderEngine.bindTexture(textures);                    
    	GL11.glPushMatrix();
    	model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
    	GL11.glPopMatrix();
    	GL11.glPopMatrix();
    }
}