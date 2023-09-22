import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sky extends World
{

    /**
     * Constructor for objects of class sky.
     * 
     */
    public sky()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new plane(), 100, 100);
        addObject(new plane(), 500, 100);
        addObject(new plane(), 100, 300);
        addObject(new plane(), 500, 300);
    }
}
