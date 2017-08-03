package com.ivianrr.dsmod.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import com.ivianrr.dsmod.blocks.testcontainer.TestContainer;
import com.ivianrr.dsmod.blocks.testcontainer.TestContainerBlock;
import com.ivianrr.dsmod.blocks.testcontainer.TestContainerGui;
import com.ivianrr.dsmod.blocks.testcontainer.TestContainerTileEntity;

public class GuiProxy implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity te = world.getTileEntity(pos);
        //if (te instanceof TestContainerTileEntity) {
        if(ID == TestContainerBlock.GUI_ID){
        	return new TestContainer(player.inventory, (TestContainerTileEntity) te);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity te = world.getTileEntity(pos);
        //if (te instanceof TestContainerTileEntity) {
        if(ID == TestContainerBlock.GUI_ID){
        	TestContainerTileEntity containerTileEntity = (TestContainerTileEntity) te;
            return new TestContainerGui(containerTileEntity, new TestContainer(player.inventory, containerTileEntity));
        }
        return null;
    }
}
