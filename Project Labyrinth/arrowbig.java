import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrowbig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrowbig extends arrow
{
    private int count = 0;
    /**
     * Act - do whatever the arrowbig wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public arrowbig()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*2;
        int myNewWidth = (int)myImage.getWidth()*2;
        myImage.scale(myNewWidth, myNewHeight);
    }

    public void act()
    {
        if(count < 200)
        {
            move(-2);
            count++;
        }
        else if(count == 200 )
        {
            getWorld().removeObject(this);
        }
    }
}
