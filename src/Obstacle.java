import javax.swing.ImageIcon;

/**
 * Abstract class Obstacle - Parent class of all objects that effect
 *  traversal of the map.
 *
 * @author Kevin Kirby
 * @version 02/20/18
 */
public abstract class Obstacle
{
    private ImageIcon sprite;//path of sprite file
    private Position position;
    private boolean passable;//should this be boolean? or different per character
    
    public ImageIcon getSprite()
    {
        return sprite;
    }
    
    public Position getPosition()
    {
        return position;
    }
    
    public boolean getPassable()
    {
        return passable;
    }
    
    public void setSprite(ImageIcon sprite)
    {
        this.sprite = sprite;
    }
    
    public void setPosition(Position position)
    {
        this.position = position;
    }
    
    public void setPassable(boolean passable)
    {
        this.passable = passable;
    }
}
