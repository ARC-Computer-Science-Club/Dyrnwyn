import javax.swing.ImageIcon;

public class Tile
{

    public Tile(typeOfTile t)
    {
        type = t;
    }


    public enum typeOfTile
    {
        LAND, WATER, DAM
    }

    private ImageIcon sprite;

    private int[] position = {0,0};

    private typeOfTile type;

    public ImageIcon getSprite()
    {
        return sprite;
    }

    public void setSprite(String path)
    {
        sprite = new ImageIcon(path);
    }

    public int[] getPosition()
    {
        return ( position );
    }

    public void setPosition(int[] pos)
    {
        if (pos.length == 2)
        {
            position = pos;
        }
    }

    public void setPosition(int x, int y)
    {
        int[] position = {x,y};
        setPosition(position);
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
