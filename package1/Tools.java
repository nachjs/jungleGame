package package1;

public class Tools implements Interactives
{
    private boolean attack = false;
    private int heartRemoval = 0;
    
    /**
     * 
     * @param myAttack
     * @param myHeartRemoval
     */
    public Tools( boolean myAttack, int myHeartRemoval)
    {
        attack = myAttack;
        heartRemoval = myHeartRemoval;
    }

    @Override
    /**
     * @return null
     */
    public void act()
    {
        
    }

    
    /** 
     * @return int
     */
    public int getDamage()
    {
        return heartRemoval;
    }
}
