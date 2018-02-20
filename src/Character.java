import javax.swing.ImageIcon;

public class Character{
  // Attributes
  private ImageIcon sprite;
  private Position position;
  private Boolean[] passable;
  private Direction direction;

  public enum Direction{
    NORTH, EAST, SOUTH, WEST
  }

  // Constructors
  public Character()
  {
    position = new Position();
    passable = new Boolean[]{false, false, false, false};
  }
  public Character(int idP, ImageIcon icon, Position positionP, Boolean[] passableP)
  {
    sprite = icon;
    position = positionP;
    passable = passableP;
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

  public void forward()
  {
    //Interactions with Map
  }
  public Boolean[] getPassable()
  {
    return passable;
  }
}
