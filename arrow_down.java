import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrow_down here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrow_down extends arrow
{
    private int count = 0;
    /**
     * Act - do whatever the arrow_down wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Player.class))
        {
            setLocation(340,0);
            count = 0;
        }
        
        if(count < 100)
        {
            setLocation(getX(),getY()+1);
            count++;
        }
        else if(count == 100 )
        {
            setLocation(340,0);
            count = 0;
        }
    }
}
