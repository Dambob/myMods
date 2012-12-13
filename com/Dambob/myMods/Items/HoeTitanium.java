package com.Dambob.myMods.Items;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemHoe;

public class HoeTitanium extends ItemHoe
{

	public HoeTitanium(int par1, EnumToolMaterial par2EnumToolMaterial, String n) 
	{
		super(par1, par2EnumToolMaterial);
		this.setItemName(n);
		this.setIconIndex(5);
		this.setCreativeTab(CreativeTabs.tabTools);
	};

	@SideOnly(Side.CLIENT)
	public String getTextureFile()
	{
		return "/com/Dambob/myMods/Textures/items.png";
	}
	
};
