package ZoneSeek.common.biomes;
 
import java.util.Random;

import ZoneSeek.common.blocks.BlocksHelper;
import ZoneSeek.common.entities.LagoonSlug;
import ZoneSeek.common.worldgen.WorldGenLagoonTallGrass;
import ZoneSeek.common.worldgen.WorldGenLagoonTree;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenSwamp;
import net.minecraft.world.gen.feature.WorldGenTaiga1;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
 
public class BiomeGenLagoon extends BiomeGenBase
{



	public BiomeGenLagoon(int par1)
    {
        super(par1);
        this.topBlock = (byte)BlocksHelper.LagoonGrass.blockID;
        this.fillerBlock = (byte)BlocksHelper.LagoonDirt.blockID;
        this.theBiomeDecorator.treesPerChunk = 2;
        this.theBiomeDecorator.flowersPerChunk = -999;
        this.theBiomeDecorator.deadBushPerChunk = 1;
        this.theBiomeDecorator.mushroomsPerChunk = 8;
        this.theBiomeDecorator.reedsPerChunk = 10;
        this.theBiomeDecorator.clayPerChunk = 10;
        this.theBiomeDecorator.waterlilyPerChunk = 4;
        this.waterColorMultiplier = 0x2D5447;
        this.spawnableCreatureList.add(new SpawnListEntry(LagoonSlug.class, 175, 4, 6));
    }
	
    public WorldGenerator getRandomWorldGenForGrass(Random par1Random)
    {
        return par1Random.nextInt(20) == 0 ? new WorldGenLagoonTallGrass(BlocksHelper.LagoonTallGrass.blockID, topBlock) : new WorldGenLagoonTallGrass(BlocksHelper.LagoonTallGrass.blockID, fillerBlock);
    }
    
    public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return (WorldGenerator)(par1Random.nextInt(10) == 0 ? new WorldGenLagoonTree(false, 15, 0, 0) : new WorldGenLagoonTree(false, 15, 0, 0));
    }

    

  
    }