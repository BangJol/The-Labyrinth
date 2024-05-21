import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrow_trap_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrow_trap_3 extends arrow
{
    /**
     * Act - do whatever the arrow_trap_3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int count = 0;
   
    
    public void act()
    {
        if(isTouching(Player.class))
        {
            setLocation(408,754);
            count = 0;
        }
        else if(count < 100)
        {
            move(-2);
            count++;
        }
        else if(count == 100 )
        {
            setLocation(408,754);
            count = 0;
        }
    }
}
