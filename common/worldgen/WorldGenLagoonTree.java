package ZoneSeek.common.worldgen;

import java.util.Random;

import ZoneSeek.common.blocks.BlockLagoonSapling;
import ZoneSeek.common.blocks.BlocksHelper;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.ForgeDirection;

public class WorldGenLagoonTree extends WorldGenerator
{
    /** The base height of the tree */
    private final int baseHeight;

    /** Sets the metadata for the wood blocks used */
    private final int woodMetadata;

    /** Sets the metadata for the leaves used in huge trees */
    private final int leavesMetadata;

    public WorldGenLagoonTree(boolean par1, int par2, int par3, int par4)
    {
        super(par1);
        this.baseHeight = par2;
        this.woodMetadata = par3;
        this.leavesMetadata = par4;
    }

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        int var6 = par2Random.nextInt(3) + this.baseHeight;
        boolean var7 = true;

        if (par4 >= 1 && par4 + var6 + 1 <= 256)
        {
            int var8;
            int var10;
            int var11;
            int var12;

            for (var8 = par4; var8 <= par4 + 1 + var6; ++var8)
            {
                byte var9 = 2;

                if (var8 == par4)
                {
                    var9 = 1;
                }

                if (var8 >= par4 + 1 + var6 - 2)
                {
                    var9 = 2;
                }

                for (var10 = par3 - var9; var10 <= par3 + var9 && var7; ++var10)
                {
                    for (var11 = par5 - var9; var11 <= par5 + var9 && var7; ++var11)
                    {
                        if (var8 >= 0 && var8 < 256)
                        {
                            var12 = par1World.getBlockId(var10, var8, var11);
                            Block block = Block.blocksList[var12];

                            if (var12 != 0 &&
                               !block.isLeaves(par1World, var10, var8, var11) &&
                               	var12 != BlocksHelper.LagoonGrass.blockID &&
                               	var12 != BlocksHelper.LagoonDirt.blockID &&
                               !block.canSustainPlant(par1World, var10, var8, var11, ForgeDirection.UP, (BlockLagoonSapling) BlocksHelper.LagoonSapling) && 
                               !block.isWood(par1World, var10, var8, var11) &&
                               var12 != BlocksHelper.LagoonSapling.blockID)
                            {
                                var7 = false;
                            }
                        }
                        else
                        {
                            var7 = false;
                        }
                    }
                }
            }

            if (!var7)
            {
                return false;
            }
            
            else
            {
                var8 = par1World.getBlockId(par3, par4 - 1, par5);
                Block soil = Block.blocksList[var8];
                boolean isValidSoil = soil != null && soil.canSustainPlant(par1World, par3, par4 - 1, par5, ForgeDirection.UP, (BlockLagoonSapling)BlocksHelper.LagoonSapling);

                if ((var8 == BlocksHelper.LagoonGrass.blockID || var8 == BlocksHelper.LagoonDirt.blockID) && par4 < 256 - var6 - 1)
                {
                    onPlantGrow(par1World, par3,     par4 - 1, par5,     par3, par4, par5);
                    onPlantGrow(par1World, par3 + 1, par4 - 1, par5,     par3, par4, par5);
                    onPlantGrow(par1World, par3,     par4 - 1, par5 + 1, par3, par4, par5);
                    onPlantGrow(par1World, par3 + 1, par4 - 1, par5 + 1, par3, par4, par5);
                    this.growLeaves(par1World, par3, par5, par4 + var6, 2, par2Random);

                    for (int var14 = par4 + var6 - 2 - par2Random.nextInt(4); var14 > par4 + var6 / 2; var14 -= 2 + par2Random.nextInt(4))
                    {
                        float var15 = par2Random.nextFloat() * (float)Math.PI * 2.0F;
                        var11 = par3 + (int)(0.5F + MathHelper.cos(var15) * 4.0F);
                        var12 = par5 + (int)(0.5F + MathHelper.sin(var15) * 4.0F);
                        this.growLeaves(par1World, var11, var12, var14, 0, par2Random);

                        for (int var13 = 0; var13 < 5; ++var13)
                        {
                            var11 = par3 + (int)(1.5F + MathHelper.cos(var15) * (float)var13);
                            var12 = par5 + (int)(1.5F + MathHelper.sin(var15) * (float)var13);
                            this.setBlockAndMetadata(par1World, var11, var14 - 3 + var13 / 2, var12, BlocksHelper.LagoonLog.blockID, this.woodMetadata);
                        }
                    }

                    for (var10 = 0; var10 < var6; ++var10)
                    {
                        var11 = par1World.getBlockId(par3, par4 + var10, par5);

                        if (var11 == 0 || Block.blocksList[var11] == null || Block.blocksList[var11].isLeaves(par1World, par3, par4 + var10, par5))
                        {
                            this.setBlockAndMetadata(par1World, par3, par4 + var10, par5, BlocksHelper.LagoonLog.blockID, this.woodMetadata);

                            if (var10 > 0)
                            {
                                if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3 - 1, par4 + var10, par5))
                                {
                                    this.setBlockAndMetadata(par1World, par3 - 1, par4 + var10, par5, BlocksHelper.LagoonVines.blockID, 8);
                                }

                                if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3, par4 + var10, par5 - 1))
                                {
                                    this.setBlockAndMetadata(par1World, par3, par4 + var10, par5 - 1, BlocksHelper.LagoonVines.blockID, 1);
                                }
                            }
                        }

                        if (var10 < var6 - 1)
                        {
                            var11 = par1World.getBlockId(par3 + 1, par4 + var10, par5);

                            if (var11 == 0 || Block.blocksList[var11] == null || Block.blocksList[var11].isLeaves(par1World, par3 + 1, par4 + var10, par5))
                            {
                                this.setBlockAndMetadata(par1World, par3 + 1, par4 + var10, par5, BlocksHelper.LagoonLog.blockID, this.woodMetadata);

                                if (var10 > 0)
                                {
                                    if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3 + 2, par4 + var10, par5))
                                    {
                                        this.setBlockAndMetadata(par1World, par3 + 2, par4 + var10, par5, BlocksHelper.LagoonVines.blockID, 2);
                                    }

                                    if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3 + 1, par4 + var10, par5 - 1))
                                    {
                                        this.setBlockAndMetadata(par1World, par3 + 1, par4 + var10, par5 - 1, BlocksHelper.LagoonVines.blockID, 1);
                                    }
                                }
                            }

                            var11 = par1World.getBlockId(par3 + 1, par4 + var10, par5 + 1);

                            if (var11 == 0 || Block.blocksList[var11] == null || Block.blocksList[var11].isLeaves(par1World, par3 + 1, par4 + var10, par5 + 1))
                            {
                                this.setBlockAndMetadata(par1World, par3 + 1, par4 + var10, par5 + 1, BlocksHelper.LagoonLog.blockID, this.woodMetadata);

                                if (var10 > 0)
                                {
                                    if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3 + 2, par4 + var10, par5 + 1))
                                    {
                                        this.setBlockAndMetadata(par1World, par3 + 2, par4 + var10, par5 + 1, BlocksHelper.LagoonVines.blockID, 2);
                                    }

                                    if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3 + 1, par4 + var10, par5 + 2))
                                    {
                                        this.setBlockAndMetadata(par1World, par3 + 1, par4 + var10, par5 + 2, BlocksHelper.LagoonVines.blockID, 4);
                                    }
                                }
                            }

                            var11 = par1World.getBlockId(par3, par4 + var10, par5 + 1);

                            if (var11 == 0 || Block.blocksList[var11] == null || Block.blocksList[var11].isLeaves(par1World, par3, par4 + var10, par5 + 1))
                            {
                                this.setBlockAndMetadata(par1World, par3, par4 + var10, par5 + 1, BlocksHelper.LagoonLog.blockID, this.woodMetadata);

                                if (var10 > 0)
                                {
                                    if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3 - 1, par4 + var10, par5 + 1))
                                    {
                                        this.setBlockAndMetadata(par1World, par3 - 1, par4 + var10, par5 + 1, BlocksHelper.LagoonVines.blockID, 8);
                                    }

                                    if (par2Random.nextInt(3) > 0 && par1World.isAirBlock(par3, par4 + var10, par5 + 2))
                                    {
                                        this.setBlockAndMetadata(par1World, par3, par4 + var10, par5 + 2, BlocksHelper.LagoonVines.blockID, 4);
                                    }
                                }
                            }
                        }
                    }

                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
    }

    private void growLeaves(World par1World, int par2, int par3, int par4, int par5, Random par6Random)
    {
        byte var7 = 2;

        for (int var8 = par4 - var7; var8 <= par4; ++var8)
        {
            int var9 = var8 - par4;
            int var10 = par5 + 1 - var9;

            for (int var11 = par2 - var10; var11 <= par2 + var10 + 1; ++var11)
            {
                int var12 = var11 - par2;

                for (int var13 = par3 - var10; var13 <= par3 + var10 + 1; ++var13)
                {
                    int var14 = var13 - par3;

                    Block block = Block.blocksList[par1World.getBlockId(var11, var8, var13)];

                    if ((var12 >= 0 || var14 >= 0 || var12 * var12 + var14 * var14 <= var10 * var10) && 
                        (var12 <= 0 && var14 <= 0 || var12 * var12 + var14 * var14 <= (var10 + 1) * (var10 + 1)) && 
                        (par6Random.nextInt(4) != 0 || var12 * var12 + var14 * var14 <= (var10 - 1) * (var10 - 1)) && 
                        (block == null || block.canBeReplacedByLeaves(par1World, var11, var8, var13)))
                    {
                        this.setBlockAndMetadata(par1World, var11, var8, var13, BlocksHelper.LagoonLeaf.blockID, this.leavesMetadata);
                    }
                }
            }
        }
    }
    
    private void onPlantGrow(World world, int x, int y, int z, int sourceX, int sourceY, int sourceZ)
    {
        Block block = Block.blocksList[world.getBlockId(x, y, z)];
        if (block != null)
        {
            block.onPlantGrow(world, x, y, z, sourceX, sourceY, sourceZ);
        }
    }
}
