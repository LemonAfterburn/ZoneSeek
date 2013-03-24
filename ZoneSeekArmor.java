package ZoneSeek;

import ZoneSeek.common.items.ItemsHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class ZoneSeekArmor extends CreativeTabs {
	public ZoneSeekArmor(int posistion,String tabId){
		super(posistion,tabId);
	}
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return ItemsHelper.InfectedHelmet.itemID;
	}

		public String getTranslatedTabLabel()
		{
			return "ZoneSeek Armor";
		}
	
	}
