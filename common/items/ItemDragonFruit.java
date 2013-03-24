package ZoneSeek.common.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDragonFruit extends ItemFood{

	public ItemDragonFruit(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
		maxStackSize = 64;
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void func_94581_a(IconRegister par1IconRegister)
	{
		this.iconIndex = par1IconRegister.func_94245_a("zoneseek:dragonfruit");
	}

}
