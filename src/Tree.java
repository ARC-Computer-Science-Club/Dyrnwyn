import javax.swing.ImageIcon;
/**
 * Tree class. Holds information about the tree obstacles.
 *
 * @author Kevin Kirby
 * @version 02/20/18
 */
public class Tree extends Obstacle
{
    private int value;
    
    /**
     * defualt constructor for tree class. value set to 1
     */
    public Tree()
    {
        // initialise instance variables
        value = 1;
        this.setSprite(new ImageIcon("designHub.png"));
        this.setPosition(new Position());
        this.setPassable(false);
    }
    
    /**
     * Constructor for tree class. all varibles can be set
     */
    public Tree(int value, int xPosition, int yPosition, boolean passable, 
                String sprite)
    {
        // initialise instance variables
        this.value = value;
        this.setPosition(new Position(xPosition, yPosition));
        this.setPassable(passable);
        this.setSprite(new ImageIcon("designHub.png"));
    }
    
    /**
     * Constructor for tree class. sprite is set to default.
     */
    public Tree(int value, int xPosition, int yPosition, boolean passable)
    {
        // initialise instance variables
        this.value = value;
        this.setPosition(new Position(xPosition, yPosition));
        this.setPassable(passable);
        this.setSprite(new ImageIcon("designHub.png"));
    }
    
    /**
     * Constructor for tree class. sprite is set to default. passable
     *     will be false if value is at least 1.
     */
    public Tree(int value, int xPosition, int yPosition)
    {
        // initialise instance variables
        this.value = value;
        this.setPosition(new Position(xPosition, yPosition));
        if(value >= 1)
        {
            this.setPassable(false);
        }
        else
        {
            this.setPassable(true);
        }
        this.setSprite(new ImageIcon("designHub.png"));
    }
    
    public int getValue()
    {
        return value;
    }
    
    public void setValue(int value)
    {
        this.value = value;
    }
}
