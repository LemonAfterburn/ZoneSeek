package ZoneSeek.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockGround extends Block{

	private String textureName;

	public BlockGround(int par1, String tex) {
		super(par1, Material.ground);
		this.textureName = tex;
	}

	public String getTextureName(){
		return this.textureName;
	}

	public void func_94332_a(IconRegister reg){
		this.field_94336_cN = reg.func_94245_a("zoneseek:" + this.getTextureName());
	}

}