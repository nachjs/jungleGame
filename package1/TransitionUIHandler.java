package package1;

import javax.swing.ImageIcon;
import java.awt.Image;

public class TransitionUIHandler 
{
    JungleWindow jw;

    public TransitionUIHandler(JungleWindow currJW)
    {
        jw = currJW;
    }

    public void displayStartScreen()
    {
        // // show the start screen
        // ImageIcon currImage = new ImageIcon(new ImageIcon("APCS_JungleHomePage.png").getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT));
        // jw.bg.setIcon(currImage);
        // jw.bg.setVisible(true);
        

        // //hide the game screen

        // //hide text
        // jw.textPanel.setVisible(false);
        // jw.text.setVisible(false);

        // //hide choices
        // jw.button1.setVisible(false);
        // jw.button2.setVisible(false);
        // jw.button3.setVisible(false);

        // //hide hearts
        // jw.heartLabel1.setVisible(false);
        // jw.heartLabel2.setVisible(false);
        // jw.heartLabel3.setVisible(false);
        // jw.heartLabel4.setVisible(false);
        // jw.heartLabel5.setVisible(false);

        
       
    }

    public void displayGameScreen()
    {
        //hide the start screen
        jw.startButton.setVisible(false);

        //show the game screen

        //show text
        jw.textPanel.setVisible(true);
        jw.text.setVisible(true);

        //show choices
        jw.button1.setVisible(true);
        jw.button2.setVisible(true);
        jw.button3.setVisible(true);

        //show hearts
        jw.heartLabel1.setVisible(true);
        jw.heartLabel2.setVisible(true);
        jw.heartLabel3.setVisible(true);
        jw.heartLabel4.setVisible(true);
        jw.heartLabel5.setVisible(true);


        ImageIcon currImage = new ImageIcon(new ImageIcon("OpaqueJungle.png").getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT));
        jw.bg.setIcon(currImage);
        jw.bg.setVisible(true);
    }


}
