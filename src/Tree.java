
/**
 * Tree class. Holds information about the tree obstacles.
 *
 * @author Kevin Kirby
 * @version 02/20/18
 */
public class Tree extends Obstacle
{
    int value;
    
    /**
     * defualt constructor for tree class. value set to 1
     */
    public Tree()
    {
        // initialise instance variables
        value = 1;
        sprite = "default tree sprite";
        position = new Position();
        passable = false;
    }
    
    /**
     * Constructor for tree class. all varibles can be set
     */
    public Tree(int value, int xPosition, int yPosition, boolean passable, 
                String sprite)
    {
        // initialise instance variables
        this.value = value;
        this.position = new Position(xPosition, yPosition);
        this.passable = passable;
        this.sprite = sprite;
    }
    
    /**
     * Constructor for tree class. sprite is set to default.
     */
    public Tree(int value, int xPosition, int yPosition, boolean passable)
    {
        // initialise instance variables
        this.value = value;
        this.position = new Position(xPosition, yPosition);
        this.passable = passable;
        this.sprite = "default tree sprite";
    }
    
    /**
     * Constructor for tree class. sprite is set to default. passable
     *     will be false if value is at least 1.
     */
    public Tree(int value, int xPosition, int yPosition)
    {
        // initialise instance variables
        this.value = value;
        this.position = new Position(xPosition, yPosition);
        if(value >= 1)
        {
            this.passable = false;
        }
        else
        {
            this.passable = true;
        }
        this.sprite = "default tree sprite";
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
