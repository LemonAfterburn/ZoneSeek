package ZoneSeek.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockWallPaperWhite extends Block{

public BlockWallPaperWhite(int ID) {
	super(ID, Material.wood);

	}
@Override
public void func_94332_a(IconRegister par1IconRegister)
{
         this.field_94336_cN = par1IconRegister.func_94245_a("zoneseek:wpwhite");
}

}