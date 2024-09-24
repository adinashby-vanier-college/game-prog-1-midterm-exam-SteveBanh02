// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class WinnerWorld extends World
{

    /**
     * Constructor for objects of class WinningWorld. For displaying our text and play our winning sound
     */
    public WinnerWorld()
    {
        super(600, 400, 1);
        showWinningText("You Won !", 150, 200);
        winSound();
    }

    /**
     * shows our win text in the world
     */
    public void showWinningText(String message, int x, int y)
    {
        GreenfootImage text = getBackground();
        Font font =  new  Font(60);
        text.setFont(font);
        text.setColor(Color.BLACK);
        text.drawString(message, x, y);
    }

    /**
     * plays the winning sound 
     */
    public void winSound()
    {
        Greenfoot.playSound("win.wav");
    }
}
