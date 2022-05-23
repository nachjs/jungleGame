package package1;

import java.lang.StackWalker.Option;
import java.util.Currency;

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

        }
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

        jGame.pos1 = "flatlandsSectionText";
        jGame.pos2 = "canyonSectionText";
        jGame.pos3 = "";

    }


    private void movementSection()
    {
        jWindow.button1.setText("Climb the tree");
        jWindow.button2.setText("Walk back");
        jWindow.button3.setText("");
        currText = "Option 6: Climb the tree to find fruit (1) ; walk back to find water (2)";
        jWindow.text.setText(currText);

        jGame.pos1 = "climb the tree";
        jGame.pos2 = "walk back";
        jGame.pos3 = "";
    }



    private void climbSectionText()
    {
        jWindow.button1.setText(">");
        jWindow.button2.setText( "");
        jWindow.button3.setText("");
        currText = "As you walk into the forest you come across a crawling green vine\nit has purple palm sized fruits dangling from its stem\nyou dont recognize the fruit but it is so tempting ";
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
        currText = "Option 7: pick the fruit the eat (1) ; be cautious and move on (2)";
        jWindow.text.setText(currText);

        jGame.pos1 = "eat the fruit";
        jGame.pos2 = "move on";
        jGame.pos3 = "";

    }



}
