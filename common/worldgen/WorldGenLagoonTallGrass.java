package ZoneSeek.common.worldgen;

import java.util.Random;

import ZoneSeek.common.blocks.BlocksHelper;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenLagoonTallGrass extends WorldGenerator
{
    /** Stores ID for WorldGenTallGrass */
    private int LagoontallGrassID;
    private int LagoontallGrassMetadata;

    public WorldGenLagoonTallGrass(int par1, int par2)
    {
        this.LagoontallGrassID = par1;
        this.LagoontallGrassMetadata = par2;
    }

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        int l;

        Block block = null;
        do 
        {
            block = Block.blocksList[par1World.getBlockId(par3,  par4, par5)];
            if (block != null && !block.isLeaves(par1World, par3, par4, par5))
            {
                break;
            }
            par4--;
        } while (par4 > 0);

        for (int i1 = 0; i1 < 128; ++i1)
        {
            int j1 = par3 + par2Random.nextInt(8) - par2Random.nextInt(8);
            int k1 = par4 + par2Random.nextInt(4) - par2Random.nextInt(4);
            int l1 = par5 + par2Random.nextInt(8) - par2Random.nextInt(8);

            if (par1World.getBlockId(j1, k1, l1) == BlocksHelper.LagoonGrass.blockID)
            {
            	par1World.func_94575_c(j1, k1 + 1, l1, BlocksHelper.LagoonTallGrass.blockID);
            }
        }

        return true;
    }
}
