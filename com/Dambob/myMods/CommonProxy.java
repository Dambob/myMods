package com.Dambob.myMods;

//Includes
import com.Dambob.myMods.Blocks.ModBlocks;
import com.Dambob.myMods.Container.ContainerTiny;
import com.Dambob.myMods.GUI.GUITiny;
import com.Dambob.myMods.Items.ModItems;
import com.Dambob.myMods.Recipes.Recipes;
import com.Dambob.myMods.Recipes.SmeltingRecipes;
import com.Dambob.myMods.Tiles.TileEntityTiny;
import com.Dambob.myMods.Tiles.TileEntities;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy
{
		
	//Armour type
	public static int renderTitaniumArmor = addArmor("Titanium");
		
	//Add blocks and items to world
	public static void registerRenderInformation()
	{	
		
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
		
	};
	
	public static int addArmor(String armor)
	{
		return 0;
	};
	
	

};
