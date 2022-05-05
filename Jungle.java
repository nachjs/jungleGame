import java.util.EventListener;
import java.util.Scanner;
import java.util.Stack;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class Jungle implements KeyListener
{
    boolean arrowKey = false;
    Character me = new Character(null);
    ArrayList<Tools> myTools = me.getTools();
    public static void story()
    {
        Scanner scan = new Scanner(System.in);
        int curr = 0;
        
        System.out.println("Crash! the leaves around you rustle as you sit up");
        System.out.println("You observe your surroundings, a vast jungle, with a river flowing through it");
        System.out.println("Your stomach rumbles and you feel the dryness of your mouth");
        System.out.println("You don't know how long it has been since you last had a meal");
        System.out.println("Option 1: Go towards the river (1) ; Search for food (2)");
        System.out.println("Choice: ");
        curr = scan.nextInt();
        if ( curr == 1)
        {
            System.out.println("You make your way to the river bank");
            System.out.println("The water flows past your feet, with a powerful current");
            System.out.println("Option 2: Venture in the river to wash and get water (1) ; Continue along the bank waiting for a pond (2)");
            System.out.println("Choice: ");
            curr = scan.nextInt();
            
            if ( curr == 1 )
            {
                System.out.println("As you venture in the river the water begins to make you lose balance");
            }
            else 
            {

            }
        }
        else
        {

        }
        
    }
    public static void main(String args[])
    {
        Character c = new Character("hi");
        story(c);

       
    }
    @Override
    public void keyTyped(KeyEvent e)
    {
        if ( e.getKeyCode() == KeyEvent.VK_RIGHT )
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
}
