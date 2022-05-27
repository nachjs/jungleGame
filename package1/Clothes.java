package package1;
/**
 * A class which designs and runs the different aspects and elements of the GUI
 *
 *  @author  Nachiket Joshi
 *  @version 5/26/22
 *  @author  Period: 3
 *  @author  Assignment: APCSJungleGame - Clothes
 *
 *  @author  Sources: Nachiket Joshi
 *  
 * 
 */
public class Clothes
{
    /**
     * attributes for clothes
     */
    String color = "grey";
    String itemOfClothing ="shirt";
    
    /**
     * 
     * @param color - color of item
     * @param item - item name
     */
    public Clothes(String color, String item){
        this.color = color;
        itemOfClothing = item;
    }
    /**
     * 
     * @return - returns color
     */
    public String getColor(){
        return color;
    }
    /**
     * 
     * @return - returns item name
     */
    public String getItemOfClothing(){
        return itemOfClothing;
    }
}
