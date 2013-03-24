package ZoneSeek.common;

import net.minecraftforge.common.Configuration;

public class IDsHelper {
	
	//Configuration categories
	public static String blockids = "Block IDs";
	public static String itemids = "Item IDs";
	public static String biomeids = "Biome IDs";
	
	//Biome IDs
	public static int LagoonID;
	public static int SludgeID;

	//Block IDs
	public static int ApophylliteID;
	public static int AxiniteID;
	public static int BetafiteID;
	public static int BrochantiteID;
	public static int CarpetRedID;
	public static int CoconutBlockID;
	public static int CounterID;
	public static int DolomiteID;
	public static int FotiteID;
	public static int GraniteID;
	public static int HardWoodID;
	public static int HeterogeniteID;
	public static int InfectedBlockID;
	public static int InfectedBrickID;
	public static int InfectedLampID;
	public static int InfectedOreID;
	public static int KasoliteID;
	public static int LagoonDirtID;
	public static int LagoonGrassID;
	public static int LagoonLadderID;
	public static int LagoonLeafID;
    public static int LagoonLogID;
    public static int LagoonPlanksID;
    public static int LagoonSaplingID;
    public static int LagoonTallGrassID;
    public static int LagoonVinesID;
    public static int LazuriteID;
    public static int PalmLeafID;
    public static int PalmWoodPlanksID;
    public static int PalmLogID;
    public static int SidingID;
    public static int SludgeBrickID;
    public static int SludgeDirtID;
    public static int SludgeGrassID;
    public static int SludgeLampID;
    public static int SludgeLeafID;
    public static int SludgeLogID;
    public static int SludgeOreID;
    public static int SludgePlanksID;
    public static int SludgeRockID;
    public static int SludgeStoneGroundID;
    public static int SludgeTallGrassID;
    public static int TileID;
    public static int TropicalDirtID;
    public static int TropicalGrassID;
    public static int TropicalTallGrassID;
    public static int WallPaperBlueID;
    public static int WallPaperBlueBottomID;
    public static int WallPaperGreenID;
    public static int WallPaperGreenBottomID;
    public static int WallPaperRedID;
    public static int WallPaperRedBottomID;
    public static int WallPaperWhiteID;
    public static int WallPaperYellowID;
    public static int WallPaperYellowBottomID;
    public static int LagoonStairsID;
    public static int SludgeStairsID;
    public static int GraniteStairsID;
    
    
    

	//Item IDs
	public static int ApophylliteCrystalID;
	public static int AxiniteCrystalID;
	public static int BananaID;
	public static int BetafiteCrystalID;
	public static int BookOfInfectionID;
	public static int BrochantiteCrystalID;
	public static int CoconutChunkID;
	public static int CompactedScaleFragmentID;
	public static int CompactedScalePlateID;
	public static int DolomiteCrystalID;
	public static int DragonFruitID;
	public static int FotiteCrystalID;
	public static int FuzzleChopID;
	public static int HeterogeniteCrystalID;
	public static int InfectedArrowID;
	public static int InfectedAxeID;
	public static int InfectedBattleAxeID;
	public static int InfectedBootsID;
	public static int InfectedBowID;
	public static int InfectedChestplateID;
	public static int InfectedGemID;
	public static int InfectedHelmetID;
	public static int InfectedHoeID;
	public static int InfectedLeggingsID;
	public static int InfectedPaxcelID;
	public static int InfectedPickaxeID;
	public static int InfectedPlateID;
	public static int InfectedProdID;
	public static int InfectedShardID;
	public static int InfectedSpadeID;
	public static int InfectedStickID;
	public static int InfectedStoneID;
	public static int InfectedSwordID;
	public static int KasoliteCrystalID;
	public static int LagoonScaleID;
	public static int LazuriteCrystalID;
	public static int ObsidianStickID;
	public static int PearID;
	public static int PincerScaleID;
	public static int PineappleID;
	public static int PlumID;
	public static int SludgeGemID;
	public static int SludgeKatanaID;
	public static int SludgeShardID;
	public static int SludgeStoneID;
	public static int SlugSlimeID;
	public static int TaintedInkDropID;
	public static int TaintedInkSackID;
	public static int TaintedLeatherID;
	public static int TaintedPageID;
	
	public static void runConfiguration(Configuration config){
		//Biome IDs
		LagoonID = config.get(biomeids, "Lagoon ID", 23).getInt();
		SludgeID = config.get(biomeids, "Sludge ID", 22).getInt();
		
		//Block IDs
		ApophylliteID = config.get(blockids, "Apophyllite ID", 700).getInt();
		AxiniteID = config.get(blockids, "Axinite ID", 701).getInt();
		BetafiteID = config.get(blockids, "Betafite ID", 702).getInt();
		BrochantiteID = config.get(blockids, "Brochantite ID", 703).getInt();
		CarpetRedID = config.get(blockids, "Carpet Red ID", 704).getInt();
		CoconutBlockID = config.get(blockids, "Coconut Block ID", 705).getInt();
		CounterID = config.get(blockids, "Counter ID", 706).getInt();
		DolomiteID = config.get(blockids, "Dolomite ID", 707).getInt();
		FotiteID = config.get(blockids, "Fotite ID", 708).getInt();
		GraniteID = config.get(blockids, "Granite ID", 709).getInt();
		HardWoodID = config.get(blockids, "Hard Wood ID", 710).getInt();
		HeterogeniteID = config.get(blockids, "Heterogenite ID", 711).getInt();
		InfectedBlockID = config.get(blockids, "Infected Block ID", 712).getInt();
		InfectedBrickID = config.get(blockids, "Infected Brick ID", 713).getInt();
		InfectedLampID = config.get(blockids, "Infected Lamp ID", 714).getInt();
		InfectedOreID = config.get(blockids, "Infected Ore ID", 715).getInt();
		KasoliteID = config.get(blockids, "Kasolite ID", 716).getInt();
		LagoonDirtID = config.get(blockids, "Lagoon Dirt ID", 250).getInt();
		LagoonGrassID = config.get(blockids, "Lagoon Grass ID", 251).getInt();
		LagoonLadderID = config.get(blockids, "LagoonLadder ID", 803).getInt();
		LagoonLeafID = config.get(blockids, "Lagoon Leaf ID", 804).getInt();
        LagoonLogID = config.get(blockids, "Lagoon Log ID", 806).getInt();
		LagoonPlanksID = config.get(blockids, "Lagoon Planks ID", 807).getInt();
		LagoonSaplingID = config.get(blockids, "Lagoon Sappling ID", 808).getInt();
		LagoonTallGrassID = config.get(blockids, "Lagoon Tall Grass ID", 170).getInt();
		LagoonVinesID = config.get(blockids, "Lagoon Vines ID", 247).getInt();
		LazuriteID = config.get(blockids, "Lazurite ID", 811).getInt();
		PalmLeafID = config.get(blockids, "Palm Leaf ID", 812).getInt();
		PalmWoodPlanksID = config.get(blockids, "Palm Wood Planks ID", 813).getInt();
		PalmLogID = config.get(blockids, "Palm Log ID", 814).getInt();
		SidingID = config.get(blockids, "Siding ID", 815).getInt();
		SludgeBrickID = config.get(blockids, "Sludge Brick ID", 816).getInt();
		SludgeDirtID = config.get(blockids, "Sludge Dirt ID", 254).getInt();
		SludgeGrassID = config.get(blockids, "Sludge Grass ID", 255).getInt();
		SludgeLampID = config.get(blockids, "Sludge Lamp ID", 819).getInt();
		SludgeLeafID = config.get(blockids, "Sludge Leaf ID", 820).getInt();
		SludgeLogID = config.get(blockids, "Sludge Log ID", 821).getInt();
		SludgeOreID = config.get(blockids, "Sludge Ore ID", 822).getInt();
		SludgePlanksID = config.get(blockids, "Sludge Planks ID", 823).getInt();
		SludgeRockID = config.get(blockids, "Sludge Rock ID", 824).getInt();
		SludgeStoneGroundID = config.get(blockids, "Sludge Stone Ground ID", 171).getInt();
		SludgeTallGrassID = config.get(blockids, "Sludge Tall Grass ID", 253).getInt();
		TileID = config.get(blockids, "Tile ID", 827).getInt();
		TropicalDirtID = config.get(blockids, "Tropical Dirt ID", 828).getInt();
		TropicalGrassID = config.get(blockids, "Tropical Grass ID", 829).getInt();
		WallPaperBlueID = config.get(blockids, "WallPaper Blue ID", 830).getInt();
		WallPaperBlueBottomID = config.get(blockids, "WallPaper Blue Bottom ID", 831).getInt();
		WallPaperGreenID = config.get(blockids, "WallPaper Green ID", 832).getInt();
		WallPaperGreenBottomID = config.get(blockids, "WallPaper Green Bottom ID", 833).getInt();
		WallPaperRedID = config.get(blockids, "WallPaper Red ID", 834).getInt();
		WallPaperRedBottomID = config.get(blockids, "WallPaper Red Bottom ID", 835).getInt();
		WallPaperWhiteID = config.get(blockids, "WallPaper WhiteID", 836).getInt();
		WallPaperYellowID = config.get(blockids, "WallPaper Yellow ID", 837).getInt();
		WallPaperYellowBottomID = config.get(blockids, "WallPaper Yellow Bottom ID", 838).getInt();
		TropicalTallGrassID = config.get(blockids, "Tropical Tall Grass ID", 839).getInt();
		LagoonStairsID = config.get(blockids, "Lagoon Stairs ID", 840).getInt();
		SludgeStairsID = config.get(blockids, "Sludge Stairs ID", 841).getInt();
		GraniteStairsID = config.get(blockids, "Granite Stairs ID", 842).getInt();
		
		//Item IDs
		ApophylliteCrystalID = config.get(itemids, "Apophyllite Crystal ID", 1000).getInt();
		AxiniteCrystalID = config.get(itemids, "Axinite Crystal ID", 1001).getInt();
		BananaID = config.get(itemids, "Banana ID", 1002).getInt();
		BetafiteCrystalID = config.get(itemids, "Betafite Crystal ID", 1003).getInt();
		BookOfInfectionID = config.get(itemids, "Book Of Infection", 1004).getInt();
		BrochantiteCrystalID = config.get(itemids, "Brochantite Crystal ID", 1005).getInt();
		CoconutChunkID = config.get(itemids, "Coconut Chunk ID", 1006).getInt();
		CompactedScaleFragmentID = config.get(itemids, "Compacted Scale Fragment ID", 1007).getInt();
		CompactedScalePlateID = config.get(itemids, "Compacted Scale Plate ID", 1008).getInt();
		DolomiteCrystalID = config.get(itemids, "Dolomite Crystal ID", 1009).getInt();
		DragonFruitID = config.get(itemids, "Dragon Fruit ID", 1010).getInt();
		FotiteCrystalID = config.get(itemids, "Fotite Crystal ID", 1011).getInt();
		FuzzleChopID = config.get(itemids, "Fuzzle Chop ID", 1012).getInt();
		HeterogeniteCrystalID = config.get(itemids, "Heterogenite Crystal ID", 1013).getInt();
		InfectedArrowID = config.get(itemids, "Infected Arrow ID", 1014).getInt();
		InfectedAxeID = config.get(itemids, "Infected Axe ID", 1015).getInt();
		InfectedBattleAxeID = config.get(itemids, "Infected Battle Axe ID", 1016).getInt();
		InfectedBootsID = config.get(itemids, "Infected Boots ID", 1017).getInt();
		InfectedBowID = config.get(itemids, "Infected Bow ID", 1018).getInt();
		InfectedChestplateID = config.get(itemids, "Infected Chestplate ID", 1019).getInt();
		InfectedGemID = config.get(itemids, "Infected Gem ID", 1020).getInt();
		InfectedHelmetID = config.get(itemids, "Infected Helmet ID", 1021).getInt();
		InfectedHoeID = config.get(itemids, "Infected Leggings ID", 1022).getInt();
		InfectedPaxcelID = config.get(itemids, "Infected Paxcel ID", 1023).getInt();
		InfectedPickaxeID = config.get(itemids, "Infected Pickaxe ID", 1024).getInt();
		InfectedPlateID = config.get(itemids, "Infected Plate ID", 1025).getInt();
		InfectedProdID = config.get(itemids, "Infected Prod ID", 1026).getInt();
		InfectedShardID = config.get(itemids, "Infected Shard ID", 1027).getInt();
		InfectedSpadeID = config.get(itemids, "Infected Spade ID", 1028).getInt();
		InfectedStickID = config.get(itemids, "Infected Stick ID", 1029).getInt();
		InfectedStoneID = config.get(itemids, "Infected Stone ID", 1030).getInt();
		InfectedSwordID = config.get(itemids, "Infected Sword ID", 1031).getInt();
		KasoliteCrystalID = config.get(itemids, "Kasolite Crystal ID", 1032).getInt();
		LagoonScaleID = config.get(itemids, "Lagoon Scale ID", 1033).getInt();
		LazuriteCrystalID = config.get(itemids, "LazuriteCrystalID", 1034).getInt();
		ObsidianStickID = config.get(itemids, "Obsidian Stick ID", 1035).getInt();
		PearID = config.get(itemids, "Pear ID", 1036).getInt();
		PincerScaleID = config.get(itemids, "Pincer Scale ID", 1037).getInt();
		PineappleID = config.get(itemids, "Pineapple ID", 1038).getInt();
		PlumID = config.get(itemids, "Plum ID", 1039).getInt();
		SludgeKatanaID = config.get(itemids, "Sludge Katana ID", 1040).getInt();
		SludgeShardID = config.get(itemids, "Sludge Shard ID", 1041).getInt();
		SludgeStoneID = config.get(itemids, "Sludge Stone ID", 1042).getInt();
		SlugSlimeID = config.get(itemids, "Slug Slime ID", 1043).getInt();
		TaintedInkDropID = config.get(itemids, "Tainted Ink Drop ID", 1044).getInt();
		TaintedInkSackID = config.get(itemids, "Tainted Ink Sack ID", 1045).getInt();
		TaintedLeatherID = config.get(itemids, "Tainted Leather ID", 1046).getInt();
		TaintedPageID = config.get(itemids, "Tainted Page ID", 1047).getInt();
		
		
	}
	
}