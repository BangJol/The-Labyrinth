import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoodJob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoodJob extends World
{
    GreenfootSound Bambam = new GreenfootSound("CikiBam.mp3");
    /**
     * Constructor for objects of class GoodJob.
     * 
     */
    public GoodJob()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        blackbar blackbar = new blackbar();
        addObject(blackbar,638,572);
    }
    public void act()
    {
        showJob();
        Bambam.playLoop();
        showScore();
        if(Greenfoot.mouseClicked(this))
        {
            Bambam.stop();
            Player.lives = 3;
            Player.score = 0;
            Greenfoot.delay(10);      
            Greenfoot.setWorld(new WelcomeScreen());
        }
    }

    public void showScore()
    { 
        showText("Your Score = "+Player.score  , getWidth()/2, getHeight()/2+203);
    }
    
    public void showJob()
    {
        if(Player.score < 220 )
        {
            showText("Better Luck Next Time "  , getWidth()/2-3, getHeight()/2+220);
        }
        else if(Player.score >= 220 && Player.score < 440 )
        {
            showText(" Almost Perfect "  , getWidth()/2-3, getHeight()/2+220);
        }
        else if(Player.score == 440 )
        {
            showText("You Are Awesome "  , getWidth()/2-3, getHeight()/2+220);
        }



    }
}
