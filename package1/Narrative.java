package package1;
import java.awt.Color;
import java.lang.StackWalker.Option;
import java.util.Currency;
import java.util.Stack;
import javax.crypto.CipherOutputStream;
import javax.swing.event.TableColumnModelListener;
import java.awt.Color;
/**
 * A class which designs and runs the different aspects and elements of the GUI
 *
 *  @author  Nachiket Joshi
 *  @version 5/26/22
 *  @author  Period: 3
 *  @author  Assignment: APCSJungleGame - Narrative
 *
 *  @author  Sources: Nachiket Joshi
 *  
 * 
 */
public class Narrative 
{
    JungleGame jGame;
    JungleWindow jWindow;
    TransitionUIHandler tUiHandler;
    public String currText;
    private boolean seenBandits = false;
    private Stack<Clothes> yourClothes;
    
    
    /** 
     * constructs all attributes of the game
     * @param g - jungle game ran by class
     * @param jw - jungle window used for modification
     * @param t - used to transition
     */
    public Narrative(JungleGame g, JungleWindow jw, TransitionUIHandler t)
    {
        jGame = g;
        jWindow = jw;
        tUiHandler = t;
        yourClothes = new Stack<>();
    }

    /** 
     * runs basic game situation
     */
    public void defaultGame()
    {
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        currText = "Crash! the leaves around you rustle as you sit up \n you observe your surroundings, a vast jungle, with a river flowing through it \n Your stomach rumbles and you feel the dryness of your mouth";
        jWindow.text.setText(currText);
        jGame.pos1 = "forage";
        jGame.pos2 = "";
        jGame.pos3 = "";

       
        

    }

    /** 
     * @param nextPosition - the new action which 
     * needs to be attributed to the button
     */
    public void updatePosition(String nextPosition)
    {
        switch(nextPosition)
        {
            case "forage": forageSection(); break;
            case "river": riverText(); break;
            case "food": foodText(); break;
            case "riverPond": riverOrPondSection(); break;
            case "followRiver": followRiverSectionText(); break;
            case "foodSection": foodSection(); break;
            case "pondSectionText": pondSectionText(); break;
            case "movement": movementSectionText(); break;
            case "pondSection": pondSection(); break;
            case "movementSection": movementSection(); break;
            case "climb the tree": climbSectionText(); break;
            case "walk back": riverText(); break;
            case "check the tree": climbedTreeChoice(); break;
            case "move on": pondSectionText(); break;
            case "riverSection": riverCrossChoice(); break;
            case "cross the river": movementSection(); break;
            case "walk to the fields": pondSectionText(); break;
            case "go to canyon": canyonRiverText(); break;
            case "go to flatlands": flatlandsSection(); break;
            case "go to the flatlands text": flatlandsText(); break;
            case "go to the canyon text": canyonText(); break;
            case "eat the fruit": fruitText(); break;
            case "walking": movementSection(); break;
            case "follow trail": turtleSequence(); break;
            case "keep exploring": flatlandsText(); break;
            case "fight": fightSequence(); break;
            case "run": runSequenceText(); break;
            case "fight bandits": fightBandits(); break;
            case "bargain": bargainWithBandits(); break;
            case "get hurt by bandits": getHurtByBandits(); break;
            case "attack bandits": banditAttackSequence(); break;
            case "run to turtle": turtleSequence(); break;
            case "turtleSection": turtleSection(); break;
            case "go to canyon river": canyonRiverChoice(); break;
            case "hi to turtle": petTheTurtleText(); break;
            case "pet the turtle": petTheTurtleText(); break;
            case "turtle slaps": petTheTurtle();break;
            case "say hi text": sayHiToTurtleText(); break;
            case "leave turtle": sayHiToTurtle(); break;
            case "climb up the mountain": climbMountainText(); break;
            case "find the way around": aroundMountain(); break;
            case "at top of mountain": topOfMountainText(); break;
            case "going around mountain": aroundMountain(); break;
            case "top of mountain house": topOfMountainHouse(); break;
            case "open house": openHouseText(); break;
            case "bandit scene": hearOppsInHouse(); break;
            case "go to adventure": turtleSequence(); break;
            case "leave the house": leaveHouseText(); break; 
            case "fight the people": fightTheIntrudersText(); break;
            case "jump": jumped(); break;
            case "horrible decision": tUiHandler.gameOver(); break;
            case "attack for key": attackForKey(); break;
            case "bargain for key": bargainForKey(); break; 
            case "Last situation": endScene(); break;
            case "you won": tUiHandler.win(); break;

        }
    }

    /** 
     * end game screen
     */
    public void endScene()
    {
        jWindow.text.setText("As you make your way back to the forest, scarred from your experience, you see a traveler\nHe looks at you with awe, wondering how you beat\nthe troublesome bandits. You realize the tunic is the symbol of the bandits\nWith great love for defeating the terros of\nthe locals, he offers anything,\nand you make your way home");
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        jGame.pos1 = "you won";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }
    /** 
     * creates diaglogue for attaacks
     * sequence between bandits
     */
    public void attackForKey()
    {
        yourClothes.add(new Clothes("grey", "bandit scarf"));
        yourClothes.add(new Clothes("grey", "tunic"));
        jWindow.text.setText("You decide to attack the troop\nAlthough alone, you put up a good fight\nYou manage to steal a seemingly useful scarf and tunic\n");
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        jGame.pos1 = "Last situation";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }

    /** 
     * creates diaglogue for bargain
     * sequence between bandits
     */
    public void bargainForKey()
    {
        
        double curr = Math.random();
        if ( curr > 0.5)
        {
            jWindow.text.setText("You decide to bargain with the troop\nAlthough alone, you make good offers\nYou manage to receive a seemingly useful scarf and tunic however loss of resources\nUnluckily,to send a message, they begin to attack, but you manage to escape in time");
            tUiHandler.loseHeart();
            tUiHandler.loseAxe();
            tUiHandler.loseDagger();
            tUiHandler.loseFood();
            tUiHandler.loseWater(); 
            tUiHandler.loseWood();
            jWindow.button1.setText(">");
            jWindow.button2.setText( "");
            jWindow.button3.setText("");
            jGame.pos1 = "Last situation";
            jGame.pos2 = "";
            jGame.pos3 = "";

            
        }
        else
        {
            jWindow.text.setText("You decide to bargain with the troop\nThey notice you're alone and take your resources, you eventually starve");
            tUiHandler.loseAxe();
            tUiHandler.loseDagger();
            tUiHandler.loseFood();
            tUiHandler.loseWater(); 
            tUiHandler.loseWood();
            jWindow.button1.setText(">");
            jWindow.button2.setText( "");
            jWindow.button3.setText("");
            jGame.pos1 = "horrible decision";
            jGame.pos2 = "";
            jGame.pos3 = "";
        }
        
    }

    /** 
     * creates diaglogue for jumping
     * off cliff
     */
    public void jumped()
    {
        jWindow.text.setText("terrible choice");
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        jGame.pos1 = "horrible decision";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }

     /** 
     * creates diaglogue 
     */
    public void leaveHouseText()
    {
        if ( seenBandits)
        {
            currText = "You run into a familiar group of bandits on the way out\nYou see the edge of the cliff behind\nYou as your only escape";
            jWindow.text.setText(currText);
            jWindow.button1.setText("Fight");
            jWindow.button2.setText( "jump");
            jWindow.button3.setText("bargain");
            jGame.pos1 = "attack for key"; 
            jGame.pos2 = "jump";
            jGame.pos3 = "bargain for key";
        }
        else
        {
            currText = "You run into a group of bandits searching for a key\nThey notice you and begin to approach\nYou see the edge of the cliff behind\nYou as your only escape";
            jWindow.text.setText(currText);
            jWindow.button1.setText("Fight");
            jWindow.button2.setText( "jump");
            jWindow.button3.setText("bargain");
            jGame.pos1 = "attack for key";
            jGame.pos2 = "jump";
            jGame.pos3 = "bargain for key";
        }
 }

    /** 
     * creates diaglogue 
     */
    public void fightTheIntrudersText()
    {
        if ( seenBandits)
        {
            currText = "You hear familiar voices\nThe bandits are back, seeming to be searching for something\nYou hear a soft voice looking for a key of some sort\nYou notice the window behind you, with no other exit";
            jWindow.text.setText(currText);
            jWindow.button1.setText("Fight");
            jWindow.button2.setText( "jump");
            jWindow.button3.setText("bargain");
            jGame.pos1 = "attack for key";
            jGame.pos2 = "jump";
            jGame.pos3 = "bargain for key";
        }
        else
        {
            currText = "You notice a group of bandits searching for some sort of key\nThey begin to enter the house\nYou notice the window behind you, with no other exit";
            jWindow.text.setText(currText);
            jWindow.button1.setText("Fight");
            jWindow.button2.setText( "jump");
            jWindow.button3.setText("bargain");
            jGame.pos1 = "attack for key";
            jGame.pos2 = "jump";
            jGame.pos3 = "bargain for key";
        }
    }
     /** 
     * creates diaglogue 
     */
    public void hearOppsInHouse()
    {
        currText = "You hear talking outside the right window\nIt seems that someone else has reached the house\nAt the same time as you";
        jWindow.text.setText(currText);
        jWindow.button1.setText("Leave house");
        jWindow.button2.setText( "Stay and fight");
        jWindow.button3.setText("");
        jGame.pos1 = "leave the house";
        jGame.pos2 = "fight the people";
        jGame.pos3 = "";
    }

     /** 
     * creates diaglogue 
     */
    public void openHouseText()
    {
        currText = "Scarily, the door creaks open\n Inside lies a barren room with a scroll on the wall\nIt reads: Whoever reads this, return the key, and you will be saved";
        jWindow.text.setText(currText);
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        jGame.pos1 = "bandit scene";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }
     /** 
     * creates diaglogue 
     */
    public void topOfMountainHouse()
    {
        currText = "Slowly you cut down the vines one by one\nThe door is thick with vines and it takes immense strength to cut through all the vines\nYou nick yourself a few times in the process \nYou begin to sweat profusely (LOSE WATER)\nFinally all of the vines are out of the way \nThe door has a metal bolt that keeps it shut which has rusted with age \nThe tree house has an almost ominous feeling to it \nIt makes you uneasy and unsure how to proceed";
        jWindow.text.setText(currText);
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        tUiHandler.loseWater();
        jGame.pos1 = "open house";
        jGame.pos2 = "";
        jGame.pos3 = "";

    }
     /** 
     * creates diaglogue 
     */
    public void topOfMountainText()
    {
        currText = "You enter a deep forest at the top of mountain\nYou see the edge of the house\nCovered in vines";
        jWindow.text.setText(currText);
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        jGame.pos1 = "top of mountain house";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }
    
     /** 
     * creates diaglogue 
     */
    public void aroundMountain()
    {
        currText = "You enter a deep forest along the other side of the mountain\nYou see the edge of the house\nCovered in vines";
        jWindow.text.setText(currText);
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        jGame.pos1 = "top of mountain house";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }


     /** 
     * creates diaglogue 
     */
    public void climbMountainText()
    {
        currText = "You enter a deep forest at the top of the mountain\nYou see the edge of the house\nCovered in vines";
        jWindow.text.setText(currText);
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        jGame.pos1 = "top of mountain house";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }


     /** 
     * creates diaglogue 
     */
    public void canyonRiverChoice()
    {
        jWindow.button1.setText("Climb the mountain");
        jWindow.button2.setText("Find the long way around");
        jWindow.button3.setText("");
        currText = "attempt to climb up the mountain (1) ; find the long way around (2)";
        jWindow.text.setText(currText);

        jGame.pos1 = "climb up the mountain";
        jGame.pos2 = "find the way around";
        jGame.pos3 = "";   
    }

     /** 
     * creates diaglogue 
     */
    public void sayHiToTurtleText()
    {
        currText = "Without apologizing Z responds\nFind the house atop the hill\nWithin a key to unlock good will"; 
        jWindow.text.setText(currText);
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        jGame.pos1 = "go to canyon";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }

     /** 
     * creates diaglogue 
     */
    public void sayHiToTurtle()
    {

    }

     /** 
     * creates diaglogue 
     */
    public void petTheTurtleText()
    {
        currText = "The turtle waves back at you with its front foot\nI am z the turtle\nI only speak in ryhme \nAsk any question\nAnd i will in time\nsays the turtle";
        jWindow.text.setText(currText);
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        jGame.pos1 = "turtle slaps";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }

     /** 
     * creates diaglogue 
     */
    public void petTheTurtle()
    {
        currText = "The turtle snaps down on your hand\nBlood pours out of the wound which is 3 inches long (LOSE HEART)\nOh no! you dont have any band aids or gauze on you";
        jWindow.text.setText(currText);
        tUiHandler.loseHeart();
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        jGame.pos1 = "say hi text";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }


     /** 
     * creates diaglogue 
     */
    public void turtleSequence()
    {
        currText = "As you follow the trail you come across a pond \nThe pond if full of fish and plants \nOn the edge of the pond you spot a turtle\nAs you walk toward the turtle it starts talking!";
        jWindow.text.setText(currText);
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        jGame.pos1 = "turtleSection";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }

     /** 
     * creates diaglogue 
     */
    public void turtleSection()
    {
        currText = "Say hi to the turtle (1) ; Pet the turtle (2)";
        jWindow.text.setText(currText);
        jWindow.button1.setText("Say hi");
        jWindow.button2.setText( "Pet it");
        jWindow.button3.setText("");
        jGame.pos1 = "hi to turtle";
        jGame.pos2 = "pet the turtle";
        jGame.pos3 = "";
    }

     /** 
     * creates diaglogue 
     */
    public void banditAttackSequence()
    {
        if ( jWindow.toolLabel.isVisible() || jWindow.toolLabel2.isVisible())
        {   
            currText = "Luckily your weapons help defend you\n You retain injury but survive";
            jWindow.text.setText(currText);
            jWindow.toolLabel.setVisible(false);
            jWindow.toolLabel2.setVisible(false);
            tUiHandler.loseHeart();
            tUiHandler.loseHeart();
            jWindow.button1.setText(">");
            jWindow.button2.setText( "");
            jWindow.button3.setText("");
            jGame.pos1 = "run";
            jGame.pos2 = "";
            jGame.pos3 = "";
            
        }
        else
        {
            currText = "The bandits are unrelenting\nWithout weapons you were unable to defend yourself";
            jWindow.text.setText(currText);
            tUiHandler.loseHeart();
            tUiHandler.loseHeart();
            tUiHandler.loseHeart();
            tUiHandler.loseHeart();
            jWindow.button1.setText(">");
            jWindow.button2.setText( "");
            jWindow.button3.setText("");
            jGame.pos1 = "run";
            jGame.pos2 = "";
            jGame.pos3 = "";
        }
       

    }

     /** 
     * creates diaglogue 
     */
    public void getHurtByBandits()
    {
    
        tUiHandler.loseHeart();
        tUiHandler.loseHeart();
        tUiHandler.loseHeart();
        currText = "The bandits return back\n You barely survive but continue\n on your trail";
        jWindow.text.setText(currText);
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        jGame.pos1 = "run";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }
    
     /** 
     * creates diaglogue 
     */
    public void bargainWithBandits()
    {

        if ( jWindow.fullLabel.isVisible() && jWindow.hydrateLabel.isVisible())
        {
            currText = "You attempt to bargain\n Luckily your resources bode well for you\nYou are looted but survive";
            jWindow.text.setText(currText);
            tUiHandler.loseFood();
            tUiHandler.loseWater();
            jWindow.button1.setText(">");
            jWindow.button2.setText( "");
            jWindow.button3.setText("");
            jGame.pos1 = "run";
            jGame.pos2 = "";
            jGame.pos3 = "";
        }
        else
        {
            currText = "With your lack of resource the bandits attack\nYou get hurt\nYour health will determine your survival ";
            jWindow.text.setText(currText);
            tUiHandler.loseFood();
            tUiHandler.loseWater();
            jWindow.button1.setText(">");
            jWindow.button2.setText( "");
            jWindow.button3.setText("");
            jGame.pos1 = "get hurt by bandits";
            jGame.pos2 = "";
            jGame.pos3 = "";

        }
       



    }

     /** 
     * creates diaglogue 
     */
    public void fightBandits()
    {
        currText = "The bandits draw their weapons";
        jWindow.text.setText(currText);
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        jGame.pos1 = "attack bandits";
        jGame.pos2 = "";
        jGame.pos3 = "";
        

    }

     /** 
     * creates diaglogue 
     */
    public void runSequenceText()
    {
        currText = "You succesfully get away\nAs you follow the path\nYou make your way to forest";
        jWindow.text.setText(currText);
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        jGame.pos1 = "run to turtle";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }

     /** 
     * creates diaglogue 
     */
    public void fightSequence()
    {
            seenBandits = true;
            currText = "A group of bandits appear\nReady to fight";
            jWindow.text.setText(currText);
            jWindow.button1.setText("Fight");
            jWindow.button2.setText( "Run");
            jWindow.button3.setText("Bargain");
            jGame.pos1 = "fight bandits";
            jGame.pos2 = "run";
            jGame.pos3 = "bargain";

    }

     /** 
     * creates diaglogue 
     */
    public void flatlandsSection()
    {
        if ( !jWindow.toolLabel3.isVisible())
        {
            currText = "On the flat lands you run into blueberry bushes (ADD FOOD)\nAs you look up to the sky you realize dusk is upon you \nThe sky is now a pinkish orange and the sun is low \nWith your lack of firewood you will be left to the terrors of the night ";
            jWindow.text.setText(currText);
            jWindow.button1.setText(">");
            jWindow.button2.setText( "");
            jWindow.button3.setText("");
            tUiHandler.gainFood();
            jGame.pos1 = "fight";
            jGame.pos2 = "";
            jGame.pos3 = "";


        }
        else
        {
            jWindow.button1.setText(">");
            jWindow.button2.setText( "");
            jWindow.button3.setText("");
            tUiHandler.gainFood();
            tUiHandler.loseAxe();
            currText = "On the flat lands you run into blueberry bushes (ADD FOOD)\nAs you look up to the sky you realize dusk is upon you\nThe sky is now a pinkish orange and the sun is low \nYou will need a axe and wood to build a fire to stay warm (LOSE AXE) (LOSE WOOD)";
            tUiHandler.loseWood();
            jWindow.text.setText(currText);
            
            jGame.pos1 = "go to adventure";
            jGame.pos2 = "";
            jGame.pos3 = "";
        }
        

    }

     /** 
     * creates diaglogue 
     */
    public void canyonRiverText()
    {
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        currText = "As you walk upstream you hear the roaring sound of water\nJust around the bend you see a waterfall rushing down the top of a cliff \nThe waterfall is over 20 feet tall and the water is moving fast \nOn top of the cliff sits a small hut ";
        tUiHandler.displayAxe();
        jWindow.text.setText(currText);
        
        jGame.pos1 = "go to canyon river";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }

     /** 
     * creates diaglogue 
     */
    public void canyonText()
    {
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        currText = "The river flows into the canyon and thins into a stream\nThe canyon has sheets of rocks that curve as they meet on the top.\nIn the river something glistens.\nIts an axe! (ADD AXE)";
        tUiHandler.displayAxe();
        jWindow.text.setText(currText);
        
        jGame.pos1 = "go to canyon";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }

     /** 
     * creates diaglogue 
     */
    public void flatlandsText()
    {
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        currText = "The land flattens out onto a plain\nA squishy moss covers the ground\nas you walk around birds sing and butterflies flutter \nOn a lone tree stump an axe is stuck in the wood \nYou pull the axe out of the wood and add it to your pack\nAxe added to Inventory! (ADD AXE) ";
        tUiHandler.displayAxe();
        jWindow.text.setText(currText);
        
        jGame.pos1 = "go to flatlands";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }
   

     /** 
     * creates diaglogue 
     */
    private void riverCrossChoice()
    {
        jWindow.button1.setText("Cross the river");
        jWindow.button2.setText("Walk along the river");
        jWindow.button3.setText("");
        currText = "Cross the river (1) ; Walk along the river (2)";
        jWindow.text.setText(currText);

        jGame.pos1 = "cross the river";
        jGame.pos2 = "walk to the fields";
        jGame.pos3 = "";

    }

     /** 
     * creates diaglogue 
     */
    public void forageSection()
    {   
        jWindow.button1.setText("Go to the river?");
        jWindow.button2.setText("Food ?");
        jWindow.button3.setText("");
        currText = "Out of the corner of your eye you notice a river\nGo towards the river (1) ; Search for food (2)";
        jWindow.text.setText(currText);

        jGame.pos1 = "river";
        jGame.pos2 = "food";
        jGame.pos3 = "";
    }

     /** 
     * creates diaglogue 
     */
    public void riverText()
    {
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        currText = "You make your way to the river bank\nThe water flows past your feet, with a powerful current";
        jWindow.text.setText(currText);
        
        jGame.pos1 = "riverPond";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }

     /** 
     * creates diaglogue 
     */
    public void riverOrPondSection()
    {
        jWindow.button1.setText("Enter the river?");
        jWindow.button2.setText("Search for a pond ?");
        jWindow.button3.setText("");
        currText = "Venture in the river to wash and get water (1) ; Continue along the bank waiting for a pond (2)";
        jWindow.text.setText(currText);

        jGame.pos1 = "followRiver";
        jGame.pos2 = "pondSectionText";
        jGame.pos3 = "";
        

    }

     /** 
     * creates diaglogue 
     */
    public void followRiverSectionText()
    {
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        currText = "As you wade through the river you begin to feel somethind graze your foot\nYou bend down and notice A Stone Dagger\nStone Dagger is added to your Inventory! (ADD DAGGER)\nYou bend down and you take a drink of water\nFor now, your thrist is quenched; (ADD WATER)";
        jWindow.text.setText(currText);
        tUiHandler.gainWater();
        tUiHandler.displayDagger();
        jGame.pos1 = "riverSection";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }
   
     /** 
     * creates diaglogue 
     */
    public void pondSectionText()
    {
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        currText = "As you keep walking you run into a fork in the river\nLeft takes you to the flatlands with wheat.\nRight takes to a canyon with herds of sheep.";
        jWindow.text.setText(currText);
        
        jGame.pos1 = "pondSection";
        jGame.pos2 = "";
        jGame.pos3 = "";

    }

     /** 
     * creates diaglogue 
     */
    public void foodText()
    {
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        currText = "You stand up and face the forest in front of you \nOut of the corner of your eye you stop something move";
        jWindow.text.setText(currText);
        
        jGame.pos1 = "foodSection";
        jGame.pos2 = "";
        jGame.pos3 = "";
        
    }

     /** 
     * creates diaglogue 
     */
    public void foodSection()
    {
        jWindow.button1.setText("Chase the movement");
        jWindow.button2.setText("Keep walking through the forest");
        jWindow.button3.setText("");
        currText = "Chase the movement (1) ; Keep walking through the forest (2)";
        jWindow.text.setText(currText);

        jGame.pos1 = "movement";
        jGame.pos2 = "walking";
        jGame.pos3 = "";

    }

     /** 
     * creates diaglogue 
     */
    public void movementSectionText()
    {
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        currText = "You turn and follow the motion\nSomething furry and brown runs through the underbrush\nAs you run suddenly you feel exhausted(LOSE WATER) \nYou have not been drinking any water and dehydration gets the best of you\nThe animals escapes and you find yourself in a grove of trees";
        tUiHandler.loseWater();
        jWindow.text.setText(currText);
        
        jGame.pos1 = "movementSection";
        jGame.pos2 = "";
        jGame.pos3 = "";


    }


     /** 
     * creates diaglogue 
     */
    public void pondSection()
    {
        jWindow.button1.setText("Left");
        jWindow.button2.setText("Right");
        jWindow.button3.setText("");
        currText = "Follow the fork left to the flatlands (1); Follow the fork right to the canyon (2)";
        jWindow.text.setText(currText);

        jGame.pos1 = "go to the flatlands text";
        jGame.pos2 = "go to the canyon text";
        jGame.pos3 = "";

    }


     /** 
     * creates diaglogue 
     */
    private void movementSection()
    {
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        currText = "As you walk into the forest you come across a large green vine\nIt has purple, palm sized fruits dangling from its stem\nIt's nothing familiar but looks intruiging";
        jWindow.text.setText(currText);
  
        jGame.pos1 = "climb the tree";
        jGame.pos2 = "walk back";
        jGame.pos3 = "";
    }



     /** 
     * creates diaglogue 
     */
    private void climbSectionText()
    {
        
        jWindow.button1.setText("Climb the tree");
        jWindow.button2.setText("Walk back");
        jWindow.button3.setText("");
        currText = "Climb the tree to find fruit (1) ; Walk back to find water (2)";
        jWindow.text.setText(currText);
        jGame.pos1 = "check the tree";
        jGame.pos2 = "walk back";
        jGame.pos3 = "";   
    }

     /** 
     * creates diaglogue 
     */
    private void climbedTreeChoice()
    {
        jWindow.button1.setText("Pick the fruit");
        jWindow.button2.setText("Be cautious and ignore it");
        jWindow.button3.setText("");
        currText = "Pick the fruit to eat (1); Be cautious and move on (2)";
        jWindow.text.setText(currText);

        jGame.pos1 = "eat the fruit";
        jGame.pos2 = "move on";
        jGame.pos3 = "";

    }

     /** 
     * creates diaglogue 
     */
    public void fruitText()
    {
        jWindow.button1.setText("Follow the trail");
        jWindow.button2.setText( "Explore the forest");
        jWindow.button3.setText("");
        currText = "It's a passion fruit! (ADD FOOD)\nThe fruit is ripe and bursting with flavor\nYou also are able to connect the broken branches(ADD WOOD) \nNow that you are full you its time to continue on your adventure\nIn front of you lies a patchy dirt trial";
        tUiHandler.gainWood();
        tUiHandler.gainFood();
        jWindow.text.setText(currText);
  
        jGame.pos1 = "follow trail";
        jGame.pos2 = "keep exploring";
        jGame.pos3 = "";
    }


}
