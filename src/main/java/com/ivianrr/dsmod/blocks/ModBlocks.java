package com.ivianrr.dsmod.blocks;

import com.ivianrr.dsmod.blocks.datablock.DataBlock;
import com.ivianrr.dsmod.items.Titanita;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ModBlocks {

	@GameRegistry.ObjectHolder("dsmod:titaniteblock")
    public static TitaniteBlock titaniteBlock;
	
	@GameRegistry.ObjectHolder("dsmod:datablock")
    public static DataBlock dataBlock;

	public static void init() {
		titaniteBlock = new TitaniteBlock("titaniteblock");
		dataBlock = new DataBlock();
    }
	
	
	
	 @SideOnly(Side.CLIENT)
	 public static void initModels() {
		 titaniteBlock.initModel();
		 dataBlock.initModel();
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
