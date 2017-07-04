package com.ivianrr.dsmod.blocks;

import com.ivianrr.dsmod.items.Titanita;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@GameRegistry.ObjectHolder("dsmod")
public class ModBlocks {

	@GameRegistry.ObjectHolder("titaniteblock")
    public static TitaniteBlock titaniteBlock = new TitaniteBlock("titaniteblock");

	 @SideOnly(Side.CLIENT)
	 public static void initModels() {
		 titaniteBlock.initModel();
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
