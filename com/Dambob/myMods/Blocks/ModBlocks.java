package com.Dambob.myMods.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

//Create blocks

public class ModBlocks 
{

	/* Block name constants */
    public static final String TITANIUM_ORE_NAME = "titaniumOre";
    public static final String TINY_CHEST_NAME = "tinyChest";

    /* Mod block instances */
	public static Block TitaniumOreBlock;
	public static Block TinyChestBlock;

	public static void init() 
	{
		
		//Populate instance
		TitaniumOreBlock = new BlockTitaniumOre(BlockIds.TITANIUM_ORE, 0, Material.rock, TITANIUM_ORE_NAME);
		TinyChestBlock = new BlockTiny(BlockIds.TINY_CHEST, 1, Material.wood, TINY_CHEST_NAME);
		
		//Add name to languages
		LanguageRegistry.instance().addNameForObject(TitaniumOreBlock, "en_GB", "Titanium Ore");
		LanguageRegistry.instance().addNameForObject(TinyChestBlock, "en_GB", "Tiny Chest");
		
		LanguageRegistry.addName(TitaniumOreBlock, "Titanium Ore");
		LanguageRegistry.addName(TinyChestBlock, "Tiny Chest");
				
		//Add to game
		GameRegistry.registerBlock(TitaniumOreBlock);
		GameRegistry.registerBlock(TinyChestBlock);
		
		
				
	};
	
};
