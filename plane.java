import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class plane extends Actor
{
    private int speed = 2;
    public void act()
    {
        move(speed);
        if (isAtEdge()){
            turn(45);
        }
    }
}
