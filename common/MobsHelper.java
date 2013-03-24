package ZoneSeek.common;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import ZoneSeek.common.biomes.BiomesHelper;
import ZoneSeek.common.entities.InfectedCow;
import ZoneSeek.common.entities.InfectedPig;
import ZoneSeek.common.entities.LagoonSlug;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class MobsHelper {
	
	public static void setupMobs(){
		//Mobs Hostile
		EntityRegistry.registerModEntity(InfectedPig.class, "InfectedPig", 1, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("InfectedPig", "Infected Pig");
		EntityRegistry.addSpawn(InfectedPig.class, 900, 1, 4, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.jungle, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.icePlains, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.jungleHills, BiomeGenBase.swampland);
		
		EntityRegistry.registerModEntity(InfectedCow.class, "InfectedCow", 2, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("InfectedCow", "Infected Cow");
		EntityRegistry.addSpawn(InfectedCow.class, 900, 1, 4, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.jungle, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.icePlains, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.jungleHills, BiomeGenBase.swampland);
		
		EntityRegistry.registerModEntity(LagoonSlug.class, "LagoonSlug", 3, ZoneSeek.instance, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("LagoonSlug", "Lagoon Slug");
		EntityRegistry.addSpawn(LagoonSlug.class, 900, 1, 4, EnumCreatureType.monster, BiomesHelper.Lagoon);
		//Mobs Peaceful
		
		//Spawn Eggs	
		EntityEgg(InfectedPig.class, 0x25630C, 0xEB46E0);
		EntityEgg(InfectedCow.class, 0x25630C, 0x8C918E);
		EntityEgg(LagoonSlug.class, 0x0FFC4E, 0xDBD937);
		

	}
	
	public static int getUniqueID(){
		int EntityId = 300;
		do{
			EntityId++;
		} while(EntityList.getStringFromID(EntityId) != null);
		return EntityId;
	}
	
	public static void EntityEgg(Class<? extends Entity > entity, int primaryColor, int secondaryColor){
		int id = getUniqueID();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
	}
	


}
