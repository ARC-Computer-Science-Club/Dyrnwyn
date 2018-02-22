/**
 * Manages the movement types in the game.
 *
 * @author Kevin Kirby
 * @version 02/22/18
 */
public class Movement
{
    private boolean walk;
    private boolean swim;
    private boolean climb;
    private boolean fly;
    
    /**
     * Constructor for objects of class Movement
     */
    public Movement(boolean walk, boolean swim, boolean climb, boolean fly)
    {
        this.walk = walk;
        this.swim = swim;
        this.climb = climb;
        this.fly = fly;
    }

    public void setWalk(boolean walk)
    {
        this.walk = walk;
    }
    
    public void setSwim(boolean swim)
    {
        this.swim = swim;
    }
    
    public void setClimb(boolean climb)
    {
        this.climb = climb;
    }
    
    public void setFly(boolean fly)
    {
        this.fly = fly;
    }
    
    public boolean getWalk()
    {
        return walk;
    }
    
    public boolean getSwim()
    {
        return swim;
    }
    
    public boolean getClimb()
    {
        return climb;
    }
    
    public boolean getFly()
    {
        return fly;
    }
}
