import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake_2 extends Snake
{
    private int count = 0;
    /**
     * Act - do whatever the Snake_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(count < 450)
        {
            move(-1);
            count++;
        }
        else if(count >= 450 && count < 900)
        {
            setImage("snake.png");
            move(1);
            count++;
        }
        else if(count == 900)
        {
            setImage("snake_2.png");
            count = 0;
        }

    }
}
