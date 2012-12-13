package com.Dambob.myMods.Recipes;

import com.Dambob.myMods.Blocks.ModBlocks;
import com.Dambob.myMods.Items.ModItems;

import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes 
{

	public static void init()
	{
		
		GameRegistry.addRecipe(new ItemStack(ModItems.PickaxeTitanium, 1), "XXX", " A ", " A ", Character.valueOf('X'), new ItemStack(ModItems.TitaniumIngot), Character.valueOf('A'), new ItemStack(Item.stick));
		GameRegistry.addRecipe(new ItemStack(ModItems.SwordTitanium, 1), " X ", " X ", " A ", Character.valueOf('X'), new ItemStack(ModItems.TitaniumIngot), Character.valueOf('A'), new ItemStack(Item.stick));
		GameRegistry.addRecipe(new ItemStack(ModItems.ShovelTitanium, 1), " X ", " A ", " A ", Character.valueOf('X'), new ItemStack(ModItems.TitaniumIngot), Character.valueOf('A'), new ItemStack(Item.stick));
		GameRegistry.addRecipe(new ItemStack(ModItems.AxeTitanium, 1), "XX ", "XA ", " A ", Character.valueOf('X'), new ItemStack(ModItems.TitaniumIngot), Character.valueOf('A'), new ItemStack(Item.stick));
		GameRegistry.addRecipe(new ItemStack(ModItems.AxeTitanium, 1), " XX", " AX", " A ", Character.valueOf('X'), new ItemStack(ModItems.TitaniumIngot), Character.valueOf('A'), new ItemStack(Item.stick));
		GameRegistry.addRecipe(new ItemStack(ModItems.HoeTitanium, 1), " XX", " A ", " A ", Character.valueOf('X'), new ItemStack(ModItems.TitaniumIngot), Character.valueOf('A'), new ItemStack(Item.stick));
		GameRegistry.addRecipe(new ItemStack(ModItems.HoeTitanium, 1), "XX ", " A ", " A ", Character.valueOf('X'), new ItemStack(ModItems.TitaniumIngot), Character.valueOf('A'), new ItemStack(Item.stick));		
		GameRegistry.addRecipe(new ItemStack(ModItems.HelmetTitanium, 1), "XXX", "X X", Character.valueOf('X'), new ItemStack(ModItems.TitaniumIngot));
		GameRegistry.addRecipe(new ItemStack(ModItems.PlateTitanium, 1), "X X", "XXX", "XXX", Character.valueOf('X'), new ItemStack(ModItems.TitaniumIngot));
		GameRegistry.addRecipe(new ItemStack(ModItems.LegsTitanium, 1), "XXX", "X X", "X X", Character.valueOf('X'), new ItemStack(ModItems.TitaniumIngot));
		GameRegistry.addRecipe(new ItemStack(ModItems.BootsTitanium, 1), "X X", "X X", Character.valueOf('X'), new ItemStack(ModItems.TitaniumIngot));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.TinyChestBlock, 1), " X ", "X X", " X ", Character.valueOf('X'), new ItemStack(Block.planks));
		
	};
	
};
