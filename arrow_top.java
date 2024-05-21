import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrow_top here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrow_top extends arrow
{
    private int count = 0;
    /**
     * Act - do whatever the arrow_top wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(count < 150)
        {
            setLocation(getX(),getY()-2);
            count++;
        }
        else if( count == 150 )
        {
            getWorld().removeObject(this);
        }
    }
}
