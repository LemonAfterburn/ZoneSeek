package ZoneSeek.common.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelInfectedCow extends ModelBase
{
  //fields
    ModelRenderer Front_Cover;
    ModelRenderer Back_Cover;
    ModelRenderer Top_Flesh;
    ModelRenderer Bottom_Flesh;
    ModelRenderer Back_Bone;
    ModelRenderer Middle_Bone;
    ModelRenderer Front_Bone;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer head;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer horn1;
    ModelRenderer horn2;
    ModelRenderer udders;
    ModelRenderer Top_Body;
    ModelRenderer Bottom_Body;
  
  public ModelInfectedCow()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Front_Cover = new ModelRenderer(this, 0, 42);
      Front_Cover.addBox(-1F, 2F, -10F, 7, 5, 4);
      Front_Cover.setRotationPoint(0F, 5F, 2F);
      Front_Cover.setTextureSize(128, 128);
      Front_Cover.mirror = true;
      setRotation(Front_Cover, 0F, 0F, 0F);
      Back_Cover = new ModelRenderer(this, 0, 32);
      Back_Cover.addBox(-1F, 2F, 3F, 7, 5, 5);
      Back_Cover.setRotationPoint(0F, 5F, 2F);
      Back_Cover.setTextureSize(128, 128);
      Back_Cover.mirror = true;
      setRotation(Back_Cover, 0F, 0F, 0F);
      Top_Flesh = new ModelRenderer(this, 27, 46);
      Top_Flesh.addBox(2F, 2F, -9F, 3, 2, 16);
      Top_Flesh.setRotationPoint(0F, 5F, 2F);
      Top_Flesh.setTextureSize(128, 128);
      Top_Flesh.mirror = true;
      setRotation(Top_Flesh, 0F, 0F, 0F);
      Bottom_Flesh = new ModelRenderer(this, 28, 64);
      Bottom_Flesh.addBox(0F, 3F, -9F, 2, 4, 16);
      Bottom_Flesh.setRotationPoint(0F, 5F, 2F);
      Bottom_Flesh.setTextureSize(128, 128);
      Bottom_Flesh.mirror = true;
      setRotation(Bottom_Flesh, 0F, 0F, 0F);
      Back_Bone = new ModelRenderer(this, 65, 0);
      Back_Bone.addBox(3F, 3F, 1.5F, 1, 3, 1);
      Back_Bone.setRotationPoint(0F, 5F, 2F);
      Back_Bone.setTextureSize(128, 128);
      Back_Bone.mirror = true;
      setRotation(Back_Bone, 0F, 0F, 0F);
      Middle_Bone = new ModelRenderer(this, 65, 0);
      Middle_Bone.addBox(3F, 3F, -1.5F, 1, 3, 1);
      Middle_Bone.setRotationPoint(0F, 5F, 2F);
      Middle_Bone.setTextureSize(128, 128);
      Middle_Bone.mirror = true;
      setRotation(Middle_Bone, 0F, 0F, 0F);
      Front_Bone = new ModelRenderer(this, 65, 0);
      Front_Bone.addBox(3F, 3F, -4.5F, 1, 3, 1);
      Front_Bone.setRotationPoint(0F, 5F, 2F);
      Front_Bone.setTextureSize(128, 128);
      Front_Bone.mirror = true;
      setRotation(Front_Bone, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 65);
      Shape1.addBox(-6.5F, 0F, 0F, 1, 2, 2);
      Shape1.setRotationPoint(0F, 5F, 2F);
      Shape1.setTextureSize(128, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 7, 66);
      Shape2.addBox(-7F, 0.5F, 0.5F, 1, 1, 1);
      Shape2.setRotationPoint(0F, 5F, 2F);
      Shape2.setTextureSize(128, 128);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 72);
      Shape3.addBox(4F, 4F, -10.5F, 1, 1, 1);
      Shape3.setRotationPoint(0F, 5F, 2F);
      Shape3.setTextureSize(128, 128);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 0);
      Shape4.addBox(-4.5F, 1F, -3F, 1, 1, 1);
      Shape4.setRotationPoint(0F, 4F, -8F);
      Shape4.setTextureSize(128, 128);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -4F, -6F, 8, 8, 6);
      head.setRotationPoint(0F, 4F, -8F);
      head.setTextureSize(128, 128);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 16);
      leg1.addBox(-3F, 0F, -2F, 4, 12, 4);
      leg1.setRotationPoint(-3F, 12F, 7F);
      leg1.setTextureSize(128, 128);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 0, 16);
      leg2.addBox(-1F, 0F, -2F, 4, 12, 4);
      leg2.setRotationPoint(3F, 12F, 7F);
      leg2.setTextureSize(128, 128);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      leg3 = new ModelRenderer(this, 0, 16);
      leg3.addBox(-3F, 0F, -3F, 4, 12, 4);
      leg3.setRotationPoint(-3F, 12F, -5F);
      leg3.setTextureSize(128, 128);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 0F);
      leg4 = new ModelRenderer(this, 0, 16);
      leg4.addBox(-1F, 0F, -3F, 4, 12, 4);
      leg4.setRotationPoint(3F, 12F, -5F);
      leg4.setTextureSize(128, 128);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 0F);
      horn1 = new ModelRenderer(this, 22, 0);
      horn1.addBox(-4F, -5F, -4F, 1, 3, 1);
      horn1.setRotationPoint(0F, 3F, -7F);
      horn1.setTextureSize(128, 128);
      horn1.mirror = true;
      setRotation(horn1, 0F, 0F, 0F);
      horn2 = new ModelRenderer(this, 22, 0);
      horn2.addBox(3F, -5F, -4F, 1, 3, 1);
      horn2.setRotationPoint(0F, 3F, -7F);
      horn2.setTextureSize(128, 128);
      horn2.mirror = true;
      setRotation(horn2, 0F, 0F, 0F);
      udders = new ModelRenderer(this, 52, 0);
      udders.addBox(-2F, -3F, 0F, 4, 6, 2);
      udders.setRotationPoint(0F, 14F, 6F);
      udders.setTextureSize(128, 128);
      udders.mirror = true;
      setRotation(udders, 1.570796F, 0F, 0F);
      Top_Body = new ModelRenderer(this, 26, 23);
      Top_Body.addBox(-6F, -10F, -2F, 12, 18, 5);
      Top_Body.setRotationPoint(0F, 5F, 2F);
      Top_Body.setTextureSize(128, 128);
      Top_Body.mirror = true;
      setRotation(Top_Body, 1.570796F, 0F, 0F);
      Bottom_Body = new ModelRenderer(this, 29, 0);
      Bottom_Body.addBox(-6F, -10F, -7F, 6, 18, 5);
      Bottom_Body.setRotationPoint(0F, 5F, 2F);
      Bottom_Body.setTextureSize(128, 128);
      Bottom_Body.mirror = true;
      setRotation(Bottom_Body, 1.570796F, 0F, 0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    super.render(par1Entity, par2, par3, par4, par5, par6, par7);
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    Front_Cover.render(par7);
    Back_Cover.render(par7);
    Top_Flesh.render(par7);
    Bottom_Flesh.render(par7);
    Back_Bone.render(par7);
    Middle_Bone.render(par7);
    Front_Bone.render(par7);
    Shape1.render(par7);
    Shape2.render(par7);
    Shape3.render(par7);
    Shape4.render(par7);
    head.render(par7);
    leg1.render(par7);
    leg2.render(par7);
    leg3.render(par7);
    leg4.render(par7);
    horn1.render(par7);
    horn2.render(par7);
    udders.render(par7);
    Top_Body.render(par7);
    Bottom_Body.render(par7);
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
      this.Shape4.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.horn1.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.horn2.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;

  }

}
