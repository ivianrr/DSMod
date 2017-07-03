package com.ivianrr.dsmod.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TitaniteBlock extends Block {
	public TitaniteBlock(String name) {
		super(Material.ROCK);
		setRegistryName(name);
		setUnlocalizedName(getRegistryName().toString());
		setCreativeTab(CreativeTabs.MATERIALS);
	}
	
	
}
