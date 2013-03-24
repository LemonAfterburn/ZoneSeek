package ZoneSeek.common.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelInfectedPig extends ModelBase
{
	  //fields
	    ModelRenderer Bottom_Layer__R;
	    ModelRenderer Top_Layer__R;
	    ModelRenderer Bottom_Layer__L;
	    ModelRenderer Top_Layer__L;
	    ModelRenderer Only_Layer__L;
	    ModelRenderer Shape4;
	    ModelRenderer head;
	    ModelRenderer body;
	    ModelRenderer leg1;
	    ModelRenderer leg2;
	    ModelRenderer leg4_Top;
	    ModelRenderer leg4_Small_Piece;
	    ModelRenderer leg4_Bottom;
	    ModelRenderer Shape1;
	    ModelRenderer Shape2;
	    ModelRenderer Shape3;
	    ModelRenderer Shape5;
	  
	  public ModelInfectedPig()
	  {
	    textureWidth = 64;
	    textureHeight = 64;
	    
	      Bottom_Layer__R = new ModelRenderer(this, 32, 0);
	      Bottom_Layer__R.addBox(0F, 0F, 0F, 1, 2, 2);
	      Bottom_Layer__R.setRotationPoint(4.5F, 12F, 0F);
	      Bottom_Layer__R.setTextureSize(64, 64);
	      Bottom_Layer__R.mirror = true;
	      setRotation(Bottom_Layer__R, 0F, 0F, 0F);
	      Top_Layer__R = new ModelRenderer(this, 38, 0);
	      Top_Layer__R.addBox(0F, 0F, 0F, 1, 1, 1);
	      Top_Layer__R.setRotationPoint(5F, 12.53333F, 0.5F);
	      Top_Layer__R.setTextureSize(64, 64);
	      Top_Layer__R.mirror = true;
	      setRotation(Top_Layer__R, 0F, 0F, 0F);
	      Bottom_Layer__L = new ModelRenderer(this, 32, 4);
	      Bottom_Layer__L.addBox(0F, 0F, 0F, 1, 2, 2);
	      Bottom_Layer__L.setRotationPoint(-5.533333F, 15F, -5F);
	      Bottom_Layer__L.setTextureSize(64, 64);
	      Bottom_Layer__L.mirror = true;
	      setRotation(Bottom_Layer__L, 0F, 0F, 0F);
	      Top_Layer__L = new ModelRenderer(this, 38, 4);
	      Top_Layer__L.addBox(-6F, 15.5F, -4.466667F, 1, 1, 1);
	      Top_Layer__L.setRotationPoint(0F, 0F, 0F);
	      Top_Layer__L.setTextureSize(64, 64);
	      Top_Layer__L.mirror = true;
	      setRotation(Top_Layer__L, 0F, 0F, 0F);
	      Only_Layer__L = new ModelRenderer(this, 38, 8);
	      Only_Layer__L.addBox(-4.5F, 0F, -6F, 1, 1, 1);
	      Only_Layer__L.setRotationPoint(0F, 12F, -6F);
	      Only_Layer__L.setTextureSize(64, 64);
	      Only_Layer__L.mirror = true;
	      setRotation(Only_Layer__L, 0F, 0F, 0F);
	      Shape4 = new ModelRenderer(this, 9, 41);
	      Shape4.addBox(-2F, 0F, -9F, 4, 3, 1);
	      Shape4.setRotationPoint(0F, 12F, -6F);
	      Shape4.setTextureSize(64, 64);
	      Shape4.mirror = true;
	      setRotation(Shape4, 0F, 0F, 0F);
	      head = new ModelRenderer(this, 0, 0);
	      head.addBox(-4F, -4F, -8F, 8, 8, 8);
	      head.setRotationPoint(0F, 12F, -6F);
	      head.setTextureSize(64, 64);
	      head.mirror = true;
	      setRotation(head, 0F, 0F, 0F);
	      body = new ModelRenderer(this, 16, 16);
	      body.addBox(-5F, -10F, -7F, 10, 16, 8);
	      body.setRotationPoint(0F, 11F, 3F);
	      body.setTextureSize(64, 64);
	      body.mirror = true;
	      setRotation(body, 1.570796F, 0F, 0F);
	      leg1 = new ModelRenderer(this, 0, 16);
	      leg1.addBox(-2F, 0F, -2F, 4, 6, 4);
	      leg1.setRotationPoint(-3F, 18F, 7F);
	      leg1.setTextureSize(64, 64);
	      leg1.mirror = true;
	      setRotation(leg1, 0F, 0F, 0F);
	      leg2 = new ModelRenderer(this, 0, 16);
	      leg2.addBox(-2F, 0F, -2F, 4, 6, 4);
	      leg2.setRotationPoint(3F, 18F, 7F);
	      leg2.setTextureSize(64, 64);
	      leg2.mirror = true;
	      setRotation(leg2, 0F, 0F, 0F);
	      leg4_Top = new ModelRenderer(this, 0, 27);
	      leg4_Top.addBox(0F, 0F, 0F, 4, 1, 4);
	      leg4_Top.setRotationPoint(1F, 18F, -7F);
	      leg4_Top.setTextureSize(64, 64);
	      leg4_Top.mirror = true;
	      setRotation(leg4_Top, 0F, 0F, 0F);
	      leg4_Small_Piece = new ModelRenderer(this, 0, 34);
	      leg4_Small_Piece.addBox(0F, 4F, 0F, 4, 2, 4);
	      leg4_Small_Piece.setRotationPoint(1F, 18F, -7F);
	      leg4_Small_Piece.setTextureSize(64, 64);
	      leg4_Small_Piece.mirror = true;
	      setRotation(leg4_Small_Piece, 0F, 0F, 0F);
	      leg4_Bottom = new ModelRenderer(this, 0, 41);
	      leg4_Bottom.addBox(1F, 1F, 2F, 2, 3, 2);
	      leg4_Bottom.setRotationPoint(1F, 18F, -7F);
	      leg4_Bottom.setTextureSize(64, 64);
	      leg4_Bottom.mirror = true;
	      setRotation(leg4_Bottom, 0F, 0F, 0F);
	      Shape1 = new ModelRenderer(this, 0, 47);
	      Shape1.addBox(1F, 1F, 1F, 1, 2, 1);
	      Shape1.setRotationPoint(1F, 18F, -7F);
	      Shape1.setTextureSize(64, 64);
	      Shape1.mirror = true;
	      setRotation(Shape1, 0F, 0F, 0F);
	      Shape2 = new ModelRenderer(this, 0, 51);
	      Shape2.addBox(2F, 1F, 1F, 1, 1, 1);
	      Shape2.setRotationPoint(1F, 18F, -7F);
	      Shape2.setTextureSize(64, 64);
	      Shape2.mirror = true;
	      setRotation(Shape2, 0F, 0F, 0F);
	      Shape3 = new ModelRenderer(this, 0, 54);
	      Shape3.addBox(3F, 3F, 3F, 1, 1, 1);
	      Shape3.setRotationPoint(1F, 18F, -7F);
	      Shape3.setTextureSize(64, 64);
	      Shape3.mirror = true;
	      setRotation(Shape3, 0F, 0F, 0F);
	      Shape5 = new ModelRenderer(this, 0, 16);
	      Shape5.addBox(0F, 0F, 0F, 4, 6, 4);
	      Shape5.setRotationPoint(-5F, 18F, -7F);
	      Shape5.setTextureSize(64, 64);
	      Shape5.mirror = true;
	      setRotation(Shape5, 0F, 0F, 0F);
	  }
	  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    super.render(par1Entity, par2, par3, par4, par5, par6, par7);
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    Bottom_Layer__R.render(par7);
    Top_Layer__R.render(par7);
    Bottom_Layer__L.render(par7);
    Top_Layer__L.render(par7);
    Only_Layer__L.render(par7);
    Shape4.render(par7);
    head.render(par7);
    body.render(par7);
    leg1.render(par7);
    leg2.render(par7);
    leg4_Top.render(par7);
    leg4_Small_Piece.render(par7);
    leg4_Bottom.render(par7);
    Shape1.render(par7);
    Shape2.render(par7);
    Shape3.render(par7);
    Shape5.render(par7);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
      this.head.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.head.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Shape4.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Shape4.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Only_Layer__L.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.Only_Layer__L.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.body.rotateAngleX = ((float)Math.PI / 2F);
      this.leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.Shape5.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.leg4_Top.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.leg4_Small_Piece.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.leg4_Bottom.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.Shape1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.Shape2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.Shape3.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
  }

}
