import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrow_jebakan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrow_trap extends arrow
{
    private int count = 0;
    /**
     * Act - do whatever the arrow_trap wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(count < 100)
        {
            move(-2);
            count++;
        }
        else if( count == 100 )
        {
            getWorld().removeObject(this);
        }        
    }
}
