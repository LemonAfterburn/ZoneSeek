package ZoneSeek.common.recipes;

import ZoneSeek.common.blocks.BlocksHelper;
import ZoneSeek.common.items.ItemsHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingTableHandler {
	
	public static void setupRecipes(){
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedBoots, 1), new Object[] {
			"   ", "P P", "P P", 'P', ItemsHelper.InfectedPlate, 'G', ItemsHelper.InfectedGem
			
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedLeggings, 1), new Object[] {
			"PPP", "P P", "P P", 'P', ItemsHelper.InfectedPlate, 'G', ItemsHelper.InfectedGem
			
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedHelmet, 1), new Object[] {
			"PPP", "PGP", " P ", 'P', ItemsHelper.InfectedPlate, 'G', ItemsHelper.InfectedGem
			
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedChestplate, 1), new Object[] {
			"PPP", "PGP", "P P", 'P', ItemsHelper.InfectedPlate, 'G', ItemsHelper.InfectedGem
			
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedGem, 1), new Object[] {
			"TTT", "   ", "   ", 'T', ItemsHelper.InfectedShard
			
		});
		
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedStone, 1), new Object[] {
			"TTT", "TTT", "TTT", 'T', ItemsHelper.InfectedGem
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.LagoonStairs, 4), new Object[] {
			"T  ", "TT ", "TTT", 'T', BlocksHelper.LagoonPlanks
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.SludgeStairs, 4), new Object[] {
			"T  ", "TT ", "TTT", 'T', BlocksHelper.SludgePlanks
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.GraniteStairs, 4), new Object[] {
			"T  ", "TT ", "TTT", 'T', BlocksHelper.Granite
			
		});
		
		//Tool Recipe's Infected
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedPickaxe, 1), new Object[] {
			"TTT", " X ", " X ", 'T', ItemsHelper.InfectedStone, 'X', ItemsHelper.InfectedStick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedSpade, 1), new Object[] {
			" T ", " X ", " X ", 'T', ItemsHelper.InfectedStone, 'X', ItemsHelper.InfectedStick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedAxe, 1), new Object[] {
			"TT ", "TX ", " X ", 'T', ItemsHelper.InfectedStone, 'X', ItemsHelper.InfectedStick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedHoe, 1), new Object[] {
			"TT ", " X ", " X ", 'T', ItemsHelper.InfectedStone, 'X', ItemsHelper.InfectedStick
			
		});;
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedPaxcel, 1), new Object[] {
			"TQW", "RER", " X ", 'T', ItemsHelper.InfectedAxe, 'X', ItemsHelper.InfectedStick, 'Q', ItemsHelper.InfectedPickaxe, 'W', ItemsHelper.InfectedSpade, 'E', ItemsHelper.InfectedHoe, 'R', ItemsHelper.InfectedStone
			
		});
		
		//Blocks
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.InfectedBlock, 1), new Object[] {
			"TTT", "TTT", "TTT", 'T', ItemsHelper.InfectedStone
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.InfectedLamp, 1), new Object[] {
			"TTT", "TXT", "TTT", 'T', ItemsHelper.InfectedShard, 'X', Block.glowStone
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.SludgeLamp, 1), new Object[] {
			"TTT", "TXT", "TTT", 'T', ItemsHelper.SludgeShard, 'X', Block.glowStone
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.InfectedBrick, 4), new Object[] {
			"TQT", "QXQ", "TQT", 'T', ItemsHelper.InfectedShard, 'X', Block.brick, 'Q', Block.stoneBrick
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.SludgeBrick, 4), new Object[] {
			"TQT", "QXQ", "TQT", 'T', ItemsHelper.SludgeShard, 'X', Block.brick, 'Q', Block.stoneBrick
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.SludgeRock, 4), new Object[] {
			"XTX", "TXT", "XTX", 'T', ItemsHelper.SludgeShard, 'X', Block.cobblestone
			
		});
		
		//More Items
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.SludgeGem, 1), new Object[] {
			"TTT", "   ", "   ", 'T', ItemsHelper.SludgeShard
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.SludgeStone, 1), new Object[] {
			"TTT", "TTT", "TTT", 'T', ItemsHelper.SludgeStone
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.BookOfInfection, 1), new Object[] {
			"   ", "TT ", "XT ", 'X', ItemsHelper.TaintedPage, 'T', ItemsHelper.TaintedLeather
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.ObsidianStick, 8), new Object[] {
			"   ", "XTX", "XTX", 'T', BlocksHelper.SludgePlanks, 'X', Block.obsidian
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedStick, 4), new Object[] {
			"   ", " T ", " T ", 'T', BlocksHelper.LagoonPlanks
			
		});
		//----------
		
		//Misc
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.CarpetRed, 4), new Object[] {
			"TTT", "XXX", "TTT", 'T', Block.cloth, 'X', Block.plantRed
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.HardWood, 4), new Object[] {
			"TTT", "TTT", "TTT", 'T', Block.planks
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.Tile, 4), new Object[] {
			"TYT", "XTX", "TYT", 'T', Block.stone, 'X', Item.bone, 'Y', Item.coal
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperWhite, 4), new Object[] {
			"TTT", "TTT", "TTT", 'T', Item.paper
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperGreenBottom, 4), new Object[] {
			"   ", "XXX", "TTT", 'T', BlocksHelper.WallPaperWhite, 'X', ItemsHelper.InfectedShard
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperBlueBottom, 4), new Object[] {
			"   ", "XXX", "TTT", 'T', BlocksHelper.WallPaperWhite, 'X', Item.diamond
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperRedBottom, 4), new Object[] {
			"   ", "XXX", "TTT", 'T', BlocksHelper.WallPaperWhite, 'X', Item.redstone
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperYellowBottom, 4), new Object[] {
			"   ", "XXX", "TTT", 'T', BlocksHelper.WallPaperWhite, 'X', Item.goldNugget
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperGreen, 4), new Object[] {
			" X ", "XTX", " X ", 'T', BlocksHelper.WallPaperWhite, 'X', ItemsHelper.InfectedShard
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperBlue, 4), new Object[] {
			" X ", "XTX", " X ", 'T', BlocksHelper.WallPaperWhite, 'X', Item.diamond
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperRed, 4), new Object[] {
			" X ", "XTX", " X ", 'T', BlocksHelper.WallPaperWhite, 'X', Item.redstone
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.WallPaperYellow, 4), new Object[] {
			" X ", "XTX", " X ", 'T', BlocksHelper.WallPaperWhite, 'X', Item.goldNugget
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.Counter, 1), new Object[] {
			"TTT", "XXX", "XXX", 'T', BlocksHelper.Granite, 'X', BlocksHelper.HardWood
			
		});
		GameRegistry.addRecipe(new ItemStack(BlocksHelper.Siding, 4), new Object[] {
			"TTT", "XXX", "TTT", 'T', BlocksHelper.HardWood, 'X', Item.bone
			
		});
		//Weapons
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedSword, 1), new Object[] {
			" T ", " T ", " X ", 'T', ItemsHelper.InfectedStone, 'X', ItemsHelper.InfectedStick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedBattleAxe, 1), new Object[] {
			"TTT", "TXT", " X ", 'T', ItemsHelper.InfectedStone, 'X', ItemsHelper.InfectedStick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.InfectedProd, 1), new Object[] {
			"T T", "TXT", " X ", 'T', ItemsHelper.InfectedStone, 'X', ItemsHelper.InfectedStick
			
		});
		GameRegistry.addRecipe(new ItemStack(ItemsHelper.SludgeKatana, 1), new Object[] {
			" X ", " T ", " T ", 'T', ItemsHelper.ObsidianStick, 'X', ItemsHelper.SludgeStone
			
		});
		
	}

}
