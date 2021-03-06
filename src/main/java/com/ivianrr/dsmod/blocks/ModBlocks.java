package com.ivianrr.dsmod.blocks;

import com.ivianrr.dsmod.blocks.blinkingblock.BlinkingBlock;
import com.ivianrr.dsmod.blocks.datablock.DataBlock;
import com.ivianrr.dsmod.blocks.testcontainer.TestContainerBlock;
import com.ivianrr.dsmod.items.Titanita;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ModBlocks {

	@GameRegistry.ObjectHolder("dsmod:titaniteblock")
    public static TitaniteBlock titaniteBlock;
	
	@GameRegistry.ObjectHolder("dsmod:datablock")
    public static DataBlock dataBlock;
	
	@GameRegistry.ObjectHolder("dsmod:blinkingblock")
    public static BlinkingBlock blinkingBlock;

	@GameRegistry.ObjectHolder("dsmod:testcontainerblock")
    public static TestContainerBlock testContainerBlock;
	
	public static void init() {
		titaniteBlock = new TitaniteBlock("titaniteblock");
		dataBlock = new DataBlock();
		blinkingBlock = new BlinkingBlock();
		testContainerBlock = new TestContainerBlock();
    }
	
	
	
	 @SideOnly(Side.CLIENT)
	 public static void initModels() {
		 titaniteBlock.initModel();
		 dataBlock.initModel();
		 blinkingBlock.initModel();
		 testContainerBlock.initModel();
	 }
	

	 
	 //Only for bakedmodels
	 @SideOnly(Side.CLIENT)
	 public static void initItemModels() {
		 
	 }
	 
	/*
	@GameRegistry.ObjectHolder("titanitanormal")
	public static Titanita titanitaNormal;
	
	public static void init() {
		titanitaNormal = new Titanita("titanitanormal");
	}
	
	@SideOnly(Side.CLIENT)
	public static void initModels() {
	    titanitaNormal.initModel();
	} 
	 
	 */
}
