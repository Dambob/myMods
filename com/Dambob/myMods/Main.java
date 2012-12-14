package com.Dambob.myMods;

//Includes
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.DungeonHooks;

import com.Dambob.myMods.Blocks.ModBlocks;
import com.Dambob.myMods.GUI.GUIHandler;
import com.Dambob.myMods.Items.ModItems;
import com.Dambob.myMods.Recipes.Recipes;
import com.Dambob.myMods.Recipes.SmeltingRecipes;
import com.Dambob.myMods.Tiles.TileEntities;

import client.Dambob.FirstMod.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

//Sets the mod ID
@Mod(modid = "Main Mod", name = "First Mod", version = "0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false, 
clientPacketHandlerSpec = @SidedPacketHandler(channels = {"First Mod" }, packetHandler = client.Dambob.FirstMod.ClientPacketHandler.class),
serverPacketHandlerSpec =@SidedPacketHandler(channels = {"First Mod" }, packetHandler = com.Dambob.myMods.ServerPacketHandler.class))


public class Main 
{

	@SidedProxy(clientSide = "client.Dambob.FirstMod.ClientProxy", serverSide = "com.Dambob.myMods.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance
	public static Main instance = new Main();
	private GUIHandler guiHandler = new GUIHandler();
	
	
	public class MyForgeMod
	{
		
	};
	
	//pre init
	//
	//
	//
	
	@Init
	public void LoadFrom(FMLInitializationEvent event)
	{
		
		//
		proxy.registerRenderInformation();
		
		ClientProxy.registerRenderInformation();
		
		//Create blocks and register them
		ModBlocks.init();
		
		//Create items
		ModItems.init();
		
		//Register recipes
		Recipes.init();
		
		//Register smelting recipes
		SmeltingRecipes.init();
		
		TileEntities.init();
		
		//Register World Gen
		GameRegistry.registerWorldGenerator(new FirstWorldGen());
		
		//Add Dungeon loot
		DungeonHooks.addDungeonLoot(new ItemStack(ModItems.TitaniumIngot), 10, 1, 4);
		
		NetworkRegistry.instance().registerGuiHandler(instance, guiHandler);
		
	};
	
	//post init
	//
	//
	//
	
};
