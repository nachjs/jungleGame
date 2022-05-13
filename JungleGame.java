
//import java.util.EventListener;
import java.util.Scanner;
import javax.swing.*;
import java.io.*;
//import java.util.Stack;
//import java.awt.*;
//import javax.swing.*;
//import javax.swing.event.MouseInputListener;
//import java.awt.event.KeyListener;
//import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class JungleGame {
    //`boolean arrowKey = false;
    private int optionNum = 0;
    private int choice = 0;
    private String currTag = "@"+ optionNum + "-" + choice;
    JungleWindow jw = new JungleWindow();
    
    /**
     * @return void
     * @throws IOException
     */
    public String playBlock() throws IOException
    {
       
        return "";
    }
    

    //public class
    /** 
     * @param args[]
     */
    public void main(String args[])
    {

    }
   


    public class ChoiceHandler implements ActionListener {

        public void actionPerformed(ActionEvent event)
        {

            String yourChoice = event.getActionCommand();

            switch(yourChoice)
            {
                case "Ready?" : break;
                case "c1" : break;
                case "c2" : break;
                case "c3" : break;

            }
        }

        
    }
}
