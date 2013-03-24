package ZoneSeek.common.blocks;


import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import ZoneSeek.ZoneSeekArmor;
import ZoneSeek.ZoneSeekBlocks;
import ZoneSeek.ZoneSeekFood;
import ZoneSeek.ZoneSeekItems;
import ZoneSeek.ZoneSeekMaterials;
import ZoneSeek.ZoneSeekTools;
import ZoneSeek.ZoneSeekWeapons;
import ZoneSeek.common.IDsHelper;
import ZoneSeek.common.ZoneSeek;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlocksHelper {

	//Blocks
	public static Block Apophyllite;
	public static Block Axinite;
	public static Block Betafite;
	public static Block Brochantite;
	public static Block CarpetRed;
	public static Block CoconutBlock;
	public static Block Counter;
	public static Block Dolomite;
	public static Block Fotite;
	public static Block Granite;
	public static Block HardWood;
	public static Block Heterogenite;
	public static Block InfectedBlock;
	public static Block InfectedBrick;
	public static Block InfectedLamp;
	public static Block InfectedOre;
	public static Block Kasolite;
	public static Block LagoonDirt;
	public static Block LagoonGrass;
	public static Block LagoonLadder;
	public static Block LagoonLeaf;
    public static Block LagoonLog;
    public static Block LagoonPlanks;
    public static Block LagoonSapling;
    public static Block LagoonTallGrass;
    public static Block LagoonVines;
    public static Block Lazurite;
    public static Block PalmLeaf;
    public static Block PalmWoodPlanks;
    public static Block PalmLog;
    public static Block Siding;
    public static Block SludgeBrick;
    public static Block SludgeDirt;
    public static Block SludgeGrass;
    public static Block SludgeLamp;
    public static Block SludgeLeaf;
    public static Block SludgeLog;
    public static Block SludgeOre;
    public static Block SludgePlanks;
    public static Block SludgeRock;
    public static Block SludgeStoneGround;
    public static Block SludgeTallGrass;
    public static Block Tile;
    public static Block TropicalDirt;
    public static Block TropicalGrass;
    public static Block TropicalTallGrass;
    public static Block WallPaperBlue;
    public static Block WallPaperBlueBottom;
    public static Block WallPaperGreen;
    public static Block WallPaperGreenBottom;
    public static Block WallPaperRed;
    public static Block WallPaperRedBottom;
    public static Block WallPaperWhite;
    public static Block WallPaperYellow;
    public static Block WallPaperYellowBottom;
    public static Block LagoonStairs;
    public static Block SludgeStairs;
    public static Block GraniteStairs;

	public static void setupBlocks() {
		
		//Ores
		Apophyllite = new BlockOre(IDsHelper.ApophylliteID, "Apophyllite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Apophyllite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Axinite = new BlockOre(IDsHelper.AxiniteID, "Axinite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Axinite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Betafite = new BlockOre(IDsHelper.BetafiteID, "Betafite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Betafite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Brochantite = new BlockOre(IDsHelper.BrochantiteID, "Brochantite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Brochantite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Dolomite = new BlockOre(IDsHelper.DolomiteID, "Dolomite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Dolomite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Fotite = new BlockOre(IDsHelper.FotiteID, "Fotite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Fotite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Granite = new BlockOre(IDsHelper.GraniteID, "Granite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Granite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Heterogenite = new BlockOre(IDsHelper.HeterogeniteID, "Heterogenite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Heterogenite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		InfectedOre = new BlockInfectedOre(IDsHelper.InfectedOreID, "InfectedOre").setHardness(10F).setResistance(0.2F).setUnlocalizedName("InfectedOre").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Kasolite = new BlockOre(IDsHelper.KasoliteID, "Kasolite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Kasolite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Lazurite = new BlockOre(IDsHelper.LazuriteID, "Lazurite").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Lazurite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeOre = new BlockOre(IDsHelper.SludgeOreID, "SludgeOre").setHardness(10F).setResistance(0.2F).setUnlocalizedName("SludgeOre").setCreativeTab(ZoneSeek.ZoneSeekBlocks);

		//Normal Blocks Wood
		CarpetRed = new BlockWood(IDsHelper.CarpetRedID, "CarpetRed").setHardness(12F).setResistance(10F).setUnlocalizedName("CarpetRed").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		CoconutBlock = new BlockWood(IDsHelper.CoconutBlockID, "CoconutBlock").setHardness(12F).setResistance(10F).setUnlocalizedName("CoconutBlock").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		HardWood = new BlockWood(IDsHelper.HardWoodID, "HardWood").setHardness(12F).setResistance(10F).setUnlocalizedName("HardWood").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		LagoonPlanks = new BlockWood(IDsHelper.LagoonPlanksID, "LagoonPlanks").setHardness(12F).setResistance(10F).setUnlocalizedName("LagoonPlanks").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		PalmWoodPlanks = new BlockWood(IDsHelper.PalmWoodPlanksID, "PalmWoodPlanks").setHardness(12F).setResistance(10F).setUnlocalizedName("PalmWoodPlanks").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Siding = new BlockWood(IDsHelper.SidingID, "Siding").setHardness(12F).setResistance(10F).setUnlocalizedName("Siding").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgePlanks = new BlockWood(IDsHelper.SludgePlanksID, "SludgePlanks").setHardness(12F).setResistance(10F).setUnlocalizedName("SludgePlanks").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		
		//WallPaper
		WallPaperBlue = new BlockWallPaperBlue(IDsHelper.WallPaperBlueID).setHardness(12F).setResistance(10F).setUnlocalizedName("WallPaperBlue").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperBlueBottom = new BlockWallPaperBlueB(IDsHelper.WallPaperBlueBottomID).setHardness(12F).setResistance(10F).setUnlocalizedName("WallPaperBlueBottom").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperGreen = new BlockWallPaperGreen(IDsHelper.WallPaperGreenID).setHardness(12F).setResistance(10F).setUnlocalizedName("WallPaperGreen").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperGreenBottom = new BlockWallPaperGreenB(IDsHelper.WallPaperGreenBottomID).setHardness(12F).setResistance(10F).setUnlocalizedName("WallPaperGreenBottom").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperRed = new BlockWallPaperRed(IDsHelper.WallPaperRedID).setHardness(12F).setResistance(10F).setUnlocalizedName("WallPaperRed").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperRedBottom = new BlockWallPaperRedB(IDsHelper.WallPaperRedBottomID).setHardness(12F).setResistance(10F).setUnlocalizedName("WallPaperRedBottom").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperWhite = new BlockWallPaperWhite(IDsHelper.WallPaperWhiteID).setHardness(12F).setResistance(10F).setUnlocalizedName("WallPaperWhite").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperYellow = new BlockWallPaperYellow(IDsHelper.WallPaperYellowID).setHardness(12F).setResistance(10F).setUnlocalizedName("WallPaperYellow").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		WallPaperYellowBottom = new BlockWallPaperYellowB(IDsHelper.WallPaperYellowBottomID).setHardness(12F).setResistance(10F).setUnlocalizedName("WallPaperYellowBottom").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		
		//Normal Blocks Stone
		Counter = new BlockStone(IDsHelper.CounterID, "Counter").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Counter").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		InfectedBlock = new BlockStone(IDsHelper.InfectedBlockID, "InfectedBlock").setHardness(10F).setResistance(0.2F).setUnlocalizedName("InfectedBlock").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		InfectedBrick = new BlockStone(IDsHelper.InfectedBrickID, "InfectedBrick").setHardness(10F).setResistance(0.2F).setUnlocalizedName("InfectedBrick").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeBrick = new BlockStone(IDsHelper.SludgeBrickID, "SludgeBrick").setHardness(10F).setResistance(0.2F).setUnlocalizedName("SludgeBrick").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeRock = new BlockStone(IDsHelper.SludgeRockID, "SludgeRock").setHardness(10F).setResistance(0.2F).setUnlocalizedName("SludgeRock").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeStoneGround = new BlockStone(IDsHelper.SludgeStoneGroundID, "SludgeStoneGround").setHardness(10F).setResistance(0.2F).setUnlocalizedName("SludgeStoneGround").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		Tile = new BlockStone(IDsHelper.TileID, "Tile").setHardness(10F).setResistance(0.2F).setUnlocalizedName("Tile").setCreativeTab(ZoneSeek.ZoneSeekBlocks);

		//Normal Blocks Ground
		LagoonDirt = new BlockGround(IDsHelper.LagoonDirtID, "LagoonDirt").setHardness(10F).setResistance(0.2F).setUnlocalizedName("LagoonDirt").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeDirt = new BlockGround(IDsHelper.SludgeDirtID, "SludgeDirt").setHardness(10F).setResistance(0.2F).setUnlocalizedName("SludgeDirt").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		TropicalDirt = new BlockGround(IDsHelper.TropicalDirtID, "TropicalDirt").setHardness(10F).setResistance(0.2F).setUnlocalizedName("TropicalDirt").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		
		//Normal Blocks Lamp
		InfectedLamp = new BlockLamp(IDsHelper.InfectedLampID, "InfectedLamp").setHardness(10F).setResistance(0.2F).setUnlocalizedName("InfectedLamp").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeLamp = new BlockLamp(IDsHelper.SludgeLampID, "SludgeLamp").setHardness(10F).setResistance(0.2F).setUnlocalizedName("SludgeLamp").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		
		//Special Blocks
		LagoonLadder = new BlockLagoonLadder(IDsHelper.LagoonLadderID, "LagoonLadder").setHardness(12F).setResistance(10F).setUnlocalizedName("LagoonLadder").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		
		//Biome Blocks
		LagoonGrass = new BlockLagoonGrass(IDsHelper.LagoonGrassID).setHardness(10F).setResistance(0.2F).setUnlocalizedName("LagoonGrass").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		LagoonLeaf = new BlockLagoonLeaf(IDsHelper.LagoonLeafID).setHardness(10F).setResistance(0.2F).setUnlocalizedName("LagoonLeaf").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		LagoonLog = new BlockLagoonLog(IDsHelper.LagoonLogID).setHardness(10F).setResistance(0.2F).setUnlocalizedName("LagoonLog").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		LagoonSapling = new BlockLagoonSapling(IDsHelper.LagoonSaplingID).setHardness(10F).setResistance(0.2F).setUnlocalizedName("LagoonSapling").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		LagoonTallGrass = new BlockLagoonTallGrass(IDsHelper.LagoonTallGrassID).setHardness(10F).setResistance(0.2F).setUnlocalizedName("LagoonTallGrass").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		LagoonVines = new BlockLagoonVines(IDsHelper.LagoonVinesID).setHardness(10F).setResistance(0.2F).setUnlocalizedName("LagoonVines").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		PalmLeaf = new BlockPalmLeaf(IDsHelper.PalmLeafID).setHardness(10F).setResistance(0.2F).setUnlocalizedName("PalmLeaf").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		PalmLog = new BlockPalmLog(IDsHelper.PalmLogID).setHardness(10F).setResistance(0.2F).setUnlocalizedName("PalmLog").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeGrass = new BlockSludgeGrass(IDsHelper.SludgeGrassID).setHardness(10F).setResistance(0.2F).setUnlocalizedName("SludgeGrass").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeLeaf = new BlockSludgeLeaf(IDsHelper.SludgeLeafID).setHardness(10F).setResistance(0.2F).setUnlocalizedName("SludgeLeaf").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeLog = new BlockSludgeLog(IDsHelper.SludgeLogID).setHardness(10F).setResistance(0.2F).setUnlocalizedName("SludgeLog").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeTallGrass = new BlockSludgeTallGrass(IDsHelper.SludgeTallGrassID).setHardness(10F).setResistance(0.2F).setUnlocalizedName("SludgeTallGrass").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		TropicalGrass = new BlockTropicalGrass(IDsHelper.TropicalGrassID).setHardness(10F).setResistance(0.2F).setUnlocalizedName("TropicalGrass").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		TropicalTallGrass = new BlockTropicalTallGrass(IDsHelper.TropicalTallGrassID).setHardness(10F).setResistance(0.2F).setUnlocalizedName("TropicalTallGrass").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		
		//Stairs
		LagoonStairs = new BlockLagoonStairs(IDsHelper.LagoonStairsID, BlocksHelper.LagoonPlanks, 0).setUnlocalizedName("LagoonStairs").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		SludgeStairs = new BlockSludgeStairs(IDsHelper.SludgeStairsID, BlocksHelper.SludgePlanks, 0).setUnlocalizedName("SludgeStairs").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		GraniteStairs = new BlockGraniteStairs(IDsHelper.GraniteStairsID, BlocksHelper.Granite, 0).setUnlocalizedName("GraniteStairs").setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		
		//Machines
		//geothermalOven = new BlockLavaFurnace(IDsHelper.lavafurnaceID, "LavaFurnaceFront").setHardness(2.5F).setResistance(22F).setUnlocalizedName("geothermaloven").setStepSound(Block.soundStoneFootstep).setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		//geothermalOvenActive = new BlockLavaFurnace(IDsHelper.lavafurnaceID + 1, "LavaFurnaceFrontRunning").setHardness(2.5F).setResistance(22F).setUnlocalizedName("geothermaloven1").setStepSound(Block.soundStoneFootstep).setLightValue(0.3F);
		//researcher = new BlockResearcher(IDsHelper.researcherID, "ResearcherTop", "ResearcherSide").setUnlocalizedName("researcher").setHardness(2.5F).setResistance(10F).setCreativeTab(ZoneSeek.ZoneSeekBlocks).setStepSound(Block.soundMetalFootstep);
		//logger = new BlockLogger(IDsHelper.loggerID, "LoggerFront", "LoggerSide").setUnlocalizedName("logger").setHardness(1.2F).setStepSound(Block.soundWoodFootstep).setCreativeTab(ZoneSeek.ZoneSeekBlocks);
		//loggeractive = new BlockLogger(IDsHelper.loggerID + 10, "LoggerFrontRunning", "LoggerSide").setUnlocalizedName("logger").setHardness(1.2F).setStepSound(Block.soundWoodFootstep);
		
		MinecraftForge.setBlockHarvestLevel(InfectedOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(Granite, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(SludgeOre, "pickaxe", 2);
		
		gameRegisters();
		languageRegisters();
	}

	private static void gameRegisters() {
		//Block Registry
		GameRegistry.registerBlock(InfectedOre, "AdamBahr_InfectedOre");
		GameRegistry.registerBlock(InfectedBlock, "AdamBahr_InfectedBlock");
		GameRegistry.registerBlock(InfectedLamp, "AdamBahr_InfectedLamp");
		GameRegistry.registerBlock(InfectedBrick, "AdamBahr_InfectedBrick");
		GameRegistry.registerBlock(LagoonLog, "AdamBahr_LagoonLog");
		GameRegistry.registerBlock(LagoonPlanks, "AdamBahr_LagoonPlanks");
		GameRegistry.registerBlock(LagoonSapling, "AdamBahr_LagoonSapling");
		GameRegistry.registerBlock(LagoonLeaf, "AdamBahr_LagoonLeaf");
		GameRegistry.registerBlock(LagoonDirt, "AdamBahr_LagoonDirt");
		GameRegistry.registerBlock(LagoonGrass, "AdamBahr_LagoonGrass");
		GameRegistry.registerBlock(LagoonTallGrass, "AdamBahr_LagoonTallGrass");
		GameRegistry.registerBlock(SludgeTallGrass, "AdamBahr_SludgeTallGrass");
		GameRegistry.registerBlock(LagoonVines, "AdamBahr_LagoonVines");
		GameRegistry.registerBlock(SludgeOre, "AdamBahr_SludgeOre");
		GameRegistry.registerBlock(SludgeBrick, "AdamBahr_SludgeBrick");
		GameRegistry.registerBlock(SludgeLog, "AdamBahr_Log");
		GameRegistry.registerBlock(SludgePlanks, "AdamBahr_SludgePlanks");
		GameRegistry.registerBlock(SludgeDirt, "AdamBahr_SludgeDirt");
		GameRegistry.registerBlock(SludgeGrass, "AdamBahr_SludgeGrass");
		GameRegistry.registerBlock(SludgeLamp, "AdamBahr_SludgeLamp");
		GameRegistry.registerBlock(SludgeRock, "AdamBahr_SludgeRock");
		GameRegistry.registerBlock(SludgeLeaf, "AdamBahr_SludgeLeaf");
		GameRegistry.registerBlock(CarpetRed, "AdamBahr_CarpetRed");
		GameRegistry.registerBlock(HardWood, "AdamBahr_HardWood");
		GameRegistry.registerBlock(Tile, "AdamBahr_Tile");
		GameRegistry.registerBlock(WallPaperWhite, "AdamBahr_WallPaperWhite");
		GameRegistry.registerBlock(WallPaperGreenBottom, "AdamBahr_WallPaperBottomGreen");
		GameRegistry.registerBlock(WallPaperBlueBottom, "AdamBahr_WallPaperBottomBlue");
		GameRegistry.registerBlock(WallPaperRedBottom, "AdamBahr_WallPaperBottomRed");
		GameRegistry.registerBlock(WallPaperYellowBottom, "AdamBahr_WallPaperBottomYellow");
		GameRegistry.registerBlock(WallPaperGreen, "AdamBahr_WallPaperGreen");
		GameRegistry.registerBlock(WallPaperBlue, "AdamBahr_WallPaperBlue");
		GameRegistry.registerBlock(WallPaperRed, "AdamBahr_WallPaperRed");
		GameRegistry.registerBlock(WallPaperYellow, "AdamBahr_WallPaperYellow");
		GameRegistry.registerBlock(Siding, "AdamBahr_Siding");
		GameRegistry.registerBlock(Granite, "AdamBahr_Granite");
		GameRegistry.registerBlock(Counter, "AdamBahr_Counter");
		GameRegistry.registerBlock(Apophyllite, "AdamBahr_Apophyllite");
		GameRegistry.registerBlock(Axinite, "AdamBahr_Axinite");
		GameRegistry.registerBlock(Betafite, "AdamBahr_Betafite");
		GameRegistry.registerBlock(Brochantite, "AdamBahr_Brochantite");
		GameRegistry.registerBlock(CoconutBlock, "AdamBahr_CoconutBlock");
		GameRegistry.registerBlock(Dolomite, "AdamBahr_Dolomite");
		GameRegistry.registerBlock(Fotite, "AdamBahr_Fotite");
		GameRegistry.registerBlock(Heterogenite, "AdamBahr_Heterogenite");
		GameRegistry.registerBlock(Kasolite, "AdamBahr_Kasolite");
		GameRegistry.registerBlock(Lazurite, "AdamBahr_Lazurite");
		GameRegistry.registerBlock(PalmLeaf, "AdamBahr_PalmLeaf");
		GameRegistry.registerBlock(PalmWoodPlanks, "AdamBahr_PalmWoodPlanks");
		GameRegistry.registerBlock(PalmLog, "AdamBahr_PalmLog");
		GameRegistry.registerBlock(SludgeStoneGround, "AdamBahr_SludgeStoneGround");
		GameRegistry.registerBlock(TropicalDirt, "AdamBahr_TropicalDirt");
		GameRegistry.registerBlock(TropicalGrass, "AdamBahr_TropicalGrass");
		GameRegistry.registerBlock(TropicalTallGrass, "AdamBahr_TropicalTallGrass");
		GameRegistry.registerBlock(LagoonStairs, "AdamBahr_LagoonStairs");
		GameRegistry.registerBlock(SludgeStairs, "AdamBahr_SludgeStairs");
		GameRegistry.registerBlock(GraniteStairs, "AdamBahr_GraniteStairs");
	}
	
	private static void languageRegisters() {
		//Blocks
		LanguageRegistry.addName(SludgeOre, "Sludge Ore");
		LanguageRegistry.addName(SludgeBrick, "Sludge Brick");
		LanguageRegistry.addName(SludgeLog, "Sludge Log");
		LanguageRegistry.addName(SludgePlanks, "Sludge Planks");
		LanguageRegistry.addName(SludgeDirt, "Sludge Dirt");
		LanguageRegistry.addName(SludgeGrass, "Sludge Grass");
		LanguageRegistry.addName(SludgeLamp, "Sludge Lamp");
		LanguageRegistry.addName(SludgeRock, "Sludge Rock");
		LanguageRegistry.addName(SludgeLeaf, "Sludge Leaf");
		LanguageRegistry.addName(CarpetRed, "Red Carpet");
		LanguageRegistry.addName(HardWood, "Hard Wood");
		LanguageRegistry.addName(Tile, "Tile");
		LanguageRegistry.addName(WallPaperWhite, "Wallpaper White");
		LanguageRegistry.addName(WallPaperGreenBottom, "Wallpaper Bottom Green");
		LanguageRegistry.addName(WallPaperBlueBottom, "Wallpaper Bottom Blue");
		LanguageRegistry.addName(WallPaperRedBottom, "Wallpaper Bottom Red");
		LanguageRegistry.addName(WallPaperYellowBottom, "Wallpaper Bottom Yellow");
		LanguageRegistry.addName(WallPaperGreen, "Wallpaper Green");
		LanguageRegistry.addName(WallPaperBlue, "Wallpaper Blue");
		LanguageRegistry.addName(WallPaperRed, "Wallpaper Red");
		LanguageRegistry.addName(WallPaperYellow, "Wallpaper Yellow");
		LanguageRegistry.addName(Siding, "Siding");
		LanguageRegistry.addName(Granite, "Granite");
		LanguageRegistry.addName(Counter, "Granite Counter");
		LanguageRegistry.addName(Apophyllite, "Apophyllite");
		LanguageRegistry.addName(Axinite, "Axinite");
		LanguageRegistry.addName(Betafite, "Betafite");
		LanguageRegistry.addName(Brochantite, "Brochantite");
		LanguageRegistry.addName(CoconutBlock, "Coconut Block");
		LanguageRegistry.addName(Dolomite, "Dolomite");
		LanguageRegistry.addName(Fotite, "Fotite");
		LanguageRegistry.addName(Heterogenite, "Heterogenite");
		LanguageRegistry.addName(Kasolite, "Kasolite");
		LanguageRegistry.addName(Lazurite, "Lazurite");
		LanguageRegistry.addName(PalmLeaf, "PalmLeaf");
		LanguageRegistry.addName(PalmWoodPlanks, "Palm Wood Planks");
		LanguageRegistry.addName(PalmLog, "PalmLog");
		LanguageRegistry.addName(SludgeStoneGround, "Sludge Stone Ground");
		LanguageRegistry.addName(TropicalDirt, "Tropical Dirt");
		LanguageRegistry.addName(TropicalGrass, "Tropical Grass");
		LanguageRegistry.addName(TropicalTallGrass, "Tropical Tall Grass");
		LanguageRegistry.addName(LagoonStairs, "Lagoon Stairs");
		LanguageRegistry.addName(SludgeStairs, "Sludge Stairs");
		LanguageRegistry.addName(GraniteStairs, "Granite Stairs");
	}

}