import javax.swing.ImageIcon;

/**
 * Beaver character class
 *
 * @author Devin Scholl and Kevin Kirby
 * @version 02/22/18
 */
public class Beaver extends Character
{
    private int wood;

    public Beaver(ImageIcon icon, Position position, Movement movement)
    {
        super(icon, position, movement);
        wood = 0;
    }

    public int getWood()
    {
        return wood;
    }

    public void setWood(int quantity)
    {
        wood = quantity;
    }

    public void addWood(int quantity)
    {
        wood += quantity;
    }

    public void removeWood(int quantity)
    {
        wood -= quantity;
    }
}