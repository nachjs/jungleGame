import java.util.Stack;
public class Health implements Interactives 
{

    private int numHearts = 0;
    private Stack<Heart> currTotalHealth = null;
    private boolean stayingWarm = false;
    private boolean stayingCool = false;
    public Health( int myHearts)
    {
        numHearts = myHearts;
    }
    public boolean evaluate()
    {
        return (numHearts == 0);
    }
    @Override
    public void act()
    {
        currTotalHealth.push(new Heart());
        numHearts++;
        
    }
    public int getHearts()
    {
        return numHearts;
    }
    public boolean receiveAttack( Tools other)
    {
        for ( int i = 0; i < other.getDamage(); i++)
        {
            currTotalHealth.pop();
            numHearts--;
        }
        return evaluate();
    }
    public boolean feelCold()
    {
        if ( stayingWarm == false)
        {
            currTotalHealth.pop();
            numHearts--;
        }
        return evaluate();
    }
    public boolean feelWarm()
    {
        if ( stayingCool == false)
        {
            currTotalHealth.pop();
            numHearts--;
        }
        return evaluate();
    }
    
}
