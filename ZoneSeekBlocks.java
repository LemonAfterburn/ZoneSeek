package ZoneSeek;

import ZoneSeek.common.blocks.BlocksHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class ZoneSeekBlocks extends CreativeTabs {
	public ZoneSeekBlocks(int posistion,String tabId){
		super(posistion,tabId);
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return BlocksHelper.InfectedBrick.blockID;
	}

		public String getTranslatedTabLabel()
		{
			return "ZoneSeek Blocks";
		}
	
	}
