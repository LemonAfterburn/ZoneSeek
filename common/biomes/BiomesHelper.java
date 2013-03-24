package ZoneSeek.common.biomes;

import ZoneSeek.common.IDsHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomesHelper {
	
	//Biomes
    public static BiomeGenBase Lagoon;
    public static BiomeGenBase Sludge;
    
    public static void setupBiomes() {
        Lagoon = (new BiomeGenLagoon(IDsHelper.LagoonID).setBiomeName("Lagoon Biome").setMinMaxHeight(-0.2F,0.2F).setTemperatureRainfall(0.8F, 0.9F));
        GameRegistry.addBiome(Lagoon);
        
        Sludge = (new BiomeGenSludge(IDsHelper.SludgeID).setBiomeName("Sludge Biome").setMinMaxHeight(0.4F,0.5F).setTemperatureRainfall(0.2F, 0.4F));
        GameRegistry.addBiome(Sludge);
        
    
    	
    }

}
