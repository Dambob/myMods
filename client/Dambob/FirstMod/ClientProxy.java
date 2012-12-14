package client.Dambob.FirstMod;

import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

import com.Dambob.myMods.CommonProxy;

public class ClientProxy extends CommonProxy
{
	@SideOnly(Side.CLIENT)
	public static void registerRenderInformation()
	{
		
		preloadTextures();

	};
	
	public static void preloadTextures()
	{
		
		MinecraftForgeClient.preloadTexture("/com/Dambob/myMods/Textures/terrain.png");
		MinecraftForgeClient.preloadTexture("/com/Dambob/myMods/Textures/items.png");
		MinecraftForgeClient.preloadTexture("/com/Dambob/myMods/Textures/titanium_1.png");
		MinecraftForgeClient.preloadTexture("/com/Dambob/myMods/Textures/titanium_2.png");
		MinecraftForgeClient.preloadTexture("/com/Dambob/myMods/Textures/TinyChestGUI.png");
		
	};
	
	//Generates a number for the item material
	public static int addArmor(String armor)
	{
	    return RenderingRegistry.addNewArmourRendererPrefix(armor);
	};
	
};
