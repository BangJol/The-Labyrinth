import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fresh_fruit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fresh_fruit extends Actor
{
    public fresh_fruit()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()-26 ;
        int myNewWidth = (int)myImage.getWidth()-26;
        myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the fresh_fruit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
