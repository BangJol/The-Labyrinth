import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{    
    GreenfootSound mySound = new GreenfootSound("GameOver.wav"); 
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
    }
    public void act()
    {
        mySound.play();
        if(Greenfoot.mouseClicked(this))
        {
            Player.lives = 3;
            Player.score = 0;
            mySound.stop();
            Greenfoot.delay(10);      
            Greenfoot.setWorld(new WelcomeScreen());
        }
    }
}
