import java.util.*;
public class Character implements Interactives
{
    private String npcVerse = "";
    private Health myHealth;
    private ArrayList<Tools> myTools;
    
    /**
     * 
     * @param verse
     */
    public Character( String verse)
    {
        npcVerse = verse;
    }

    /**
     * 
     * @param myHearts
     */
    public Character( int myHearts)
    {
        myHealth = new Health(myHearts);
    }

    @Override
    /**
     * 
     */
    public void act()
    {
        System.out.println(npcVerse);
    }
    
    /** 
     * @param newTool
     */
    public void receiveTool(Tools newTool)
    {
        myTools.add(newTool);
    }
    
    /** 
     * @return ArrayList<Tools>
     */
    public ArrayList<Tools> getTools()
    {
        return myTools;
    }
    
    /** 
     * @return Health
     */
    public Health getHealth()
    {
        return myHealth;
    }
    
}
