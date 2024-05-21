import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrow_stage_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrow_stage_2 extends arrow
{
    private int count = 0;
    /**
     * Act - do whatever the arrow_stage_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Player.class))
        {
            setLocation(1278,87);
            count = 0;
        }
        else if(count < 200)
        {
            move(-1);
            count++;
        }
        else if(count == 200 )
        {
            setLocation(1278,87);
            count = 0;
        }
    }
}
