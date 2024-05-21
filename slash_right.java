import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class slash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class slash_right extends Actor
{
    GreenfootSound mySing2 = new GreenfootSound("Singsing.wav");
    private int count = 0;
    /**
     * Act - do whatever the slash_right wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public slash_right()
    {
        GreenfootSound mySing2 = new GreenfootSound("Singsing.wav");
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/5-11;
        int myNewWidth = (int)myImage.getWidth()/5-11;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        brokenwallcollision();
        if(count < 20)
        {
            mySing2.play();
            setLocation(getX()+1,getY());
            count++;
            if(isTouching(Snake.class))
            {
            removeTouching(Snake.class); 
            }
        }
        if(count == 20)
        {
            getWorld().removeObject(this);
        }
    }
    
    public void brokenwallcollision()
    {
        if(isTouching(wallbroken.class))
        {
            Greenfoot.playSound("Brokenwall.wav");
            removeTouching(wallbroken.class);
        }
    }
}

