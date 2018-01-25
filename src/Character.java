
public class Character{
  // Attributes
  private ImageIcon sprite;
  private int id;
  private int[] position;
  private Boolean[] passable;
  private Direction direction;

  public enum Direction{
    NORTH, EAST, SOUTH, WEST
  }

  // Constructors
  public Character()
  {
    id = 0;
    position = new int[]{0,0};
    passable = new Boolean[]{0,0,0,0};
  }
  public Character(int idP,ImageIcon icon,int[] positionP,Boolean[] passableP)
  {
    id = idP;
    sprite = icon;
    position = positionP;
    passable = passableP;
  }

  // Methods
  public int[] getPosition()
  {
    return position;
  }

  public void setPosition(int x,int y)
  {
    position[0] = x;
    position[1] = y;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int idP)
  {
    id = idP;
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
      case NORTH:  direction = EAST;
        break;
      case EAST:  direction = SOUTH;
        break;
      case SOUTH:  direction = WEST;
        break;
      case WEST:  direction = NORTH;
        break;
    }
  }
  public void turnLeft()
  {
    switch(direction)
    {
      case NORTH:  direction = WEST;
        break;
      case EAST:  direction = NORTH;
        break;
      case SOUTH:  direction = EAST;
        break;
      case WEST:  direction = SOUTH;
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