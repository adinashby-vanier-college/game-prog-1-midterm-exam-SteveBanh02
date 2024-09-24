// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Snake extends Actor
{

    /**
     * set the limit of our random number from 0 to 359
     */
    public Snake()
    {
        turn(Greenfoot.getRandomNumber(360));
    }

    /**
     * Act - do whatever the Snake wants to do. This method allows the snake to move around, eat the pig, and transition to the losing world if the player lost
     */
    public void act()
    {
        movingAround();
        eatPig();
        if (isGameLost()) {
            transitionToLosingWorld();
        }
    }

    /**
     * for the snake to move around randomly
     */
    public void movingAround()
    {
        move(3);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * if the snake intersects with the pig, it removes the pig from the world
     */
    public void eatPig()
    {
        Actor pig = getOneIntersectingObject(Pig.class);
        if (pig != null) {
            World world = getWorld();
            world.removeObject(pig);
        }
    }

    /**
     * checks if the player lost by checking if pig is gone
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Pig.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * the transition to our losing world
     */
    public void transitionToLosingWorld()
    {
        World gameOver =  new  LoserWorld();
        Greenfoot.setWorld(gameOver);
    }
}
