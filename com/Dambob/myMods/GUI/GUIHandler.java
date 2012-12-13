package com.Dambob.myMods.GUI;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;

import com.Dambob.myMods.Container.ContainerTiny;
import com.Dambob.myMods.Tiles.TileEntityTiny;

import cpw.mods.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler
{

	//returns an instance of the Container you made earlier
	@Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) 
    {
        TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
        
        if(tileEntity instanceof TileEntityTiny)
        {
            return new ContainerTiny(player.inventory, (TileEntityTiny) tileEntity);
        }
        
        return null;
    }

    //returns an instance of the Gui you made earlier
	@Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) 
    {
        TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
        
        if(tileEntity instanceof TileEntityTiny)
        {
            return new GUITiny(player.inventory, (TileEntityTiny) tileEntity);
        }
        
        return null;
    }	
	
}
