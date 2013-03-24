package ZoneSeek.common.items;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.EnumHelper;
import ZoneSeek.client.ClientProxyZoneSeek;
import ZoneSeek.common.CommonProxyZoneSeek;
import ZoneSeek.common.IDsHelper;
import ZoneSeek.common.ZoneSeek;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemsHelper{
	
	@SidedProxy(clientSide = "ZoneSeek.client.ClientProxyZoneSeek", serverSide = "ZoneSeek.common.CommonProxyZoneSeek")
	public static CommonProxyZoneSeek proxy;

	//Items
	public static Item ApophylliteCrystal;
	public static Item AxiniteCrystal;
	public static Item Banana;
	public static Item BetafiteCrystal;
	public static Item BookOfInfection;
	public static Item BrochantiteCrystal;
	public static Item CoconutChunk;
	public static Item CompactedScaleFragment;
	public static Item CompactedScalePlate;
	public static Item DolomiteCrystal;
	public static Item DragonFruit;
	public static Item FotiteCrystal;
	public static Item FuzzleChop;
	public static Item HeterogeniteCrystal;
	public static Item InfectedArrow;
	public static Item InfectedAxe;
	public static Item InfectedBattleAxe;
	public static Item InfectedBoots;
	public static Item InfectedBow;
	public static Item InfectedChestplate;
	public static Item InfectedGem;
	public static Item InfectedHelmet;
	public static Item InfectedHoe;
	public static Item InfectedLeggings;
	public static Item InfectedPaxcel;
	public static Item InfectedPickaxe;
	public static Item InfectedPlate;
	public static Item InfectedProd;
	public static Item InfectedShard;
	public static Item InfectedSpade;
	public static Item InfectedStick;
	public static Item InfectedStone;
	public static Item InfectedSword;
	public static Item KasoliteCrystal;
	public static Item LagoonScale;
	public static Item LazuriteCrystal;
	public static Item ObsidianStick;
	public static Item Pear;
	public static Item PincerScale;
	public static Item Pineapple;
	public static Item Plum;
	public static Item SludgeGem;
	public static Item SludgeKatana;
	public static Item SludgeShard;
	public static Item SludgeStone;
	public static Item SlugSlime;
	public static Item TaintedInkDrop;
	public static Item TaintedInkSack;
	public static Item TaintedLeather;
	public static Item TaintedPage;
	
	public static void setupItems() {
		//Materials
		EnumToolMaterial InfectedMaterial = EnumHelper.addToolMaterial("Infected Material", 3, 4000, 7.0F, 2, 20);
		EnumToolMaterial SludgeMaterial = EnumHelper.addToolMaterial("Sludge Material", 3, 4500, 7.5F, 3, 20);
		EnumArmorMaterial InfectedArmorMaterial = EnumHelper.addArmorMaterial("Infected Armor", 33, new int[] {2, 6, 6, 5}, 16);
		
		//Item Loading
		ApophylliteCrystal = new ItemCrystal(IDsHelper.ApophylliteCrystalID).setCreativeTab(ZoneSeek.ZoneSeekMaterials).setUnlocalizedName("ApophylliteCrystal");
		AxiniteCrystal = new ItemCrystal(IDsHelper.AxiniteCrystalID).setCreativeTab(ZoneSeek.ZoneSeekMaterials).setUnlocalizedName("AxiniteCrystal");
		Banana = new ItemBanana(IDsHelper.BananaID, 2, 2.0F, false).setCreativeTab(ZoneSeek.ZoneSeekFood).setUnlocalizedName("Banana");
		BetafiteCrystal = new ItemCrystal(IDsHelper.BetafiteCrystalID).setCreativeTab(ZoneSeek.ZoneSeekMaterials).setUnlocalizedName("BetafiteCrystal");
		BookOfInfection = new ItemBookOfInfecteion(IDsHelper.BookOfInfectionID).setCreativeTab(ZoneSeek.ZoneSeekItems).setUnlocalizedName("BookOfInfectione");
		BrochantiteCrystal = new ItemCrystal(IDsHelper.BrochantiteCrystalID).setCreativeTab(ZoneSeek.ZoneSeekMaterials).setUnlocalizedName("BrochantiteCrystal");
		CoconutChunk = new ItemCoconutChunk(IDsHelper.CoconutChunkID, 2, 2.0F, false).setCreativeTab(ZoneSeek.ZoneSeekFood).setUnlocalizedName("CoconutChunk");
		CompactedScaleFragment = new ItemMisc(IDsHelper.CompactedScaleFragmentID).setCreativeTab(ZoneSeek.ZoneSeekItems).setUnlocalizedName("CompactedScaleFragment");
		CompactedScalePlate = new ItemMisc(IDsHelper.CompactedScalePlateID).setCreativeTab(ZoneSeek.ZoneSeekItems).setUnlocalizedName("CompactedScalePlate");
		DolomiteCrystal = new ItemCrystal(IDsHelper.DolomiteCrystalID).setCreativeTab(ZoneSeek.ZoneSeekMaterials).setUnlocalizedName("DolomiteCrystal");
		DragonFruit = new ItemDragonFruit(IDsHelper.DragonFruitID, 2, 2.0F, false).setCreativeTab(ZoneSeek.ZoneSeekFood).setUnlocalizedName("DragonFruit");
		FotiteCrystal = new ItemCrystal(IDsHelper.FotiteCrystalID).setCreativeTab(ZoneSeek.ZoneSeekMaterials).setUnlocalizedName("FotiteCrystal");
		FuzzleChop = new ItemFuzzleChop(IDsHelper.FuzzleChopID, 2, 5.0F, false).setCreativeTab(ZoneSeek.ZoneSeekFood).setUnlocalizedName("FuzzleChop");
		HeterogeniteCrystal = new ItemCrystal(IDsHelper.HeterogeniteCrystalID).setCreativeTab(ZoneSeek.ZoneSeekMaterials).setUnlocalizedName("HeterogeniteCrystal");
		InfectedArrow = new ItemInfectedArrow(IDsHelper.InfectedArrowID).setCreativeTab(ZoneSeek.ZoneSeekWeapons).setUnlocalizedName("InfectedArrow");
		InfectedAxe = new ItemInfectedAxe(IDsHelper.InfectedAxeID, InfectedMaterial).setCreativeTab(ZoneSeek.ZoneSeekTools).setUnlocalizedName("InfectedAxe");
		InfectedBattleAxe = new ItemBattleAxe(IDsHelper.InfectedBattleAxeID, InfectedMaterial).setCreativeTab(ZoneSeek.ZoneSeekWeapons).setUnlocalizedName("InfectedBattleAxe");
		InfectedBoots = new ItemInfectedArmor(IDsHelper.InfectedBootsID, InfectedArmorMaterial, proxy.addArmor("Infected"), 0, "infectedboots").setCreativeTab(ZoneSeek.ZoneSeekArmor).setUnlocalizedName("InfectedBoots");
		InfectedBow = new ItemInfectedBow(IDsHelper.InfectedBowID).setCreativeTab(ZoneSeek.ZoneSeekWeapons).setUnlocalizedName("InfectedBow");
		InfectedChestplate = new ItemInfectedArmor(IDsHelper.InfectedChestplateID, InfectedArmorMaterial, proxy.addArmor("Infected"), 0, "infectedchestplate").setCreativeTab(ZoneSeek.ZoneSeekArmor).setUnlocalizedName("InfectedChestplate");
		InfectedGem = new ItemMisc(IDsHelper.InfectedGemID).setCreativeTab(ZoneSeek.ZoneSeekMaterials).setUnlocalizedName("InfectedGem");
		InfectedHelmet = new ItemInfectedArmor(IDsHelper.InfectedHelmetID, InfectedArmorMaterial, proxy.addArmor("Infected"), 0, "infectedhelmet").setCreativeTab(ZoneSeek.ZoneSeekArmor).setUnlocalizedName("InfectedHelmet");
		InfectedHoe = new ItemInfectedHoe(IDsHelper.InfectedHoeID, InfectedMaterial).setCreativeTab(ZoneSeek.ZoneSeekTools).setUnlocalizedName("InfectedHoe");
		InfectedLeggings = new ItemInfectedArmor(IDsHelper.InfectedLeggingsID, InfectedArmorMaterial, proxy.addArmor("Infected"), 0, "infectedleggings").setCreativeTab(ZoneSeek.ZoneSeekArmor).setUnlocalizedName("InfectedLeggings");
		InfectedPaxcel = new ItemInfectedPaxcel(IDsHelper.InfectedPaxcelID, InfectedMaterial).setCreativeTab(ZoneSeek.ZoneSeekTools).setUnlocalizedName("InfectedPaxcel");
		InfectedPickaxe = new ItemInfectedPickaxe(IDsHelper.InfectedPickaxeID, InfectedMaterial).setCreativeTab(ZoneSeek.ZoneSeekTools).setUnlocalizedName("InfectedPickaxe");
		InfectedPlate = new ItemMisc(IDsHelper.InfectedPlateID).setCreativeTab(ZoneSeek.ZoneSeekItems).setUnlocalizedName("InfectedPlate");
		InfectedProd = new ItemInfectedProd(IDsHelper.InfectedProdID, InfectedMaterial).setCreativeTab(ZoneSeek.ZoneSeekWeapons).setUnlocalizedName("InfectedProd");
		InfectedShard = new ItemMisc(IDsHelper.InfectedShardID).setCreativeTab(ZoneSeek.ZoneSeekMaterials).setUnlocalizedName("InfectedShard");
		InfectedSpade = new ItemInfectedSpade(IDsHelper.InfectedSpadeID, InfectedMaterial).setCreativeTab(ZoneSeek.ZoneSeekTools).setUnlocalizedName("InfectedSpade");
		InfectedStick = new ItemMisc(IDsHelper.InfectedStickID).setCreativeTab(ZoneSeek.ZoneSeekMaterials).setUnlocalizedName("InfectedStick");
		InfectedStone = new ItemMisc(IDsHelper.InfectedStoneID).setCreativeTab(ZoneSeek.ZoneSeekMaterials).setUnlocalizedName("InfectedStone");
		InfectedSword = new ItemInfectedSword(IDsHelper.InfectedSwordID, InfectedMaterial).setCreativeTab(ZoneSeek.ZoneSeekWeapons).setUnlocalizedName("InfectedSword");
		KasoliteCrystal = new ItemCrystal(IDsHelper.KasoliteCrystalID).setCreativeTab(ZoneSeek.ZoneSeekMaterials).setUnlocalizedName("KasoliteCrystal");
		LagoonScale = new ItemMisc(IDsHelper.LagoonScaleID).setCreativeTab(ZoneSeek.ZoneSeekItems).setUnlocalizedName("LagoonScale");
		LazuriteCrystal = new ItemCrystal(IDsHelper.LazuriteCrystalID).setCreativeTab(ZoneSeek.ZoneSeekMaterials).setUnlocalizedName("LazuriteCrystal");
		ObsidianStick = new ItemMisc(IDsHelper.ObsidianStickID).setCreativeTab(ZoneSeek.ZoneSeekMaterials).setUnlocalizedName("ObsidianStick");
		Pear = new ItemPear(IDsHelper.PearID, 2, 2.0F, false).setCreativeTab(ZoneSeek.ZoneSeekFood).setUnlocalizedName("Pear");
		PincerScale = new ItemMisc(IDsHelper.PincerScaleID).setCreativeTab(ZoneSeek.ZoneSeekItems).setUnlocalizedName("PincerScale");
		Pineapple = new ItemPineapple(IDsHelper.PineappleID, 2, 3.0F, false).setCreativeTab(ZoneSeek.ZoneSeekFood).setUnlocalizedName("Pineapple");
		Plum = new ItemPlum(IDsHelper.PlumID, 2, 2.0F, false).setCreativeTab(ZoneSeek.ZoneSeekFood).setUnlocalizedName("Plum");
		SludgeGem = new ItemMisc(IDsHelper.SludgeGemID).setCreativeTab(ZoneSeek.ZoneSeekMaterials).setUnlocalizedName("SludgeGem");
		SludgeKatana = new ItemSludgeKatana(IDsHelper.SludgeKatanaID, SludgeMaterial).setCreativeTab(ZoneSeek.ZoneSeekWeapons).setUnlocalizedName("SludgeKatana");
		SludgeShard = new ItemMisc(IDsHelper.SludgeShardID).setCreativeTab(ZoneSeek.ZoneSeekMaterials).setUnlocalizedName("SludgeShard");
		SludgeStone = new ItemMisc(IDsHelper.SludgeStoneID).setCreativeTab(ZoneSeek.ZoneSeekMaterials).setUnlocalizedName("SludgeStone");
		SlugSlime = new ItemMisc(IDsHelper.SlugSlimeID).setCreativeTab(ZoneSeek.ZoneSeekItems).setUnlocalizedName("SlugSlime");
		TaintedInkDrop = new ItemMisc(IDsHelper.TaintedInkDropID).setCreativeTab(ZoneSeek.ZoneSeekItems).setUnlocalizedName("TaintedInkDrop");
		TaintedInkSack = new ItemMisc(IDsHelper.TaintedInkSackID).setCreativeTab(ZoneSeek.ZoneSeekItems).setUnlocalizedName("TaintedInkSack");
		TaintedLeather = new ItemMisc(IDsHelper.TaintedLeatherID).setCreativeTab(ZoneSeek.ZoneSeekItems).setUnlocalizedName("TaintedLeather");
		TaintedPage = new ItemMisc(IDsHelper.TaintedPageID).setCreativeTab(ZoneSeek.ZoneSeekItems).setUnlocalizedName("TaintedPage");

		gameRegisters();
		languageRegisters();
	}
	
	private static void gameRegisters(){
		//Item Registry
		GameRegistry.registerItem(ApophylliteCrystal, "ApophylliteCrystal");
		GameRegistry.registerItem(AxiniteCrystal, "AxiniteCrystal");
		GameRegistry.registerItem(Banana, "Banana");
		GameRegistry.registerItem(BetafiteCrystal, "BetafiteCrystal");
		GameRegistry.registerItem(BookOfInfection, "BookOfInfectione");
		GameRegistry.registerItem(BrochantiteCrystal, "BrochantiteCrystal");
		GameRegistry.registerItem(CoconutChunk, "CoconutChunk");
		GameRegistry.registerItem(CompactedScaleFragment, "CompactedScaleFragment");
		GameRegistry.registerItem(CompactedScalePlate, "CompactedScalePlate");
		GameRegistry.registerItem(DolomiteCrystal, "DolomiteCrystal");
		GameRegistry.registerItem(DragonFruit, "DragonFruit");
		GameRegistry.registerItem(FotiteCrystal, "FotiteCrystal");
		GameRegistry.registerItem(FuzzleChop, "FuzzleChop");
		GameRegistry.registerItem(HeterogeniteCrystal, "HeterogeniteCrystal");
		GameRegistry.registerItem(InfectedArrow, "InfectedArrow");
		GameRegistry.registerItem(InfectedAxe, "InfectedAxe");
		GameRegistry.registerItem(InfectedBattleAxe, "InfectedBattleAxe");
		GameRegistry.registerItem(InfectedBoots, "InfectedBoots");
		GameRegistry.registerItem(InfectedBow, "InfectedBow");
		GameRegistry.registerItem(InfectedChestplate, "InfectedChestplate");
		GameRegistry.registerItem(InfectedHelmet, "InfectedHelmet");
		GameRegistry.registerItem(InfectedHoe, "InfectedHoe");
		GameRegistry.registerItem(InfectedLeggings, "InfectedLeggings");
		GameRegistry.registerItem(InfectedPaxcel, "InfectedPaxcel");
		GameRegistry.registerItem(InfectedPickaxe, "InfectedPickaxe");
		GameRegistry.registerItem(InfectedPlate, "InfectedPlate");
		GameRegistry.registerItem(InfectedProd, "InfectedProd");
		GameRegistry.registerItem(InfectedShard, "InfectedShard");
		GameRegistry.registerItem(InfectedSpade, "InfectedSpade");
		GameRegistry.registerItem(InfectedStick, "InfectedStick");
		GameRegistry.registerItem(InfectedStone, "InfectedStone");
		GameRegistry.registerItem(InfectedSword, "InfectedSword");
		GameRegistry.registerItem(KasoliteCrystal, "KasoliteCrystal");
		GameRegistry.registerItem(LagoonScale, "LagoonScale");
		GameRegistry.registerItem(LazuriteCrystal, "LazuriteCrystal");
		GameRegistry.registerItem(ObsidianStick, "ObsidianStick");
		GameRegistry.registerItem(Pear, "Pear");
		GameRegistry.registerItem(PincerScale, "PincerScale");
		GameRegistry.registerItem(Pineapple, "Pineapple");
		GameRegistry.registerItem(Plum, "Plum");
		GameRegistry.registerItem(SludgeGem, "SludgeGem");
		GameRegistry.registerItem(SludgeKatana, "SludgeKatana");
		GameRegistry.registerItem(SludgeShard, "SludgeShard");
		GameRegistry.registerItem(SludgeStone, "SludgeStone");
		GameRegistry.registerItem(SlugSlime, "SlugSlime");
		GameRegistry.registerItem(TaintedInkDrop, "TaintedInkDrop");
		GameRegistry.registerItem(TaintedInkSack, "TaintedInkSack");
		GameRegistry.registerItem(TaintedLeather, "TaintedLeather");
		GameRegistry.registerItem(TaintedPage, "TaintedPage");
		GameRegistry.registerItem(InfectedGem, "InfectedGem");
	}
	

	private static void languageRegisters(){
		//Item LanguageRegistry
		LanguageRegistry.addName(ApophylliteCrystal, "Apophyllite Crystal");
		LanguageRegistry.addName(AxiniteCrystal, "Axinite Crystal");
		LanguageRegistry.addName(Banana, "Banana");
		LanguageRegistry.addName(BetafiteCrystal, "Betafite Crystal");
		LanguageRegistry.addName(BookOfInfection, "Book Of Infection");
		LanguageRegistry.addName(BrochantiteCrystal, "Brochantite Crystal");
		LanguageRegistry.addName(CoconutChunk, "Coconut Chunk");
		LanguageRegistry.addName(CompactedScaleFragment, "Compacted Scale Fragment");
		LanguageRegistry.addName(CompactedScalePlate, "Compacted Scale Plate");
		LanguageRegistry.addName(DolomiteCrystal, "Dolomite Crystal");
		LanguageRegistry.addName(DragonFruit, "Dragon Fruit");
		LanguageRegistry.addName(FotiteCrystal, "Fotite Crystal");
		LanguageRegistry.addName(FuzzleChop, "Fuzzle Chop");
		LanguageRegistry.addName(HeterogeniteCrystal, "Heterogenite Crystal");
		LanguageRegistry.addName(InfectedArrow, "Infected Arrow");
        LanguageRegistry.addName(InfectedAxe, "Infected Axe");
		LanguageRegistry.addName(InfectedBattleAxe, "Infected Battle Axe");
		LanguageRegistry.addName(InfectedBoots, "Infected Boots");
		LanguageRegistry.addName(InfectedBow, "Infected Bow");
		LanguageRegistry.addName(InfectedChestplate, "Infected Chestplate");
		LanguageRegistry.addName(InfectedGem, "Infected Gem");
		LanguageRegistry.addName(InfectedHelmet, "InfectedHelmet");
		LanguageRegistry.addName(InfectedHoe, "Infected Hoe");
		LanguageRegistry.addName(InfectedLeggings, "Infected Leggings");
		LanguageRegistry.addName(InfectedPaxcel, "Infected Paxcel");
		LanguageRegistry.addName(InfectedPickaxe, "Infected Pickaxe");
		LanguageRegistry.addName(InfectedPlate, "Infected Plate");
		LanguageRegistry.addName(InfectedProd, "Infected Prod");
		LanguageRegistry.addName(InfectedShard, "Infected Shard");
		LanguageRegistry.addName(InfectedSpade, "Infected Spade");
		LanguageRegistry.addName(InfectedStick, "Infected Stick");
        LanguageRegistry.addName(InfectedStone, "Infected Stone");
		LanguageRegistry.addName(InfectedSword, "Infected Slasher");
		LanguageRegistry.addName(KasoliteCrystal, "Kasolite Crystal");
		LanguageRegistry.addName(LagoonScale, "Lagoon Scale");
		LanguageRegistry.addName(LazuriteCrystal, "Lazurite Crystal");
		LanguageRegistry.addName(ObsidianStick, "Obsidian Stick");
		LanguageRegistry.addName(Pear, "Pear");
		LanguageRegistry.addName(PincerScale, "Pincer Scale");
		LanguageRegistry.addName(Pineapple, "Pineapple");
		LanguageRegistry.addName(Plum, "Plum");
		LanguageRegistry.addName(SludgeGem, "Sludge Gem");
		LanguageRegistry.addName(SludgeKatana, "Sludge Katana");
		LanguageRegistry.addName(SludgeShard, "Sludge Shard");
		LanguageRegistry.addName(SludgeStone, "Sludge Stone");
		LanguageRegistry.addName(SlugSlime, "Slug Slime");
		LanguageRegistry.addName(TaintedInkDrop, "Tainted Ink Drop");
        LanguageRegistry.addName(TaintedInkSack, "Tainted Ink Sack");
        LanguageRegistry.addName(TaintedLeather, "Tainted Leather");
        LanguageRegistry.addName(TaintedPage, "Tainted Page");
	}

}