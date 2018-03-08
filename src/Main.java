import java.io.File;
/**
 * Driver class for Dammit Debugger.
 *
 * @author Kevin Kirby
 * @version 03/06/18
 */
public class Main
{
    /**
     *
     */
    public static void main(String[] args)
    {
        File map = new File(args[0]);
        File codeSet = new File(args[1]);
        new Engine(map, codeSet);
    }
}
