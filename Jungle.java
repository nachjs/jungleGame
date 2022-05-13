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
    private int optionNum = 0;
    private int choice = 0;
    private String currTag = "@"+ optionNum + "-" + choice;
    
    /**
     * @return void
     * @throws IOException
     */
    public String readBlock() throws IOException
    {
       File f = new File("Story.txt");
       Scanner sc = new Scanner(f);
       String block = "";
       String tag ="";
       String temp = "";
       while(sc.hasNextLine()){
           if(currTag.equals(tag)){
            block += sc.nextLine();
           }
           else{ break;}
           temp = sc.nextLine();
           if(temp.indexOf("@")==0){
               optionNum = Integer.parseInt(temp.substring(1, 2));
               choice = Integer.parseInt(temp.substring(3));
           }
       }
        return block;
    }
    
    /** 
     * @param args[]
     */
    public void main(String args[])
    {

    }
   
}
