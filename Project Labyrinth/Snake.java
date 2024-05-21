import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    private int count = 0;
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(count < 100)
        {
            move(2);
            count++;
        }
        else if(count >= 100 && count < 200)
        {
            setImage("snake_2.png");
            move(-2);
            count++;
        }
        else if(count == 200)
        {
            setImage("snake.png");
            count = 0;
        }
    }
}
