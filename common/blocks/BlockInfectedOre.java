package ZoneSeek.common.blocks;

import java.util.Random;

import ZoneSeek.common.items.ItemsHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BlockInfectedOre extends Block{

	private String textureName;

	public BlockInfectedOre(int par1, String tex) {
		super(par1, Material.rock);
		this.textureName = tex;
	}

	public String getTextureName(){
		return this.textureName;
	}
	
	public int idDropped(int par1, Random rand, int par3){
		return ItemsHelper.InfectedGem.itemID;
	}
	
	public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity){
		if (par5Entity instanceof EntityLiving){
			
			((EntityLiving)par5Entity).addPotionEffect(new PotionEffect(Potion.poison.getId(),5,10));
		
		}
	}

	public void func_94332_a(IconRegister reg){
		this.field_94336_cN = reg.func_94245_a("zoneseek:" + this.getTextureName());
	}

}