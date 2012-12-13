package com.Dambob.myMods.GUI;

import net.minecraft.src.*;

import org.lwjgl.opengl.GL11;

import com.Dambob.myMods.Container.ContainerTiny;
import com.Dambob.myMods.Tiles.TileEntityTiny;

public class GUITiny extends GuiContainer 
{
    public GUITiny (InventoryPlayer inventoryPlayer, TileEntityTiny tileEntity) 
    {
        //the container is instanciated and passed to the superclass for handling
        super(new ContainerTiny(inventoryPlayer, tileEntity));
    }

    protected void drawGuiContainerForegroundLayer(int i, int j) 
    {
        //draw text and stuff here
        //the parameters for drawString are: string, x, y, colour
        fontRenderer.drawString("Tiny Chest", 10, 6, 0x000000);
        //draws "Inventory" or your regional equivalent
        fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 0x000000);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) 
    {
        //draw your Gui here, only thing you need to change is the path
        int texture = mc.renderEngine.getTexture("/com/Dambob/myMods/Textures/TinyChestGUI.png");
        
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        
        this.mc.renderEngine.bindTexture(texture);
        
        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;
        
        this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
    }
    
}

