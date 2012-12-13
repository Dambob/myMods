package com.Dambob.myMods.Blocks;

import java.util.Random;

import com.Dambob.myMods.Main;
import com.Dambob.myMods.Tiles.TileEntityTiny;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

import net.minecraft.src.*;

public class BlockTiny extends BlockContainer
{

	protected BlockTiny (int i, int j, Material m, String n) 
	{
	    super(i, j, Material.wood);
	    this.setHardness(2.0F);
	    this.setResistance(5.0F);
	    this.setBlockName(n);
	    this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int idk, float what, float these, float are) 
	{
	    TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
	    
	    if (tileEntity == null || player.isSneaking()) 
	    {
	        return false;
	    }
	    
	    //opens gui, to be implemented later
	    player.openGui(Main.instance, 0, world, x, y, z);
	    
	    return true;
	}
	
	@Override
	public void breakBlock(World world, int x, int y, int z, int par5, int par6) 
	{
	    dropItems(world, x, y, z);
	    super.breakBlock(world, x, y, z, par5, par6);
	}
	
	private void dropItems(World world, int x, int y, int z)
	{
	    Random rand = new Random();
	
	    TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
	    
	    if (!(tileEntity instanceof IInventory)) 
	    {
	        return;
	    }
	    
	    IInventory inventory = (IInventory) tileEntity;
	
	    for (int i = 0; i < inventory.getSizeInventory(); i++) 
	    {
	        ItemStack item = inventory.getStackInSlot(i);
	
	        if (item != null && item.stackSize > 0) 
	        {
	            float rx = rand.nextFloat() * 0.8F + 0.1F;
	            float ry = rand.nextFloat() * 0.8F + 0.1F;
	            float rz = rand.nextFloat() * 0.8F + 0.1F;
	
	            EntityItem entityItem = new EntityItem(world, x + rx, y + ry, z + rz, new ItemStack(item.itemID, item.stackSize, item.getItemDamage()));
	
	            if (item.hasTagCompound()) 
	            {
	                entityItem.item.setTagCompound((NBTTagCompound) item.getTagCompound().copy());
	            }
	
	            float factor = 0.05F;
	            entityItem.motionX = rand.nextGaussian() * factor;
	            entityItem.motionY = rand.nextGaussian() * factor + 0.2F;
	            entityItem.motionZ = rand.nextGaussian() * factor;
	            world.spawnEntityInWorld(entityItem);
	            item.stackSize = 0;
	        }
	    }
	}
	
	@Override
	public TileEntity createNewTileEntity(World world) 
	{
	    return new TileEntityTiny();
	}
	
	@SideOnly(Side.CLIENT)
	public String getTextureFile()
	{
		return "/com/Dambob/myMods/Textures/terrain.png";
	};
	
	@SideOnly(Side.CLIENT) //Client side only
	public int getBlockTextureFromSide(int i)
	{
		
		switch(i)
		{
		case 0: return 1;
		
		case 1: return 1;
		
		default: return 2;
		}
		
	//	return 1;
		
		//different textures for different sides
		//if par1    0 = Bottom 1 = Top 2-5 = sides
		//return par1 == 0 ? 19 : (par1 == 1 ? 23 : 22);
	};

}