package package1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * A class which designs and runs the different aspects and elements of the GUI
 *
 *  @author  Nachiket Joshi
 *  @version 5/26/22
 *  @author  Period: 3
 *  @author  Assignment: APCSJungleGame - JungleGame
 *
 *  @author  Sources: Nachiket Joshi
 *  
 * 
 */
public class JungleGame 
{
    ChoiceHandler cHandler = new ChoiceHandler();
    JungleWindow jw = new JungleWindow();
    TransitionUIHandler tuim = new TransitionUIHandler(jw);
    Narrative story = new Narrative(this, jw, tuim);
    public String pos1 = "", pos2 = "", pos3 = "";

   
    /**
     * runs a new instance
     *  of jungle game
     */
    public JungleGame()
    {
        jw.gameStartUI(cHandler);
        story.defaultGame();
        tuim.displayStartScreen();
    }

    
    /** 
     * @param args - runs a new game when created
     */
    public static void main(String[] args)
    {
        new JungleGame();
    }
    public class ChoiceHandler implements ActionListener 
    {
        /**
         * implements action performed, updating use of button
         */
        public void actionPerformed(ActionEvent event) {
    
            String choice = event.getActionCommand();
            switch(choice)
            {
                case "start": tuim.displayGameScreen(); story.defaultGame(); break;
                case "choice1": story.updatePosition(pos1); break;
                case "choice2": story.updatePosition(pos2); break;
                case "choice3": story.updatePosition(pos3); break;
    
            }
        }    
    }   

}

