import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class damagedown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class damagedown extends Actor
{
    private int count = 0;
    public damagedown()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/3;
        int myNewWidth = (int)myImage.getWidth()/3;
        myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the damagedown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Player.class))
        {
            setLocation(859,182);
            count = 0;
        }
        if(isTouching(slash_left.class))
        {
            setLocation(859,182);
            count = 0;
        }
        if(isTouching(slash_right.class))
        {
            setLocation(859,182);
            count = 0;
        }
        if(count < 200)
        {
            setLocation(getX(),getY()+1);
            count++;
        }
        else if(count == 200 )
        {
            setLocation(859,182);
            count = 0;
        }

    }
}
