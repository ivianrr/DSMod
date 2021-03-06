package com.ivianrr.dsmod.blocks.blinkingblock;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlinkingBlock extends Block implements ITileEntityProvider {

    public static final PropertyBool LIT = PropertyBool.create("lit");

    public BlinkingBlock() {
        super(Material.ROCK);
        setRegistryName("blinkingblock");
        setUnlocalizedName(getRegistryName().toString());
		setCreativeTab(CreativeTabs.MATERIALS);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new BlinkingTileEntity();
    }

    private BlinkingTileEntity getTE(IBlockAccess world, BlockPos pos) {
        return (BlinkingTileEntity) world.getTileEntity(pos);
    }

    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess world, BlockPos pos) {
        return state.withProperty(LIT, getTE(world, pos).isLit());
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer (this, LIT);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return 0;
    }
    
    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) 
        {

    		if (world.isRemote) {
            // We only count on the client side.
    			int entities = ((BlinkingTileEntity)world.getTileEntity(pos)).getCounter();
                TextComponentTranslation component = new TextComponentTranslation("message.dsmod.counter_par", entities);
                component.getStyle().setColor(TextFormatting.BLUE);
                player.sendStatusMessage(component, false);
            }

        return true;
    }
}