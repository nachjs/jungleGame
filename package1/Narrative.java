package package1;
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
        jWindow.button1.setText("Towards river?");
        jWindow.button2.setText( "Forage?");
        jWindow.button3.setText(">");
        currText = "Crash! the leaves around you rustle as you sit up \n ou observe your surroundings, a vast jungle, with a river flowing through it \n Your stomach rumbles and you feel the dryness of your mouth \n You don't know how long it has been since you last had a meal \n Option 1: Go towards the river (1) ; Search for food (2) ";
        jWindow.text.setText(currText);

    }


}
