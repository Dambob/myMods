package com.Dambob.myMods;

import java.util.Random;

import com.Dambob.myMods.Blocks.ModBlocks;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class FirstWorldGen implements IWorldGenerator 
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch (world.provider.dimensionId)
		{
			//Nether
			case -1: generateNether(world, random, chunkX*16, chunkZ*16);
			
			//Surface
		    case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		    
		    //End
		    case 1: generateEnd(world, random, chunkX*16, chunkZ*16);
		};
	};
	
	private void generateEnd(World world, Random random, int i, int j) 
	{
		
	};

	private void generateNether(World world, Random random, int blockX, int blockZ) 
	{
		
	};

	private void generateSurface(World world, Random random, int blockX, int blockZ) 
	{
		for (int i = 0; i < 15; i++)
		{
			int Xcoord = blockX + random.nextInt(16);
			int Ycoord = random.nextInt(40);
			int Zcoord = blockZ + random.nextInt(16);
			int Pocketsize = 10 + random.nextInt(3);
						  
			new WorldGenMinable(ModBlocks.TitaniumOreBlock.blockID, Pocketsize).generate(world, random, Xcoord, Ycoord, Zcoord);
		};
		
	};

}
