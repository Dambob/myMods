package com.Dambob.myMods.Container;

import com.Dambob.myMods.Tiles.TileEntityTiny;
import net.minecraft.src.*;

public class ContainerTiny extends Container
{
	protected TileEntityTiny tileEntity;
	private int 	width = 9,
    				height = 1;
    
    public ContainerTiny(InventoryPlayer inventoryPlayer, TileEntityTiny te)
    {
	    tileEntity = te;
	    
	    int slotNumber = 0;
	    
	    int 	width = 9,
	    		height = 1;
	    
	    for (int i = 0; i < height; i++)
	    {
	    	for (int j = 0; j < width; j++)
	    	{
	    		//the Slot constructor takes the IInventory and the slot number in that it binds to
	    	    //and the x-y coordinates it resides on-screen
	    	    addSlotToContainer(new Slot( tileEntity, slotNumber, 8 + (j*18), 18 + (i*18) ));
	    	
	    	    
	    	    slotNumber++;
	    	}
	    }
	    
	    //commonly used vanilla code that adds the player's inventory
	    bindPlayerInventory(inventoryPlayer);
	
	    
    };

    @Override
    public boolean canInteractWith(EntityPlayer player) 
    {
        return tileEntity.isUseableByPlayer(player);
    };


    protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) 
    {
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 9; j++) 
            {
                addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            };
        };

        for (int i = 0; i < 9; i++) 
        {
            addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
        };
    };
    
    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slot)
    {
        ItemStack stack = null;
        Slot slotObject = (Slot) inventorySlots.get(slot);

        //null checks and checks if the item can be stacked (maxStackSize > 1)
        if (slotObject != null && slotObject.getHasStack()) 
        {
            ItemStack stackInSlot = slotObject.getStack();
            stack = stackInSlot.copy();
            
            int numSlots = width * height;

            //merges the item into player inventory since its in the tileEntity
            //this assumes only 1 slot, for inventories with > 1 slots, check out the Chest Container.
            if (slot < numSlots) 
            {
                if (!mergeItemStack(stackInSlot, 0, inventorySlots.size(), true))
                {
                    return null;
                }
            //places it into the tileEntity is possible since its in the player inventory
            } 
            else if (!mergeItemStack(stackInSlot, 0, numSlots, false)) 
            {
                return null;
            }

            if (stackInSlot.stackSize == 0) 
            {
                slotObject.putStack(null);
            } 
            else 
            {
                slotObject.onSlotChanged();
            }
        }

        return stack;
    }

}
