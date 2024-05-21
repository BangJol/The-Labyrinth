import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage1 extends World
{  
    /**
     * Constructor for objects of class Stage1.
     * 
     */
    public Stage1()
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
        Wall wall = new Wall();
        addObject(wall,134,14);
        wall.setLocation(70,6);
        Wall wall2 = new Wall();
        addObject(wall2,264,7);
        wall2.setLocation(210,6);
        Wall wall3 = new Wall();
        addObject(wall3,350,6);
        Wall wall4 = new Wall();
        addObject(wall4,490,6);
        Wall wall5 = new Wall();
        addObject(wall5,630,6);
        Wall wall6 = new Wall();
        addObject(wall6,770,6);
        Wall wall7 = new Wall();
        addObject(wall7,910,6);
        Wall wall8 = new Wall();
        addObject(wall8,1050,6);
        Wall wall9 = new Wall();
        addObject(wall9,1190,6);
        Wall wall10 = new Wall();
        addObject(wall10,1330,6);
        Wall wall11 = new Wall();
        addObject(wall11,70,140);
        Player player = new Player();
        addObject(player,28,65);
        Wall wall12 = new Wall();
        addObject(wall12,190,140);
        Wall wall13 = new Wall();
        addObject(wall13,446,159);
        wall13.setLocation(246,193);
        wall13.setRotation(90);
        Wall wall14 = new Wall();
        addObject(wall14,400,192);
        wall14.setRotation(90);

        Wall wall15 = new Wall();
        addObject(wall15,455,245);
        Wall wall16 = new Wall();
        addObject(wall16,550,193);
        wall16.setRotation(90);

        Wall wall17 = new Wall();
        addObject(wall17,645,128);
        wall17.setLocation(608,140);
        Wall wall18 = new Wall();
        addObject(wall18,750,140);

        Wall wall19 = new Wall();
        addObject(wall19,887,210);
        wall19.setRotation(90);
        wall19.setLocation(807,193);
        Wall wall20 = new Wall();
        addObject(wall20,1021,157);
        wall20.setLocation(1045,143);
        Wall wall21 = new Wall();
        addObject(wall21,1088,239);
        wall21.setRotation(90);
        wall21.setLocation(1276,87);
        Wall wall22 = new Wall();
        addObject(wall22,725,242);
        wall22.setLocation(757,286);
        Wall wall23 = new Wall();
        addObject(wall23,453,351);
        wall23.setRotation(90);
        wall23.setLocation(400,316);
        Wall wall24 = new Wall();
        addObject(wall24,573,304);
        wall24.setRotation(90);
        wall24.setLocation(550,321);
        Wall wall25 = new Wall();
        addObject(wall25,70,292);
        wall25.setLocation(41,268);
        Checkpoint checkpoint = new Checkpoint();
        addObject(checkpoint,17,197);
        wall25.setLocation(51,277);
        checkpoint.setLocation(10,225);
        wall25.setLocation(26,300);
        Wall wall26 = new Wall();
        addObject(wall26,112,620);
        wall26.setLocation(77,612);
        Wall wall27 = new Wall();
        addObject(wall27,247,607);
        wall27.setLocation(201,612);
        Wall wall28 = new Wall();
        addObject(wall28,394,587);
        wall28.setRotation(90);
        wall28.setLocation(263,665);
        wall26.setLocation(55,612);
        wall14.setLocation(400,195);
        Wall wall29 = new Wall();
        addObject(wall29,234,308);
        wall29.setRotation(90);
        wall29.setLocation(247,332);
        Wall wall30 = new Wall();
        addObject(wall30,194,391);
        wall30.setLocation(195,427);
        Wall wall31 = new Wall();
        addObject(wall31,644,403);
        wall31.setLocation(596,415);
        wall27.setLocation(200,612);
        wall28.setLocation(250,675);
        wall31.setLocation(606,415);
        Wall wall32 = new Wall();
        addObject(wall32,735,414);
        wall32.setLocation(739,415);
        Wall wall33 = new Wall();
        addObject(wall33,1125,280);
        wall33.setLocation(1212,274);
        Wall wall34 = new Wall();
        addObject(wall34,1075,275);
        wall34.setLocation(1074,274);
        Wall wall35 = new Wall();
        addObject(wall35,916,416);
        wall35.setLocation(889,415);
        Wall wall36 = new Wall();
        addObject(wall36,1113,415);
        wall36.setLocation(1037,415);
        Wall wall37 = new Wall();
        addObject(wall37,1267,386);
        wall37.setLocation(1192,372);
        wall37.setRotation(90);
        wall37.setLocation(1266,361);
        Wall wall38 = new Wall();
        addObject(wall38,454,714);
        Wall wall39 = new Wall();
        addObject(wall39,623,709);
        wall39.setLocation(552,709);
        Wall wall40 = new Wall();
        addObject(wall40,623,714);
        wall39.setLocation(552,714);
        Wall wall41 = new Wall();
        addObject(wall41,690,714);
        Wall wall42 = new Wall();
        addObject(wall42,830,714);
        Wall wall43 = new Wall();
        addObject(wall43,970,714);
        Wall wall44 = new Wall();
        addObject(wall44,1040,714);
        Wall wall45 = new Wall();
        addObject(wall45,1170,714);
        Wall wall46 = new Wall();
        addObject(wall46,1240,714);
        Wall wall47 = new Wall();
        addObject(wall47,1156,573);
        wall47.setLocation(1204,577);
        Wall wall48 = new Wall();
        addObject(wall48,896,525);
        wall48.setRotation(90);
        wall48.setLocation(967,465);
        wall48.setLocation(972,509);
        Wall wall49 = new Wall();
        addObject(wall49,727,557);
        wall49.setLocation(762,561);
        Wall wall50 = new Wall();
        addObject(wall50,511,469);
        wall50.setLocation(310,466);
        wall50.setLocation(300,457);
        wall38.setLocation(434,703);
        wall38.setLocation(308,713);
        wall50.setLocation(293,459);
        wall50.setLocation(356,429);
        wall50.setLocation(300,426);
        removeObject(wall23);
        Wall wall51 = new Wall();
        addObject(wall51,493,489);
        wall51.setRotation(90);
        wall51.setLocation(552,500);
        Block block = new Block();
        addObject(block,236,503);
        block.setLocation(247,512);
        block.setLocation(241,506);
        block.setRotation(90);
        block.setLocation(243,485);
        block.setLocation(246,459);
        block.setLocation(250,395);
        wall29.setLocation(247,396);
        wall29.setLocation(248,330);
        wall29.setLocation(256,403);
        wall29.setLocation(245,340);

        fresh_fruit fresh_fruit = new fresh_fruit();
        addObject(fresh_fruit,1035,85);
        fresh_fruit fresh_fruit2 = new fresh_fruit();
        addObject(fresh_fruit2,1240,646);

        fresh_fruit fresh_fruit3 = new fresh_fruit();
        addObject(fresh_fruit3,481,181);
        block.setLocation(250,457);
        block.setLocation(247,390);
        wall30.setLocation(257,420);
        wall50.setLocation(350,420);
        wall30.setLocation(256,420);

        fresh_fruit3.setLocation(440,335);

        Snake snake = new Snake();
        addObject(snake,429,68);
        arrow arrow = new arrow();
        addObject(arrow,1255,497);
        arrow.setLocation(1280,507);
        wallcollision wallcollision = new wallcollision();
        addObject(wallcollision,476,426);
        wallcollision.setLocation(475,419);
        wall36.setLocation(1225,415);
        wall48.setLocation(970,464);
        Wall wall52 = new Wall();
        addObject(wall52,247,385);
        wall52.setRotation(90);
        arrow arrow2 = new arrow();
        addObject(arrow2,1237,200);
        arrow2.setLocation(1279,206);

        Snake snake2 = new Snake();
        addObject(snake2,320,74);
        removeObject(arrow2);
        wall34.setLocation(1080,274);
        wallcollision_2 wallcollision_2 = new wallcollision_2();
        addObject(wallcollision_2,955,276);
        wallcollision_2.setLocation(999,273);

        arrow_trap_3 arrow_jebakan_3 = new arrow_trap_3();
        addObject(arrow_jebakan_3,439,666);
        arrow_jebakan_3.setRotation(90);
        arrow_jebakan_3.setLocation(434,666);
        arrow_jebakan_3.setLocation(416,703);
        arrow_jebakan_3.setLocation(414,716);
        arrow_jebakan_3.setLocation(408,754);
        arrow_top arrow_top = new arrow_top();
        addObject(arrow_top,442,663);
        arrow_top.setLocation(442,665);
        removeObject(arrow_top);
        wall39.setLocation(591,713);

        removeObject(fresh_fruit3);
        wall32.setLocation(757,415);

        removeObject(fresh_fruit);
        removeObject(fresh_fruit2);

        fresh_fruit fresh_fruit4 = new fresh_fruit();
        addObject(fresh_fruit4,741,646);
        fresh_fruit_2 fresh_fruit_2 = new fresh_fruit_2();
        addObject(fresh_fruit_2,988,648);
        fresh_fruit fresh_fruit5 = new fresh_fruit();
        addObject(fresh_fruit5,753,494);
        blessing_fruit blessing_fruit26 = new blessing_fruit();
        addObject(blessing_fruit26,1200,644);
        fresh_fruit fresh_fruit6 = new fresh_fruit();
        addObject(fresh_fruit6,886,139);
        fresh_fruit fresh_fruit7 = new fresh_fruit();
        addObject(fresh_fruit7,1184,141);
        fresh_fruit fresh_fruit8 = new fresh_fruit();
        addObject(fresh_fruit8,1038,72);
        fresh_fruit fresh_fruit9 = new fresh_fruit();
        addObject(fresh_fruit9,1072,408);
        fresh_fruit fresh_fruit10 = new fresh_fruit();
        addObject(fresh_fruit10,468,347);
        removeObject(fresh_fruit10);

        fresh_fruit fresh_fruit11 = new fresh_fruit();
        addObject(fresh_fruit11,470,330);
        fresh_fruit fresh_fruit12 = new fresh_fruit();
        addObject(fresh_fruit12,332,532);
        fresh_fruit fresh_fruit13 = new fresh_fruit();
        addObject(fresh_fruit13,476,166);
        fresh_fruit fresh_fruit14 = new fresh_fruit();
        addObject(fresh_fruit14,317,223);
        fresh_fruit fresh_fruit15 = new fresh_fruit();
        addObject(fresh_fruit15,524,637);
        wall18.setLocation(764,150);
        wall35.setLocation(951,403);

        wall18.setLocation(734,140);

        wall35.setLocation(876,414);
        blessing_fruit blessing_fruit2 = new blessing_fruit();
        addObject(blessing_fruit2,66,397);
        blessing_fruit_2 blessing_fruit_2 = new blessing_fruit_2();
        addObject(blessing_fruit_2,736,217);
        Wall wall53 = new Wall();
        addObject(wall53,624,288);
        removeObject(wall53);

        removeObject(wall19);

        wallbroken wallbroken = new wallbroken();
        addObject(wallbroken,807,190);
        wallbroken.setRotation(90);
        wall14.setLocation(390,190);
        slash_right slash_right = new slash_right();
        addObject(slash_right,384,205);
        slash_right.setLocation(446,83);
        slash_right.setLocation(232,83);
        removeObject(slash_right);
        Snake_2 snake_2 = new Snake_2();
        addObject(snake_2,1169,348);
        removeObject(snake);
        removeObject(snake_2);
        Snake_2 snake_22 = new Snake_2();
        addObject(snake_22,1182,350);
        arrow arrow3 = new arrow();
        addObject(arrow3,1240,650);
        arrow3.setLocation(1262,651);
        removeObject(arrow3);
        fresh_fruit12.setLocation(329,538);
        Block block2 = new Block();
        addObject(block2,329,538);
        removeObject(block2);
        blessing_fruit_3 blessing_fruit_3 = new blessing_fruit_3();
        addObject(blessing_fruit_3,56,442);
        removeObject(blessing_fruit2);
        checkpoint.setLocation(48,222);
        Wall wall54 = new Wall();
        addObject(wall54,87,203);
        wall54.setRotation(90);
        wall54.setLocation(8,235);
        arrow_right arrow_right = new arrow_right();
        addObject(arrow_right,4,545);
        removeObject(blessing_fruit_3);

        blessing_fruit_3 blessing_fruit_32 = new blessing_fruit_3();
        addObject(blessing_fruit_32,141,424);
        removeObject(arrow_right);
        removeObject(checkpoint);
        removeObject(wall54);
        Portal portal = new Portal();
        addObject(portal,26,217);
        BarScore barScore = new BarScore();
        addObject(barScore,77,717);
    }
}

