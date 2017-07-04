package com.ivianrr.dsmod.proxy;

import com.ivianrr.dsmod.blocks.ModBlocks;
import com.ivianrr.dsmod.items.ModItems;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;


@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
	}
	
	@Override
	public void Init(FMLInitializationEvent event)
	{
		super.Init(event);
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event)
	{
		super.postInit(event);
		ModBlocks.initItemModels();//vacio

	}
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) 
	{
        ModBlocks.initModels();
		ModItems.initModels();
	}
}
