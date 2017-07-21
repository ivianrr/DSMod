package com.ivianrr.dsmod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ModItems 
{
	@GameRegistry.ObjectHolder("dsmod:titanitanormal")
	public static Titanita titanitaNormal;
	
	public static void init() {
		titanitaNormal = new Titanita("titanitanormal");
    }
	
	@SideOnly(Side.CLIENT)
    public static void initModels() {
        titanitaNormal.initModel();
    }
}
