package com.ivianrr.dsmod.proxy;

import com.ivianrr.dsmod.init.blocks.TitaniteBlock;
import com.ivianrr.dsmod.init.blocks.ModBlocks;
import com.ivianrr.dsmod.init.items.Titanita;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ivianrr.dsmod.init.items.ModItems;

@Mod.EventBusSubscriber
public class CommonProxy 
{
	
	public void preInit(FMLPreInitializationEvent event)
	{		
		ModItems.init();

	}
	
	public void Init(FMLInitializationEvent event)
	{
		
	}

	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e) 
    {
        e.getRegistry().register(ModBlocks.titaniteBlock);
    }
    
	@SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e) 
    {
    	e.getRegistry().register(ModItems.titanitaNormal);	
    	
        e.getRegistry().register(new ItemBlock(ModBlocks.titaniteBlock).setRegistryName(ModBlocks.titaniteBlock.getRegistryName()));
    }

}
