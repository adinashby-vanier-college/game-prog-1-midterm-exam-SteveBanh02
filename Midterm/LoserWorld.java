// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class LoserWorld extends World
{

    /**
     * Constructor for objects of class GameOver. display our losing text as well as playing our losing sound
     */
    public LoserWorld()
    {
        super(600, 400, 1);
        showLosingText("Game Over !", 150, 200);
        losingSound();
    }

    /**
     * shows our losing text
     */
    public void showLosingText(String message, int x, int y)
    {
        GreenfootImage text = getBackground();
        Font font =  new  Font(60);
        text.setFont(font);
        text.setColor(Color.WHITE);
        text.drawString(message, x, y);
    }

    /**
     * for playing our losing sound
     */
    public void losingSound()
    {
        Greenfoot.playSound("lose.wav");
    }
}
