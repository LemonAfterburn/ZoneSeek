package ZoneSeek.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public class BlockLagoonTallGrass extends BlockFlower
{
public BlockLagoonTallGrass(int id)
    {
     super(id, Material.grass);
this.setCreativeTab(CreativeTabs.tabMisc);
this.setHardness(0F);
this.setStepSound(Block.soundGrassFootstep);
        float var3 = 0.2F;
        this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.8F, 0.5F + var3);
    }

    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return super.canPlaceBlockAt(par1World, par2, par3, par4) && canBlockStay(par1World, par2, par3, par4);
    }


    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
     return par1 == BlocksHelper.LagoonGrass.blockID;
    }


    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        Block soil = BlocksHelper.LagoonGrass;
        return (par1World.getFullBlockLightValue(par2, par3, par4) >= 0) && 
                (soil != null && soil.canSustainPlant(par1World, par2, par3 - 1, par4, ForgeDirection.UP, this));
    }

    @Override
    public void func_94332_a(IconRegister par1IconRegister)
    {
             this.field_94336_cN = par1IconRegister.func_94245_a("zoneseek:lagoontallgrass");
    }



    @Override

    public int idDropped(int i, Random r, int j) 
     
     {
     
     return 0;
     
     }

}