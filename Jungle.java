//import java.util.EventListener;
import java.util.Scanner;
import java.io.*;
//import java.util.Stack;
//import java.awt.*;
//import javax.swing.*;
//import javax.swing.event.MouseInputListener;
//import java.awt.event.KeyListener;
//import java.awt.event.KeyEvent;
import java.util.*;
public class Jungle {
    //`boolean arrowKey = false;
    Character me = new Character(null);
    ArrayList<Tools> myTools = me.getTools();
    Health myHealth = me.getHealth();
    private static String currTag = "@0-0";
    
    /**
     * @return void
     * @throws IOException
     */
    public static String nextSection() throws IOException
    {
        Scanner scan = new Scanner(System.in);
        int curr = 0;
        File file = new File("Story.txt");
        BufferedReader br = null;
        String result = "";
        br = new BufferedReader(new FileReader(file));
        while ( br.readLine() != null)
        {
            if ( br.readLine().contains(currTag))
            {
                while ( !br.readLine().contains("@"))
                {
                    result += br.readLine();
                }
            }
        }
        
        
        
        return "";
        
    }
    
    /** 
     * @param args[]
     */
    public static void main(String args[])
    {
        nextSection();
    }
   
}
