/**
 * Abstract class Obstacle - Parent class of all objects that effect
 *  traversal of the map.
 *
 * @author Kevin Kirby
 * @version 02/20/18
 */
public abstract class Obstacle
{
    String sprite;//path of sprite file
    Position position;
    boolean passable;//should this be boolean? or different per character
    
    public String getSprite()
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
    
    public void setSprite(String sprite)
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