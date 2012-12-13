package com.Dambob.myMods.Recipes;

import com.Dambob.myMods.Blocks.BlockIds;
import com.Dambob.myMods.Items.ModItems;

import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class SmeltingRecipes 
{

	public static void init()
	{
		
		GameRegistry.addSmelting(BlockIds.TITANIUM_ORE, new ItemStack(ModItems.TitaniumIngot, 1), 20F);
		
	};
	
};
