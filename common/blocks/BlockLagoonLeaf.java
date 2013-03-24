package ZoneSeek.common.blocks;

import java.util.ArrayList;
import java.util.Random;

import ZoneSeek.common.items.ItemsHelper;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import net.minecraftforge.common.IShearable;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLagoonLeaf extends BlockLeavesBase implements IShearable
{
	int[] adjacentTreeBlocks;

	public BlockLagoonLeaf(int blockId)
	{
		super(blockId, Material.leaves, true);
		this.setHardness(0.2F);
		this.setLightOpacity(1);
		this.setStepSound(soundGrassFootstep);
		this.setTickRandomly(true);
	}


	@Override
	@SideOnly(Side.CLIENT)
	public void func_94332_a(IconRegister par1IconRegister)
	{
		this.field_94336_cN = par1IconRegister.func_94245_a("zoneseek:lagoonleaf");
	}

	@Override
	public void breakBlock(World world, int x, int y, int z, int par5, int par6)
	{
		if (world.checkChunksExist(x - 2, y - 2, z - 2, x + 2, y + 2, z + 2))
		{
			for (int i = -1; i <= 1; i++)
			{
				for (int j = -1; j <= 1; j++)
				{
					for (int k = -1; k <= 1; k++)
					{
						int neighborBlockId = world.getBlockId(x + i, y + j, z + k);
						if (Block.blocksList[neighborBlockId] != null)
						{
							Block.blocksList[neighborBlockId].beginLeavesDecay(world, x + i, y + j, z + k);
						}
					}
				}
			}
		}
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random random)
	{
		if (!world.isRemote)
		{
			int metadata = world.getBlockMetadata(x, y, z);

			if ((metadata & 8) != 0 && (metadata & 4) == 0)
			{
				int sustainableRange = 4;
				int unsustainableRange = sustainableRange + 1;
				byte var9 = 32;
				int var10 = var9 * var9;
				int var11 = var9 / 2;

				if (this.adjacentTreeBlocks == null)
				{
					this.adjacentTreeBlocks = new int[var9 * var9 * var9];
				}

				int var12;

				if (world.checkChunksExist( x - unsustainableRange, y - unsustainableRange, z - unsustainableRange,
											x + unsustainableRange, y + unsustainableRange, z + unsustainableRange))
				{
					int var13;
					int var14;
					int var15;

					for (var12 = -sustainableRange; var12 <= sustainableRange; ++var12)
					{
						for (var13 = -sustainableRange; var13 <= sustainableRange; ++var13)
						{
							for (var14 = -sustainableRange; var14 <= sustainableRange; ++var14)
							{
								int ebonyLogBlockId = world.getBlockId(x + var12, y + var13, z + var14);

								Block block = Block.blocksList[ebonyLogBlockId];

								if (block != null && block.canSustainLeaves(world, x + var12, y + var13, z + var14))
								{
									this.adjacentTreeBlocks[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = 0;
								}
								else if (block != null && block.isLeaves(world, x + var12, y + var13, z + var14))
								{
									this.adjacentTreeBlocks[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = -2;
								}
								else
								{
									this.adjacentTreeBlocks[(var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11] = -1;
								}
							}
						}
					}

					for (var12 = 1; var12 <= 4; ++var12)
					{
						for (var13 = -sustainableRange; var13 <= sustainableRange; ++var13)
						{
							for (var14 = -sustainableRange; var14 <= sustainableRange; ++var14)
							{
								for (var15 = -sustainableRange; var15 <= sustainableRange; ++var15)
								{
									if (this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11] == var12 - 1)
									{
										if (this.adjacentTreeBlocks[(var13 + var11 - 1) * var10 + (var14 + var11) * var9 + var15 + var11] == -2)
										{
											this.adjacentTreeBlocks[(var13 + var11 - 1) * var10 + (var14 + var11) * var9 + var15 + var11] = var12;
										}

										if (this.adjacentTreeBlocks[(var13 + var11 + 1) * var10 + (var14 + var11) * var9 + var15 + var11] == -2)
										{
											this.adjacentTreeBlocks[(var13 + var11 + 1) * var10 + (var14 + var11) * var9 + var15 + var11] = var12;
										}

										if (this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11 - 1) * var9 + var15 + var11] == -2)
										{
											this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11 - 1) * var9 + var15 + var11] = var12;
										}

										if (this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11 + 1) * var9 + var15 + var11] == -2)
										{
											this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11 + 1) * var9 + var15 + var11] = var12;
										}

										if (this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var9 + (var15 + var11 - 1)] == -2)
										{
											this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var9 + (var15 + var11 - 1)] = var12;
										}

										if (this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11 + 1] == -2)
										{
											this.adjacentTreeBlocks[(var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11 + 1] = var12;
										}
									}
								}
							}
						}
					}
				}

				var12 = this.adjacentTreeBlocks[var11 * var10 + var11 * var9 + var11];

				if (var12 >= 0)
				{
					world.setBlockMetadataWithNotify(x, y, z, metadata & -9, 3);
				}
				else
				{
					this.removeLeaves(world, x, y, z);
				}
			}
		}
	}

	private void removeLeaves(World world, int x, int y, int z)
	{
		dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
		world.func_94571_i(x, y, z);
	}

	@Override
	public int quantityDropped(Random random)
	{
		return random.nextInt(20) != 0 ? 0 : 1;
	}

	@Override
	public int idDropped(int i, Random random, int j)
	{
		return BlocksHelper.LagoonSapling.blockID;
	}
	
    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        if (!par1World.isRemote)
        {
            int j1 = 20;

            if ((par5 & 3) == 3)
            {
                j1 = 40;
            }

            if (par7 > 0)
            {
                j1 -= 2 << par7;

                if (j1 < 10)
                {
                    j1 = 10;
                }
            }

            if (par1World.rand.nextInt(j1) == 0)
            {
                int k1 = this.idDropped(par5, par1World.rand, par7);
                this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(k1, 1, this.damageDropped(par5)));
            }

            j1 = 200;

            if (par7 > 0)
            {
                j1 -= 10 << par7;

                if (j1 < 40)
                {
                    j1 = 40;
                }
            }

            if ((par5 & 3) == 0 && par1World.rand.nextInt(j1) == 0)
            {
                this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(ItemsHelper.Pear.itemID, 1, 0));
            }
        }
    }

	@Override
	public void harvestBlock(World world, EntityPlayer entityplayer, int i, int j, int k, int l)
	{
		super.harvestBlock(world, entityplayer, i, j, k, l);
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public void onEntityWalking(World world, int x, int y, int z, Entity entity)
	{
		super.onEntityWalking(world, x, y, z, entity);
	}

	@Override
	public void beginLeavesDecay(World world, int x, int y, int z)
	{
		world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) | 8, 3);
	}
	
    @SideOnly(Side.CLIENT)
    public int getBlockColor()
    {
        double d0 = 0.5D;
        double d1 = 1.0D;
        return ColorizerFoliage.getFoliageColor(d0, d1);
    }
    
    @SideOnly(Side.CLIENT)

    /**
     * Returns the color this block should be rendered. Used by leaves.
     */
    public int getRenderColor(int par1)
    {
        return (par1 & 3) == 1 ? ColorizerFoliage.getFoliageColorPine() : ((par1 & 3) == 2 ? ColorizerFoliage.getFoliageColorBirch() : ColorizerFoliage.getFoliageColorBasic());
    }
    
    @SideOnly(Side.CLIENT)

    /**
     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     * when first determining what to render.
     */
    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        int l = par1IBlockAccess.getBlockMetadata(par2, par3, par4);

        if ((l & 3) == 1)
        {
            return ColorizerFoliage.getFoliageColorPine();
        }
        else if ((l & 3) == 2)
        {
            return ColorizerFoliage.getFoliageColorBirch();
        }
        else
        {
            int i1 = 0;
            int j1 = 0;
            int k1 = 0;

            for (int l1 = -1; l1 <= 1; ++l1)
            {
                for (int i2 = -1; i2 <= 1; ++i2)
                {
                    int j2 = par1IBlockAccess.getBiomeGenForCoords(par2 + i2, par4 + l1).getBiomeFoliageColor();
                    i1 += (j2 & 16711680) >> 16;
                    j1 += (j2 & 65280) >> 8;
                    k1 += j2 & 255;
                }
            }

            return (i1 / 9 & 255) << 16 | (j1 / 9 & 255) << 8 | k1 / 9 & 255;
        }
    }


	@Override
	public boolean isLeaves(World world, int x, int y, int z)
	{
		return true;
	}

	// implements IShearable
	@Override
	public boolean isShearable(ItemStack item, World world, int X, int Y, int Z)
	{
		return true;
	}

	@Override
	public ArrayList<ItemStack> onSheared(ItemStack item, World world, int X, int Y, int Z, int fortune)
	{
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		ret.add(new ItemStack(BlocksHelper.LagoonLeaf.blockID, 1, world.getBlockMetadata(X, Y, Z)));
		return ret;
	}

}