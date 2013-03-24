package ZoneSeek;

import ZoneSeek.common.items.ItemsHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class ZoneSeekItems extends CreativeTabs {
	public ZoneSeekItems(int posistion,String tabId){
		super(posistion,tabId);
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return ItemsHelper.SludgeStone.itemID;
	}

		public String getTranslatedTabLabel()
		{
			return "ZoneSeek Items";
		}
	
	}
