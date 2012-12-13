package com.Dambob.myMods.Tiles;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntities 
{
	
	
	
	public static void init()
	{
		
		GameRegistry.registerTileEntity(TileEntityTiny.class, "TileEntityTiny");
		
	}

}
