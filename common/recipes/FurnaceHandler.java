package ZoneSeek.common.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import ZoneSeek.common.items.ItemsHelper;
import net.minecraft.item.ItemStack;

public class FurnaceHandler {
	
	public static void setupRecipes(){
		GameRegistry.addSmelting(ItemsHelper.InfectedStone.itemID, new ItemStack(ItemsHelper.InfectedPlate), 0.5F);
		
		GameRegistry.addSmelting(ItemsHelper.TaintedInkSack.itemID, new ItemStack(ItemsHelper.TaintedInkDrop), 0.5F);
			
	}

}
