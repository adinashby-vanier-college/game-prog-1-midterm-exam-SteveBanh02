// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pig extends Actor
{

    /**
     * Act - do whatever the Pig wants to do. This method allows the player to move, eat the burgers, and transition to the winner world if the player won
     */
    public void act()
    {
        movement();
        eatBurger();
        if (isGameWon()) {
            transitionToWinningWorld();
        }
    }

    /**
     * using our awsd key to move our pig around
     */
    public void movement()
    {
        if (Greenfoot.isKeyDown("w")) {
            turn(-2);
        }
        if (Greenfoot.isKeyDown("s")) {
            turn(2);
        }
        if (Greenfoot.isKeyDown("a")) {
            move(-2);
        }
        if (Greenfoot.isKeyDown("d")) {
            move(2);
        }
    }

    /**
     * checks if pig intersects with the burgers, it removes the pig from our world
     */
    public void eatBurger()
    {
        Actor burger = getOneIntersectingObject(Burger.class);
        if (burger != null) {
            World world = getWorld();
            world.removeObject(burger);
            Greenfoot.playSound("eating.wav");
        }
    }

    /**
     * checks if the player won by checking if all the burgers are gone
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(Burger.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * the transition to our winning world
     */
    public void transitionToWinningWorld()
    {
        World winningWorld =  new  WinnerWorld();
        Greenfoot.setWorld(winningWorld);
    }
}
