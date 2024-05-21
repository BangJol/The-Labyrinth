import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    GreenfootSound myMusic = new GreenfootSound("Undertale.wav");
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        myMusic.playLoop();
        if(Greenfoot.mouseClicked(this))
        {
            myMusic.stop();
            Greenfoot.delay(10);      
            Greenfoot.setWorld(new Instruction());
        }
    }
}
