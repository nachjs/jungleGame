//
//import java.util.EventListener;
//import java.util.Scanner;
//import java.util.Stack;
//import java.awt.*;
import javax.swing.*;
//import javax.swing.event.MouseInputListener;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JungleWindow {
    JFrame f = new JFrame("choose your own adventure!!");
    JLabel bg = new JLabel(); 
    JScrollPane story = new JScrollPane();
    JPanel inventory = new JPanel();
    //JungleGame j = new JungleGame();
    JFrame gameWindow;
    boolean arrowKey = false;
    JButton button;
    int hearts = 0;
    String option1, option2, option3;
    

    

    public void gameStartUI()
    {
        //Background
        gameWindow = new JFrame("Jungle Adventure!");
        gameWindow.setBounds(100, 100, 1200, 800);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //start button
        button = new JButton();
        button.setBounds(450, 500, 300, 150);
        button.addActionListener(e -> gameUI());
        button.setText("Ready?");
        button.setFont(new Font("Dialog", Font.BOLD, 40));
        gameWindow.add(button);

        //background image
        ImageIcon currImage = new ImageIcon(new ImageIcon("APCS_JungleHomePage.png").getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT));
        gameWindow.add(bg);
        gameWindow.setBackground(Color.WHITE);
        bg.setIcon(currImage);
        
        //set ui visible
        gameWindow.setVisible(true);
    }



    public void gameUI()
    {   
        
        
        //add Health bar
        ImageIcon hearts = new ImageIcon(new ImageIcon("APCS_JungleHeart.png").getImage().getScaledInstance(100, 70, Image.SCALE_DEFAULT));
       
        /*
        heart 1 from : https://www.tutorialspoint.com/how-to-set-location-of-jlabel-in-a-jframe-with-java
        this link helped me with orientation of the heart
        */
        JLabel heartLabel1 = new JLabel(); 
        gameWindow.getContentPane();
        heartLabel1.setIcon(hearts);
        Dimension size = heartLabel1.getPreferredSize();
        heartLabel1.setBounds(10, 0, size.width, size.height);
        gameWindow.setLayout(null);
        gameWindow.add(heartLabel1);
        heartLabel1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.add(heartLabel1);
        heartLabel1.setSize(500, 300);
        gameWindow.setVisible(true);

        //heart two

        JLabel heartLabel2 = new JLabel(); 
        gameWindow.getContentPane();
        heartLabel2.setIcon(hearts);
        Dimension size2 = heartLabel2.getPreferredSize();
        heartLabel2.setBounds(140, 0, size.width, size.height);
        gameWindow.setLayout(null);
        gameWindow.add(heartLabel2);
        heartLabel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.add(heartLabel2);
        heartLabel2.setSize(500, 300);
        gameWindow.setVisible(true);


        //heart three

        JLabel heartLabel3 = new JLabel(); 
        gameWindow.getContentPane();
        heartLabel3.setIcon(hearts);
        Dimension size3 = heartLabel3.getPreferredSize();
        heartLabel3.setBounds(270, 0, size.width, size.height);
        gameWindow.setLayout(null);
        gameWindow.add(heartLabel3);
        heartLabel3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.add(heartLabel3);
        heartLabel3.setSize(500, 300);
        gameWindow.setVisible(true);

        //heart four

        JLabel heartLabel4 = new JLabel(); 
        gameWindow.getContentPane();
        heartLabel4.setIcon(hearts);
        Dimension size4 = heartLabel4.getPreferredSize();
        heartLabel4.setBounds(400, 0, size.width, size.height);
        gameWindow.setLayout(null);
        gameWindow.add(heartLabel4);
        heartLabel4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.add(heartLabel4);
        heartLabel4.setSize(500, 300);
        gameWindow.setVisible(true);

        //heart five

        JLabel heartLabel5 = new JLabel(); 
        gameWindow.getContentPane();
        heartLabel5.setIcon(hearts);
        Dimension size5 = heartLabel5.getPreferredSize();
        heartLabel5.setBounds(530, 0, size.width, size.height);
        gameWindow.setLayout(null);
        gameWindow.add(heartLabel5);
        heartLabel5.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameWindow.add(heartLabel5);
        heartLabel5.setSize(500, 300);
        gameWindow.setVisible(true);

        //remove start game button
        gameWindow.remove(button);

        //option buttons
        //opti5n button 1
        JButton button1 = new JButton();
        button1.setBounds(50, 300, 160, 80);
        //button.addActionListener(e -> gameUI());
        button1.setText("Option 1");
        button1.setFont(new Font("Dialog", Font.BOLD, 20));
        gameWindow.add(button1);

        //option button 2
        JButton button2 = new JButton();
        button2.setBounds(50, 400, 160, 80);
        //button.addActionListener(e -> gameUI());
        button2.setText("Option 2");
        button2.setFont(new Font("Dialog", Font.BOLD, 20));
        gameWindow.add(button2);

        //option button 3
        JButton button3 = new JButton();
        button3.setBounds(50, 500, 160, 80);
        //button.addActionListener(e -> gameUI());
        button3.setText("Option 3");
        button3.setFont(new Font("Dialog", Font.BOLD, 20));
        gameWindow.add(button3);

        

        //blurred game background
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setBounds(100, 100, 1200, 800);
        ImageIcon currImage = new ImageIcon(new ImageIcon("OpaqueJungle.png").getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT));
        gameWindow.add(bg);
        gameWindow.setBackground(Color.WHITE);
        bg.setIcon(currImage);
        

        //add Hunger bar
        
        //add Thirst bar

        //add Tools
        
        



        gameWindow.setVisible(true);




        
    }

    public void run()
    {
       
    }
    
    public static void main (String[] args){
        JungleWindow gui = new JungleWindow(); 
        gui.gameStartUI();
    }
    
}
