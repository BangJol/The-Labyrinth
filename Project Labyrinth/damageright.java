import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class damageright here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class damageright extends damagedown
{
    private int count = 0;
    /**
     * Act - do whatever the damageright wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Player.class))
        {
            setLocation(866,132);
            count = 0;
        }
        if(isTouching(slash_left.class))
        {
            setLocation(866,132);
            count = 0;
        }
        if(isTouching(slash_right.class))
        {
            setLocation(866,132);
            count = 0;
        }
        if(count < 200)
        {
            setLocation(getX()+1,getY());
            count++;
        }
        else if(count == 200 )
        {
            setLocation(866,132);
            count = 0;
        }
    }
}