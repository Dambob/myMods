package com.Dambob.myMods.Items;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import com.Dambob.myMods.CommonProxy;
import com.Dambob.myMods.Materials.*;

public class ModItems 
{
	
	/* Item name constants */
    public static final String TITANIUM_INGOT_NAME = "titaniumIngot";
    public static final String TITANIUM_PICKAXE_NAME = "titaniumPickaxe";
    public static final String TITANIUM_SWORD_NAME = "titaniumSword";
    public static final String TITANIUM_SHOVEL_NAME = "titaniumShovel";
    public static final String TITANIUM_AXE_NAME = "titaniumAxe";
    public static final String TITANIUM_HOE_NAME = "titaniumHoe";
    public static final String TITANIUM_HELMET_NAME = "titaniumHelmet";
    public static final String TITANIUM_PLATE_NAME = "titaniumPlate";
    public static final String TITANIUM_LEGS_NAME = "titaniumLegs";
    public static final String TITANIUM_BOOTS_NAME = "titaniumBoots";
    
    /* Mod item instances */
	public static Item TitaniumIngot;
	public static Item PickaxeTitanium;
	public static Item SwordTitanium;
	public static Item ShovelTitanium;
	public static Item AxeTitanium;
	public static Item HoeTitanium;
	public static Item HelmetTitanium;
	public static Item PlateTitanium;
	public static Item LegsTitanium;
	public static Item BootsTitanium;

	public static void init() 
	{
		
		//Populate instance
		TitaniumIngot = new ItemTitaniumIngot(ItemIds.TITANIUM_INGOT, TITANIUM_INGOT_NAME);
		PickaxeTitanium = new PickaxeTitanium(ItemIds.TITANIUM_PICKAXE, ModToolMaterials.TITANIUM, TITANIUM_PICKAXE_NAME);
		SwordTitanium = new SwordTitanium(ItemIds.TITANIUM_SWORD, ModToolMaterials.TITANIUM, TITANIUM_SWORD_NAME);
		ShovelTitanium = new ShovelTitanium(ItemIds.TITANIUM_SHOVEL, ModToolMaterials.TITANIUM, TITANIUM_SHOVEL_NAME);
		AxeTitanium = new AxeTitanium(ItemIds.TITANIUM_AXE, ModToolMaterials.TITANIUM, TITANIUM_AXE_NAME);
		HoeTitanium = new HoeTitanium(ItemIds.TITANIUM_HOE, ModToolMaterials.TITANIUM, TITANIUM_HOE_NAME);
		
		HelmetTitanium = new ArmorTitanium(ItemIds.TITANIUM_HELMET, ModArmorMaterials.TITANIUMArmor, CommonProxy.renderTitaniumArmor, 0, TITANIUM_HELMET_NAME, 6);
		PlateTitanium = new ArmorTitanium(ItemIds.TITANIUM_PLATE, ModArmorMaterials.TITANIUMArmor, CommonProxy.renderTitaniumArmor, 1, TITANIUM_PLATE_NAME, 7);
		LegsTitanium = new ArmorTitanium(ItemIds.TITANIUM_LEGS, ModArmorMaterials.TITANIUMArmor, CommonProxy.renderTitaniumArmor, 2, TITANIUM_LEGS_NAME, 8);
		BootsTitanium = new ArmorTitanium(ItemIds.TITANIUM_BOOTS, ModArmorMaterials.TITANIUMArmor, CommonProxy.renderTitaniumArmor, 3, TITANIUM_BOOTS_NAME, 9);
		
		
		//Add name to languages
		LanguageRegistry.instance().addNameForObject(TitaniumIngot, "en_GB", "Titanium Ingot");
		LanguageRegistry.instance().addNameForObject(PickaxeTitanium, "en_GB", "Titanium Pickaxe");
		LanguageRegistry.instance().addNameForObject(SwordTitanium, "en_GB", "Titanium Sword");
		LanguageRegistry.instance().addNameForObject(ShovelTitanium, "en_GB", "Titanium Shovel");
		LanguageRegistry.instance().addNameForObject(AxeTitanium, "en_GB", "Titanium Axe");
		LanguageRegistry.instance().addNameForObject(HoeTitanium, "en_GB", "Titanium Hoe");
		LanguageRegistry.instance().addNameForObject(HelmetTitanium, "en_GB", "Titanium Helmet");
		LanguageRegistry.instance().addNameForObject(PlateTitanium, "en_GB", "Titanium Chestplate");
		LanguageRegistry.instance().addNameForObject(LegsTitanium, "en_GB", "Titanium Leggings");
		LanguageRegistry.instance().addNameForObject(BootsTitanium, "en_GB", "Titanium Boots");
		
		LanguageRegistry.addName(TitaniumIngot, "Titanium Ingot");
		LanguageRegistry.addName(PickaxeTitanium, "Titanium Pickaxe");
		LanguageRegistry.addName(SwordTitanium, "Titanium Sword");
		LanguageRegistry.addName(ShovelTitanium, "Titanium Shovel");
		LanguageRegistry.addName(AxeTitanium, "Titanium Axe");
		LanguageRegistry.addName(HoeTitanium, "Titanium Hoe");
		LanguageRegistry.addName(HelmetTitanium, "Titanium Helmet");
		LanguageRegistry.addName(PlateTitanium, "Titanium Chestlate");
		LanguageRegistry.addName(LegsTitanium, "Titanium Leggings");
		LanguageRegistry.addName(BootsTitanium, "Titanium Boots");
	
	};
					
};
