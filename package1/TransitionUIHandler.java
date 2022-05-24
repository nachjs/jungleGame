package package1;


import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Color;

public class TransitionUIHandler 
{
    JungleWindow jw;
    String name;
    public String currText;
    private int hearts = 5;

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

        //show food
        jw.hungryLabel.setVisible(true);

        //show water
        jw.thirstyLabel.setVisible(true);

        ImageIcon opaque = new ImageIcon(getClass().getResource("/package1/OpaqueJungle.png"));
        Image opaqueJungle  = opaque.getImage();
        Image newOpaque = opaqueJungle.getScaledInstance(1200, 800, Image.SCALE_DEFAULT);
        opaque = new ImageIcon(newOpaque);
        jw.gameWindow.setBackground(Color.WHITE);
        jw.bg.setIcon(opaque);


        

       
    }

    public void loseFood()
    {
        if ( jw.hungryLabel.isVisible() == true)
        {
            loseHeart();
            return;
        }
        jw.fullLabel.setVisible(false);
        jw.hungryLabel.setVisible(true);
        
    }

    public void loseWater()
    {
        if ( jw.thirstyLabel.isVisible() == true)
        {
            loseHeart();
            return;
        }
        jw.hydrateLabel.setVisible(false);
        jw.thirstyLabel.setVisible(true);
    }

    public void gainWater()
    {
        jw.hydrateLabel.setVisible(true);
        jw.thirstyLabel.setVisible(false);
    }

    public void loseHeart()
    {
        hearts--;
        switch(hearts)
        {
            case 4: jw.heartLabel5.setVisible(false); break;
            case 3: jw.heartLabel4.setVisible(false); break;
            case 2: jw.heartLabel3.setVisible(false); break;
            case 1: jw.heartLabel2.setVisible(false); break;
            case 0: gameOver(); break;
            default:break;
        }
    }

    public void gainHeart()
    {
        hearts++;
        switch(hearts)
        {
            case 5: jw.heartLabel5.setVisible(true); break;
            case 4: jw.heartLabel4.setVisible(true); break;
            case 3: jw.heartLabel3.setVisible(true); break;
            case 2: jw.heartLabel2.setVisible(true); break;
            default:break;
        }
    }

    public void gainFood()
    {
        if ( jw.fullLabel.isVisible() == true)
        {
            gainHeart();
            return;
        }
        jw.hungryLabel.setVisible(false);
        jw.fullLabel.setVisible(true);
    }
    
    public void gameOver()
    {

    }
    
    public void displayDagger()
    {
        jw.toolLabel.setVisible(true);
    }

    public void loseDagger()
    {
        jw.toolLabel.setVisible(false);
    }

    public void displayAxe()
    {
        jw.toolLabel2.setVisible(true);
    }

    public void loseAxe()
    {
        jw.toolLabel2.setVisible(false);
    }

    public void gainWood()
    {
        jw.toolLabel3.setVisible(true);
    }

    public void loseWood()
    {
        jw.toolLabel3.setVisible(false);
    }


}
