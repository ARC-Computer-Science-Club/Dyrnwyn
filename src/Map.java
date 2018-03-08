
/**
 * Write a description of class Map here.
 *
 * @author Kevin Kirby
 * @version 02/22/18
 */
public class Map
{
    Tile tileMap[][];
    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        
    }
    
    /**
     * Return tile at position
     * index 0,0 is top left corner of map.
     * 
     * @param: int x, first index. int y second index.
     * 
     * @return: Tile at position.
     */
    public Tile getTile(int x, int y)
    {
        return tileMap[x][y];
    }
    
    /**
     * Return tile at position
     * index 0,0 is top left corner of map.
     * 
     * @param: Position object with corresponding x, y potision.
     * 
     * @return: Tile at position.
     */
    public Tile getTile(Position position)
    {
        return tileMap[position.getX()][position.getY()];
    }
}