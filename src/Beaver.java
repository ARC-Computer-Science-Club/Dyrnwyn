public class Beaver extends Character
{
    private int wood;


    public Beaver()
    {
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
