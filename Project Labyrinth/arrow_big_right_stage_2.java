import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrow_big_right_stage_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrow_big_right_stage_2 extends arrow
{
    private int count = 0;
    /**
     * Act - do whatever the arrow_big_right_stage_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public arrow_big_right_stage_2()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*3;
        int myNewWidth = (int)myImage.getWidth()*3;
        myImage.scale(myNewWidth, myNewHeight);
    }

    public void act()
    {
       if(count < 200)
       {
            move(2);
            count++;
       }
        else if(count == 200 )
       {
            getWorld().removeObject(this);
       }
    }
}
