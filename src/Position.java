/**
 * Keeps track of map positions in x,y coordinates.
 *
 * @author Kevin Kirby
 * @version 02/20/18
 */
public class Position
{
    private int x;
    private int y;
    /**
     * defualt constructor. sets both x and y to 0.
     */
    public Position()
    {
        x = 0;
        y = 0;
    }
    
    /**
     * Constructor sets x and y with the intergers passed.
     */
    public Position(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
}
