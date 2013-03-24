package ZoneSeek.common.recipes;

import ZoneSeek.common.blocks.BlocksHelper;
import ZoneSeek.common.items.ItemsHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ShapelessHandler {
	
	public static void setupRecipes(){
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsHelper.InfectedStick, 1), new Object[] {new ItemStack(ItemsHelper.InfectedShard), new ItemStack(Item.stick)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksHelper.LagoonPlanks, 4), new Object[] {new ItemStack(BlocksHelper.LagoonLog)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksHelper.SludgePlanks, 4), new Object[] {new ItemStack(BlocksHelper.SludgeLog)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemsHelper.TaintedPage, 4), new Object[] {new ItemStack(ItemsHelper.TaintedInkDrop), new ItemStack(Item.paper)});
		
	}

}
