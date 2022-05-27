package package1;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Image;
import java.awt.Color;
/**
 * A class which designs and runs the different aspects and elements of the GUI
 *
 *  @author  Nachiket Joshi
 *  @version 5/26/22
 *  @author  Period: 3
 *  @author  Assignment: APCSJungleGame - Jungle Window
 *
 *  @author  Sources: Nachiket Joshi
 *  
 * 
 */

public class TransitionUIHandler 
{
    JungleWindow jw;
    private int hearts = 5;

    /**
     * 
     * @param currJW - used to transition between all
     * jungle windows
     */
    public TransitionUIHandler(JungleWindow currJW)
    {
        jw = currJW;
    }

     /** 
     * displays basic start screen
     * by manipuolating gui elemets
     */
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


     /** 
     * displays game screen by removing
     * start elements and adding
     * game elements
     */
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

    /** 
     * displays loss of food
     * by removing food icon
     */
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

    /** 
     * displays loss of water by
     * removing water icon
     */
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

    /** 
     * displays gaining water
     * by adding water icon
     */
    public void gainWater()
    {
        jw.hydrateLabel.setVisible(true);
        jw.thirstyLabel.setVisible(false);
    }

    /** 
     * displays loss of heart
     * by removing heart
     */
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

    /** 
     * displays gain of heart
     * by adding heart
     */
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
    /** 
     * displays gain of food
     * by adding food
     */
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
    
    /** 
     * displays win game screen
     */
    public void win()
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
        
        jw.hungryLabel.setVisible(false);
        jw.thirstyLabel.setVisible(false);

        jw.fullLabel.setVisible(false);
        jw.hydrateLabel.setVisible(false);

        jw.toolLabel.setVisible(false);
        jw.toolLabel2.setVisible(false);
        jw.toolLabel3.setVisible(false);
        

        jw.gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jw.gameWindow.setBounds(100, 100, 1200, 800);
        ImageIcon gameOver = new ImageIcon(getClass().getResource("/package1/APCS_GameWinScreen.jpg"));
        Image gameOverImage  = gameOver.getImage();
        Image newOver = gameOverImage.getScaledInstance(1200, 800, Image.SCALE_DEFAULT);
        gameOver = new ImageIcon(newOver);
        jw.gameWindow.add(jw.bg);
        jw.gameWindow.setBackground(Color.WHITE);
        jw.bg.setIcon(gameOver);
        jw.gameWindow.setIconImage(gameOverImage);
        jw.gameWindow.setVisible(true);

    }
    /** 
     * displays game over screen
     */
    public void gameOver()
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
        
        jw.hungryLabel.setVisible(false);
        jw.thirstyLabel.setVisible(false);

        jw.fullLabel.setVisible(false);
        jw.hydrateLabel.setVisible(false);

        jw.toolLabel.setVisible(false);
        jw.toolLabel2.setVisible(false);
        jw.toolLabel3.setVisible(false);
        

        jw.gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jw.gameWindow.setBounds(100, 100, 1200, 800);
        ImageIcon gameOver = new ImageIcon(getClass().getResource("/package1/APCS_GameOver.png"));
        Image gameOverImage  = gameOver.getImage();
        Image newOver = gameOverImage.getScaledInstance(1200, 800, Image.SCALE_DEFAULT);
        gameOver = new ImageIcon(newOver);
        jw.gameWindow.add(jw.bg);
        jw.gameWindow.setBackground(Color.WHITE);
        jw.bg.setIcon(gameOver);
        jw.gameWindow.setIconImage(gameOverImage);
        jw.gameWindow.setVisible(true);
    }
    
    /** 
     * displays dagger
     */
    public void displayDagger()
    {
        jw.toolLabel.setVisible(true);
    }

    /** 
     * displays loss of dagger
     */
    public void loseDagger()
    {
        jw.toolLabel.setVisible(false);
    }

    /** 
     * displays axe
     */
    public void displayAxe()
    {
        jw.toolLabel2.setVisible(true);
    }

    /** 
     * displays loss of axe
     */
    public void loseAxe()
    {
        jw.toolLabel2.setVisible(false);
    }

    /** 
     * displays wood
     */
    public void gainWood()
    {
        jw.toolLabel3.setVisible(true);
    }

    /** 
     * displays loss of wood
     */
    public void loseWood()
    {
        jw.toolLabel3.setVisible(false);
    }


}
