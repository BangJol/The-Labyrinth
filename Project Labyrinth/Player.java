import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    GreenfootSound myMusic = new GreenfootSound("Battlesound.wav");
    GreenfootSound mySound = new GreenfootSound("GameOver.wav");
    private GreenfootImage right = new GreenfootImage("MC.png");
    private GreenfootImage left= new GreenfootImage("MCleft.png");
    public static int lives = 3;
    public static int score;
    boolean canslash = true;
    boolean canslash2 = true;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Movement();
        CollisionMagicWall();
        CollisionMagicWall2();
        Collisionblessingfruit2();
        Collisionblessingfruit3();
        slashprojectile();
        slashprojectile2();
        fresh_fruit_collision();
        CollisionGreenBlock();
        eatFreshFruit();
        eatBlessingFruit();
        showStatus();
        backsound();
        detectTrap();
        Teleport();
        Finish();
        Boss();
        getHolyGrail();
        damaged();
    }
    
    private void Movement()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+3,getY());
            setImage("MC.png");
            if(isTouching(Snake.class))
            {
            Greenfoot.playSound("hurt.wav");
            setLocation(getX()-24,getY());
            removeLife();
            }
            if (isTouching(Wall.class))
            {
                setLocation(getX()-3,getY());
            }
            if (isTouching(teleportwall.class))
            {
                setLocation(getX()-3,getY());
            }
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-3,getY());
            setImage("MCleft.png");
            if(isTouching(Snake.class))
            {
            Greenfoot.playSound("hurt.wav");
            setLocation(getX()+24,getY());
            removeLife();
            }
            if (isTouching(Wall.class))
            {
                setLocation(getX()+3,getY());
            }
            if (isTouching(teleportwall.class))
            {
                Greenfoot.playSound("Checkpoint.wav");
                setLocation(100,260);
            }
        }
            
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+3);
            if(isTouching(Snake.class))
            {
            Greenfoot.playSound("hurt.wav");
            setLocation(getX(),getY()-24);
            removeLife();
            }
            if(isTouching(Wall.class))
            {
            setLocation(getX(),getY()-3);
            }
            if (isTouching(teleportwall.class))
            {
                setLocation(getX(),getY()+3);
        
            }
        }
            
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-3);
            if(isTouching(Snake.class)){
            Greenfoot.playSound("hurt.wav");
            setLocation(getX(),getY()+24);
            removeLife();
            }
            if(isTouching(Wall.class)){
            setLocation(getX(),getY()+3);
            }
            if (isTouching(teleportwall.class))
            {
                setLocation(getX(),getY()-3);
            }
        }
    }
    
    public void CollisionMagicWall()
    {
        if(isTouching(wallcollision.class))
        {
            removeTouching(wallcollision.class);
            getWorld().addObject(new arrow_trap(), 475, 450);
            getWorld().addObject(new arrow_top(), 440,700);
            getWorld().addObject(new arrow_top(), 460,700);
            getWorld().addObject(new arrow_top(), 480,700);
            getWorld().addObject(new arrow_top(), 500,700);
            
        }
    }
    
    public void CollisionGreenBlock()
    {
        if(isTouching(Block.class))
        {
            setLocation(350,590);
        }
    }
    
    public void CollisionMagicWall2()
    {
        if(isTouching(wallcollision_2.class))
        {
            removeTouching(wallcollision_2.class);
            getWorld().addObject(new arrow_trap_2(),1258,207);
        }
    }
    
    public void Collisionblessingfruit2()
    {
        if(isTouching(blessing_fruit_2.class))
        {
            increase2XScore();
            Greenfoot.playSound("eat.wav");
            removeTouching(blessing_fruit_2.class);
            getWorld().addObject(new Wall(),624,284);
        }
    }
    
    public void slashprojectile()
    {
        if(Greenfoot.isKeyDown("X")  && canslash == true)
        {
            getWorld().addObject(new slash_right(),getX()+100,getY() );
            canslash = false;
        }
        else if(!Greenfoot.isKeyDown("X"))
        {
            canslash = true;
        }
    }
    
    public void slashprojectile2()
    {
        if(Greenfoot.isKeyDown("Z")  && canslash2 == true)
        {
            getWorld().addObject(new slash_left(),getX()-100,getY() );
            canslash2 = false;
        }
        else if(!Greenfoot.isKeyDown("Z"))
        {
            canslash2 = true;
        }
    }
    
    public void fresh_fruit_collision()
    {
        if(isTouching(fresh_fruit_2.class))
        {
            increaseScore();
            Greenfoot.playSound("eat.wav");
            removeTouching(fresh_fruit_2.class);
            getWorld().addObject(new arrowbig(), 1262 , 651);
        }
    }
    
    public void Collisionblessingfruit3()
    {
        if(isTouching(blessing_fruit_3.class))
        {
            increase2XScore();
            Greenfoot.playSound("eat.wav");
            removeTouching(blessing_fruit_3.class);
            getWorld().addObject(new arrow_right(),0,56);
            getWorld().addObject(new arrow_right(),0,545);
            getWorld().addObject(new arrow_right(),0,530);
            getWorld().addObject(new arrow_right(),0,515);
            getWorld().addObject(new arrow_right(),0,500);
            getWorld().addObject(new arrow_right(),0,485);
            getWorld().addObject(new arrow_right(),0,470);
            getWorld().addObject(new arrow_right(),0,455);
            getWorld().addObject(new arrow_right(),0,440);
            getWorld().addObject(new arrow_right(),0,425);
            getWorld().addObject(new arrow_right(),0,410);
            getWorld().addObject(new arrow_right(),0,395);
            getWorld().addObject(new arrow_right(),0,380);
            getWorld().addObject(new arrow_right(),0,365);
        }
    }
    
    public void eatFreshFruit()
    {
        if(isTouching(fresh_fruit.class))
        {
            Greenfoot.playSound("eat.wav");
            removeTouching(fresh_fruit.class);
            increaseScore();
        }
    }

    public void eatBlessingFruit()
    {
        if(isTouching(blessing_fruit.class))
        {
            Greenfoot.playSound("eat.wav");
            removeTouching(blessing_fruit.class);
            increase2XScore();
        }
    }

    public void getHolyGrail()
    {
        if(isTouching(Holy_grail.class))
        {
            Greenfoot.playSound("Grail.wav");
            removeTouching(Holy_grail.class);
            increaseBonus();
            getWorld().addObject(new teleportwall(),440,392);
            getWorld().addObject(new arrow_big_right_stage_2(),0,404);
        }
    }

    public void showStatus()
    {
        getWorld().showText("Lives = "+lives , 115, 665);
        getWorld().showText("Score = "+score , 115, 685);
    }

    public void increaseScore()
    {
        score = score+10;
        showStatus();
    }

    public void increase2XScore()
    {
        score = score+20;
        showStatus();
    }

    public void increaseBonus()
    {
        score = score+100;
        showStatus();
    }

    public void removeLife()
    {
        lives--;
        testEndGame();
        showStatus();
    }

    public void backsound()
    {
        if(lives != 0)
        {
            myMusic.playLoop();
        }
    }

    public void testEndGame()
    {
        if(lives == 0)
        {
            if(myMusic.isPlaying())
            {
            myMusic.stop();
            Greenfoot.delay(10);
            Greenfoot.setWorld(new GameOver());
            }     
        }
    }

    public void detectTrap()
    {
        if(isTouching(arrow.class))
        {
            Greenfoot.playSound("hurt.wav");
            removeTouching(arrow_trap.class);
            removeLife();
        }
    }
    
    public void Teleport()
    {
        if(isTouching(Portal.class))
        {
            if(myMusic.isPlaying())
            {
            Greenfoot.playSound("Checkpoint.wav");
            myMusic.stop();
            Greenfoot.setWorld(new Stage2());
            }
        }
    }
    
    public void Finish()
    {
        if(isTouching(Checkpoint.class))
        {
            if(myMusic.isPlaying())
            {
            Greenfoot.playSound("Checkpoint.wav");
            lives = 3;
            myMusic.stop();
            Greenfoot.setWorld(new GoodJob());
            }
        }
    }
    
    public void Boss()
    {
        if(isTouching(Undefeated.class))
        {
            removeTouching(arrow_trap.class);
            lives = 0;
            Greenfoot.playSound("hurt.wav");
            testEndGame();
        }
    }
    
    public void damaged()
    {
        if(isTouching(damagedown.class))
        {
            removeLife();
            Greenfoot.playSound("hurt.wav");
        }
    }
    
}
