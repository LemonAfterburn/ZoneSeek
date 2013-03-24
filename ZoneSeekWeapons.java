package ZoneSeek;

import ZoneSeek.common.items.ItemsHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class ZoneSeekWeapons extends CreativeTabs {
	public ZoneSeekWeapons(int posistion,String tabId){
		super(posistion,tabId);
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return ItemsHelper.InfectedSword.itemID;
	}

		public String getTranslatedTabLabel()
		{
			return "ZoneSeek Weapons";
		}
	
	}
