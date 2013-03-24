package ZoneSeek.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public class BlockTropicalTallGrass extends BlockFlower
{
public BlockTropicalTallGrass(int id)
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
     return par1 == BlocksHelper.TropicalGrass.blockID;
    }


    public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        Block soil = BlocksHelper.TropicalGrass;
        return (par1World.getFullBlockLightValue(par2, par3, par4) >= 0) && 
                (soil != null && soil.canSustainPlant(par1World, par2, par3 - 1, par4, ForgeDirection.UP, this));
    }

    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
             this.blockIcon = par1IconRegister.registerIcon("zoneseek:tropicaltallgrass");
    }



    @Override

    public int idDropped(int i, Random r, int j) 
     
     {
     
     return 0;
     
     }

}
