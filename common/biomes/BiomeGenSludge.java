package ZoneSeek.common.biomes;
 
import java.util.Random;

import ZoneSeek.common.blocks.BlocksHelper;
import ZoneSeek.common.worldgen.WorldGenSludgeTallGrass;
import ZoneSeek.common.worldgen.WorldGenSludgeTree;

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
 
public class BiomeGenSludge extends BiomeGenBase
{



	public BiomeGenSludge(int par1)
    {
        super(par1);
        this.topBlock = (byte)BlocksHelper.SludgeGrass.blockID;
        this.fillerBlock = (byte)BlocksHelper.SludgeDirt.blockID;
        this.theBiomeDecorator.treesPerChunk = 10;
        this.theBiomeDecorator.flowersPerChunk = 50;
        this.theBiomeDecorator.mushroomsPerChunk = 1;
        this.theBiomeDecorator.clayPerChunk = 2;
        this.waterColorMultiplier = 0xFF7396;
    }
	
    public WorldGenerator getRandomWorldGenForGrass(Random par1Random)
    {
        return par1Random.nextInt(20) == 0 ? new WorldGenSludgeTallGrass(BlocksHelper.SludgeTallGrass.blockID, topBlock) : new WorldGenSludgeTallGrass(BlocksHelper.SludgeTallGrass.blockID, fillerBlock);
    }
    
    public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return (WorldGenerator)(par1Random.nextInt(2) == 0 ? new WorldGenSludgeTree(false, 5, 0, 0, false) : new WorldGenSludgeTree(false, 10, 0, 0, false));
    }

    

  
    }