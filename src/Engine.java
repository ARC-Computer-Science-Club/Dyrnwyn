import java.io.File;//for files
import java.util.Scanner;//for scanner
/**
 * Engine for Dammit Debugger.
 * handles logic for code set and map.
 *
 * @author Kevin Kirby
 * @version 03/06/18
 */
public class Engine
{
    private File codeSet;
    private Map map;
    private int numActors;
    private Beaver beavers[];
    private int damCost;
    private Scanner parser;
    /**
     * Constructor for objects of class Engine
     */
    public Engine(File mapFile, File codeSet)
    {
        this.codeSet = codeSet;
        setupMap(mapFile);
        try
        {
            parser = new Scanner(codeSet);
            while(parser.hasNext())
            {
                //step(parser.next());
            }
        }
        catch(Exception e)
        {
            System.out.println("Unable to open code set file.");
        }
    }
    
    /**
     * reads the map file and store its values.
     */
    public void setupMap(File mapFile)
    {
        //set tiles
        //assign beavers
        //assign numActors
        //assign damCost
        //assign valid commands?
        map = new Map();
    }
    
    /**
     * 
     */
    public boolean step(char command, char actor)
    {
        boolean compiled = true;
        switch(command)
        {
            case '^': //forward
                if(actor < numActors)//check if actor is a valid character
                {
                    //check if next square is passable
                    beavers[actor].forward();
                }
                else
                {
                    compiled = false;
                    errorMsg("Index out of bounds");
                }
                break;
            case '>': //turn right
                if(actor < numActors)//check if actor is a valid character
                {
                    beavers[actor].turnRight();
                }
                else
                {
                    compiled = false;
                    errorMsg("Index out of bounds");
                }
                break;
            case '<': //turn left
                if(actor < numActors)//check if actor is a valid character
                {
                    beavers[actor].turnLeft();
                }
                else
                {
                    compiled = false;
                    errorMsg("Index out of bounds");
                }
                break;
            case '#': //build dam
                if(actor < numActors)//check if actor is a valid character
                {
                    if(beavers[actor].getWood() >= damCost)
                    {
                        //check if beaver is in water
                        beavers[actor].removeWood(damCost);
                    }
                    else
                    {
                        compiled = false;
                        errorMsg("Not enough dam wood");
                    }
                }
                else
                {
                    compiled = false;
                    errorMsg("Index out of bounds");
                }
                break;
            case '+': //gather wood
                if(actor < numActors)
                {
                    //check facing.
                    //check position.
                    //get value of tree at position facing+1.
                    //increase beavers wood by value of tree.
                }
                else
                {
                    compiled = false;
                    errorMsg("Index out of bounds");
                }
                break;
            case '\n': //newline
            case '\t': //tab
            case ' ': //space
                break;
            default:
        }
        return compiled;
    }
    
    public void errorMsg(String error)
    {
        System.out.println(error);
    }
}
