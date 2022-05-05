import java.util.*;
public class Character implements Interactives
{
    private String npcVerse = "";
    private Health myHealth;
    private ArrayList<Tools> myTools;
    public Character( String verse)
    {
        npcVerse = verse;
    }

    public void act()
    {
        System.out.println(npcVerse);
    }
    public void receiveTool(Tools newTool)
    {
        myTools.add(newTool);
    }
    public ArrayList<Tools> getTools()
    {
        return myTools;
    }
    
}
