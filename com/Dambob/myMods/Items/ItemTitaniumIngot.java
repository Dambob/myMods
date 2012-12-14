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
		
		setItemName(n);
		setIconIndex(0);
		setCreativeTab(CreativeTabs.tabMaterials);
		
		//This line is used to create things like buckets
		//Ie bucket of milk in recipie, milk is used but the bucket is returned
		//'this' would be changed to bucket and the class that we're in would be bucketOfMilk
		//setContainerItem(this);
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
