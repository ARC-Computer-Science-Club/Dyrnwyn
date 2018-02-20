import javax.swing.ImageIcon;

public class Tile
{
    private ImageIcon sprite;

    private typeOfTile type;

    private Position position;


    public Tile(typeOfTile t, int x, int y)
    {
        type = t;
        position = new Position(x, y);
    }


    public enum typeOfTile
    {
        LAND, WATER, DAM
    }


    public ImageIcon getSprite()
    {
        return sprite;
    }


    public void setSprite(String path)
    {
        sprite = new ImageIcon(path);
    }


    public Position getPosition()
    {
        return position;
    }


    public void setTypeOfTile(typeOfTile t)
    {
        type = t;
    }


    public typeOfTile getTypeOfTile()
    {
        return type;
    }
}
