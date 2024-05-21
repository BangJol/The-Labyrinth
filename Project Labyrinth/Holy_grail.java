import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Holy_grail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Holy_grail extends Actor
{
    public Holy_grail()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/16;
        int myNewWidth = (int)myImage.getWidth()/16;
        myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the Holy_grail wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
