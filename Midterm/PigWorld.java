// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PigWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public PigWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pig pig =  new  Pig();
        addObject(pig, 310, 190);
        Snake snake =  new  Snake();
        addObject(snake, 31, 30);
        Burger burger =  new  Burger();
        addObject(burger, 440, 80);
        Burger burger2 =  new  Burger();
        addObject(burger2, 172, 99);
        Burger burger3 =  new  Burger();
        addObject(burger3, 73, 313);
        Burger burger4 =  new  Burger();
        addObject(burger4, 453, 318);
        burger2.setLocation(170, 100);
        burger2.setLocation(535, 190);
        burger.setLocation(503, 42);
        burger4.setLocation(458, 346);
        pig.setLocation(305, 200);
    }
}
