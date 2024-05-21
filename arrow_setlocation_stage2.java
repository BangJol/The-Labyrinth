import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrow_setlocation_stage2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrow_setlocation_stage2 extends arrow
{
    private int count = 0;
    /**
     * Act - do whatever the arrow_setlocation_stage2 wants to do. This method is called whenever
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
            move(-1);
            count++;
        }
        else if(count==100)
        {
            setLocation(1275,522);
            count++;
        }
        else if(count > 100 && count < 200 )
        {
            move(-1);
            count++;
        }
        else if(count == 200)
        {
            setLocation(1277,394);
            count = 0;
        }
    }
}
