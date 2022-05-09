//import java.util.EventListener;
//import java.util.Scanner;
//import java.util.Stack;
//import java.awt.*;
import javax.swing.*;
//import javax.swing.event.MouseInputListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
//import java.util.*;
public class JungleWindow implements KeyListener{
    
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
        JFrame f = new JFrame("choose your own adventure!!");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 100, 800, 800);

        f.setVisible(true);
    }
    
    public static void main (String[] args){
        JungleWindow gui = new JungleWindow(); 
        gui.framing();
    }
    
}
