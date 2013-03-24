package ZoneSeek.common.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraftforge.common.IArmorTextureProvider;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemInfectedArmor extends ItemArmor implements IArmorTextureProvider
{
	private Icon icon;
	private String n;
	public ItemInfectedArmor(int itemID,EnumArmorMaterial armorMaterial, int renderIndex, int armorType, String name)
	{
		super(itemID,armorMaterial,renderIndex,armorType);
		setUnlocalizedName(name);
		n=name;
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void func_94581_a(IconRegister iconRegister)
	{
		makeIcons(iconRegister);
	}
	public void makeIcons(IconRegister iconRegister)
	{
		icon = iconRegister.func_94245_a("zoneseek:"+n);
	}
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int i)
	{
		return icon;
	}
	@Override
	public String getArmorTextureFile(ItemStack itemstack)
	{
		if(itemstack.itemID == ItemsHelper.InfectedHelmet.itemID || itemstack.itemID == ItemsHelper.InfectedChestplate.itemID || itemstack.itemID == ItemsHelper.InfectedBoots.itemID)
		{
			return "/mods/zoneseek/textures/items/infected_1.png";
		}
		else if(itemstack.itemID == ItemsHelper.InfectedLeggings.itemID)
		{
			return "/mods/zoneseek/textures/items/infected_2.png";
		}

		return "/mods/zoneseek/textures/items/infected_1.png";
	}
}