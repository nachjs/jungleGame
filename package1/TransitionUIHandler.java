package package1;


import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Color;

public class TransitionUIHandler 
{
    JungleWindow jw;
    String name;
    public String currText;

    public TransitionUIHandler(JungleWindow currJW)
    {
        jw = currJW;
    }

    public void displayStartScreen()
    {

        jw.button1.setVisible(false);
        jw.button2.setVisible(false);
        jw.button3.setVisible(false);

        jw.heartLabel1.setVisible(false);
        jw.heartLabel2.setVisible(false);
        jw.heartLabel3.setVisible(false);
        jw.heartLabel4.setVisible(false);
        jw.heartLabel5.setVisible(false);

        jw.text.setVisible(false);

        //set button visible
        jw.startButton.setVisible(true);
        
        //set background visible
        jw.bg.setIcon(null);
        ImageIcon currImage = new ImageIcon(getClass().getResource("/package1/APCS_JungleHomePage.png"));
        Image image  = currImage.getImage();
        Image newimg = image.getScaledInstance(1200, 800, Image.SCALE_DEFAULT);
        currImage = new ImageIcon(newimg);
        jw.bg.setBackground(Color.WHITE);
        jw.bg.setIcon(currImage);
        jw.gameWindow.add(jw.bg);
        
        

        
        
        

        
       
    }


    public void displayGameScreen()
    {
        //hide the start screen
        jw.startButton.setVisible(false);

        //show the game screen

        //show text
        
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

        ImageIcon opaque = new ImageIcon(getClass().getResource("/package1/OpaqueJungle.png"));
        Image opaqueJungle  = opaque.getImage();
        Image newOpaque = opaqueJungle.getScaledInstance(1200, 800, Image.SCALE_DEFAULT);
        opaque = new ImageIcon(newOpaque);
        jw.gameWindow.setBackground(Color.WHITE);
        jw.bg.setIcon(opaque);
        

       
    }

    public void loseFood()
    {

    }

    public void loseWater()
    {

    }

    public void gameOver()
    {

    }
    
    public void displayDagger()
    {
        jw.toolLabel.setVisible(true);
    }


}
