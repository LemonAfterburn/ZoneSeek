package ZoneSeek.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import ZoneSeek.ZoneSeekArmor;
import ZoneSeek.ZoneSeekBlocks;
import ZoneSeek.ZoneSeekFood;
import ZoneSeek.ZoneSeekItems;
import ZoneSeek.ZoneSeekMaterials;
import ZoneSeek.ZoneSeekTools;
import ZoneSeek.ZoneSeekWeapons;
import ZoneSeek.common.biomes.BiomesHelper;
import ZoneSeek.common.blocks.BlocksHelper;
import ZoneSeek.common.items.ItemsHelper;
import ZoneSeek.common.recipes.CraftingTableHandler;
import ZoneSeek.common.recipes.FurnaceHandler;
import ZoneSeek.common.recipes.ShapelessHandler;
import ZoneSeek.common.worldgen.WorldGeneratorLagoon;
import ZoneSeek.common.worldgen.WorldGeneratorSludge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "ZoneSeek", name = "ZoneSeek", version = "1.5")
@NetworkMod(clientSideRequired = true, serverSideRequired = false, packetHandler = CommonPacketHandler.class, channels = {"ZoneSeek"})

public class ZoneSeek {
	
	@Instance
	public static ZoneSeek instance = new ZoneSeek();
	
    public static CreativeTabs ZoneSeekBlocks = new ZoneSeekBlocks(CreativeTabs.getNextID(),"ZoneSeekBlocks");
    public static CreativeTabs ZoneSeekItems = new ZoneSeekItems(CreativeTabs.getNextID(),"ZoneSeekItems");
    public static CreativeTabs ZoneSeekWeapons = new ZoneSeekWeapons(CreativeTabs.getNextID(),"ZoneSeekWeapons");
    public static CreativeTabs ZoneSeekTools = new ZoneSeekTools(CreativeTabs.getNextID(),"ZoneSeekTools");
    public static CreativeTabs ZoneSeekArmor = new ZoneSeekArmor(CreativeTabs.getNextID(),"ZoneSeekArmor");
    public static CreativeTabs ZoneSeekMaterials = new ZoneSeekMaterials(CreativeTabs.getNextID(),"ZoneSeekMaterials");
    public static CreativeTabs ZoneSeekFood = new ZoneSeekFood(CreativeTabs.getNextID(),"ZoneSeekFood");
	
	//public static GuiHandler guihandler = new GuiHandler();

	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();

		IDsHelper.runConfiguration(config);

		config.save();
	}

	@Init
	public void load(FMLInitializationEvent event){
        BlocksHelper.setupBlocks();
        ItemsHelper.setupItems();
        BiomesHelper.setupBiomes();
        MobsHelper.setupMobs();
        CraftingTableHandler.setupRecipes();
        FurnaceHandler.setupRecipes();
        ShapelessHandler.setupRecipes();
        

		GameRegistry.registerWorldGenerator(new WorldGenOres());
	    GameRegistry.registerWorldGenerator(new WorldGeneratorLagoon());
	    GameRegistry.registerWorldGenerator(new WorldGeneratorSludge());
		//GameRegistry.registerFuelHandler(new FuelHandler());
		
		//NetworkRegistry.instance().registerGuiHandler(instance, guihandler);
		
		//GameRegistry.registerTileEntity(TileEntityLavaFurnace.class, "GeothermalOven");
		//GameRegistry.registerTileEntity(TileEntityResearcher.class, "Researcher");
		//GameRegistry.registerTileEntity(TileEntityLogger.class, "Logger");
		
		//ResearchHandler.instance().setResearchValue(ItemsHelper.siliconIngot.itemID, true);
		//ResearchHandler.instance().initResearchHandler();
	}
}