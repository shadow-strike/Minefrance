package net.minecraft.src;

import java.awt.Desktop;
import java.awt.Menu;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.minecraft.client.Minecraft;

public class GuiIngameMenu extends GuiScreen
{
    /** Also counts the number of updates, not certain as to why yet. */
    private int updateCounter2;

    /** Counts the number of screen updates. */
    private int updateCounter;

    public GuiIngameMenu()
    {
        updateCounter2 = 0;
        updateCounter = 0;
    }

    /**
     * Adds the buttons (and other controls) to the screen in question.
     */
    public void initGui()
    {
        updateCounter2 = 0;
        controlList.clear();
        byte byte0 = -16;
        controlList.add(new GuiButton(1, width / 2 - 100, height / 4 + 120 + byte0, StatCollector.translateToLocal("menu.returnToMenu")));

        if (mc.isMultiplayerWorld())
        {
            ((GuiButton)controlList.get(0)).displayString = StatCollector.translateToLocal("menu.disconnect");
        }

        controlList.add(new GuiButton(60, width / 2 - 100, height / 4 + 145 + byte0,StatCollector.translateToLocal("menu.mods"))); 
        controlList.add(new GuiButton(4, width / 2 - 100, height / 4 + 24 + byte0, StatCollector.translateToLocal("menu.returnToGame")));
        controlList.add(new GuiButton(0, width / 2 - 100, height / 4 + 96 + byte0, StatCollector.translateToLocal("menu.options")));
        controlList.add(new GuiButton(5, width / 2 - 100, height / 4 + 48 + byte0, 98, 20, StatCollector.translateToLocal("gui.achievements")));
        controlList.add(new GuiButton(6, width / 2 + 2, height / 4 + 48 + byte0, 98, 20, StatCollector.translateToLocal("gui.stats")));
        controlList.add(new GuiButton(61, width / 2 - 100, height / 4 + 71 + byte0, 98, 20, StatCollector.translateToLocal("Forum")));
        controlList.add(new GuiButton(62, width / 2 + 2, height / 4 + 71 + byte0, 98, 20, StatCollector.translateToLocal("Votez!")));
    }

    /**
     * Fired when a control is clicked. This is the equivalent of ActionListener.actionPerformed(ActionEvent e).
     */
    protected void actionPerformed(GuiButton par1GuiButton)
    
    {
        switch (par1GuiButton.id)
        {
            case 2:
            case 3:
            default:
                break;

            case 0:
                mc.displayGuiScreen(new GuiOptions(this, mc.gameSettings));
                break;

            case 1:
                mc.statFileWriter.readStat(StatList.leaveGameStat, 1);

                if (mc.isMultiplayerWorld())
                {
                    mc.theWorld.sendQuittingDisconnectingPacket();
                }

                mc.changeWorld1(null);
                mc.displayGuiScreen(new GuiMainMenu());
                break;

            case 4:
                mc.displayGuiScreen(null);
                mc.setIngameFocus();
                break;

            case 5:
                mc.displayGuiScreen(new GuiAchievements(mc.statFileWriter));
                break;

            case 6:
                mc.displayGuiScreen(new GuiStats(this, mc.statFileWriter));
                break;
                
            case 60:
            	mc.displayGuiScreen(new GuiTexturePacks(this));
                break;
            case 61:
            {
                
                Desktop desktop = null;
                java.net.URI url;
                try {
                        url = new java.net.URI("http://minefrance.com/2.0/forum/"); //remplacez l'adresse
                        if (Desktop.isDesktopSupported())
                        {
                            desktop = Desktop.getDesktop();
                            desktop.browse(url);
                        }
                    }
                catch (Exception ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;
            case 62:
{
                
                Desktop desktop = null;
                java.net.URI url;
                try {
                        url = new java.net.URI("http://www.rpg-paradize.com/?page=vote&vote=30236"); //remplacez l'adresse
                        if (Desktop.isDesktopSupported())
                        {
                            desktop = Desktop.getDesktop();
                            desktop.browse(url);
                        }
                    }
                catch (Exception ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;
        }
    }

    /**
     * Called from the main game loop to update the screen.
     */
    public void updateScreen()
    {
        super.updateScreen();
        updateCounter++;
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int par1, int par2, float par3)
    {
        drawDefaultBackground();
        boolean flag = !mc.theWorld.quickSaveWorld(updateCounter2++);

        if (flag || updateCounter < 20)
        {
            float f = ((float)(updateCounter % 10) + par3) / 10F;
            f = MathHelper.sin(f * (float)Math.PI * 2.0F) * 0.2F + 0.8F;
            int i = (int)(255F * f);
            drawString(fontRenderer, "Saving level..", 8, height - 16, i << 16 | i << 8 | i);
        }

        drawCenteredString(fontRenderer, "Game menu", width / 2, 40, 0xffffff);
        super.drawScreen(par1, par2, par3);
    }
}
