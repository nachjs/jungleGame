package package1;


import javax.swing.*;
import package1.*;
import package1.JungleGame.ChoiceHandler;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JungleWindow {
    JLabel bg = new JLabel(); 
    JFrame gameWindow;
    boolean arrowKey = false;
    JButton startButton, button1, button2, button3;
    int hearts = 0;
    String option1, option2, option3;
    JPanel textPanel;
    JLabel label, heartLabel1, heartLabel2, heartLabel3, heartLabel4, heartLabel5;
    JTextArea text;

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
        startButton.setBounds(450, 500, 300, 150);
        startButton.setText("Ready?");
        startButton.setFont(new Font("Dialog", Font.BOLD, 40));
        startButton.addActionListener(ch);
        startButton.setActionCommand("start");
        gameWindow.add(startButton);

        //background image
        ImageIcon currImage = new ImageIcon(new ImageIcon("APCS_JungleHomePage.png").getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT));
        gameWindow.add(bg);
        bg.setIcon(currImage);

       
        gameWindow.setVisible(true);




        // ** Play Window ** //

     
        //add Health bar
        ImageIcon hearts = new ImageIcon(new ImageIcon("APCS_JungleHeart.png").getImage().getScaledInstance(100, 70, Image.SCALE_DEFAULT));
       
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
        gameWindow.setVisible(true);

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
        gameWindow.setVisible(true);


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
        gameWindow.setVisible(true);

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
        gameWindow.setVisible(true);

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
        gameWindow.setVisible(true);

        //remove start game button
        gameWindow.remove(startButton);

        //option buttons
        //opti5n button 1
        button1 = new JButton();
        button1.setBounds(50, 450, 160, 80);
        button1.addActionListener(ch);
        button1.setActionCommand("choice1");
        button1.setText("Option 1");
        button1.setFont(new Font("Dialog", Font.BOLD, 20));
        gameWindow.add(button1);

        //option button 2
        button2 = new JButton();
        button2.setBounds(50, 550, 160, 80);
        button2.addActionListener(ch);
        button2.setActionCommand("choice2");
        button2.setText("Option 2");
        button2.setFont(new Font("Dialog", Font.BOLD, 20));
        gameWindow.add(button2);

        //option button 3
        button3 = new JButton();
        button3.setBounds(50, 650, 160, 80);
        button3.addActionListener(ch);
        button3.setActionCommand("choice3");
        button3.setText("Option 3");
        button3.setFont(new Font("Dialog", Font.BOLD, 20));
        gameWindow.add(button3);

        //text panel

        textPanel = new JPanel();
        textPanel.setBounds(100, 100, 600, 250);
        textPanel.setBackground(Color.white);
        gameWindow.add(textPanel);

        //text

        text = new JTextArea("This is the main text area");
        text.setBounds(100, 100, 600, 250);
        text.setBackground(Color.white);
        text.setForeground(Color.black);
        text.setFont(normalFont);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setEditable(false);
        gameWindow.add(text);
        gameWindow.setVisible(true);

         //add Hunger bar
        
        //add Thirst bar

        //add Tools
        

        

        //blurred game background
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setBounds(100, 100, 1200, 800);
        ImageIcon opaqueCurr = new ImageIcon(new ImageIcon("OpaqueJungle.png").getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT));
        gameWindow.add(bg);
        gameWindow.setBackground(Color.WHITE);
        bg.setIcon(opaqueCurr);
        

       
        



        
        


        
        //set ui visible
        gameWindow.setVisible(true);
    }


public static void main (String[] args)
{
    
}
    
    
    
}
