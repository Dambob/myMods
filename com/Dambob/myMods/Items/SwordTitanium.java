package com.Dambob.myMods.Items;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemSword;

public class SwordTitanium extends ItemSword
{

	public SwordTitanium(int par1, EnumToolMaterial par2EnumToolMaterial, String n) 
	{
		super(par1, par2EnumToolMaterial);
		this.setItemName(n);
		this.setIconIndex(2);
		this.setCreativeTab(CreativeTabs.tabCombat);		
	};
	
	@SideOnly(Side.CLIENT)
	public String getTextureFile()
	{
		return "/com/Dambob/myMods/Textures/items.png";
	};
	
};
