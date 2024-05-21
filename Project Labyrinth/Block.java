import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    private int count = 0;
    /**
     * Act - do whatever the Block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Block()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/2;
        int myNewWidth = (int)myImage.getWidth()/2+20;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public void act()
    {
        if(count < 130)
        {
            move(1);
            count++;
        }
        else if(count >= 130 && count < 260)
        {
            move(-1);
            count++;
        }
        else if(count == 260)
        {
            count = 0;
        }
    }
}
