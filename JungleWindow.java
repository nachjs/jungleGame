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
    Jungle j = new Jungle();
    JFrame gameWindow = new JFrame("Begin!");
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
        button.setFont(new Font("Retro", Font.PLAIN, 40));
        gameWindow.add(button);
        ImageIcon currImage = new ImageIcon(new ImageIcon("BlurredJungle.jpg").getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT));
        gameWindow.add(bg);
        gameWindow.setBackground(Color.WHITE);
        bg.setIcon(currImage);
        gameWindow.setVisible(true);
        
        
        
        


        
    }



    public void gameFrame(){
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 100, 1200, 800);
        //story text 
        story.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        story.setBackground(Color.WHITE);
        story.setBounds(850, 0, 400, 800);
        f.add(story);
        //background image 
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("APCS_JungleIsland.png").getImage().getScaledInstance(900, 800, Image.SCALE_DEFAULT));
        bg.setBackground(Color.WHITE);
        f.add(bg);
        f.setBackground(Color.WHITE);
        bg.setIcon(imageIcon);
        f.setVisible(true);
    }
    public void run(String tag){
        
    }
    
    public static void main (String[] args){
        JungleWindow gui = new JungleWindow(); 
        gui.startGame();
    }
    
}
