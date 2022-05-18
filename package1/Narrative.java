package package1;
public class Narrative 
{
    JungleGame jGame;
    JungleWindow jWindow;
    TransitionUIHandler tUiHandler;
    Character you;
    

    public Narrative(JungleGame g, JungleWindow jw, TransitionUIHandler t)
    {
        jGame = g;
        jWindow = jw;
        tUiHandler = t;
    }

    public void defaultGame()
    {
        you = new Character(5);

       jWindow.text.setText("Crash! the leaves around you rustle as you sit up \n You observe your surroundings, a vast jungle, with a river flowing through it \n Your stomach rumbles and you feel the dryness of your mouth \n You don't know how long it has been since you last had a meal \n Option 1: Go towards the river (1) ; Search for food (2) ");

    }


}
