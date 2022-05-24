package package1;

import java.lang.StackWalker.Option;
import java.util.Currency;
import javax.crypto.CipherOutputStream;
import javax.swing.event.TableColumnModelListener;

public class Narrative 
{
    JungleGame jGame;
    JungleWindow jWindow;
    TransitionUIHandler tUiHandler;
    Character you;
    public String currText;
    

    public Narrative(JungleGame g, JungleWindow jw, TransitionUIHandler t)
    {
        jGame = g;
        jWindow = jw;
        tUiHandler = t;
    }

    public void defaultGame()
    {
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        currText = "Crash! the leaves around you rustle as you sit up \n you observe your surroundings, a vast jungle, with a river flowing through it \n Your stomach rumbles and you feel the dryness of your mouth";
        jWindow.text.setText(currText);
        jGame.pos1 = "forage";
        jGame.pos2 = "";
        jGame.pos3 ="";

       
        

    }

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
            case "find the way around": aroundMountainText(); break;
            case "at top of mountain": topOfMountainText(); break;
            case "going around mountain": aroundMountain(); break;
            case "top of mountain house": topOfMountainHouse(); break;

        }
    }

    public void topOfMountainHouse()
    {
        currText = "Slowly you cut down the vines one by one\nThe door is thick with vines and it takes immense strength to cut through all the vines\nYou nick yourself a few times in the process \nYou begin to sweat profusely (LOSE WATER)\nFinally all of the vines are out of the way \nThe door has a metal bolt that keeps it shut which has rusted with age \nThe tree house has an almost ominous feeling to it \nIt makes you uneasy and unsure how to proceed";
        jWindow.text.setText(currText);
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        tUiHandler.loseWater();
        jGame.pos1 = "top of mountain house";
        jGame.pos2 = "";
        jGame.pos3 = "";

    }
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


    public void climbMountainText()
    {
        currText = "You enter a deep forest at the top of the mountain\nYou see the edge of the house\nCovered in vines";
        jWindow.text.setText(currText);
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        jGame.pos1 = "top of mountain";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }

    public void aroundMountainText()
    {
        currText = "attempt to climb up the mountain (1) ; find the long way around (2)";
        jWindow.text.setText(currText);
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        jGame.pos1 = "going around mountain";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }

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

    public void sayHiToTurtle()
    {

    }

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

    public void runSequenceText()
    {
        currText = "You succesfully get away\nAs you follow the path\n You make your way to forest";
        jWindow.text.setText(currText);
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        jGame.pos1 = "run to turtle";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }

    public void fightSequence()
    {
            currText = "A group of bandits appear\n Ready to fight";
            jWindow.text.setText(currText);
            jWindow.button1.setText("Fight");
            jWindow.button2.setText( "Run");
            jWindow.button3.setText("Bargain");
            jGame.pos1 = "fight bandits";
            jGame.pos2 = "run";
            jGame.pos3 = "bargain";

    }

    public void flatlandsSection()
    {
        if ( !jWindow.toolLabel3.isVisible())
        {
            currText = "On the flat lands you run into blueberry bushes (ADD FOOD)\nAs you look up to the sky you realize dusk is upon you \nThe sky is now a pinkish orange and the sun is low \nWith your lack of wood you face the terrors of the night ";
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
            currText = "On the flat lands you run into blueberry bushes (ADD FOOD)\nAs you look up to the sky you realize dusk is upon you \nThe sky is now a pinkish orange and the sun is low \nYou will need a axe and wood to build a fire to stay warm (LOSE AXE) (LOSE WOOD)";
            tUiHandler.loseWood();
            jWindow.text.setText(currText);
            
            jGame.pos1 = "go to adventure";
            jGame.pos2 = "";
            jGame.pos3 = "";
        }
        

    }

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

    public void canyonText()
    {
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        currText = "The river flows into the canyon and thins into a stream \nThe canyon has sheets of rocks that curve as they meet on the top.\nIn the river something glistens.\nIts an axe! (ADD AXE)";
        tUiHandler.displayAxe();
        jWindow.text.setText(currText);
        
        jGame.pos1 = "go to canyon";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }

    public void flatlandsText()
    {
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        currText = "The land flattens out onto a plain \nmoss covers the floor, it feels squishy \nas you walk around birds sing and butterflies flutter \non a lone tree stump an axe is stuck in the wood \nyou pull the axe out of the wood and add it to your pack\nAxe added to Inventory! (ADD AXE) ";
        tUiHandler.displayAxe();
        jWindow.text.setText(currText);
        
        jGame.pos1 = "go to flatlands";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }
   

    private void riverCrossChoice()
    {
        jWindow.button1.setText("Cross the river");
        jWindow.button2.setText("Walk along the river");
        jWindow.button3.setText("");
        currText = "Option 4: Cross the river (1) ; Walk along the river (2)";
        jWindow.text.setText(currText);

        jGame.pos1 = "cross the river";
        jGame.pos2 = "walk to the fields";
        jGame.pos3 = "";

    }

    public void forageSection()
    {   
        jWindow.button1.setText("Go to the river?");
        jWindow.button2.setText("Food ?");
        jWindow.button3.setText("");
        currText = "Out of the corner of your eye you notice a river. \n Option 1: Go towards the river (1) ; Search for food (2)";
        jWindow.text.setText(currText);

        jGame.pos1 = "river";
        jGame.pos2 = "food";
        jGame.pos3 = "";
    }

    public void riverText()
    {
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        currText = "You make your way to the river bank \n The water flows past your feet, with a powerful current";
        jWindow.text.setText(currText);
        
        jGame.pos1 = "riverPond";
        jGame.pos2 = "";
        jGame.pos3 = "";
    }

    public void riverOrPondSection()
    {
        jWindow.button1.setText("Enter the river?");
        jWindow.button2.setText("Search for a pond ?");
        jWindow.button3.setText("");
        currText = "Option 2: Venture in the river to wash and get water (1) ; Continue along the bank waiting for a pond (2)";
        jWindow.text.setText(currText);

        jGame.pos1 = "followRiver";
        jGame.pos2 = "pondSectionText";
        jGame.pos3 = "";
        

    }

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
    
    public void pondSectionText()
    {
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        currText = "As you keep walking you run into a fork in the river\nLeft takes you to the flatlands with wheat.\nRight takes to a canyon with herds of sheep. ";
        jWindow.text.setText(currText);
        
        jGame.pos1 = "pondSection";
        jGame.pos2 = "";
        jGame.pos3 = "";

    }

    public void foodText()
    {
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        currText = "You stand up and face the forest in front of you \n out of the corner of your eye you stop something move";
        jWindow.text.setText(currText);
        
        jGame.pos1 = "foodSection";
        jGame.pos2 = "";
        jGame.pos3 = "";
        
    }

    public void foodSection()
    {
        jWindow.button1.setText("Chase the movement");
        jWindow.button2.setText("Keep walking through the forest");
        jWindow.button3.setText("");
        currText = "Option 3: Chase the movement (1) ; Keep walking through the forest (2)";
        jWindow.text.setText(currText);

        jGame.pos1 = "movement";
        jGame.pos2 = "walking";
        jGame.pos3 = "";

    }

    public void movementSectionText()
    {
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        currText = "You turn and follow the motion\nsomething furry and brown runs through the underbrush\nAs you run suddenly you feel exhausted (LOSE WATER) \nyou have not been drinking any water and dehydration gets the best of you\nThe animals escapes and you find yourself in a grove of trees";
        tUiHandler.loseWater();
        jWindow.text.setText(currText);
        
        jGame.pos1 = "movementSection";
        jGame.pos2 = "";
        jGame.pos3 = "";


    }


    public void pondSection()
    {
        jWindow.button1.setText("Left ?");
        jWindow.button2.setText("Right ?");
        jWindow.button3.setText("");
        currText = "Option 5: follow the fork left to the flatlands (1); follow the fork right to the canyon (2)";
        jWindow.text.setText(currText);

        jGame.pos1 = "go to the flatlands text";
        jGame.pos2 = "go to the canyon text";
        jGame.pos3 = "";

    }


    private void movementSection()
    {
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        currText = "As you walk into the forest you come across a crawling green vine\nit has purple palm sized fruits dangling from its stem\nyou dont recognize the fruit but it is so tempting ";
        jWindow.text.setText(currText);
  
        jGame.pos1 = "climb the tree";
        jGame.pos2 = "walk back";
        jGame.pos3 = "";
    }



    private void climbSectionText()
    {
        
        jWindow.button1.setText("Climb the tree");
        jWindow.button2.setText("Walk back");
        jWindow.button3.setText("");
        currText = "Option 6: Climb the tree to find fruit (1) ; walk back to find water (2)";
        jWindow.text.setText(currText);
        jGame.pos1 = "check the tree";
        jGame.pos2 = "";
        jGame.pos3 = "";   
    }

    private void climbedTreeChoice()
    {
        jWindow.button1.setText("pick the fruit");
        jWindow.button2.setText("be cautious and move on");
        jWindow.button3.setText("");
        currText = "Option 7: pick the fruit to eat (1) ; be cautious and move on (2)";
        jWindow.text.setText(currText);

        jGame.pos1 = "eat the fruit";
        jGame.pos2 = "move on";
        jGame.pos3 = "";

    }

    public void fruitText()
    {
        jWindow.button1.setText("follow the trail");
        jWindow.button2.setText( "keep exploring");
        jWindow.button3.setText("");
        currText = "its passion fruit! (ADD FOOD)\nthe fruit is so ripe and bursting with flavor\n you also are able to connecting the broken branches(ADD WOOD) \nnow that you are full you its time to continue on your adventure\nyou see a dirt trail in front of you that is over grown";
        tUiHandler.gainWood();
        tUiHandler.gainFood();
        jWindow.text.setText(currText);
  
        jGame.pos1 = "follow trail";
        jGame.pos2 = "keep exploring";
        jGame.pos3 = "";
    }


}
