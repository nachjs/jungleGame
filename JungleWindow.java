//import java.util.EventListener;
//import java.util.Scanner;
//import java.util.Stack;
//import java.awt.*;
import javax.swing.*;
//import javax.swing.event.MouseInputListener;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
//import java.util.*;
public class JungleWindow implements KeyListener{
    JFrame f = new JFrame("choose your own adventure!!");
    JLabel bg = new JLabel(); 
    JScrollPane story = new JScrollPane();
    Jungle j = new Jungle();
    boolean arrowKey = false;

    @Override
    public void keyTyped(KeyEvent e)
    {
        if ( e.getKeyCode() == KeyEvent.VK_RIGHT ) // next
        {
            arrowKey = true;
        }
        else if ( e.getKeyCode() == KeyEvent.VK_1 ) //choice 1
        {
            arrowKey = true;
        }
        else if ( e.getKeyCode() == KeyEvent.VK_2 ) // choice 2
        {
            arrowKey = true;
        }
        else if ( e.getKeyCode() == KeyEvent.VK_2 ) // quit
        {
            arrowKey = true;
        }
        else if ( e.getKeyCode() == KeyEvent.VK_2 ) // restart 
        {
            arrowKey = true;
        }
        
    }
    @Override
    public void keyPressed(KeyEvent e)
    {
        return;
        
    }
    @Override
    public void keyReleased(KeyEvent e)
    {
        return; 
        
    }
    
    public void framing(){
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
        gui.framing();
    }
    
}
