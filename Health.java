
import java.util.*;
public class Health implements Interactives 
{

    private int numHearts = 0;
    private Stack<Heart> currTotalHealth = null;
    private boolean stayingWarm = false;
    private boolean stayingCool = false;
    private boolean hydrated = false;
    private boolean full = false;
    private ArrayList<Clothes> myClothes = null;
    private Stack<Clothes> currClothes = null;
   
    /**
     * 
     * @param myHearts
     */
    public Health( int myHearts)
    {
        numHearts = myHearts;
    }
    
    /** 
     * @return boolean
     */
    public boolean evaluate()
    {
        return (numHearts == 0);
    }

    @Override
    /**
     * @return void
     */
    public void act()
    {
        currTotalHealth.push(new Heart());
        numHearts++;
        
    }
    
    /** 
     * @return int
     */
    public int getHearts()
    {
        return numHearts;
    }
    
    /** 
     * @param other
     * @return boolean
     */
    public boolean receiveAttack( Tools other)
    {
        for ( int i = 0; i < other.getDamage(); i++)
        {
            currTotalHealth.pop();
            numHearts--;
        }
        return evaluate();
    }
    
    /** 
     * @return boolean
     */
    public boolean feelCold()
    {
        if ( stayingWarm == false)
        {
            currTotalHealth.pop();
            numHearts--;
        }
        return evaluate();
    }
    
    /** 
     * @return boolean
     */
    public boolean feelWarm()
    {
        if ( stayingCool == false)
        {
            currTotalHealth.pop();
            numHearts--;
        }
        return evaluate();
    }

    /**
     * 
     */
    public void wearClothes()
    {
        if ( myClothes != null)
        {
            stayingWarm = true;
            return;
        }
        stayingWarm = false;
        
    }

    public void takeOffClothes()
    {
        if ( currClothes.peek() != null)
        {
            myClothes.add(currClothes.pop())
        }
    }
    /** 
     * @return boolean
     */
    public boolean thirsty()
    {
        if( hydrated == false)
        {
            currTotalHealth.pop();
        }
        return evaluate();
    }

    /** 
     * @return boolean
     */
    public boolean hungry()
    {
        if( full == false)
        {
            currTotalHealth.pop();
        }
        return evaluate();
    }
    
}
