package com.techiinexus.letsmodreboot;

import com.techiinexus.letsmodreboot.handler.ConfigurationHandler;
import com.techiinexus.letsmodreboot.init.ModItems;
import com.techiinexus.letsmodreboot.proxy.IProxy;
import com.techiinexus.letsmodreboot.reference.Reference;
import com.techiinexus.letsmodreboot.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class LetsModReboot {

	@Mod.Instance(Reference.MOD_ID)
	public static LetsModReboot instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY, serverSide=Reference.SERVER_PROXY)
	public static IProxy proxy;
	
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		ModItems.init();
		LogHelper.info("Pre Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		LogHelper.info("Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void postInit (FMLPostInitializationEvent event){
		LogHelper.info("Post Initialization Complete!");
	}
}
