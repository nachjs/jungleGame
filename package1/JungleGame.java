package package1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JungleGame 
{
    ChoiceHandler cHandler = new ChoiceHandler();
    JungleWindow jw = new JungleWindow();
    TransitionUIHandler tuim = new TransitionUIHandler(jw);
    Narrative story = new Narrative(this, jw, tuim);

   

    public JungleGame()
    {
        jw.gameStartUI(cHandler);
        story.defaultGame();
        tuim.displayStartScreen();
    }

    public static void main(String[] args)
    {
        new JungleGame();
    }
    public class ChoiceHandler implements ActionListener 
    {

        public void actionPerformed(ActionEvent event) {
    
            String choice = event.getActionCommand();
            switch(choice)
            {
                case "start": tuim.displayGameScreen(); story.defaultGame(); break;
                case "choice1": break;
                case "choice2": break;
                case "choice3": break;
    
            }
        }    
    }   

}

