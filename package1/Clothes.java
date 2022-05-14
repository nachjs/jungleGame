package package1;

public class Clothes
{
    String color = "grey";
    String itemOfClothing ="shirt";
    /**
     * 
     */
    public Clothes(){

    }
    /**
     * 
     * @param color
     * @param item
     */
    public Clothes(String color, String item){
        this.color = color;
        itemOfClothing = item;
    }
    /**
     * 
     * @return
     */
    public String getColor(){
        return color;
    }
    /**
     * 
     * @return
     */
    public String getItemOfClothing(){
        return itemOfClothing;
    }
}
