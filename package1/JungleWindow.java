package package1;


import javax.swing.*;
import package1.JungleGame.ChoiceHandler;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.awt.Container;
public class JungleWindow {
    JLabel bg = new JLabel(); 
    JFrame gameWindow;
    boolean arrowKey = false;
    JButton startButton, button1, button2, button3;
    int hearts = 0;
    String option1, option2, option3;
    JPanel textPanel;
    JLabel label, heartLabel1, heartLabel2, heartLabel3, heartLabel4, heartLabel5, textLabel, toolLabel, toolLabel2, fullLabel, hungryLabel, hydrateLabel, thirstyLabel, toolLabel3;
    JTextArea text;
    Container background = new Container();
    Scanner scan = new Scanner(System.in);
    

    private Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
    

    

    public void gameStartUI(ChoiceHandler ch)
    {

        //** Start Window **//

        //Window
        gameWindow = new JFrame("Jungle Adventure!");
        gameWindow.setBounds(100, 100, 1200, 800);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //start button 
        startButton = new JButton();
        startButton.setSize(300, 150);
        startButton.setBounds(450, 500, 300, 150);
        startButton.setText("Ready?");
        startButton.setFont(new Font("Dialog", Font.BOLD, 40));
        startButton.addActionListener(ch);
        startButton.setActionCommand("start");
        gameWindow.add(startButton);

        //background image
        ImageIcon currImage = new ImageIcon(getClass().getResource("/package1/APCS_JungleHomePage.png"));
        Image image  = currImage.getImage();
        Image newimg = image.getScaledInstance(1200, 800, Image.SCALE_DEFAULT);
        currImage = new ImageIcon(newimg);
        gameWindow.add(bg);
        bg.setBackground(Color.white);
        bg.setIcon(currImage);

        

        

       
        gameWindow.setVisible(true);
        startButton.setVisible(true);



        // ** Play Window ** //

     
        //add Health bar
        ImageIcon hearts = new ImageIcon(getClass().getResource("/package1/APCS_JungleHeart.png"));
        Image heartImage  = hearts.getImage();
        Image newHeart = heartImage.getScaledInstance(100, 70, Image.SCALE_DEFAULT);
        hearts = new ImageIcon(newHeart);
        /*
        heart 1 from : https://www.tutorialspoint.com/how-to-set-location-of-jlabel-in-a-jframe-with-java
        this link helped me with orientation of the heart
        */
        heartLabel1 = new JLabel(); 
        gameWindow.getContentPane();
        heartLabel1.setIcon(hearts);
        Dimension size = heartLabel1.getPreferredSize();
        heartLabel1.setBounds(10, -100, size.width, size.height);
        gameWindow.setLayout(null);
        gameWindow.add(heartLabel1);
        heartLabel1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.add(heartLabel1);
        heartLabel1.setSize(500, 300);
        

        //heart two

        heartLabel2 = new JLabel(); 
        gameWindow.getContentPane();
        heartLabel2.setIcon(hearts);
        Dimension size2 = heartLabel2.getPreferredSize();
        heartLabel2.setBounds(140, -100, size.width, size.height);
        gameWindow.setLayout(null);
        gameWindow.add(heartLabel2);
        heartLabel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.add(heartLabel2);
        heartLabel2.setSize(500, 300);
        

        //heart three

        heartLabel3 = new JLabel(); 
        gameWindow.getContentPane();
        heartLabel3.setIcon(hearts);
        Dimension size3 = heartLabel3.getPreferredSize();
        heartLabel3.setBounds(270, -100, size.width, size.height);
        gameWindow.setLayout(null);
        gameWindow.add(heartLabel3);
        heartLabel3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.add(heartLabel3);
        heartLabel3.setSize(500, 300);
        

        //heart four

        heartLabel4 = new JLabel(); 
        gameWindow.getContentPane();
        heartLabel4.setIcon(hearts);
        Dimension size4 = heartLabel4.getPreferredSize();
        heartLabel4.setBounds(400, -100, size.width, size.height);
        gameWindow.setLayout(null);
        gameWindow.add(heartLabel4);
        heartLabel4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.add(heartLabel4);
        heartLabel4.setSize(500, 300);
       

        //heart five

        heartLabel5 = new JLabel(); 
        gameWindow.getContentPane();
        heartLabel5.setIcon(hearts);
        Dimension size5 = heartLabel5.getPreferredSize();
        heartLabel5.setBounds(530, -100, size.width, size.height);
        gameWindow.setLayout(null);
        gameWindow.add(heartLabel5);
        heartLabel5.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.add(heartLabel5);
        heartLabel5.setSize(500, 300);
       

      

        //option buttons
        //opti5n button 1
        button1 = new JButton();
        button1.setBounds(50, 430, 300, 100);
        button1.addActionListener(ch);
        button1.setActionCommand("choice1");
        button1.setText("Option 1");
        button1.setFont(new Font("Dialog", Font.BOLD, 20));
        gameWindow.add(button1);

        //option button 2
        button2 = new JButton();
        button2.setBounds(50, 550, 300, 100);
        button2.addActionListener(ch);
        button2.setActionCommand("choice2");
        button2.setText("Option 2");
        button2.setFont(new Font("Dialog", Font.BOLD, 20));
        gameWindow.add(button2);

        //option button 3
        button3 = new JButton();
        button3.setBounds(50, 670, 300, 100);
        button3.addActionListener(ch);
        button3.setActionCommand("choice3");
        button3.setText("Option 3");
        button3.setFont(new Font("Dialog", Font.BOLD, 20));
        gameWindow.add(button3);

        //text panel



        //text

        text = new JTextArea("This is the main text area");
        text.setBounds(10, 150, 600, 250);
        //text.setBackground(Color.white);
        text.setFont(normalFont);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setEditable(false);
        text.setBackground(Color.white);
        text.setForeground(Color.BLACK);
        gameWindow.add(text);



        //add Hunger bar
        ImageIcon food = new ImageIcon(getClass().getResource("/package1/APCS_JungleFood.png"));
        Image foodImage  = food.getImage();
        Image newFood = foodImage.getScaledInstance(150, 200, Image.SCALE_DEFAULT);
        food = new ImageIcon(newFood);

        fullLabel = new JLabel(); 
        gameWindow.getContentPane();
        fullLabel.setIcon(food);
        Dimension size9 = fullLabel.getPreferredSize();
        fullLabel.setBounds(660, -35, size.width, size.height);
        gameWindow.setLayout(null);
        gameWindow.add(fullLabel);
        fullLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.add(fullLabel);
        fullLabel.setSize(500, 300);
        fullLabel.setVisible(false);

        //hungry bar
        ImageIcon hunger = new ImageIcon(getClass().getResource("/package1/APCS_JungleHungryChickens.png"));
        Image hungerImage  = hunger.getImage();
        Image newHunger = hungerImage.getScaledInstance(150, 200, Image.SCALE_DEFAULT);
        hunger = new ImageIcon(newHunger);

        hungryLabel = new JLabel(); 
        gameWindow.getContentPane();
        hungryLabel.setIcon(hunger);
        Dimension size10 = hungryLabel.getPreferredSize();
        hungryLabel.setBounds(660, -35, size.width, size.height);
        gameWindow.setLayout(null);
        gameWindow.add(hungryLabel);
        hungryLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.add(hungryLabel);
        hungryLabel.setSize(500, 300);
        hungryLabel.setVisible(false);

        
        //add Thirst bar
        //add dehydrated bar
        ImageIcon thirsty = new ImageIcon(getClass().getResource("/package1/APCS_JungleWater2.png"));
        Image thirstyImage  = thirsty.getImage();
        Image newThirsty = thirstyImage.getScaledInstance(150, 200, Image.SCALE_DEFAULT);
        thirsty = new ImageIcon(newThirsty);

        thirstyLabel = new JLabel(); 
        gameWindow.getContentPane();
        thirstyLabel.setIcon(thirsty);
        Dimension size12 = thirstyLabel.getPreferredSize();
        thirstyLabel.setBounds(790, -35, size.width, size.height);
        gameWindow.setLayout(null);
        gameWindow.add(thirstyLabel);
        thirstyLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.add(thirstyLabel);
        thirstyLabel.setSize(500, 300);
        thirstyLabel.setVisible(false);

        //water bar
        ImageIcon water = new ImageIcon(getClass().getResource("/package1/APCS_JungleWater.png"));
        Image waterImage  = water.getImage();
        Image newWater = waterImage.getScaledInstance(150, 200, Image.SCALE_DEFAULT);
        water = new ImageIcon(newWater);

        hydrateLabel = new JLabel(); 
        gameWindow.getContentPane();
        hydrateLabel.setIcon(water);
        Dimension size11 = hydrateLabel.getPreferredSize();
        hydrateLabel.setBounds(790, -35, size.width, size.height);
        gameWindow.setLayout(null);
        gameWindow.add(hydrateLabel);
        hydrateLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.add(hydrateLabel);
        hydrateLabel.setSize(500, 300);
        hydrateLabel.setVisible(false);

        //add Tools
        //dagger
        ImageIcon dagger = new ImageIcon(getClass().getResource("/package1/APCS_JungleDagger.png"));
        Image daggerImage  = dagger.getImage();
        Image newDagger = daggerImage.getScaledInstance(100, 200, Image.SCALE_DEFAULT);
        dagger = new ImageIcon(newDagger);

        toolLabel = new JLabel(); 
        gameWindow.getContentPane();
        toolLabel.setIcon(dagger);
        Dimension size6 = toolLabel.getPreferredSize();
        toolLabel.setBounds(1000, -35, size.width, size.height);
        gameWindow.setLayout(null);
        gameWindow.add(toolLabel);
        toolLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.add(toolLabel);
        toolLabel.setSize(500, 300);
        toolLabel.setVisible(false);

        //axe
        ImageIcon axe = new ImageIcon(getClass().getResource("/package1/APCS_JungleAxe.png"));
        Image axeImage  = axe.getImage();
        Image newAxe = axeImage.getScaledInstance(100, 200, Image.SCALE_DEFAULT);
        axe = new ImageIcon(newAxe);

        toolLabel2 = new JLabel(); 
        gameWindow.getContentPane();
        toolLabel2.setIcon(axe);
        Dimension size7 = toolLabel2.getPreferredSize();
        toolLabel2.setBounds(1000, 200, size.width, size.height);
        gameWindow.setLayout(null);
        gameWindow.add(toolLabel2);
        toolLabel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.add(toolLabel2);
        toolLabel2.setSize(500, 300);
        toolLabel2.setVisible(false);

        //axe
        ImageIcon wood = new ImageIcon(getClass().getResource("/package1/APCS_JungleWood.png"));
        Image woodImage  = wood.getImage();
        Image newWood = woodImage.getScaledInstance(100, 200, Image.SCALE_DEFAULT);
        wood = new ImageIcon(newWood);

        toolLabel3 = new JLabel(); 
        gameWindow.getContentPane();
        toolLabel3.setIcon(wood);
        Dimension size13 = toolLabel3.getPreferredSize();
        toolLabel3.setBounds(1000, 400, size.width, size.height);
        gameWindow.setLayout(null);
        gameWindow.add(toolLabel3);
        toolLabel3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.add(toolLabel3);
        toolLabel3.setSize(500, 300);
        toolLabel3.setVisible(false);

        
        
        

        //blurred game background
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setBounds(100, 100, 1200, 800);
        ImageIcon opaque = new ImageIcon(getClass().getResource("/package1/OpaqueJungle.png"));
        Image opaqueJungle  = opaque.getImage();
        Image newOpaque = opaqueJungle.getScaledInstance(1200, 800, Image.SCALE_DEFAULT);
        opaque = new ImageIcon(newOpaque);
        gameWindow.add(bg);
        gameWindow.setBackground(Color.WHITE);
        bg.setIcon(opaque);
        gameWindow.setVisible(true);

       
        



        
        


        
        //set ui visible
       
    }


}