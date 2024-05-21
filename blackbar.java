import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blackbar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blackbar extends Actor
{
    public blackbar()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/2-10;
        int myNewWidth = (int)myImage.getWidth()/2+200;
        myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the blackbar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
