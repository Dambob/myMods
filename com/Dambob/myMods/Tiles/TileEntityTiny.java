package com.Dambob.myMods.Tiles;

import net.minecraft.src.*;

public class TileEntityTiny extends TileEntity implements IInventory 
{
	private ItemStack[] inventory;
	
	public TileEntityTiny()
	{
		inventory = new ItemStack[10];
	}
	
	@Override
	public int getSizeInventory() 
	{
		return inventory.length;
	}
	
	@Override
	public ItemStack getStackInSlot(int slot) 
	{
		return inventory[slot];
	}
	
	@Override
	public void setInventorySlotContents(int slot, ItemStack stack) 
	{
		inventory[slot] = stack;
		
		//Sorts out stack sizes (e.g. 64 cobble)
	    if (stack != null && stack.stackSize > getInventoryStackLimit()) 
	    {
	    	stack.stackSize = getInventoryStackLimit();
	    }               
	}
	
	@Override
	public ItemStack decrStackSize(int slot, int amt) 
	{
	    ItemStack stack = getStackInSlot(slot);
	    
	    if (stack != null) 
	    {
	        if (stack.stackSize <= amt) 
	        {
	            setInventorySlotContents(slot, null);
	        } 
	        else 
	        {
	            stack = stack.splitStack(amt);
	            
	            if (stack.stackSize == 0) 
	            {
	                setInventorySlotContents(slot, null);
	            }
	        }
	    }
	    
	    return stack;
	}
	
	@Override
	public ItemStack getStackInSlotOnClosing(int slot) 
	{
	    ItemStack stack = getStackInSlot(slot);
	    
	    if (stack != null) 
	    {
	    	setInventorySlotContents(slot, null);
	    }
	    
	    return stack;
	}
	
	@Override
	public int getInventoryStackLimit() 
	{
	    return 64;
	}
	
	@Override
	public boolean isUseableByPlayer(EntityPlayer player) 
	{
	    return worldObj.getBlockTileEntity(xCoord, yCoord, zCoord) == this && player.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) < 64;
	}
	
	@Override
	public void openChest() 
	{
		
	}
	
	@Override
	public void closeChest() 
	{
		
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tagCompound) 
	{
	    super.readFromNBT(tagCompound);
	    
	    NBTTagList tagList = tagCompound.getTagList("Inventory");
	    
	    for (int i = 0; i < tagList.tagCount(); i++) 
	    {
	        NBTTagCompound tag = (NBTTagCompound) tagList.tagAt(i);
	        
	        byte slot = tag.getByte("Slot");
	        
	        if (slot >= 0 && slot < inventory.length) 
	        {
	        	inventory[slot] = ItemStack.loadItemStackFromNBT(tag);
	        }
	    }
	}
	
	@Override
	public void writeToNBT(NBTTagCompound tagCompound) 
	{
	    super.writeToNBT(tagCompound);
	                    
	    NBTTagList itemList = new NBTTagList();
	    
	    for (int i = 0; i < inventory.length; i++) 
	    {
	        ItemStack stack = inventory[i];
	        
	        if (stack != null) 
	        {
	            NBTTagCompound tag = new NBTTagCompound();
	            tag.setByte("Slot", (byte) i);
	            stack.writeToNBT(tag);
	            itemList.appendTag(tag);
	        }
	    }
	    
	    tagCompound.setTag("Inventory", itemList);
	}
	
	@Override
	public String getInvName() 
	{
		return "TileEntityTiny";
	}
}