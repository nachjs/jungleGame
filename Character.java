import java.util.*;
public class Character implements Interactives
{
    private String npcVerse = "";

    public Character( String verse)
    {
        npcVerse = verse;
    }

    public void act()
    {
        System.out.println(npcVerse);
    }
    
}
