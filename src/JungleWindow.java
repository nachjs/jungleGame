package src;
//import java.util.EventListener;
//import java.util.Scanner;
//import java.util.Stack;
//import java.awt.*;
import javax.swing.*;
//import javax.swing.event.MouseInputListener;
import java.awt.event.KeyListener;
import java.awt.Color;
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
    Jungle j = new Jungle();
    JFrame gameWindow;
    boolean arrowKey = false;
    JButton button;
    

    

    public void startGame()
    {
        gameWindow = new JFrame("Jungle Adventure!");
        gameWindow.setBounds(100, 100, 1200, 800);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton();
        button.setBounds(450, 500, 300, 150);
        button.addActionListener(e -> gameFrame());
        button.setText("Ready?");
        button.setFont(new Font("Arial", Font.BOLD, 40));
        gameWindow.add(button);
        ImageIcon currImage = new ImageIcon(new ImageIcon("APCS_JungleHomePage.png").getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT));
        gameWindow.add(bg);
        gameWindow.setBackground(Color.WHITE);
        bg.setIcon(currImage);
        gameWindow.setVisible(true);
        
        
        
        


        
    }



    public void gameFrame()
    {
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setBounds(100, 100, 1200, 800);
        ImageIcon currImage = new ImageIcon(new ImageIcon("OpaqueJungle.png").getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT));
        gameWindow.add(bg);
        gameWindow.setBackground(Color.WHITE);
        bg.setIcon(currImage);
        gameWindow.remove(button);
        gameWindow.setVisible(true);




        
    }

    public void run()
    {
       
    }
    
    public static void main (String[] args){
        JungleWindow gui = new JungleWindow(); 
        gui.startGame();
    }
    
}
