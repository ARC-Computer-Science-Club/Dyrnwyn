import javax.swing.ImageIcon;

/**
 * Abstract class Character - Parent class for all characters.
 *
 * @author Devin Scholl, Eric Lum and Kevin Kirby 
 * @version 02/20/18
 */
public class Character
{
    // Attributes
  private ImageIcon sprite;
  private Position position;
  private Movement movement;
  private Direction direction;
  
  public enum Direction{
    NORTH, EAST, SOUTH, WEST
  }
  
  // Constructor
  
  public Character(ImageIcon icon, Position position, Movement movement)
  {
    sprite = icon;
    this.position = position;
    this.movement = movement;
  }
  
   // Methods
  public Position getPosition()
  {
    return position;
  }

  public void setPosition(int x,int y)
  {
    position.setX(x);
    position.setY(y);
  }

  public void setSprite(ImageIcon icon)
  {
    sprite = icon;
  }

  public ImageIcon getSprite()
  {
    return sprite;
  }
  
  public void setMovement(Movement movement)
  {
      this.movement = movement;
  }
  
  public void setFacing(Direction face)
  {
    direction = face;
  }
  
  public void turnRight()
  {
    switch(direction)
    {
      case NORTH:  direction = Direction.EAST;
        break;
      case EAST:  direction = Direction.SOUTH;
        break;
      case SOUTH:  direction = Direction.WEST;
        break;
      case WEST:  direction = Direction.NORTH;
        break;
    }
  }
  
  public void turnLeft()
  {
    switch(direction)
    {
      case NORTH:  direction = Direction.WEST;
        break;
      case EAST:  direction = Direction.NORTH;
        break;
      case SOUTH:  direction = Direction.EAST;
        break;
      case WEST:  direction = Direction.SOUTH;
        break;
    }
  }
  
  /**
   * Map must check if move is valid before calling this function.
   */
  public void forward()
  {
    switch(direction)
    {
      case NORTH:
        position.setY(position.getY() - 1);
        break;
      case EAST:
        position.setX(position.getX() + 1);
        break;
      case SOUTH:
        position.setY(position.getY() + 1);
        break;
      case WEST:
        position.setX(position.getX() + 1);
        break;
    }
  }
  
  public Movement getMovement()
  {
    return movement;
  }
}
