package ZoneSeek.common;


import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		// TODO Auto-generated method stub
		return 0;
/**
	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.itemID == ItemsHelper.ligniteCoal.itemID){
			return 3200;
		}else if(fuel.itemID == ItemsHelper.bituminousCoal.itemID){
			return 6400;
		}else if(fuel.itemID == ItemsHelper.anthraciteCoal.itemID){
			return 12800;
		}
		return 0;
	}
**/
}
}