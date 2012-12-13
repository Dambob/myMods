package com.Dambob.myMods.Items;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class ArmorTitanium extends ItemArmor implements IArmorTextureProvider
{

	public ArmorTitanium(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String n, int iconID) 
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.setItemName(n);
		this.setIconIndex(iconID);
		this.setCreativeTab(CreativeTabs.tabCombat);
	};
	
	@SideOnly(Side.CLIENT)
	public String getArmorTextureFile(ItemStack par1)
	{
		if (par1.itemID == ModItems.HelmetTitanium.shiftedIndex || par1.itemID == ModItems.PlateTitanium.shiftedIndex || par1.itemID == ModItems.BootsTitanium.shiftedIndex)
		{
			return "/com/Dambob/myMods/Textures/titanium_1.png";
		}
		else
		{
			return "/com/Dambob/myMods/Textures/titanium_2.png";
		}
	};

	@SideOnly(Side.CLIENT)
	public String getTextureFile()
	{
		return "/com/Dambob/myMods/Textures/items.png";
	};
	
};
