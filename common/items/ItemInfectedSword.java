package ZoneSeek.common.items;

import java.awt.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemInfectedSword extends ItemSword{
	

	public ItemInfectedSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.enchantability(30);
		
	}
	
	public int enchantability(int i) {
		return 30;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void func_94581_a(IconRegister par1IconRegister)
	{
		this.iconIndex = par1IconRegister.func_94245_a("zoneseek:infectedsword");
	}
	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
	  {
		par1ItemStack.damageItem(1, par3EntityLiving);
		par2EntityLiving.addPotionEffect(new PotionEffect(Potion.poison.getId(), 100, 1));
		return true;
	  }
	  
	
	

}
