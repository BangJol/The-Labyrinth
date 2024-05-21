import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake_stage_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake_stage_2 extends Snake
{
    private int count = 0;
    /**
     * Act - do whatever the Snake_stage_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         if(count < 220)
        {
            move(1);
            count++;
        }
        else if(count >= 220 && count < 440)
        {
            setImage("snake_2.png");
            move(-1);
            count++;
        }
        else if(count == 440)
        {
            setImage("snake.png");
            count = 0;
        }
    }
}
