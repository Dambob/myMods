package com.Dambob.myMods.Blocks;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntitySilverfish;
import net.minecraft.src.EntityXPOrb;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class BlockTitaniumOre extends Block
{
	public BlockTitaniumOre(int i, int j, Material m, String n)
	{
		super(i, j, m);
		this.setBlockName(n);
		this.setHardness(1F);
		this.setResistance(10F);
		this.setCreativeTab(CreativeTabs.tabBlock);
	};
	
	@SideOnly(Side.CLIENT)
	public String getTextureFile()
	{
		return "/com/Dambob/myMods/Textures/terrain.png";
	};
	
	@SideOnly(Side.CLIENT) //Client side only
	public int getBlockTextureFromSide(int i)
	{
		return 0;
		
		//different textures for different sides
		//if par1    0 = Bottom 1 = Top 2-5 = sides
		//return par1 == 0 ? 19 : (par1 == 1 ? 23 : 22);
	};
	
	//Drop xp
	/*public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5)
	{
	    if (!par1World.isRemote)
	    {
	      	EntityXPOrb var6 = new EntityXPOrb(par1World, ((double)par2 + 0.5D), ((double)par3), ((double)par4 + 0.5D), 3);    
	        par1World.spawnEntityInWorld(var6);
	    };
	
	    super.onBlockDestroyedByPlayer(par1World, par2, par3, par4, par5);
	};*/
		
};
