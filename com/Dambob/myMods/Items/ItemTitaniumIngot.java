package com.Dambob.myMods.Items;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class ItemTitaniumIngot extends Item
{
	public ItemTitaniumIngot(int i, String n)
	{
		super(i);
		
		this.setItemName(n);
		this.setIconIndex(0);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	};
	
	@SideOnly(Side.CLIENT)
	public String getTextureFile()
	{
		return "/com/Dambob/myMods/Textures/items.png";
	};
	
	//Shiny sprite
	/*@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    };*/
    
    //Gives coloured text.
    /*@SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.epic;
    };*/
	
};
