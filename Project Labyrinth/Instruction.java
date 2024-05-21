import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruction extends World
{
    GreenfootSound myRules = new GreenfootSound("Rules.wav"); 
    /**
     * Constructor for objects of class Instruction.
     * 
     */
    public Instruction()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
    }
    public void act()
    {
        myRules.playLoop();
        if(Greenfoot.mouseClicked(this))
        {
            myRules.stop();
            Greenfoot.delay(10);      
            Greenfoot.setWorld(new Stage1());
        }
    }
}
